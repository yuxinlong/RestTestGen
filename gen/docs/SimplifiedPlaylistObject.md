

# SimplifiedPlaylistObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collaborative** | **Boolean** | &#x60;true&#x60; if the owner allows other users to modify the playlist.  |  [optional]
**description** | **String** | The playlist description. _Only returned for modified, verified playlists, otherwise_ &#x60;null&#x60;.  |  [optional]
**externalUrls** | [**ExternalUrlObject**](ExternalUrlObject.md) | Known external URLs for this playlist.  |  [optional]
**href** | **String** | A link to the Web API endpoint providing full details of the playlist.  |  [optional]
**id** | **String** | The [Spotify ID](/documentation/web-api/#spotify-uris-and-ids) for the playlist.  |  [optional]
**images** | [**List&lt;ImageObject&gt;**](ImageObject.md) | Images for the playlist. The array may be empty or contain up to three images. The images are returned by size in descending order. See [Working with Playlists](/documentation/general/guides/working-with-playlists/). _**Note**: If returned, the source URL for the image (&#x60;url&#x60;) is temporary and will expire in less than a day._  |  [optional]
**name** | **String** | The name of the playlist.  |  [optional]
**owner** | [**PlaylistOwnerObject**](PlaylistOwnerObject.md) | The user who owns the playlist  |  [optional]
**_public** | **Boolean** | The playlist&#39;s public/private status: &#x60;true&#x60; the playlist is public, &#x60;false&#x60; the playlist is private, &#x60;null&#x60; the playlist status is not relevant. For more about public/private status, see [Working with Playlists](/documentation/general/guides/working-with-playlists/)  |  [optional]
**snapshotId** | **String** | The version identifier for the current playlist. Can be supplied in other requests to target a specific playlist version  |  [optional]
**tracks** | [**PlaylistTracksRefObject**](PlaylistTracksRefObject.md) | A collection containing a link ( &#x60;href&#x60; ) to the Web API endpoint where full details of the playlist&#39;s tracks can be retrieved, along with the &#x60;total&#x60; number of tracks in the playlist. Note, a track object may be &#x60;null&#x60;. This can happen if a track is no longer available.  |  [optional]
**type** | **String** | The object type: \&quot;playlist\&quot;  |  [optional]
**uri** | **String** | The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for the playlist.  |  [optional]



