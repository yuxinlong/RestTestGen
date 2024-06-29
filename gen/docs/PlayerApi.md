# PlayerApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addToQueue**](PlayerApi.md#addToQueue) | **POST** /me/player/queue | Add Item to Playback Queue 
[**getAUsersAvailableDevices**](PlayerApi.md#getAUsersAvailableDevices) | **GET** /me/player/devices | Get Available Devices 
[**getInformationAboutTheUsersCurrentPlayback**](PlayerApi.md#getInformationAboutTheUsersCurrentPlayback) | **GET** /me/player | Get Playback State 
[**getQueue**](PlayerApi.md#getQueue) | **GET** /me/player/queue | Get the User&#39;s Queue 
[**getRecentlyPlayed**](PlayerApi.md#getRecentlyPlayed) | **GET** /me/player/recently-played | Get Recently Played Tracks 
[**getTheUsersCurrentlyPlayingTrack**](PlayerApi.md#getTheUsersCurrentlyPlayingTrack) | **GET** /me/player/currently-playing | Get Currently Playing Track 
[**pauseAUsersPlayback**](PlayerApi.md#pauseAUsersPlayback) | **PUT** /me/player/pause | Pause Playback 
[**seekToPositionInCurrentlyPlayingTrack**](PlayerApi.md#seekToPositionInCurrentlyPlayingTrack) | **PUT** /me/player/seek | Seek To Position 
[**setRepeatModeOnUsersPlayback**](PlayerApi.md#setRepeatModeOnUsersPlayback) | **PUT** /me/player/repeat | Set Repeat Mode 
[**setVolumeForUsersPlayback**](PlayerApi.md#setVolumeForUsersPlayback) | **PUT** /me/player/volume | Set Playback Volume 
[**skipUsersPlaybackToNextTrack**](PlayerApi.md#skipUsersPlaybackToNextTrack) | **POST** /me/player/next | Skip To Next 
[**skipUsersPlaybackToPreviousTrack**](PlayerApi.md#skipUsersPlaybackToPreviousTrack) | **POST** /me/player/previous | Skip To Previous 
[**startAUsersPlayback**](PlayerApi.md#startAUsersPlayback) | **PUT** /me/player/play | Start/Resume Playback 
[**toggleShuffleForUsersPlayback**](PlayerApi.md#toggleShuffleForUsersPlayback) | **PUT** /me/player/shuffle | Toggle Playback Shuffle 
[**transferAUsersPlayback**](PlayerApi.md#transferAUsersPlayback) | **PUT** /me/player | Transfer Playback 


<a name="addToQueue"></a>
# **addToQueue**
> addToQueue(uri, deviceId)

Add Item to Playback Queue 

Add an item to the end of the user&#39;s current playback queue. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlayerApi apiInstance = new PlayerApi(defaultClient);
    String uri = "spotify:track:4iV5W9uYEdYUVa79Axb7Rh"; // String | 
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8"; // String | 
    try {
      apiInstance.addToQueue(uri, deviceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#addToQueue");
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
 **uri** | **String**|  |
 **deviceId** | **String**|  | [optional]

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
**204** | Command received |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getAUsersAvailableDevices"></a>
# **getAUsersAvailableDevices**
> DevicesObject getAUsersAvailableDevices()

Get Available Devices 

Get information about a user’s available devices. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlayerApi apiInstance = new PlayerApi(defaultClient);
    try {
      DevicesObject result = apiInstance.getAUsersAvailableDevices();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#getAUsersAvailableDevices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DevicesObject**](DevicesObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of devices |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getInformationAboutTheUsersCurrentPlayback"></a>
# **getInformationAboutTheUsersCurrentPlayback**
> CurrentlyPlayingContextObject getInformationAboutTheUsersCurrentPlayback(market, additionalTypes)

Get Playback State 

Get information about the user’s current playback state, including track or episode, progress, and active device. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlayerApi apiInstance = new PlayerApi(defaultClient);
    String market = "ES"; // String | 
    String additionalTypes = "additionalTypes_example"; // String | 
    try {
      CurrentlyPlayingContextObject result = apiInstance.getInformationAboutTheUsersCurrentPlayback(market, additionalTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#getInformationAboutTheUsersCurrentPlayback");
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
 **additionalTypes** | **String**|  | [optional]

### Return type

[**CurrentlyPlayingContextObject**](CurrentlyPlayingContextObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Information about playback |  -  |
**204** | Playback not available or active |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getQueue"></a>
# **getQueue**
> QueueObject getQueue()

Get the User&#39;s Queue 

Get the list of objects that make up the user&#39;s queue. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlayerApi apiInstance = new PlayerApi(defaultClient);
    try {
      QueueObject result = apiInstance.getQueue();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#getQueue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**QueueObject**](QueueObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Information about the queue |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getRecentlyPlayed"></a>
# **getRecentlyPlayed**
> CursorPagingPlayHistoryObject getRecentlyPlayed(limit, after, before)

Get Recently Played Tracks 

Get tracks from the current user&#39;s recently played tracks. _**Note**: Currently doesn&#39;t support podcast episodes._ 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlayerApi apiInstance = new PlayerApi(defaultClient);
    Integer limit = 20; // Integer | 
    Integer after = 1484811043508; // Integer | 
    Integer before = 56; // Integer | 
    try {
      CursorPagingPlayHistoryObject result = apiInstance.getRecentlyPlayed(limit, after, before);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#getRecentlyPlayed");
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
 **after** | **Integer**|  | [optional]
 **before** | **Integer**|  | [optional]

### Return type

[**CursorPagingPlayHistoryObject**](CursorPagingPlayHistoryObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A paged set of tracks |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getTheUsersCurrentlyPlayingTrack"></a>
# **getTheUsersCurrentlyPlayingTrack**
> CurrentlyPlayingObject getTheUsersCurrentlyPlayingTrack(market, additionalTypes)

Get Currently Playing Track 

Get the object currently being played on the user&#39;s Spotify account. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlayerApi apiInstance = new PlayerApi(defaultClient);
    String market = "ES"; // String | 
    String additionalTypes = "additionalTypes_example"; // String | 
    try {
      CurrentlyPlayingObject result = apiInstance.getTheUsersCurrentlyPlayingTrack(market, additionalTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#getTheUsersCurrentlyPlayingTrack");
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
 **additionalTypes** | **String**|  | [optional]

### Return type

[**CurrentlyPlayingObject**](CurrentlyPlayingObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Information about the currently playing track |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="pauseAUsersPlayback"></a>
# **pauseAUsersPlayback**
> pauseAUsersPlayback(deviceId)

Pause Playback 

Pause playback on the user&#39;s account. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlayerApi apiInstance = new PlayerApi(defaultClient);
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8"; // String | 
    try {
      apiInstance.pauseAUsersPlayback(deviceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#pauseAUsersPlayback");
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
 **deviceId** | **String**|  | [optional]

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
**204** | Playback paused |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="seekToPositionInCurrentlyPlayingTrack"></a>
# **seekToPositionInCurrentlyPlayingTrack**
> seekToPositionInCurrentlyPlayingTrack(positionMs, deviceId)

Seek To Position 

Seeks to the given position in the user’s currently playing track. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlayerApi apiInstance = new PlayerApi(defaultClient);
    Integer positionMs = 25000; // Integer | 
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8"; // String | 
    try {
      apiInstance.seekToPositionInCurrentlyPlayingTrack(positionMs, deviceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#seekToPositionInCurrentlyPlayingTrack");
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
 **positionMs** | **Integer**|  |
 **deviceId** | **String**|  | [optional]

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
**204** | Command sent |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="setRepeatModeOnUsersPlayback"></a>
# **setRepeatModeOnUsersPlayback**
> setRepeatModeOnUsersPlayback(state, deviceId)

Set Repeat Mode 

Set the repeat mode for the user&#39;s playback. Options are repeat-track, repeat-context, and off. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlayerApi apiInstance = new PlayerApi(defaultClient);
    String state = "context"; // String | 
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8"; // String | 
    try {
      apiInstance.setRepeatModeOnUsersPlayback(state, deviceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#setRepeatModeOnUsersPlayback");
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
 **state** | **String**|  |
 **deviceId** | **String**|  | [optional]

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
**204** | Command sent |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="setVolumeForUsersPlayback"></a>
# **setVolumeForUsersPlayback**
> setVolumeForUsersPlayback(volumePercent, deviceId)

Set Playback Volume 

Set the volume for the user’s current playback device. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlayerApi apiInstance = new PlayerApi(defaultClient);
    Integer volumePercent = 50; // Integer | 
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8"; // String | 
    try {
      apiInstance.setVolumeForUsersPlayback(volumePercent, deviceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#setVolumeForUsersPlayback");
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
 **volumePercent** | **Integer**|  |
 **deviceId** | **String**|  | [optional]

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
**204** | Command sent |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="skipUsersPlaybackToNextTrack"></a>
# **skipUsersPlaybackToNextTrack**
> skipUsersPlaybackToNextTrack(deviceId)

Skip To Next 

Skips to next track in the user’s queue. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlayerApi apiInstance = new PlayerApi(defaultClient);
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8"; // String | 
    try {
      apiInstance.skipUsersPlaybackToNextTrack(deviceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#skipUsersPlaybackToNextTrack");
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
 **deviceId** | **String**|  | [optional]

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
**204** | Command sent |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="skipUsersPlaybackToPreviousTrack"></a>
# **skipUsersPlaybackToPreviousTrack**
> skipUsersPlaybackToPreviousTrack(deviceId)

Skip To Previous 

Skips to previous track in the user’s queue. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlayerApi apiInstance = new PlayerApi(defaultClient);
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8"; // String | 
    try {
      apiInstance.skipUsersPlaybackToPreviousTrack(deviceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#skipUsersPlaybackToPreviousTrack");
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
 **deviceId** | **String**|  | [optional]

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
**204** | Command sent |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="startAUsersPlayback"></a>
# **startAUsersPlayback**
> startAUsersPlayback(deviceId, requestBody)

Start/Resume Playback 

Start a new context or resume current playback on the user&#39;s active device. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlayerApi apiInstance = new PlayerApi(defaultClient);
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.startAUsersPlayback(deviceId, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#startAUsersPlayback");
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
 **deviceId** | **String**|  | [optional]
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
**204** | Playback started |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="toggleShuffleForUsersPlayback"></a>
# **toggleShuffleForUsersPlayback**
> toggleShuffleForUsersPlayback(state, deviceId)

Toggle Playback Shuffle 

Toggle shuffle on or off for user’s playback. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlayerApi apiInstance = new PlayerApi(defaultClient);
    Boolean state = true; // Boolean | 
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8"; // String | 
    try {
      apiInstance.toggleShuffleForUsersPlayback(state, deviceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#toggleShuffleForUsersPlayback");
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
 **state** | **Boolean**|  |
 **deviceId** | **String**|  | [optional]

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
**204** | Command sent |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="transferAUsersPlayback"></a>
# **transferAUsersPlayback**
> transferAUsersPlayback(requestBody)

Transfer Playback 

Transfer playback to a new device and determine if it should start playing. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    PlayerApi apiInstance = new PlayerApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.transferAUsersPlayback(requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#transferAUsersPlayback");
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
**204** | Playback transferred |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

