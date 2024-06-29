

# AudioAnalysisObjectMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analysisTime** | **BigDecimal** | The amount of time taken to analyze this track. |  [optional]
**analyzerVersion** | **String** | The version of the Analyzer used to analyze this track. |  [optional]
**detailedStatus** | **String** | A detailed status code for this track. If analysis data is missing, this code may explain why. |  [optional]
**inputProcess** | **String** | The method used to read the track&#39;s audio data. |  [optional]
**platform** | **String** | The platform used to read the track&#39;s audio data. |  [optional]
**statusCode** | **Integer** | The return code of the analyzer process. 0 if successful, 1 if any errors occurred. |  [optional]
**timestamp** | **Integer** | The Unix timestamp (in seconds) at which this track was analyzed. |  [optional]



