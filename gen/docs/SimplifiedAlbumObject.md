

# SimplifiedAlbumObject

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
**albumGroup** | [**AlbumGroupEnum**](#AlbumGroupEnum) | The field is present when getting an artist&#39;s albums. Compare to album_type this field represents relationship between the artist and the album.  |  [optional]
**artists** | [**List&lt;SimplifiedArtistObject&gt;**](SimplifiedArtistObject.md) | The artists of the album. Each artist object includes a link in &#x60;href&#x60; to more detailed information about the artist.  | 



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



## Enum: AlbumGroupEnum

Name | Value
---- | -----
ALBUM | &quot;album&quot;
SINGLE | &quot;single&quot;
COMPILATION | &quot;compilation&quot;
APPEARS_ON | &quot;appears_on&quot;



