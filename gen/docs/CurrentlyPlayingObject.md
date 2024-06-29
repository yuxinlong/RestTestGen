

# CurrentlyPlayingObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**ContextObject**](ContextObject.md) | A Context Object. Can be &#x60;null&#x60;. |  [optional]
**currentlyPlayingType** | **String** | The object type of the currently playing item. Can be one of &#x60;track&#x60;, &#x60;episode&#x60;, &#x60;ad&#x60; or &#x60;unknown&#x60;.  |  [optional]
**isPlaying** | **Boolean** | If something is currently playing, return &#x60;true&#x60;. |  [optional]
**item** | [**OneOfTrackObjectEpisodeObject**](OneOfTrackObjectEpisodeObject.md) | The currently playing track or episode. Can be &#x60;null&#x60;. |  [optional]
**progressMs** | **Integer** | Progress into the currently playing track or episode. Can be &#x60;null&#x60;. |  [optional]
**timestamp** | **Integer** | Unix Millisecond Timestamp when data was fetched |  [optional]



