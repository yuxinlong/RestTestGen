

# TrackObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**album** | [**SimplifiedAlbumObject**](SimplifiedAlbumObject.md) | The album on which the track appears. The album object includes a link in &#x60;href&#x60; to full information about the album.  |  [optional]
**artists** | [**List&lt;ArtistObject&gt;**](ArtistObject.md) | The artists who performed the track. Each artist object includes a link in &#x60;href&#x60; to more detailed information about the artist.  |  [optional]
**availableMarkets** | **List&lt;String&gt;** | A list of the countries in which the track can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.  |  [optional]
**discNumber** | **Integer** | The disc number (usually &#x60;1&#x60; unless the album consists of more than one disc).  |  [optional]
**durationMs** | **Integer** | The track length in milliseconds.  |  [optional]
**explicit** | **Boolean** | Whether or not the track has explicit lyrics ( &#x60;true&#x60; &#x3D; yes it does; &#x60;false&#x60; &#x3D; no it does not OR unknown).  |  [optional]
**externalIds** | [**ExternalIdObject**](ExternalIdObject.md) | Known external IDs for the track.  |  [optional]
**externalUrls** | [**ExternalUrlObject**](ExternalUrlObject.md) | Known external URLs for this track.  |  [optional]
**href** | **String** | A link to the Web API endpoint providing full details of the track.  |  [optional]
**id** | **String** | The [Spotify ID](/documentation/web-api/#spotify-uris-and-ids) for the track.  |  [optional]
**isLocal** | **Boolean** | Whether or not the track is from a local file.  |  [optional]
**isPlayable** | **Boolean** | Part of the response when [Track Relinking](/documentation/general/guides/track-relinking-guide/) is applied. If &#x60;true&#x60;, the track is playable in the given market. Otherwise &#x60;false&#x60;.  |  [optional]
**linkedFrom** | [**LinkedTrackObject**](LinkedTrackObject.md) | Part of the response when [Track Relinking](/documentation/general/guides/track-relinking-guide/) is applied and is only part of the response if the track linking, in fact, exists. The requested track has been replaced with a different track. The track in the &#x60;linked_from&#x60; object contains information about the originally requested track. |  [optional]
**name** | **String** | The name of the track.  |  [optional]
**popularity** | **Integer** | The popularity of the track. The value will be between 0 and 100, with 100 being the most popular.&lt;br/&gt;The popularity of a track is a value between 0 and 100, with 100 being the most popular. The popularity is calculated by algorithm and is based, in the most part, on the total number of plays the track has had and how recent those plays are.&lt;br/&gt;Generally speaking, songs that are being played a lot now will have a higher popularity than songs that were played a lot in the past. Duplicate tracks (e.g. the same track from a single and an album) are rated independently. Artist and album popularity is derived mathematically from track popularity. _**Note**: the popularity value may lag actual popularity by a few days: the value is not updated in real time._  |  [optional]
**previewUrl** | **String** | A link to a 30 second preview (MP3 format) of the track. Can be &#x60;null&#x60;  |  [optional]
**restrictions** | [**TrackRestrictionObject**](TrackRestrictionObject.md) | Included in the response when a content restriction is applied.  |  [optional]
**trackNumber** | **Integer** | The number of the track. If an album has several discs, the track number is the number on the specified disc.  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The object type: \&quot;track\&quot;.  |  [optional]
**uri** | **String** | The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for the track.  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TRACK | &quot;track&quot;



