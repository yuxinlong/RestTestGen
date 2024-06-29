# ArtistsApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkCurrentUserFollows**](ArtistsApi.md#checkCurrentUserFollows) | **GET** /me/following/contains | Check If User Follows Artists or Users 
[**followArtistsUsers**](ArtistsApi.md#followArtistsUsers) | **PUT** /me/following | Follow Artists or Users 
[**getAnArtist**](ArtistsApi.md#getAnArtist) | **GET** /artists/{id} | Get Artist 
[**getAnArtistsAlbums**](ArtistsApi.md#getAnArtistsAlbums) | **GET** /artists/{id}/albums | Get Artist&#39;s Albums 
[**getAnArtistsRelatedArtists**](ArtistsApi.md#getAnArtistsRelatedArtists) | **GET** /artists/{id}/related-artists | Get Artist&#39;s Related Artists 
[**getAnArtistsTopTracks**](ArtistsApi.md#getAnArtistsTopTracks) | **GET** /artists/{id}/top-tracks | Get Artist&#39;s Top Tracks 
[**getFollowed**](ArtistsApi.md#getFollowed) | **GET** /me/following | Get Followed Artists 
[**getMultipleArtists**](ArtistsApi.md#getMultipleArtists) | **GET** /artists | Get Several Artists 
[**getUsersTopArtists**](ArtistsApi.md#getUsersTopArtists) | **GET** /me/top/artists | Get User&#39;s Top Artists 
[**unfollowArtistsUsers**](ArtistsApi.md#unfollowArtistsUsers) | **DELETE** /me/following | Unfollow Artists or Users 


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
import org.openapitools.client.api.ArtistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ArtistsApi apiInstance = new ArtistsApi(defaultClient);
    String type = "artist"; // String | 
    String ids = "2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6"; // String | 
    try {
      List<Boolean> result = apiInstance.checkCurrentUserFollows(type, ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArtistsApi#checkCurrentUserFollows");
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
import org.openapitools.client.api.ArtistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ArtistsApi apiInstance = new ArtistsApi(defaultClient);
    String type = "artist"; // String | 
    String ids = "2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.followArtistsUsers(type, ids, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArtistsApi#followArtistsUsers");
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

<a name="getAnArtist"></a>
# **getAnArtist**
> ArtistObject getAnArtist(id)

Get Artist 

Get Spotify catalog information for a single artist identified by their unique Spotify ID. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArtistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ArtistsApi apiInstance = new ArtistsApi(defaultClient);
    String id = "0TnOYISbd1XYRBk9myaseg"; // String | 
    try {
      ArtistObject result = apiInstance.getAnArtist(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArtistsApi#getAnArtist");
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

[**ArtistObject**](ArtistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An artist |  -  |
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
import org.openapitools.client.api.ArtistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ArtistsApi apiInstance = new ArtistsApi(defaultClient);
    String id = "0TnOYISbd1XYRBk9myaseg"; // String | 
    String includeGroups = "single,appears_on"; // String | 
    String market = "ES"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingSimplifiedAlbumObject result = apiInstance.getAnArtistsAlbums(id, includeGroups, market, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArtistsApi#getAnArtistsAlbums");
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

<a name="getAnArtistsRelatedArtists"></a>
# **getAnArtistsRelatedArtists**
> InlineResponse2001 getAnArtistsRelatedArtists(id)

Get Artist&#39;s Related Artists 

Get Spotify catalog information about artists similar to a given artist. Similarity is based on analysis of the Spotify community&#39;s [listening history](http://news.spotify.com/se/2010/02/03/related-artists/). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArtistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ArtistsApi apiInstance = new ArtistsApi(defaultClient);
    String id = "0TnOYISbd1XYRBk9myaseg"; // String | 
    try {
      InlineResponse2001 result = apiInstance.getAnArtistsRelatedArtists(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArtistsApi#getAnArtistsRelatedArtists");
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

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of artists |  -  |
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
import org.openapitools.client.api.ArtistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ArtistsApi apiInstance = new ArtistsApi(defaultClient);
    String id = "0TnOYISbd1XYRBk9myaseg"; // String | 
    String market = "ES"; // String | 
    try {
      InlineResponse2002 result = apiInstance.getAnArtistsTopTracks(id, market);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArtistsApi#getAnArtistsTopTracks");
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
import org.openapitools.client.api.ArtistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ArtistsApi apiInstance = new ArtistsApi(defaultClient);
    String type = "artist"; // String | 
    String after = "0I2XqVXqHScXjHhk6AYYRe"; // String | 
    Integer limit = 20; // Integer | 
    try {
      InlineResponse20010 result = apiInstance.getFollowed(type, after, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArtistsApi#getFollowed");
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

<a name="getMultipleArtists"></a>
# **getMultipleArtists**
> InlineResponse2001 getMultipleArtists(ids)

Get Several Artists 

Get Spotify catalog information for several artists based on their Spotify IDs. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArtistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ArtistsApi apiInstance = new ArtistsApi(defaultClient);
    String ids = "2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6"; // String | 
    try {
      InlineResponse2001 result = apiInstance.getMultipleArtists(ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArtistsApi#getMultipleArtists");
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

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of artists |  -  |
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
import org.openapitools.client.api.ArtistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ArtistsApi apiInstance = new ArtistsApi(defaultClient);
    String timeRange = "\"medium_term\""; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingArtistObject result = apiInstance.getUsersTopArtists(timeRange, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArtistsApi#getUsersTopArtists");
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
import org.openapitools.client.api.ArtistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ArtistsApi apiInstance = new ArtistsApi(defaultClient);
    String type = "artist"; // String | 
    String ids = "2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      apiInstance.unfollowArtistsUsers(type, ids, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArtistsApi#unfollowArtistsUsers");
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

