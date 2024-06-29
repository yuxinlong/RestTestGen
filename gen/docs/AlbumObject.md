

# AlbumObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**albumType** | [**AlbumTypeEnum**](#AlbumTypeEnum) | The type of the album.  | 
**availableMarkets** | **List&lt;String&gt;** | The markets in which the album is available: [ISO 3166-1 alpha-2 country codes](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). _**NOTE**: an album is considered available in a market when at least 1 of its tracks is available in that market._  | 
**externalUrls** | [**ExternalUrlObject**](ExternalUrlObject.md) | Known external URLs for this album.  | 
**href** | **String** | A link to the Web API endpoint providing full details of the album.  | 
**id** | **String** | The [Spotify ID](/documentation/web-api/#spotify-uris-and-ids) for the album.  | 
**images** | [**List&lt;ImageObject&gt;**](ImageObject.md) | The cover art for the album in various sizes, widest first.  | 
**name** | **String** | The name of the album. In case of an album takedown, the value may be an empty string.  | 
**releaseDate** | **String** | The date the album was first released.  | 
**releaseDatePrecision** | [**ReleaseDatePrecisionEnum**](#ReleaseDatePrecisionEnum) | The precision with which &#x60;release_date&#x60; value is known.  | 
**restrictions** | [**AlbumRestrictionObject**](AlbumRestrictionObject.md) | Included in the response when a content restriction is applied.  |  [optional]
**totalTracks** | **Integer** | The number of tracks in the album. | 
**type** | [**TypeEnum**](#TypeEnum) | The object type.  | 
**uri** | **String** | The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for the album.  | 
**artists** | [**List&lt;SimplifiedArtistObject&gt;**](SimplifiedArtistObject.md) | The artists of the album. Each artist object includes a link in &#x60;href&#x60; to more detailed information about the artist.  |  [optional]
**copyrights** | [**List&lt;CopyrightObject&gt;**](CopyrightObject.md) | The copyright statements of the album. |  [optional]
**externalIds** | [**ExternalIdObject**](ExternalIdObject.md) | Known external IDs for the album.  |  [optional]
**genres** | **List&lt;String&gt;** | A list of the genres used to classify the album. (If not yet classified, the array is empty.) |  [optional]
**label** | **String** | The label for the album. |  [optional]
**popularity** | **Integer** | The popularity of the album, with 100 being the most popular. The popularity is calculated from the popularity of the album&#39;s individual tracks. |  [optional]
**tracks** | [**PagingSimplifiedTrackObject**](PagingSimplifiedTrackObject.md) | The tracks of the album.  |  [optional]



## Enum: AlbumTypeEnum

Name | Value
---- | -----
ALBUM | &quot;album&quot;
SINGLE | &quot;single&quot;
COMPILATION | &quot;compilation&quot;



## Enum: ReleaseDatePrecisionEnum

Name | Value
---- | -----
YEAR | &quot;year&quot;
MONTH | &quot;month&quot;
DAY | &quot;day&quot;



## Enum: TypeEnum

Name | Value
---- | -----
ALBUM | &quot;album&quot;



