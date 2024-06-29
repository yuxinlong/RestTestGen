

# AlbumObjectAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artists** | [**List&lt;SimplifiedArtistObject&gt;**](SimplifiedArtistObject.md) | The artists of the album. Each artist object includes a link in &#x60;href&#x60; to more detailed information about the artist.  |  [optional]
**copyrights** | [**List&lt;CopyrightObject&gt;**](CopyrightObject.md) | The copyright statements of the album. |  [optional]
**externalIds** | [**ExternalIdObject**](ExternalIdObject.md) | Known external IDs for the album.  |  [optional]
**genres** | **List&lt;String&gt;** | A list of the genres used to classify the album. (If not yet classified, the array is empty.) |  [optional]
**label** | **String** | The label for the album. |  [optional]
**popularity** | **Integer** | The popularity of the album, with 100 being the most popular. The popularity is calculated from the popularity of the album&#39;s individual tracks. |  [optional]
**tracks** | [**PagingSimplifiedTrackObject**](PagingSimplifiedTrackObject.md) | The tracks of the album.  |  [optional]



