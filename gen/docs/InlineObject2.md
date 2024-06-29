

# InlineObject2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**snapshotId** | **String** | The playlist&#39;s snapshot ID against which you want to make the changes. The API will validate that the specified items exist and in the specified positions and make the changes, even if more recent changes have been made to the playlist.  |  [optional]
**tracks** | [**List&lt;PlaylistsPlaylistIdTracksTracks&gt;**](PlaylistsPlaylistIdTracksTracks.md) | An array of objects containing [Spotify URIs](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) of the tracks or episodes to remove. For example: &#x60;{ \&quot;tracks\&quot;: [{ \&quot;uri\&quot;: \&quot;spotify:track:4iV5W9uYEdYUVa79Axb7Rh\&quot; },{ \&quot;uri\&quot;: \&quot;spotify:track:1301WleyT98MSxVHPZCA6M\&quot; }] }&#x60;. A maximum of 100 objects can be sent at once.  | 



