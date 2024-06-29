# ChaptersApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAChapter**](ChaptersApi.md#getAChapter) | **GET** /chapters/{id} | Get a Chapter 
[**getAudiobookChapters**](ChaptersApi.md#getAudiobookChapters) | **GET** /audiobooks/{id}/chapters | Get Audiobook Chapters 
[**getSeveralChapters**](ChaptersApi.md#getSeveralChapters) | **GET** /chapters | Get Several Chapters 


<a name="getAChapter"></a>
# **getAChapter**
> ChapterObject getAChapter(id, market)

Get a Chapter 

Get Spotify catalog information for a single chapter.&lt;br /&gt; **Note: Chapters are only available for the US, UK, Ireland, New Zealand and Australia markets.** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChaptersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ChaptersApi apiInstance = new ChaptersApi(defaultClient);
    String id = "0D5wENdkdwbqlrHoaJ9g29"; // String | 
    String market = "ES"; // String | 
    try {
      ChapterObject result = apiInstance.getAChapter(id, market);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChaptersApi#getAChapter");
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
 **id** | **String**|  |
 **market** | **String**|  | [optional]

### Return type

[**ChapterObject**](ChapterObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Chapter |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getAudiobookChapters"></a>
# **getAudiobookChapters**
> PagingSimplifiedChapterObject getAudiobookChapters(id, market, limit, offset)

Get Audiobook Chapters 

Get Spotify catalog information about an audiobook&#39;s chapters.&lt;br /&gt; **Note: Audiobooks are only available for the US, UK, Ireland, New Zealand and Australia markets.** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChaptersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ChaptersApi apiInstance = new ChaptersApi(defaultClient);
    String id = "7iHfbu1YPACw6oZPAFJtqe"; // String | 
    String market = "ES"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingSimplifiedChapterObject result = apiInstance.getAudiobookChapters(id, market, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChaptersApi#getAudiobookChapters");
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
 **id** | **String**|  |
 **market** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingSimplifiedChapterObject**](PagingSimplifiedChapterObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pages of chapters |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getSeveralChapters"></a>
# **getSeveralChapters**
> InlineResponse2007 getSeveralChapters(ids, market)

Get Several Chapters 

Get Spotify catalog information for several chapters identified by their Spotify IDs.&lt;br /&gt; **Note: Chapters are only available for the US, UK, Ireland, New Zealand and Australia markets.** 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChaptersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ChaptersApi apiInstance = new ChaptersApi(defaultClient);
    String ids = "0IsXVP0JmcB2adSE338GkK,3ZXb8FKZGU0EHALYX6uCzU,0D5wENdkdwbqlrHoaJ9g29"; // String | 
    String market = "ES"; // String | 
    try {
      InlineResponse2007 result = apiInstance.getSeveralChapters(ids, market);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChaptersApi#getSeveralChapters");
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
 **ids** | **String**|  |
 **market** | **String**|  | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of chapters |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

