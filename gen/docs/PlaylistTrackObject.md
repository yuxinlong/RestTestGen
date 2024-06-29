

# PlaylistTrackObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addedAt** | **OffsetDateTime** | The date and time the track or episode was added. _**Note**: some very old playlists may return &#x60;null&#x60; in this field._  |  [optional]
**addedBy** | [**PlaylistUserObject**](PlaylistUserObject.md) | The Spotify user who added the track or episode. _**Note**: some very old playlists may return &#x60;null&#x60; in this field._  |  [optional]
**isLocal** | **Boolean** | Whether this track or episode is a [local file](https://developer.spotify.com/web-api/local-files-spotify-playlists/) or not.  |  [optional]
**track** | [**OneOfTrackObjectEpisodeObject**](OneOfTrackObjectEpisodeObject.md) | Information about the track or episode. |  [optional]



