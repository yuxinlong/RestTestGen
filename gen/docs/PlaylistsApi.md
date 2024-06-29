# PlaylistsApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTracksToPlaylist**](PlaylistsApi.md#addTracksToPlaylist) | **POST** /playlists/{playlist_id}/tracks | Add Items to Playlist 
[**changePlaylistDetails**](PlaylistsApi.md#changePlaylistDetails) | **PUT** /playlists/{playlist_id} | Change Playlist Details 
[**checkIfUserFollowsPlaylist**](PlaylistsApi.md#checkIfUserFollowsPlaylist) | **GET** /playlists/{playlist_id}/followers/contains | Check if Users Follow Playlist 
[**createPlaylist**](PlaylistsApi.md#createPlaylist) | **POST** /users/{user_id}/playlists | Create Playlist 
[**followPlaylist**](PlaylistsApi.md#followPlaylist) | **PUT** /playlists/{playlist_id}/followers | Follow Playlist 
[**getACategoriesPlaylists**](PlaylistsApi.md#getACategoriesPlaylists) | **GET** /browse/categories/{category_id}/playlists | Get Category&#39;s Playlists 
[**getAListOfCurrentUsersPlaylists**](PlaylistsApi.md#getAListOfCurrentUsersPlaylists) | **GET** /me/playlists | Get Current User&#39;s Playlists 
[**getFeaturedPlaylists**](PlaylistsApi.md#getFeaturedPlaylists) | **GET** /browse/featured-playlists | Get Featured Playlists 
[**getListUsersPlaylists**](PlaylistsApi.md#getListUsersPlaylists) | **GET** /users/{user_id}/playlists | Get User&#39;s Playlists 
[**getPlaylist**](PlaylistsApi.md#getPlaylist) | **GET** /playlists/{playlist_id} | Get Playlist 
[**getPlaylistCover**](PlaylistsApi.md#getPlaylistCover) | **GET** /playlists/{playlist_id}/images | Get Playlist Cover Image 
[**getPlaylistsTracks**](PlaylistsApi.md#getPlaylistsTracks) | **GET** /playlists/{playlist_id}/tracks | Get Playlist Items 
[**removeTracksPlaylist**](PlaylistsApi.md#removeTracksPlaylist) | **DELETE** /playlists/{playlist_id}/tracks | Remove Playlist Items 
[**reorderOrReplacePlaylistsTracks**](PlaylistsApi.md#reorderOrReplacePlaylistsTracks) | **PUT** /playlists/{playlist_id}/tracks | Update Playlist Items 
[**unfollowPlaylist**](PlaylistsApi.md#unfollowPlaylist) | **DELETE** /playlists/{playlist_id}/followers | Unfollow Playlist 
[**uploadCustomPlaylistCover**](PlaylistsApi.md#uploadCustomPlaylistCover) | **PUT** /playlists/{playlist_id}/images | Add Custom Playlist Cover Image 


<a name="addTracksToPlaylist"></a>
# **addTracksToPlaylist**
> InlineResponse20011 addTracksToPlaylist(playlistId, position, uris, requestBody)

Add Items to Playlist 

Add one or more items to a user&#39;s playlist. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n"; // String | 
    Integer position = 0; // Integer | 
    String uris = "spotify:track:4iV5W9uYEdYUVa79Axb7Rh,spotify:track:1301WleyT98MSxVHPZCA6M"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      InlineResponse20011 result = apiInstance.addTracksToPlaylist(playlistId, position, uris, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#addTracksToPlaylist");
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
 **playlistId** | **String**|  |
 **position** | **Integer**|  | [optional]
 **uris** | **String**|  | [optional]
 **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A snapshot ID for the playlist |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="changePlaylistDetails"></a>
# **changePlaylistDetails**
> changePlaylistDetails(playlistId, requestBody)

Change Playlist Details 

Change a playlist&#39;s name and public/private state. (The user must, of course, own the playlist.) 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.changePlaylistDetails(playlistId, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#changePlaylistDetails");
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
 **playlistId** | **String**|  |
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
**200** | Playlist updated |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="checkIfUserFollowsPlaylist"></a>
# **checkIfUserFollowsPlaylist**
> List&lt;Boolean&gt; checkIfUserFollowsPlaylist(playlistId, ids)

Check if Users Follow Playlist 

Check to see if one or more Spotify users are following a specified playlist. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n"; // String | 
    String ids = "jmperezperez,thelinmichael,wizzler"; // String | 
    try {
      List<Boolean> result = apiInstance.checkIfUserFollowsPlaylist(playlistId, ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#checkIfUserFollowsPlaylist");
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
 **playlistId** | **String**|  |
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

<a name="createPlaylist"></a>
# **createPlaylist**
> PlaylistObject createPlaylist(userId, requestBody)

Create Playlist 

Create a playlist for a Spotify user. (The playlist will be empty until you [add tracks](/documentation/web-api/reference/#/operations/add-tracks-to-playlist).) 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String userId = "smedjan"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      PlaylistObject result = apiInstance.createPlaylist(userId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#createPlaylist");
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
 **userId** | **String**|  |
 **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional]

### Return type

[**PlaylistObject**](PlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A playlist |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="followPlaylist"></a>
# **followPlaylist**
> followPlaylist(playlistId, requestBody)

Follow Playlist 

Add the current user as a follower of a playlist. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.followPlaylist(playlistId, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#followPlaylist");
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
 **playlistId** | **String**|  |
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
**200** | Playlist followed |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

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
import org.openapitools.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String categoryId = "dinner"; // String | 
    String country = "SE"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingFeaturedPlaylistObject result = apiInstance.getACategoriesPlaylists(categoryId, country, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getACategoriesPlaylists");
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

<a name="getAListOfCurrentUsersPlaylists"></a>
# **getAListOfCurrentUsersPlaylists**
> PagingPlaylistObject getAListOfCurrentUsersPlaylists(limit, offset)

Get Current User&#39;s Playlists 

Get a list of the playlists owned or followed by the current Spotify user. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingPlaylistObject result = apiInstance.getAListOfCurrentUsersPlaylists(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getAListOfCurrentUsersPlaylists");
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

### Return type

[**PagingPlaylistObject**](PagingPlaylistObject.md)

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

<a name="getFeaturedPlaylists"></a>
# **getFeaturedPlaylists**
> PagingFeaturedPlaylistObject getFeaturedPlaylists(country, locale, timestamp, limit, offset)

Get Featured Playlists 

Get a list of Spotify featured playlists (shown, for example, on a Spotify player&#39;s &#39;Browse&#39; tab). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String country = "SE"; // String | 
    String locale = "sv_SE"; // String | 
    String timestamp = "2014-10-23T09:00:00"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingFeaturedPlaylistObject result = apiInstance.getFeaturedPlaylists(country, locale, timestamp, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getFeaturedPlaylists");
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
 **timestamp** | **String**|  | [optional]
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

<a name="getListUsersPlaylists"></a>
# **getListUsersPlaylists**
> PagingPlaylistObject getListUsersPlaylists(userId, limit, offset)

Get User&#39;s Playlists 

Get a list of the playlists owned or followed by a Spotify user. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String userId = "smedjan"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingPlaylistObject result = apiInstance.getListUsersPlaylists(userId, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getListUsersPlaylists");
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
 **userId** | **String**|  |
 **limit** | **Integer**|  | [optional] [default to 20]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingPlaylistObject**](PagingPlaylistObject.md)

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

<a name="getPlaylist"></a>
# **getPlaylist**
> PlaylistObject getPlaylist(playlistId, market, fields, additionalTypes)

Get Playlist 

Get a playlist owned by a Spotify user. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n"; // String | 
    String market = "ES"; // String | 
    String fields = "items(added_by.id,track(name,href,album(name,href)))"; // String | 
    String additionalTypes = "additionalTypes_example"; // String | 
    try {
      PlaylistObject result = apiInstance.getPlaylist(playlistId, market, fields, additionalTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getPlaylist");
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
 **playlistId** | **String**|  |
 **market** | **String**|  | [optional]
 **fields** | **String**|  | [optional]
 **additionalTypes** | **String**|  | [optional]

### Return type

[**PlaylistObject**](PlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A playlist |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getPlaylistCover"></a>
# **getPlaylistCover**
> List&lt;ImageObject&gt; getPlaylistCover(playlistId)

Get Playlist Cover Image 

Get the current image associated with a specific playlist. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n"; // String | 
    try {
      List<ImageObject> result = apiInstance.getPlaylistCover(playlistId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getPlaylistCover");
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
 **playlistId** | **String**|  |

### Return type

[**List&lt;ImageObject&gt;**](ImageObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of images |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getPlaylistsTracks"></a>
# **getPlaylistsTracks**
> PagingPlaylistTrackObject getPlaylistsTracks(playlistId, market, fields, limit, offset, additionalTypes)

Get Playlist Items 

Get full details of the items of a playlist owned by a Spotify user. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n"; // String | 
    String market = "ES"; // String | 
    String fields = "items(added_by.id,track(name,href,album(name,href)))"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    String additionalTypes = "additionalTypes_example"; // String | 
    try {
      PagingPlaylistTrackObject result = apiInstance.getPlaylistsTracks(playlistId, market, fields, limit, offset, additionalTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getPlaylistsTracks");
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
 **playlistId** | **String**|  |
 **market** | **String**|  | [optional]
 **fields** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20]
 **offset** | **Integer**|  | [optional] [default to 0]
 **additionalTypes** | **String**|  | [optional]

### Return type

[**PagingPlaylistTrackObject**](PagingPlaylistTrackObject.md)

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

<a name="removeTracksPlaylist"></a>
# **removeTracksPlaylist**
> InlineResponse20011 removeTracksPlaylist(playlistId, inlineObject2)

Remove Playlist Items 

Remove one or more items from a user&#39;s playlist. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n"; // String | 
    InlineObject2 inlineObject2 = new InlineObject2(); // InlineObject2 | 
    try {
      InlineResponse20011 result = apiInstance.removeTracksPlaylist(playlistId, inlineObject2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#removeTracksPlaylist");
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
 **playlistId** | **String**|  |
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | [optional]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A snapshot ID for the playlist |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="reorderOrReplacePlaylistsTracks"></a>
# **reorderOrReplacePlaylistsTracks**
> InlineResponse20011 reorderOrReplacePlaylistsTracks(playlistId, uris, requestBody)

Update Playlist Items 

Either reorder or replace items in a playlist depending on the request&#39;s parameters. To reorder items, include &#x60;range_start&#x60;, &#x60;insert_before&#x60;, &#x60;range_length&#x60; and &#x60;snapshot_id&#x60; in the request&#39;s body. To replace items, include &#x60;uris&#x60; as either a query parameter or in the request&#39;s body. Replacing items in a playlist will overwrite its existing items. This operation can be used for replacing or clearing items in a playlist. &lt;br/&gt; **Note**: Replace and reorder are mutually exclusive operations which share the same endpoint, but have different parameters. These operations can&#39;t be applied together in a single request. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n"; // String | 
    String uris = "uris_example"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      InlineResponse20011 result = apiInstance.reorderOrReplacePlaylistsTracks(playlistId, uris, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#reorderOrReplacePlaylistsTracks");
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
 **playlistId** | **String**|  |
 **uris** | **String**|  | [optional]
 **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A snapshot ID for the playlist |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="unfollowPlaylist"></a>
# **unfollowPlaylist**
> unfollowPlaylist(playlistId)

Unfollow Playlist 

Remove the current user as a follower of a playlist. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n"; // String | 
    try {
      apiInstance.unfollowPlaylist(playlistId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#unfollowPlaylist");
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
 **playlistId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Playlist unfollowed |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="uploadCustomPlaylistCover"></a>
# **uploadCustomPlaylistCover**
> uploadCustomPlaylistCover(playlistId, body)

Add Custom Playlist Cover Image 

Replace the image used to represent a specific playlist. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n"; // String | 
    String body = "body_example"; // String | The new cover image of the playlist as a Base64 encoded JPEG image. Maximum payload size is 256KB.
    try {
      apiInstance.uploadCustomPlaylistCover(playlistId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#uploadCustomPlaylistCover");
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
 **playlistId** | **String**|  |
 **body** | **String**| The new cover image of the playlist as a Base64 encoded JPEG image. Maximum payload size is 256KB. |

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: image/jpeg
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Image uploaded |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

