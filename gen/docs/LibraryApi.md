# LibraryApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePlaylistDetails**](LibraryApi.md#changePlaylistDetails) | **PUT** /playlists/{playlist_id} | Change Playlist Details 
[**checkCurrentUserFollows**](LibraryApi.md#checkCurrentUserFollows) | **GET** /me/following/contains | Check If User Follows Artists or Users 
[**checkUsersSavedAlbums**](LibraryApi.md#checkUsersSavedAlbums) | **GET** /me/albums/contains | Check User&#39;s Saved Albums 
[**checkUsersSavedAudiobooks**](LibraryApi.md#checkUsersSavedAudiobooks) | **GET** /me/audiobooks/contains | Check User&#39;s Saved Audiobooks 
[**checkUsersSavedEpisodes**](LibraryApi.md#checkUsersSavedEpisodes) | **GET** /me/episodes/contains | Check User&#39;s Saved Episodes 
[**checkUsersSavedShows**](LibraryApi.md#checkUsersSavedShows) | **GET** /me/shows/contains | Check User&#39;s Saved Shows 
[**checkUsersSavedTracks**](LibraryApi.md#checkUsersSavedTracks) | **GET** /me/tracks/contains | Check User&#39;s Saved Tracks 
[**createPlaylist**](LibraryApi.md#createPlaylist) | **POST** /users/{user_id}/playlists | Create Playlist 
[**followArtistsUsers**](LibraryApi.md#followArtistsUsers) | **PUT** /me/following | Follow Artists or Users 
[**getAListOfCurrentUsersPlaylists**](LibraryApi.md#getAListOfCurrentUsersPlaylists) | **GET** /me/playlists | Get Current User&#39;s Playlists 
[**getFollowed**](LibraryApi.md#getFollowed) | **GET** /me/following | Get Followed Artists 
[**getUsersSavedAlbums**](LibraryApi.md#getUsersSavedAlbums) | **GET** /me/albums | Get User&#39;s Saved Albums 
[**getUsersSavedAudiobooks**](LibraryApi.md#getUsersSavedAudiobooks) | **GET** /me/audiobooks | Get User&#39;s Saved Audiobooks 
[**getUsersSavedEpisodes**](LibraryApi.md#getUsersSavedEpisodes) | **GET** /me/episodes | Get User&#39;s Saved Episodes 
[**getUsersSavedShows**](LibraryApi.md#getUsersSavedShows) | **GET** /me/shows | Get User&#39;s Saved Shows 
[**getUsersSavedTracks**](LibraryApi.md#getUsersSavedTracks) | **GET** /me/tracks | Get User&#39;s Saved Tracks 
[**getUsersTopArtists**](LibraryApi.md#getUsersTopArtists) | **GET** /me/top/artists | Get User&#39;s Top Artists 
[**getUsersTopTracks**](LibraryApi.md#getUsersTopTracks) | **GET** /me/top/tracks | Get User&#39;s Top Tracks 
[**removeAlbumsUser**](LibraryApi.md#removeAlbumsUser) | **DELETE** /me/albums | Remove Users&#39; Saved Albums 
[**removeAudiobooksUser**](LibraryApi.md#removeAudiobooksUser) | **DELETE** /me/audiobooks | Remove User&#39;s Saved Audiobooks 
[**removeEpisodesUser**](LibraryApi.md#removeEpisodesUser) | **DELETE** /me/episodes | Remove User&#39;s Saved Episodes 
[**removeShowsUser**](LibraryApi.md#removeShowsUser) | **DELETE** /me/shows | Remove User&#39;s Saved Shows 
[**removeTracksUser**](LibraryApi.md#removeTracksUser) | **DELETE** /me/tracks | Remove User&#39;s Saved Tracks 
[**saveAlbumsUser**](LibraryApi.md#saveAlbumsUser) | **PUT** /me/albums | Save Albums for Current User 
[**saveAudiobooksUser**](LibraryApi.md#saveAudiobooksUser) | **PUT** /me/audiobooks | Save Audiobooks for Current User 
[**saveEpisodesUser**](LibraryApi.md#saveEpisodesUser) | **PUT** /me/episodes | Save Episodes for Current User 
[**saveShowsUser**](LibraryApi.md#saveShowsUser) | **PUT** /me/shows | Save Shows for Current User 
[**saveTracksUser**](LibraryApi.md#saveTracksUser) | **PUT** /me/tracks | Save Tracks for Current User 
[**unfollowArtistsUsers**](LibraryApi.md#unfollowArtistsUsers) | **DELETE** /me/following | Unfollow Artists or Users 


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
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.changePlaylistDetails(playlistId, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#changePlaylistDetails");
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

<a name="checkCurrentUserFollows"></a>
# **checkCurrentUserFollows**
> List&lt;Boolean&gt; checkCurrentUserFollows(type, ids)

Check If User Follows Artists or Users 

Check to see if the current user is following one or more artists or other Spotify users. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String type = "artist"; // String | 
    String ids = "2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6"; // String | 
    try {
      List<Boolean> result = apiInstance.checkCurrentUserFollows(type, ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#checkCurrentUserFollows");
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
 **type** | **String**|  | [enum: artist, user]
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
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String ids = "382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc"; // String | 
    try {
      List<Boolean> result = apiInstance.checkUsersSavedAlbums(ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#checkUsersSavedAlbums");
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

<a name="checkUsersSavedAudiobooks"></a>
# **checkUsersSavedAudiobooks**
> List&lt;Boolean&gt; checkUsersSavedAudiobooks(ids)

Check User&#39;s Saved Audiobooks 

Check if one or more audiobooks are already saved in the current Spotify user&#39;s library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String ids = "18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe"; // String | 
    try {
      List<Boolean> result = apiInstance.checkUsersSavedAudiobooks(ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#checkUsersSavedAudiobooks");
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

<a name="checkUsersSavedEpisodes"></a>
# **checkUsersSavedEpisodes**
> List&lt;Boolean&gt; checkUsersSavedEpisodes(ids)

Check User&#39;s Saved Episodes 

Check if one or more episodes is already saved in the current Spotify user&#39;s &#39;Your Episodes&#39; library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String ids = "77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf"; // String | 
    try {
      List<Boolean> result = apiInstance.checkUsersSavedEpisodes(ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#checkUsersSavedEpisodes");
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

<a name="checkUsersSavedShows"></a>
# **checkUsersSavedShows**
> List&lt;Boolean&gt; checkUsersSavedShows(ids)

Check User&#39;s Saved Shows 

Check if one or more shows is already saved in the current Spotify user&#39;s library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String ids = "5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ"; // String | 
    try {
      List<Boolean> result = apiInstance.checkUsersSavedShows(ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#checkUsersSavedShows");
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

<a name="checkUsersSavedTracks"></a>
# **checkUsersSavedTracks**
> List&lt;Boolean&gt; checkUsersSavedTracks(ids)

Check User&#39;s Saved Tracks 

Check if one or more tracks is already saved in the current Spotify user&#39;s &#39;Your Music&#39; library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B"; // String | 
    try {
      List<Boolean> result = apiInstance.checkUsersSavedTracks(ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#checkUsersSavedTracks");
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
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String userId = "smedjan"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      PlaylistObject result = apiInstance.createPlaylist(userId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#createPlaylist");
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

<a name="followArtistsUsers"></a>
# **followArtistsUsers**
> followArtistsUsers(type, ids, requestBody)

Follow Artists or Users 

Add the current user as a follower of one or more artists or other Spotify users. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String type = "artist"; // String | 
    String ids = "2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.followArtistsUsers(type, ids, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#followArtistsUsers");
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
 **type** | **String**|  | [enum: artist, user]
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
**204** | Artist or user followed |  -  |
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
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingPlaylistObject result = apiInstance.getAListOfCurrentUsersPlaylists(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#getAListOfCurrentUsersPlaylists");
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

<a name="getFollowed"></a>
# **getFollowed**
> InlineResponse20010 getFollowed(type, after, limit)

Get Followed Artists 

Get the current user&#39;s followed artists. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String type = "artist"; // String | 
    String after = "0I2XqVXqHScXjHhk6AYYRe"; // String | 
    Integer limit = 20; // Integer | 
    try {
      InlineResponse20010 result = apiInstance.getFollowed(type, after, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#getFollowed");
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
 **type** | **String**|  | [enum: artist]
 **after** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A paged set of artists |  -  |
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
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    String market = "ES"; // String | 
    try {
      PagingSavedAlbumObject result = apiInstance.getUsersSavedAlbums(limit, offset, market);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#getUsersSavedAlbums");
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

<a name="getUsersSavedAudiobooks"></a>
# **getUsersSavedAudiobooks**
> PagingSavedAudiobookObject getUsersSavedAudiobooks(limit, offset)

Get User&#39;s Saved Audiobooks 

Get a list of the audiobooks saved in the current Spotify user&#39;s &#39;Your Music&#39; library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingSavedAudiobookObject result = apiInstance.getUsersSavedAudiobooks(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#getUsersSavedAudiobooks");
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

[**PagingSavedAudiobookObject**](PagingSavedAudiobookObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pages of saved audiobooks |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getUsersSavedEpisodes"></a>
# **getUsersSavedEpisodes**
> PagingSavedEpisodeObject getUsersSavedEpisodes(market, limit, offset)

Get User&#39;s Saved Episodes 

Get a list of the episodes saved in the current Spotify user&#39;s library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String market = "ES"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingSavedEpisodeObject result = apiInstance.getUsersSavedEpisodes(market, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#getUsersSavedEpisodes");
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
 **market** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingSavedEpisodeObject**](PagingSavedEpisodeObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pages of episodes |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getUsersSavedShows"></a>
# **getUsersSavedShows**
> PagingSavedShowObject getUsersSavedShows(limit, offset)

Get User&#39;s Saved Shows 

Get a list of shows saved in the current Spotify user&#39;s library. Optional parameters can be used to limit the number of shows returned. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingSavedShowObject result = apiInstance.getUsersSavedShows(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#getUsersSavedShows");
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

[**PagingSavedShowObject**](PagingSavedShowObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pages of shows |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getUsersSavedTracks"></a>
# **getUsersSavedTracks**
> PagingSavedTrackObject getUsersSavedTracks(market, limit, offset)

Get User&#39;s Saved Tracks 

Get a list of the songs saved in the current Spotify user&#39;s &#39;Your Music&#39; library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String market = "ES"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingSavedTrackObject result = apiInstance.getUsersSavedTracks(market, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#getUsersSavedTracks");
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
 **market** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingSavedTrackObject**](PagingSavedTrackObject.md)

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

<a name="getUsersTopArtists"></a>
# **getUsersTopArtists**
> PagingArtistObject getUsersTopArtists(timeRange, limit, offset)

Get User&#39;s Top Artists 

Get the current user&#39;s top artists based on calculated affinity. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String timeRange = "\"medium_term\""; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingArtistObject result = apiInstance.getUsersTopArtists(timeRange, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#getUsersTopArtists");
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
 **timeRange** | **String**|  | [optional] [default to &quot;medium_term&quot;]
 **limit** | **Integer**|  | [optional] [default to 20]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingArtistObject**](PagingArtistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pages of artists |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getUsersTopTracks"></a>
# **getUsersTopTracks**
> PagingTrackObject getUsersTopTracks(timeRange, limit, offset)

Get User&#39;s Top Tracks 

Get the current user&#39;s top tracks based on calculated affinity. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String timeRange = "\"medium_term\""; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingTrackObject result = apiInstance.getUsersTopTracks(timeRange, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#getUsersTopTracks");
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
 **timeRange** | **String**|  | [optional] [default to &quot;medium_term&quot;]
 **limit** | **Integer**|  | [optional] [default to 20]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingTrackObject**](PagingTrackObject.md)

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
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String ids = "382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.removeAlbumsUser(ids, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#removeAlbumsUser");
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

<a name="removeAudiobooksUser"></a>
# **removeAudiobooksUser**
> removeAudiobooksUser(ids)

Remove User&#39;s Saved Audiobooks 

Remove one or more audiobooks from the Spotify user&#39;s library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String ids = "18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe"; // String | 
    try {
      apiInstance.removeAudiobooksUser(ids);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#removeAudiobooksUser");
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

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Audiobook(s) have been removed from the library |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="removeEpisodesUser"></a>
# **removeEpisodesUser**
> removeEpisodesUser(ids, requestBody)

Remove User&#39;s Saved Episodes 

Remove one or more episodes from the current user&#39;s library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.removeEpisodesUser(ids, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#removeEpisodesUser");
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
**200** | Episode removed |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="removeShowsUser"></a>
# **removeShowsUser**
> removeShowsUser(ids, market, inlineObject1)

Remove User&#39;s Saved Shows 

Delete one or more shows from current Spotify user&#39;s library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String ids = "5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ"; // String | 
    String market = "ES"; // String | 
    InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
    try {
      apiInstance.removeShowsUser(ids, market, inlineObject1);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#removeShowsUser");
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
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional]

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
**200** | Show removed |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="removeTracksUser"></a>
# **removeTracksUser**
> removeTracksUser(ids, requestBody)

Remove User&#39;s Saved Tracks 

Remove one or more tracks from the current user&#39;s &#39;Your Music&#39; library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.removeTracksUser(ids, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#removeTracksUser");
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
**200** | Track removed |  -  |
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
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String ids = "382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.saveAlbumsUser(ids, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#saveAlbumsUser");
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

<a name="saveAudiobooksUser"></a>
# **saveAudiobooksUser**
> saveAudiobooksUser(ids)

Save Audiobooks for Current User 

Save one or more audiobooks to the current Spotify user&#39;s library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String ids = "18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe"; // String | 
    try {
      apiInstance.saveAudiobooksUser(ids);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#saveAudiobooksUser");
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

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Audiobook(s) are saved to the library |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="saveEpisodesUser"></a>
# **saveEpisodesUser**
> saveEpisodesUser(ids, requestBody)

Save Episodes for Current User 

Save one or more episodes to the current user&#39;s library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String ids = "77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.saveEpisodesUser(ids, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#saveEpisodesUser");
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
**200** | Episode saved |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="saveShowsUser"></a>
# **saveShowsUser**
> saveShowsUser(ids, inlineObject)

Save Shows for Current User 

Save one or more shows to current Spotify user&#39;s library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String ids = "5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ"; // String | 
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      apiInstance.saveShowsUser(ids, inlineObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#saveShowsUser");
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | [optional]

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
**200** | Show saved |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="saveTracksUser"></a>
# **saveTracksUser**
> saveTracksUser(ids, requestBody)

Save Tracks for Current User 

Save one or more tracks to the current user&#39;s &#39;Your Music&#39; library. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.saveTracksUser(ids, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#saveTracksUser");
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
**200** | Track saved |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="unfollowArtistsUsers"></a>
# **unfollowArtistsUsers**
> unfollowArtistsUsers(type, ids, requestBody)

Unfollow Artists or Users 

Remove the current user as a follower of one or more artists or other Spotify users. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    LibraryApi apiInstance = new LibraryApi(defaultClient);
    String type = "artist"; // String | 
    String ids = "2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.unfollowArtistsUsers(type, ids, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryApi#unfollowArtistsUsers");
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
 **type** | **String**|  | [enum: artist, user]
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
**200** | Artist or user unfollowed |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

