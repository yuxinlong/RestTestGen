/*
 * Spotify Web API with fixes and improvements from sonallux
 * You can use Spotify's Web API to discover music and podcasts, manage your Spotify library, control audio playback, and much more. Browse our available Web API endpoints using the sidebar at left, or via the navigation bar on top of this page on smaller screens.  In order to make successful Web API requests your app will need a valid access token. One can be obtained through <a href=\"https://developer.spotify.com/documentation/general/guides/authorization-guide/\">OAuth 2.0</a>.  The base URI for all Web API requests is `https://api.spotify.com/v1`.  Need help? See our <a href=\"https://developer.spotify.com/documentation/web-api/guides/\">Web API guides</a> for more information, or visit the <a href=\"https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer\">Spotify for Developers community forum</a> to ask questions and connect with other developers. 
 *
 * The version of the OpenAPI document: 2023.2.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.InlineResponse2009;
import org.openapitools.client.model.InlineResponse401;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarketsApi {
    private ApiClient localVarApiClient;

    public MarketsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MarketsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getAvailableMarkets
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A markets object with an array of country codes </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The app has exceeded its rate limits.  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAvailableMarketsCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/markets";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth_2_0" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAvailableMarketsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getAvailableMarketsCall(_callback);
        return localVarCall;

    }

    /**
     * Get Available Markets 
     * Get the list of markets where Spotify is available. 
     * @return InlineResponse2009
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A markets object with an array of country codes </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The app has exceeded its rate limits.  </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse2009 getAvailableMarkets() throws ApiException {
        ApiResponse<InlineResponse2009> localVarResp = getAvailableMarketsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get Available Markets 
     * Get the list of markets where Spotify is available. 
     * @return ApiResponse&lt;InlineResponse2009&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A markets object with an array of country codes </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The app has exceeded its rate limits.  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse2009> getAvailableMarketsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAvailableMarketsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<InlineResponse2009>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Available Markets  (asynchronously)
     * Get the list of markets where Spotify is available. 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A markets object with an array of country codes </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The app has exceeded its rate limits.  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAvailableMarketsAsync(final ApiCallback<InlineResponse2009> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAvailableMarketsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<InlineResponse2009>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
