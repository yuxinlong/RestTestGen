package io.resttestgen.core.testing;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.jayway.jsonpath.internal.filter.ValueNodes;
import io.resttestgen.core.Environment;
import io.resttestgen.core.datatype.HttpMethod;
import io.resttestgen.core.datatype.HttpStatusCode;
import io.resttestgen.core.helper.Taggable;
import io.resttestgen.core.helper.TestInteractionType;
import io.resttestgen.core.openapi.Operation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Timestamp;
import java.util.Map;

/**
 * Represents a single HTTP test interaction (including a request and a response).
 */
public class TestInteraction extends Taggable {

    private static final Logger logger = LogManager.getLogger(TestInteraction.class);

    // Request fields
    private final transient Operation referenceOperation; // Operation from the specification (typically, read only)
    private transient Operation fuzzedOperation; // Operation populated by the fuzzer
    private HttpMethod requestMethod;
    private String requestURL;
    private String requestHeaders;
    private String requestBody;
    private Timestamp requestSentAt;

    // Response fields
    private String responseProtocol;
    private HttpStatusCode responseStatusCode;
    private String responseHeaders;
    private String responseBody;
    private Timestamp responseReceivedAt;

    // Other fields
    private Timestamp executionTime;
    private transient TestStatus testStatus = TestStatus.CREATED;

    public TestInteractionType getType() {
        return type;
    }

    private TestInteractionType type;


    public TestInteraction(Operation referenceOperation, Operation fuzzedOperation) {
        if (referenceOperation != null && referenceOperation.isReadOnly()) {
            this.referenceOperation = referenceOperation;
        } else {
            this.referenceOperation = null;
        }
        this.fuzzedOperation = fuzzedOperation;
    }

    public TestInteraction(Operation fuzzedOperation) {
        this.referenceOperation = Environment.getInstance().getOpenAPI().getReferenceOperationFromFuzzedOperation(fuzzedOperation);
        this.fuzzedOperation = fuzzedOperation.deepClone();
    }
    public TestInteraction(Operation fuzzedOperation, TestInteractionType type) {
        this.referenceOperation = Environment.getInstance().getOpenAPI().getReferenceOperationFromFuzzedOperation(fuzzedOperation);
        this.fuzzedOperation = fuzzedOperation.deepClone();
        this.type = type;
    }

    public Operation getFuzzedOperation() {
        return fuzzedOperation;
    }

    public void setOperation(Operation operation) {
        this.fuzzedOperation = operation;
    }

    public void setResponseStatusCode(HttpStatusCode statusCode) {
        this.responseStatusCode = statusCode;
    }

    public HttpStatusCode getResponseStatusCode() {
        return responseStatusCode;
    }

    public String getResponseHeaders() {
        return responseHeaders;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public HttpMethod getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(HttpMethod requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestURL() {
        return requestURL;
    }

    public void setRequestURL(String requestURL) {
        this.requestURL = requestURL;
    }

    public String getRequestHeaders() {
        return requestHeaders;
    }

    public void setRequestHeaders(String requestHeaders) {
        this.requestHeaders = requestHeaders;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public Timestamp getRequestSentAt() {
        return requestSentAt;
    }

    public void setRequestSentAt(Timestamp requestSentAt) {
        this.requestSentAt = requestSentAt;
    }

    public String getResponseProtocol() {
        return responseProtocol;
    }

    public void setResponseProtocol(String responseProtocol) {
        this.responseProtocol = responseProtocol;
    }

    public void setResponseHeaders(String responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    public Timestamp getResponseReceivedAt() {
        return responseReceivedAt;
    }

    public void setResponseReceivedAt(Timestamp responseReceivedAt) {
        this.responseReceivedAt = responseReceivedAt;
    }

    public Timestamp getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Timestamp executionTime) {
        this.executionTime = executionTime;
    }

    public TestStatus getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(TestStatus testStatus) {
        this.testStatus = testStatus;
    }

    public void setRequestInfo(HttpMethod httpMethod, String requestURL, String requestHeaders, String requestBody) {
        this.requestMethod = httpMethod;
        this.requestURL = requestURL;
        this.requestHeaders = requestHeaders;
        this.requestBody = requestBody;
    }

    public void setResponseInfo(String responseProtocol, HttpStatusCode responseStatusCode, String responseHeaders,
                                String responseBody, Timestamp requestSentAt, Timestamp responseReceivedAt) {
        this.responseProtocol = responseProtocol;
        this.responseStatusCode = responseStatusCode;
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
        this.requestSentAt = requestSentAt;
        this.responseReceivedAt = responseReceivedAt;
        this.testStatus = TestStatus.EXECUTED;
    }

    public TestInteraction reset() {

        // Reset request info
        requestMethod = null;
        requestURL = null;
        requestHeaders = null;
        requestBody = null;
        requestSentAt = null;

        // Reset response info
        responseProtocol = null;
        responseStatusCode = null;
        responseHeaders = null;
        responseBody = null;
        responseReceivedAt = null;

        // Reset test status
        testStatus = TestStatus.CREATED;

        return this;
    }

    public TestInteraction deepClone() {
        return new TestInteraction(fuzzedOperation.deepClone());
    }

    @Override
    public String toString() {
        return fuzzedOperation.toString();
    }



    public int getTotalValue(){
        return findTotalValue(JsonParser.parseString(responseBody));
    }
    private int findTotalValue(JsonElement element) {
        if (element.isJsonObject()) {
            // 如果是对象，查找包含 "total" 键的部分
            JsonObject jsonObject = element.getAsJsonObject();
            if (jsonObject.has("total")) {
                // 找到 "total" 键，返回其值
                return jsonObject.get("total").getAsInt();
            } else {
                // 如果未找到 "total" 键，继续递归查找子节点
                for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                    int result = findTotalValue(entry.getValue());
                    if (result != -1) {
                        // 如果找到了 "total" 键，直接返回值
                        return result;
                    }
                }
            }
        } else if (element.isJsonArray()) {
            // 如果是数组，递归查找数组元素
            for (JsonElement arrayElement : element.getAsJsonArray()) {
                int result = findTotalValue(arrayElement);
                if (result != -1) {
                    // 如果找到了 "total" 键，直接返回值
                    return result;
                }
            }
        }
        // 未找到 "total" 键的情况
        return -1;
    }
}
