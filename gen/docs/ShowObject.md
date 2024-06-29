

# ShowObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableMarkets** | **List&lt;String&gt;** | A list of the countries in which the show can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.  | 
**copyrights** | [**List&lt;CopyrightObject&gt;**](CopyrightObject.md) | The copyright statements of the show.  | 
**description** | **String** | A description of the show. HTML tags are stripped away from this field, use &#x60;html_description&#x60; field in case HTML tags are needed.  | 
**explicit** | **Boolean** | Whether or not the show has explicit content (true &#x3D; yes it does; false &#x3D; no it does not OR unknown).  | 
**externalUrls** | [**ExternalUrlObject**](ExternalUrlObject.md) | External URLs for this show.  | 
**href** | **String** | A link to the Web API endpoint providing full details of the show.  | 
**htmlDescription** | **String** | A description of the show. This field may contain HTML tags.  | 
**id** | **String** | The [Spotify ID](/documentation/web-api/#spotify-uris-and-ids) for the show.  | 
**images** | [**List&lt;ImageObject&gt;**](ImageObject.md) | The cover art for the show in various sizes, widest first.  | 
**isExternallyHosted** | **Boolean** | True if all of the shows episodes are hosted outside of Spotify&#39;s CDN. This field might be &#x60;null&#x60; in some cases.  | 
**languages** | **List&lt;String&gt;** | A list of the languages used in the show, identified by their [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code.  | 
**mediaType** | **String** | The media type of the show.  | 
**name** | **String** | The name of the episode.  | 
**publisher** | **String** | The publisher of the show.  | 
**totalEpisodes** | **Integer** | The total number of episodes in the show.  | 
**type** | [**TypeEnum**](#TypeEnum) | The object type.  | 
**uri** | **String** | The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for the show.  | 
**episodes** | [**PagingSimplifiedEpisodeObject**](PagingSimplifiedEpisodeObject.md) | The episodes of the show.  | 



## Enum: TypeEnum

Name | Value
---- | -----
SHOW | &quot;show&quot;



