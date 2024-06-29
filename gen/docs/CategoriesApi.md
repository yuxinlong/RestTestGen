# CategoriesApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getACategoriesPlaylists**](CategoriesApi.md#getACategoriesPlaylists) | **GET** /browse/categories/{category_id}/playlists | Get Category&#39;s Playlists 
[**getACategory**](CategoriesApi.md#getACategory) | **GET** /browse/categories/{category_id} | Get Single Browse Category 
[**getCategories**](CategoriesApi.md#getCategories) | **GET** /browse/categories | Get Several Browse Categories 


<a name="getACategoriesPlaylists"></a>
# **getACategoriesPlaylists**
> PagingFeaturedPlaylistObject getACategoriesPlaylists(categoryId, country, limit, offset)

Get Category&#39;s Playlists 

Get a list of Spotify playlists tagged with a particular category. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    String categoryId = "dinner"; // String | 
    String country = "SE"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingFeaturedPlaylistObject result = apiInstance.getACategoriesPlaylists(categoryId, country, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getACategoriesPlaylists");
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
 **categoryId** | **String**|  |
 **country** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingFeaturedPlaylistObject**](PagingFeaturedPlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A paged set of playlists |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getACategory"></a>
# **getACategory**
> CategoryObject getACategory(categoryId, country, locale)

Get Single Browse Category 

Get a single category used to tag items in Spotify (on, for example, the Spotify player’s “Browse” tab). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    String categoryId = "dinner"; // String | 
    String country = "SE"; // String | 
    String locale = "sv_SE"; // String | 
    try {
      CategoryObject result = apiInstance.getACategory(categoryId, country, locale);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getACategory");
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
 **categoryId** | **String**|  |
 **country** | **String**|  | [optional]
 **locale** | **String**|  | [optional]

### Return type

[**CategoryObject**](CategoryObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A category |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getCategories"></a>
# **getCategories**
> InlineResponse2005 getCategories(country, locale, limit, offset)

Get Several Browse Categories 

Get a list of categories used to tag items in Spotify (on, for example, the Spotify player’s “Browse” tab). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    String country = "SE"; // String | 
    String locale = "sv_SE"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      InlineResponse2005 result = apiInstance.getCategories(country, locale, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getCategories");
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
 **country** | **String**|  | [optional]
 **locale** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A paged set of categories |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

