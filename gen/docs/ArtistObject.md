

# ArtistObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**externalUrls** | [**ExternalUrlObject**](ExternalUrlObject.md) | Known external URLs for this artist.  |  [optional]
**followers** | [**FollowersObject**](FollowersObject.md) | Information about the followers of the artist.  |  [optional]
**genres** | **List&lt;String&gt;** | A list of the genres the artist is associated with. If not yet classified, the array is empty.  |  [optional]
**href** | **String** | A link to the Web API endpoint providing full details of the artist.  |  [optional]
**id** | **String** | The [Spotify ID](/documentation/web-api/#spotify-uris-and-ids) for the artist.  |  [optional]
**images** | [**List&lt;ImageObject&gt;**](ImageObject.md) | Images of the artist in various sizes, widest first.  |  [optional]
**name** | **String** | The name of the artist.  |  [optional]
**popularity** | **Integer** | The popularity of the artist. The value will be between 0 and 100, with 100 being the most popular. The artist&#39;s popularity is calculated from the popularity of all the artist&#39;s tracks.  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The object type.  |  [optional]
**uri** | **String** | The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for the artist.  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
ARTIST | &quot;artist&quot;



