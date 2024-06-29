# AlbumsApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkUsersSavedAlbums**](AlbumsApi.md#checkUsersSavedAlbums) | **GET** /me/albums/contains | Check User&#39;s Saved Albums 
[**getAnAlbum**](AlbumsApi.md#getAnAlbum) | **GET** /albums/{id} | Get Album 
[**getAnAlbumsTracks**](AlbumsApi.md#getAnAlbumsTracks) | **GET** /albums/{id}/tracks | Get Album Tracks 
[**getAnArtistsAlbums**](AlbumsApi.md#getAnArtistsAlbums) | **GET** /artists/{id}/albums | Get Artist&#39;s Albums 
[**getMultipleAlbums**](AlbumsApi.md#getMultipleAlbums) | **GET** /albums | Get Several Albums 
[**getNewReleases**](AlbumsApi.md#getNewReleases) | **GET** /browse/new-releases | Get New Releases 
[**getUsersSavedAlbums**](AlbumsApi.md#getUsersSavedAlbums) | **GET** /me/albums | Get User&#39;s Saved Albums 
[**removeAlbumsUser**](AlbumsApi.md#removeAlbumsUser) | **DELETE** /me/albums | Remove Users&#39; Saved Albums 
[**saveAlbumsUser**](AlbumsApi.md#saveAlbumsUser) | **PUT** /me/albums | Save Albums for Current User 


<a name="checkUsersSavedAlbums"></a>
# **checkUsersSavedAlbums**
> List&lt;Boolean&gt; checkUsersSavedAlbums(ids)

Check User&#39;s Saved Albums 

Check if one or more albums is already saved in the current Spotify user&#39;s &#39;Your Music&#39; library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AlbumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    AlbumsApi apiInstance = new AlbumsApi(defaultClient);
    String ids = "382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc"; // String | 
    try {
      List<Boolean> result = apiInstance.checkUsersSavedAlbums(ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#checkUsersSavedAlbums");
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

### Return type

**List&lt;Boolean&gt;**

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Array of booleans |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getAnAlbum"></a>
# **getAnAlbum**
> AlbumObject getAnAlbum(id, market)

Get Album 

Get Spotify catalog information for a single album. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AlbumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    AlbumsApi apiInstance = new AlbumsApi(defaultClient);
    String id = "4aawyAB9vmqN3uQ7FjRGTy"; // String | 
    String market = "ES"; // String | 
    try {
      AlbumObject result = apiInstance.getAnAlbum(id, market);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#getAnAlbum");
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

[**AlbumObject**](AlbumObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An album |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getAnAlbumsTracks"></a>
# **getAnAlbumsTracks**
> PagingSimplifiedTrackObject getAnAlbumsTracks(id, market, limit, offset)

Get Album Tracks 

Get Spotify catalog information about an album’s tracks. Optional parameters can be used to limit the number of tracks returned. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AlbumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    AlbumsApi apiInstance = new AlbumsApi(defaultClient);
    String id = "4aawyAB9vmqN3uQ7FjRGTy"; // String | 
    String market = "ES"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingSimplifiedTrackObject result = apiInstance.getAnAlbumsTracks(id, market, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#getAnAlbumsTracks");
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

[**PagingSimplifiedTrackObject**](PagingSimplifiedTrackObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pages of tracks |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getAnArtistsAlbums"></a>
# **getAnArtistsAlbums**
> PagingSimplifiedAlbumObject getAnArtistsAlbums(id, includeGroups, market, limit, offset)

Get Artist&#39;s Albums 

Get Spotify catalog information about an artist&#39;s albums. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AlbumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    AlbumsApi apiInstance = new AlbumsApi(defaultClient);
    String id = "0TnOYISbd1XYRBk9myaseg"; // String | 
    String includeGroups = "single,appears_on"; // String | 
    String market = "ES"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingSimplifiedAlbumObject result = apiInstance.getAnArtistsAlbums(id, includeGroups, market, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#getAnArtistsAlbums");
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
 **includeGroups** | **String**|  | [optional]
 **market** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingSimplifiedAlbumObject**](PagingSimplifiedAlbumObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pages of albums |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getMultipleAlbums"></a>
# **getMultipleAlbums**
> InlineResponse200 getMultipleAlbums(ids, market)

Get Several Albums 

Get Spotify catalog information for multiple albums identified by their Spotify IDs. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AlbumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    AlbumsApi apiInstance = new AlbumsApi(defaultClient);
    String ids = "382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc"; // String | 
    String market = "ES"; // String | 
    try {
      InlineResponse200 result = apiInstance.getMultipleAlbums(ids, market);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#getMultipleAlbums");
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

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of albums |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getNewReleases"></a>
# **getNewReleases**
> InlineResponse2006 getNewReleases(country, limit, offset)

Get New Releases 

Get a list of new album releases featured in Spotify (shown, for example, on a Spotify player’s “Browse” tab). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AlbumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    AlbumsApi apiInstance = new AlbumsApi(defaultClient);
    String country = "SE"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      InlineResponse2006 result = apiInstance.getNewReleases(country, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#getNewReleases");
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
 **limit** | **Integer**|  | [optional] [default to 20]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A paged set of albums |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getUsersSavedAlbums"></a>
# **getUsersSavedAlbums**
> PagingSavedAlbumObject getUsersSavedAlbums(limit, offset, market)

Get User&#39;s Saved Albums 

Get a list of the albums saved in the current Spotify user&#39;s &#39;Your Music&#39; library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AlbumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    AlbumsApi apiInstance = new AlbumsApi(defaultClient);
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    String market = "ES"; // String | 
    try {
      PagingSavedAlbumObject result = apiInstance.getUsersSavedAlbums(limit, offset, market);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#getUsersSavedAlbums");
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
 **limit** | **Integer**|  | [optional] [default to 20]
 **offset** | **Integer**|  | [optional] [default to 0]
 **market** | **String**|  | [optional]

### Return type

[**PagingSavedAlbumObject**](PagingSavedAlbumObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pages of albums |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="removeAlbumsUser"></a>
# **removeAlbumsUser**
> removeAlbumsUser(ids, requestBody)

Remove Users&#39; Saved Albums 

Remove one or more albums from the current user&#39;s &#39;Your Music&#39; library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AlbumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    AlbumsApi apiInstance = new AlbumsApi(defaultClient);
    String ids = "382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.removeAlbumsUser(ids, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#removeAlbumsUser");
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
 **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Album(s) have been removed from the library |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="saveAlbumsUser"></a>
# **saveAlbumsUser**
> saveAlbumsUser(ids, requestBody)

Save Albums for Current User 

Save one or more albums to the current user&#39;s &#39;Your Music&#39; library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AlbumsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    AlbumsApi apiInstance = new AlbumsApi(defaultClient);
    String ids = "382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.saveAlbumsUser(ids, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#saveAlbumsUser");
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
 **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The album is saved |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

