# TracksApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTracksToPlaylist**](TracksApi.md#addTracksToPlaylist) | **POST** /playlists/{playlist_id}/tracks | Add Items to Playlist 
[**checkUsersSavedTracks**](TracksApi.md#checkUsersSavedTracks) | **GET** /me/tracks/contains | Check User&#39;s Saved Tracks 
[**getAnAlbumsTracks**](TracksApi.md#getAnAlbumsTracks) | **GET** /albums/{id}/tracks | Get Album Tracks 
[**getAnArtistsTopTracks**](TracksApi.md#getAnArtistsTopTracks) | **GET** /artists/{id}/top-tracks | Get Artist&#39;s Top Tracks 
[**getAudioAnalysis**](TracksApi.md#getAudioAnalysis) | **GET** /audio-analysis/{id} | Get Track&#39;s Audio Analysis 
[**getAudioFeatures**](TracksApi.md#getAudioFeatures) | **GET** /audio-features/{id} | Get Track&#39;s Audio Features 
[**getPlaylistsTracks**](TracksApi.md#getPlaylistsTracks) | **GET** /playlists/{playlist_id}/tracks | Get Playlist Items 
[**getRecommendations**](TracksApi.md#getRecommendations) | **GET** /recommendations | Get Recommendations 
[**getSeveralAudioFeatures**](TracksApi.md#getSeveralAudioFeatures) | **GET** /audio-features | Get Tracks&#39; Audio Features 
[**getSeveralTracks**](TracksApi.md#getSeveralTracks) | **GET** /tracks | Get Several Tracks 
[**getTrack**](TracksApi.md#getTrack) | **GET** /tracks/{id} | Get Track 
[**getUsersSavedTracks**](TracksApi.md#getUsersSavedTracks) | **GET** /me/tracks | Get User&#39;s Saved Tracks 
[**getUsersTopTracks**](TracksApi.md#getUsersTopTracks) | **GET** /me/top/tracks | Get User&#39;s Top Tracks 
[**removeTracksPlaylist**](TracksApi.md#removeTracksPlaylist) | **DELETE** /playlists/{playlist_id}/tracks | Remove Playlist Items 
[**removeTracksUser**](TracksApi.md#removeTracksUser) | **DELETE** /me/tracks | Remove User&#39;s Saved Tracks 
[**reorderOrReplacePlaylistsTracks**](TracksApi.md#reorderOrReplacePlaylistsTracks) | **PUT** /playlists/{playlist_id}/tracks | Update Playlist Items 
[**saveTracksUser**](TracksApi.md#saveTracksUser) | **PUT** /me/tracks | Save Tracks for Current User 


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
import org.openapitools.client.api.TracksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    TracksApi apiInstance = new TracksApi(defaultClient);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n"; // String | 
    Integer position = 0; // Integer | 
    String uris = "spotify:track:4iV5W9uYEdYUVa79Axb7Rh,spotify:track:1301WleyT98MSxVHPZCA6M"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      InlineResponse20011 result = apiInstance.addTracksToPlaylist(playlistId, position, uris, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#addTracksToPlaylist");
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
import org.openapitools.client.api.TracksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    TracksApi apiInstance = new TracksApi(defaultClient);
    String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B"; // String | 
    try {
      List<Boolean> result = apiInstance.checkUsersSavedTracks(ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#checkUsersSavedTracks");
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
import org.openapitools.client.api.TracksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    TracksApi apiInstance = new TracksApi(defaultClient);
    String id = "4aawyAB9vmqN3uQ7FjRGTy"; // String | 
    String market = "ES"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingSimplifiedTrackObject result = apiInstance.getAnAlbumsTracks(id, market, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getAnAlbumsTracks");
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

<a name="getAnArtistsTopTracks"></a>
# **getAnArtistsTopTracks**
> InlineResponse2002 getAnArtistsTopTracks(id, market)

Get Artist&#39;s Top Tracks 

Get Spotify catalog information about an artist&#39;s top tracks by country. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TracksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    TracksApi apiInstance = new TracksApi(defaultClient);
    String id = "0TnOYISbd1XYRBk9myaseg"; // String | 
    String market = "ES"; // String | 
    try {
      InlineResponse2002 result = apiInstance.getAnArtistsTopTracks(id, market);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getAnArtistsTopTracks");
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

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of tracks |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getAudioAnalysis"></a>
# **getAudioAnalysis**
> AudioAnalysisObject getAudioAnalysis(id)

Get Track&#39;s Audio Analysis 

Get a low-level audio analysis for a track in the Spotify catalog. The audio analysis describes the track’s structure and musical content, including rhythm, pitch, and timbre. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TracksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    TracksApi apiInstance = new TracksApi(defaultClient);
    String id = "11dFghVXANMlKmJXsNCbNl"; // String | 
    try {
      AudioAnalysisObject result = apiInstance.getAudioAnalysis(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getAudioAnalysis");
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

### Return type

[**AudioAnalysisObject**](AudioAnalysisObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Audio analysis for one track |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getAudioFeatures"></a>
# **getAudioFeatures**
> AudioFeaturesObject getAudioFeatures(id)

Get Track&#39;s Audio Features 

Get audio feature information for a single track identified by its unique Spotify ID. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TracksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    TracksApi apiInstance = new TracksApi(defaultClient);
    String id = "11dFghVXANMlKmJXsNCbNl"; // String | 
    try {
      AudioFeaturesObject result = apiInstance.getAudioFeatures(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getAudioFeatures");
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

### Return type

[**AudioFeaturesObject**](AudioFeaturesObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Audio features for one track |  -  |
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
import org.openapitools.client.api.TracksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    TracksApi apiInstance = new TracksApi(defaultClient);
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
      System.err.println("Exception when calling TracksApi#getPlaylistsTracks");
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

<a name="getRecommendations"></a>
# **getRecommendations**
> RecommendationsObject getRecommendations(limit, market, seedArtists, seedGenres, seedTracks, minAcousticness, maxAcousticness, targetAcousticness, minDanceability, maxDanceability, targetDanceability, minDurationMs, maxDurationMs, targetDurationMs, minEnergy, maxEnergy, targetEnergy, minInstrumentalness, maxInstrumentalness, targetInstrumentalness, minKey, maxKey, targetKey, minLiveness, maxLiveness, targetLiveness, minLoudness, maxLoudness, targetLoudness, minMode, maxMode, targetMode, minPopularity, maxPopularity, targetPopularity, minSpeechiness, maxSpeechiness, targetSpeechiness, minTempo, maxTempo, targetTempo, minTimeSignature, maxTimeSignature, targetTimeSignature, minValence, maxValence, targetValence)

Get Recommendations 

Recommendations are generated based on the available information for a given seed entity and matched against similar artists and tracks. If there is sufficient information about the provided seeds, a list of tracks will be returned together with pool size details.  For artists and tracks that are very new or obscure there might not be enough data to generate a list of tracks. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TracksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    TracksApi apiInstance = new TracksApi(defaultClient);
    Integer limit = 20; // Integer | 
    String market = "ES"; // String | 
    String seedArtists = "4NHQUGzhtTLFvgF5SZesLK"; // String | 
    String seedGenres = "classical,country"; // String | 
    String seedTracks = "0c6xIDDpzE81m2q797ordA"; // String | 
    BigDecimal minAcousticness = new BigDecimal(78); // BigDecimal | 
    BigDecimal maxAcousticness = new BigDecimal(78); // BigDecimal | 
    BigDecimal targetAcousticness = new BigDecimal(78); // BigDecimal | 
    BigDecimal minDanceability = new BigDecimal(78); // BigDecimal | 
    BigDecimal maxDanceability = new BigDecimal(78); // BigDecimal | 
    BigDecimal targetDanceability = new BigDecimal(78); // BigDecimal | 
    Integer minDurationMs = 56; // Integer | 
    Integer maxDurationMs = 56; // Integer | 
    Integer targetDurationMs = 56; // Integer | 
    BigDecimal minEnergy = new BigDecimal(78); // BigDecimal | 
    BigDecimal maxEnergy = new BigDecimal(78); // BigDecimal | 
    BigDecimal targetEnergy = new BigDecimal(78); // BigDecimal | 
    BigDecimal minInstrumentalness = new BigDecimal(78); // BigDecimal | 
    BigDecimal maxInstrumentalness = new BigDecimal(78); // BigDecimal | 
    BigDecimal targetInstrumentalness = new BigDecimal(78); // BigDecimal | 
    Integer minKey = 56; // Integer | 
    Integer maxKey = 56; // Integer | 
    Integer targetKey = 56; // Integer | 
    BigDecimal minLiveness = new BigDecimal(78); // BigDecimal | 
    BigDecimal maxLiveness = new BigDecimal(78); // BigDecimal | 
    BigDecimal targetLiveness = new BigDecimal(78); // BigDecimal | 
    BigDecimal minLoudness = new BigDecimal(78); // BigDecimal | 
    BigDecimal maxLoudness = new BigDecimal(78); // BigDecimal | 
    BigDecimal targetLoudness = new BigDecimal(78); // BigDecimal | 
    Integer minMode = 56; // Integer | 
    Integer maxMode = 56; // Integer | 
    Integer targetMode = 56; // Integer | 
    Integer minPopularity = 56; // Integer | 
    Integer maxPopularity = 56; // Integer | 
    Integer targetPopularity = 56; // Integer | 
    BigDecimal minSpeechiness = new BigDecimal(78); // BigDecimal | 
    BigDecimal maxSpeechiness = new BigDecimal(78); // BigDecimal | 
    BigDecimal targetSpeechiness = new BigDecimal(78); // BigDecimal | 
    BigDecimal minTempo = new BigDecimal(78); // BigDecimal | 
    BigDecimal maxTempo = new BigDecimal(78); // BigDecimal | 
    BigDecimal targetTempo = new BigDecimal(78); // BigDecimal | 
    Integer minTimeSignature = 56; // Integer | 
    Integer maxTimeSignature = 56; // Integer | 
    Integer targetTimeSignature = 56; // Integer | 
    BigDecimal minValence = new BigDecimal(78); // BigDecimal | 
    BigDecimal maxValence = new BigDecimal(78); // BigDecimal | 
    BigDecimal targetValence = new BigDecimal(78); // BigDecimal | 
    try {
      RecommendationsObject result = apiInstance.getRecommendations(limit, market, seedArtists, seedGenres, seedTracks, minAcousticness, maxAcousticness, targetAcousticness, minDanceability, maxDanceability, targetDanceability, minDurationMs, maxDurationMs, targetDurationMs, minEnergy, maxEnergy, targetEnergy, minInstrumentalness, maxInstrumentalness, targetInstrumentalness, minKey, maxKey, targetKey, minLiveness, maxLiveness, targetLiveness, minLoudness, maxLoudness, targetLoudness, minMode, maxMode, targetMode, minPopularity, maxPopularity, targetPopularity, minSpeechiness, maxSpeechiness, targetSpeechiness, minTempo, maxTempo, targetTempo, minTimeSignature, maxTimeSignature, targetTimeSignature, minValence, maxValence, targetValence);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getRecommendations");
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
 **market** | **String**|  | [optional]
 **seedArtists** | **String**|  | [optional]
 **seedGenres** | **String**|  | [optional]
 **seedTracks** | **String**|  | [optional]
 **minAcousticness** | **BigDecimal**|  | [optional]
 **maxAcousticness** | **BigDecimal**|  | [optional]
 **targetAcousticness** | **BigDecimal**|  | [optional]
 **minDanceability** | **BigDecimal**|  | [optional]
 **maxDanceability** | **BigDecimal**|  | [optional]
 **targetDanceability** | **BigDecimal**|  | [optional]
 **minDurationMs** | **Integer**|  | [optional]
 **maxDurationMs** | **Integer**|  | [optional]
 **targetDurationMs** | **Integer**|  | [optional]
 **minEnergy** | **BigDecimal**|  | [optional]
 **maxEnergy** | **BigDecimal**|  | [optional]
 **targetEnergy** | **BigDecimal**|  | [optional]
 **minInstrumentalness** | **BigDecimal**|  | [optional]
 **maxInstrumentalness** | **BigDecimal**|  | [optional]
 **targetInstrumentalness** | **BigDecimal**|  | [optional]
 **minKey** | **Integer**|  | [optional]
 **maxKey** | **Integer**|  | [optional]
 **targetKey** | **Integer**|  | [optional]
 **minLiveness** | **BigDecimal**|  | [optional]
 **maxLiveness** | **BigDecimal**|  | [optional]
 **targetLiveness** | **BigDecimal**|  | [optional]
 **minLoudness** | **BigDecimal**|  | [optional]
 **maxLoudness** | **BigDecimal**|  | [optional]
 **targetLoudness** | **BigDecimal**|  | [optional]
 **minMode** | **Integer**|  | [optional]
 **maxMode** | **Integer**|  | [optional]
 **targetMode** | **Integer**|  | [optional]
 **minPopularity** | **Integer**|  | [optional]
 **maxPopularity** | **Integer**|  | [optional]
 **targetPopularity** | **Integer**|  | [optional]
 **minSpeechiness** | **BigDecimal**|  | [optional]
 **maxSpeechiness** | **BigDecimal**|  | [optional]
 **targetSpeechiness** | **BigDecimal**|  | [optional]
 **minTempo** | **BigDecimal**|  | [optional]
 **maxTempo** | **BigDecimal**|  | [optional]
 **targetTempo** | **BigDecimal**|  | [optional]
 **minTimeSignature** | **Integer**|  | [optional]
 **maxTimeSignature** | **Integer**|  | [optional]
 **targetTimeSignature** | **Integer**|  | [optional]
 **minValence** | **BigDecimal**|  | [optional]
 **maxValence** | **BigDecimal**|  | [optional]
 **targetValence** | **BigDecimal**|  | [optional]

### Return type

[**RecommendationsObject**](RecommendationsObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of recommendations |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getSeveralAudioFeatures"></a>
# **getSeveralAudioFeatures**
> InlineResponse2003 getSeveralAudioFeatures(ids)

Get Tracks&#39; Audio Features 

Get audio features for multiple tracks based on their Spotify IDs. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TracksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    TracksApi apiInstance = new TracksApi(defaultClient);
    String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B"; // String | 
    try {
      InlineResponse2003 result = apiInstance.getSeveralAudioFeatures(ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getSeveralAudioFeatures");
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

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of audio features |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getSeveralTracks"></a>
# **getSeveralTracks**
> InlineResponse2002 getSeveralTracks(ids, market)

Get Several Tracks 

Get Spotify catalog information for multiple tracks based on their Spotify IDs. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TracksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    TracksApi apiInstance = new TracksApi(defaultClient);
    String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B"; // String | 
    String market = "ES"; // String | 
    try {
      InlineResponse2002 result = apiInstance.getSeveralTracks(ids, market);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getSeveralTracks");
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

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of tracks |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getTrack"></a>
# **getTrack**
> TrackObject getTrack(id, market)

Get Track 

Get Spotify catalog information for a single track identified by its unique Spotify ID. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TracksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    TracksApi apiInstance = new TracksApi(defaultClient);
    String id = "11dFghVXANMlKmJXsNCbNl"; // String | 
    String market = "ES"; // String | 
    try {
      TrackObject result = apiInstance.getTrack(id, market);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getTrack");
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

[**TrackObject**](TrackObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A track |  -  |
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
import org.openapitools.client.api.TracksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    TracksApi apiInstance = new TracksApi(defaultClient);
    String market = "ES"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingSavedTrackObject result = apiInstance.getUsersSavedTracks(market, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getUsersSavedTracks");
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
import org.openapitools.client.api.TracksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    TracksApi apiInstance = new TracksApi(defaultClient);
    String timeRange = "\"medium_term\""; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingTrackObject result = apiInstance.getUsersTopTracks(timeRange, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getUsersTopTracks");
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
import org.openapitools.client.api.TracksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    TracksApi apiInstance = new TracksApi(defaultClient);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n"; // String | 
    InlineObject2 inlineObject2 = new InlineObject2(); // InlineObject2 | 
    try {
      InlineResponse20011 result = apiInstance.removeTracksPlaylist(playlistId, inlineObject2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#removeTracksPlaylist");
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
import org.openapitools.client.api.TracksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    TracksApi apiInstance = new TracksApi(defaultClient);
    String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.removeTracksUser(ids, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#removeTracksUser");
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
import org.openapitools.client.api.TracksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    TracksApi apiInstance = new TracksApi(defaultClient);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n"; // String | 
    String uris = "uris_example"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      InlineResponse20011 result = apiInstance.reorderOrReplacePlaylistsTracks(playlistId, uris, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#reorderOrReplacePlaylistsTracks");
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
import org.openapitools.client.api.TracksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    TracksApi apiInstance = new TracksApi(defaultClient);
    String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.saveTracksUser(ids, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#saveTracksUser");
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

