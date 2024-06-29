# ShowsApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkUsersSavedShows**](ShowsApi.md#checkUsersSavedShows) | **GET** /me/shows/contains | Check User&#39;s Saved Shows 
[**getAShow**](ShowsApi.md#getAShow) | **GET** /shows/{id} | Get Show 
[**getAShowsEpisodes**](ShowsApi.md#getAShowsEpisodes) | **GET** /shows/{id}/episodes | Get Show Episodes 
[**getMultipleShows**](ShowsApi.md#getMultipleShows) | **GET** /shows | Get Several Shows 
[**getUsersSavedShows**](ShowsApi.md#getUsersSavedShows) | **GET** /me/shows | Get User&#39;s Saved Shows 
[**removeShowsUser**](ShowsApi.md#removeShowsUser) | **DELETE** /me/shows | Remove User&#39;s Saved Shows 
[**saveShowsUser**](ShowsApi.md#saveShowsUser) | **PUT** /me/shows | Save Shows for Current User 


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
import org.openapitools.client.api.ShowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ShowsApi apiInstance = new ShowsApi(defaultClient);
    String ids = "5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ"; // String | 
    try {
      List<Boolean> result = apiInstance.checkUsersSavedShows(ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowsApi#checkUsersSavedShows");
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

<a name="getAShow"></a>
# **getAShow**
> ShowObject getAShow(id, market)

Get Show 

Get Spotify catalog information for a single show identified by its unique Spotify ID. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ShowsApi apiInstance = new ShowsApi(defaultClient);
    String id = "38bS44xjbVVZ3No3ByF1dJ"; // String | 
    String market = "ES"; // String | 
    try {
      ShowObject result = apiInstance.getAShow(id, market);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowsApi#getAShow");
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

[**ShowObject**](ShowObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A show |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

<a name="getAShowsEpisodes"></a>
# **getAShowsEpisodes**
> PagingSimplifiedEpisodeObject getAShowsEpisodes(id, market, limit, offset)

Get Show Episodes 

Get Spotify catalog information about an show’s episodes. Optional parameters can be used to limit the number of episodes returned. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ShowsApi apiInstance = new ShowsApi(defaultClient);
    String id = "38bS44xjbVVZ3No3ByF1dJ"; // String | 
    String market = "ES"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingSimplifiedEpisodeObject result = apiInstance.getAShowsEpisodes(id, market, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowsApi#getAShowsEpisodes");
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

[**PagingSimplifiedEpisodeObject**](PagingSimplifiedEpisodeObject.md)

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

<a name="getMultipleShows"></a>
# **getMultipleShows**
> InlineResponse20014 getMultipleShows(ids, market)

Get Several Shows 

Get Spotify catalog information for several shows based on their Spotify IDs. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ShowsApi apiInstance = new ShowsApi(defaultClient);
    String ids = "5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ"; // String | 
    String market = "ES"; // String | 
    try {
      InlineResponse20014 result = apiInstance.getMultipleShows(ids, market);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowsApi#getMultipleShows");
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

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of shows |  -  |
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
import org.openapitools.client.api.ShowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ShowsApi apiInstance = new ShowsApi(defaultClient);
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      PagingSavedShowObject result = apiInstance.getUsersSavedShows(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowsApi#getUsersSavedShows");
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
import org.openapitools.client.api.ShowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ShowsApi apiInstance = new ShowsApi(defaultClient);
    String ids = "5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ"; // String | 
    String market = "ES"; // String | 
    InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
    try {
      apiInstance.removeShowsUser(ids, market, inlineObject1);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowsApi#removeShowsUser");
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
import org.openapitools.client.api.ShowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.spotify.com/v1");
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
    oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

    ShowsApi apiInstance = new ShowsApi(defaultClient);
    String ids = "5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ"; // String | 
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      apiInstance.saveShowsUser(ids, inlineObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowsApi#saveShowsUser");
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

