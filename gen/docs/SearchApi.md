# SearchApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](SearchApi.md#search) | **GET** /search | Search for Item 


<a name="search"></a>
# **search**
> InlineResponse20013 search(q, type, market, limit, offset, includeExternal)

Search for Item 

Get Spotify catalog information about albums, artists, playlists, tracks, shows, episodes or audiobooks that match a keyword string.&lt;br /&gt; **Note: Audiobooks are only available for the US, UK, Ireland, New Zealand and Australia markets.** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    SearchApi apiInstance = new SearchApi(defaultClient);
    String q = "remaster%20track:Doxy%20artist:Miles%20Davis"; // String | 
    List<String> type = Arrays.asList(); // List<String> | 
    String market = "ES"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    String includeExternal = "includeExternal_example"; // String | 
    try {
      InlineResponse20013 result = apiInstance.search(q, type, market, limit, offset, includeExternal);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#search");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**|  |
 **type** | [**List&lt;String&gt;**](String.md)|  | [enum: album, artist, playlist, track, show, episode, audiobook]
 **market** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20]
 **offset** | **Integer**|  | [optional] [default to 0]
 **includeExternal** | **String**|  | [optional] [enum: audio]

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Search response |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

