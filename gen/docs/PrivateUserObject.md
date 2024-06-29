

# PrivateUserObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **String** | The country of the user, as set in the user&#39;s account profile. An [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). _This field is only available when the current user has granted access to the [user-read-private](/documentation/general/guides/authorization-guide/#list-of-scopes) scope._  |  [optional]
**displayName** | **String** | The name displayed on the user&#39;s profile. &#x60;null&#x60; if not available.  |  [optional]
**email** | **String** | The user&#39;s email address, as entered by the user when creating their account. _**Important!** This email address is unverified; there is no proof that it actually belongs to the user._ _This field is only available when the current user has granted access to the [user-read-email](/documentation/general/guides/authorization-guide/#list-of-scopes) scope._  |  [optional]
**explicitContent** | [**ExplicitContentSettingsObject**](ExplicitContentSettingsObject.md) | The user&#39;s explicit content settings. _This field is only available when the current user has granted access to the [user-read-private](/documentation/general/guides/authorization-guide/#list-of-scopes) scope._  |  [optional]
**externalUrls** | [**ExternalUrlObject**](ExternalUrlObject.md) | Known external URLs for this user. |  [optional]
**followers** | [**FollowersObject**](FollowersObject.md) | Information about the followers of the user. |  [optional]
**href** | **String** | A link to the Web API endpoint for this user.  |  [optional]
**id** | **String** | The [Spotify user ID](/documentation/web-api/#spotify-uris-and-ids) for the user.  |  [optional]
**images** | [**List&lt;ImageObject&gt;**](ImageObject.md) | The user&#39;s profile image. |  [optional]
**product** | **String** | The user&#39;s Spotify subscription level: \&quot;premium\&quot;, \&quot;free\&quot;, etc. (The subscription level \&quot;open\&quot; can be considered the same as \&quot;free\&quot;.) _This field is only available when the current user has granted access to the [user-read-private](/documentation/general/guides/authorization-guide/#list-of-scopes) scope._  |  [optional]
**type** | **String** | The object type: \&quot;user\&quot;  |  [optional]
**uri** | **String** | The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for the user.  |  [optional]



