

# SimplifiedAlbumObjectAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**albumGroup** | [**AlbumGroupEnum**](#AlbumGroupEnum) | The field is present when getting an artist&#39;s albums. Compare to album_type this field represents relationship between the artist and the album.  |  [optional]
**artists** | [**List&lt;SimplifiedArtistObject&gt;**](SimplifiedArtistObject.md) | The artists of the album. Each artist object includes a link in &#x60;href&#x60; to more detailed information about the artist.  | 



## Enum: AlbumGroupEnum

Name | Value
---- | -----
ALBUM | &quot;album&quot;
SINGLE | &quot;single&quot;
COMPILATION | &quot;compilation&quot;
APPEARS_ON | &quot;appears_on&quot;



