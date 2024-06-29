

# SimplifiedTrackObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artists** | [**List&lt;SimplifiedArtistObject&gt;**](SimplifiedArtistObject.md) | The artists who performed the track. Each artist object includes a link in &#x60;href&#x60; to more detailed information about the artist. |  [optional]
**availableMarkets** | **List&lt;String&gt;** | A list of the countries in which the track can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.  |  [optional]
**discNumber** | **Integer** | The disc number (usually &#x60;1&#x60; unless the album consists of more than one disc). |  [optional]
**durationMs** | **Integer** | The track length in milliseconds. |  [optional]
**explicit** | **Boolean** | Whether or not the track has explicit lyrics ( &#x60;true&#x60; &#x3D; yes it does; &#x60;false&#x60; &#x3D; no it does not OR unknown). |  [optional]
**externalUrls** | [**ExternalUrlObject**](ExternalUrlObject.md) | External URLs for this track.  |  [optional]
**href** | **String** | A link to the Web API endpoint providing full details of the track. |  [optional]
**id** | **String** | The [Spotify ID](/documentation/web-api/#spotify-uris-and-ids) for the track.  |  [optional]
**isLocal** | **Boolean** | Whether or not the track is from a local file.  |  [optional]
**isPlayable** | **Boolean** | Part of the response when [Track Relinking](/documentation/general/guides/track-relinking-guide/) is applied. If &#x60;true&#x60;, the track is playable in the given market. Otherwise &#x60;false&#x60;.  |  [optional]
**linkedFrom** | [**LinkedTrackObject**](LinkedTrackObject.md) | Part of the response when [Track Relinking](/documentation/general/guides/track-relinking-guide/) is applied and is only part of the response if the track linking, in fact, exists. The requested track has been replaced with a different track. The track in the &#x60;linked_from&#x60; object contains information about the originally requested track. |  [optional]
**name** | **String** | The name of the track. |  [optional]
**previewUrl** | **String** | A URL to a 30 second preview (MP3 format) of the track.  |  [optional]
**restrictions** | [**TrackRestrictionObject**](TrackRestrictionObject.md) | Included in the response when a content restriction is applied.  |  [optional]
**trackNumber** | **Integer** | The number of the track. If an album has several discs, the track number is the number on the specified disc.  |  [optional]
**type** | **String** | The object type: \&quot;track\&quot;.  |  [optional]
**uri** | **String** | The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for the track.  |  [optional]



