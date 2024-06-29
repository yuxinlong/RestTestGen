

# RecommendationSeedObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**afterFilteringSize** | **Integer** | The number of tracks available after min\\_\\* and max\\_\\* filters have been applied.  |  [optional]
**afterRelinkingSize** | **Integer** | The number of tracks available after relinking for regional availability.  |  [optional]
**href** | **String** | A link to the full track or artist data for this seed. For tracks this will be a link to a Track Object. For artists a link to an Artist Object. For genre seeds, this value will be &#x60;null&#x60;.  |  [optional]
**id** | **String** | The id used to select this seed. This will be the same as the string used in the &#x60;seed_artists&#x60;, &#x60;seed_tracks&#x60; or &#x60;seed_genres&#x60; parameter.  |  [optional]
**initialPoolSize** | **Integer** | The number of recommended tracks available for this seed.  |  [optional]
**type** | **String** | The entity type of this seed. One of &#x60;artist&#x60;, &#x60;track&#x60; or &#x60;genre&#x60;.  |  [optional]



