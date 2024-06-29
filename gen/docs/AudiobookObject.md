

# AudiobookObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authors** | [**List&lt;AuthorObject&gt;**](AuthorObject.md) | The author(s) for the audiobook.  | 
**availableMarkets** | **List&lt;String&gt;** | A list of the countries in which the audiobook can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.  | 
**copyrights** | [**List&lt;CopyrightObject&gt;**](CopyrightObject.md) | The copyright statements of the audiobook.  | 
**description** | **String** | A description of the audiobook. HTML tags are stripped away from this field, use &#x60;html_description&#x60; field in case HTML tags are needed.  | 
**edition** | **String** | The edition of the audiobook.  |  [optional]
**explicit** | **Boolean** | Whether or not the audiobook has explicit content (true &#x3D; yes it does; false &#x3D; no it does not OR unknown).  | 
**externalUrls** | [**ExternalUrlObject**](ExternalUrlObject.md) | External URLs for this audiobook.  | 
**href** | **String** | A link to the Web API endpoint providing full details of the audiobook.  | 
**htmlDescription** | **String** | A description of the audiobook. This field may contain HTML tags.  | 
**id** | **String** | The [Spotify ID](/documentation/web-api/#spotify-uris-and-ids) for the audiobook.  | 
**images** | [**List&lt;ImageObject&gt;**](ImageObject.md) | The cover art for the audiobook in various sizes, widest first.  | 
**languages** | **List&lt;String&gt;** | A list of the languages used in the audiobook, identified by their [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code.  | 
**mediaType** | **String** | The media type of the audiobook.  | 
**name** | **String** | The name of the audiobook.  | 
**narrators** | [**List&lt;NarratorObject&gt;**](NarratorObject.md) | The narrator(s) for the audiobook.  | 
**publisher** | **String** | The publisher of the audiobook.  | 
**totalChapters** | **Integer** | The number of chapters in this audiobook.  | 
**type** | [**TypeEnum**](#TypeEnum) | The object type.  | 
**uri** | **String** | The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for the audiobook.  | 
**chapters** | [**PagingSimplifiedChapterObject**](PagingSimplifiedChapterObject.md) | The chapters of the audiobook.  | 



## Enum: TypeEnum

Name | Value
---- | -----
AUDIOBOOK | &quot;audiobook&quot;



