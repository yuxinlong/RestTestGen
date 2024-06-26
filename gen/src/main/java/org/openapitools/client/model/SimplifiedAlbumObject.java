/*
 * Spotify Web API with fixes and improvements from sonallux
 * You can use Spotify's Web API to discover music and podcasts, manage your Spotify library, control audio playback, and much more. Browse our available Web API endpoints using the sidebar at left, or via the navigation bar on top of this page on smaller screens.  In order to make successful Web API requests your app will need a valid access token. One can be obtained through <a href=\"https://developer.spotify.com/documentation/general/guides/authorization-guide/\">OAuth 2.0</a>.  The base URI for all Web API requests is `https://api.spotify.com/v1`.  Need help? See our <a href=\"https://developer.spotify.com/documentation/web-api/guides/\">Web API guides</a> for more information, or visit the <a href=\"https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer\">Spotify for Developers community forum</a> to ask questions and connect with other developers. 
 *
 * The version of the OpenAPI document: 2023.2.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.AlbumBase;
import org.openapitools.client.model.AlbumRestrictionObject;
import org.openapitools.client.model.ExternalUrlObject;
import org.openapitools.client.model.ImageObject;
import org.openapitools.client.model.SimplifiedAlbumObjectAllOf;
import org.openapitools.client.model.SimplifiedArtistObject;

/**
 * SimplifiedAlbumObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T15:44:39.866286+08:00[Asia/Shanghai]")
public class SimplifiedAlbumObject {
  /**
   * The type of the album. 
   */
  @JsonAdapter(AlbumTypeEnum.Adapter.class)
  public enum AlbumTypeEnum {
    ALBUM("album"),
    
    SINGLE("single"),
    
    COMPILATION("compilation");

    private String value;

    AlbumTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlbumTypeEnum fromValue(String value) {
      for (AlbumTypeEnum b : AlbumTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AlbumTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlbumTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlbumTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AlbumTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALBUM_TYPE = "album_type";
  @SerializedName(SERIALIZED_NAME_ALBUM_TYPE)
  private AlbumTypeEnum albumType;

  public static final String SERIALIZED_NAME_AVAILABLE_MARKETS = "available_markets";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_MARKETS)
  private List<String> availableMarkets = new ArrayList<String>();

  public static final String SERIALIZED_NAME_EXTERNAL_URLS = "external_urls";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URLS)
  private ExternalUrlObject externalUrls = null;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<ImageObject> images = new ArrayList<ImageObject>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RELEASE_DATE = "release_date";
  @SerializedName(SERIALIZED_NAME_RELEASE_DATE)
  private String releaseDate;

  /**
   * The precision with which &#x60;release_date&#x60; value is known. 
   */
  @JsonAdapter(ReleaseDatePrecisionEnum.Adapter.class)
  public enum ReleaseDatePrecisionEnum {
    YEAR("year"),
    
    MONTH("month"),
    
    DAY("day");

    private String value;

    ReleaseDatePrecisionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReleaseDatePrecisionEnum fromValue(String value) {
      for (ReleaseDatePrecisionEnum b : ReleaseDatePrecisionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReleaseDatePrecisionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReleaseDatePrecisionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReleaseDatePrecisionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReleaseDatePrecisionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RELEASE_DATE_PRECISION = "release_date_precision";
  @SerializedName(SERIALIZED_NAME_RELEASE_DATE_PRECISION)
  private ReleaseDatePrecisionEnum releaseDatePrecision;

  public static final String SERIALIZED_NAME_RESTRICTIONS = "restrictions";
  @SerializedName(SERIALIZED_NAME_RESTRICTIONS)
  private AlbumRestrictionObject restrictions = null;

  public static final String SERIALIZED_NAME_TOTAL_TRACKS = "total_tracks";
  @SerializedName(SERIALIZED_NAME_TOTAL_TRACKS)
  private Integer totalTracks;

  /**
   * The object type. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ALBUM("album");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  /**
   * The field is present when getting an artist&#39;s albums. Compare to album_type this field represents relationship between the artist and the album. 
   */
  @JsonAdapter(AlbumGroupEnum.Adapter.class)
  public enum AlbumGroupEnum {
    ALBUM("album"),
    
    SINGLE("single"),
    
    COMPILATION("compilation"),
    
    APPEARS_ON("appears_on");

    private String value;

    AlbumGroupEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlbumGroupEnum fromValue(String value) {
      for (AlbumGroupEnum b : AlbumGroupEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AlbumGroupEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlbumGroupEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlbumGroupEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AlbumGroupEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALBUM_GROUP = "album_group";
  @SerializedName(SERIALIZED_NAME_ALBUM_GROUP)
  private AlbumGroupEnum albumGroup;

  public static final String SERIALIZED_NAME_ARTISTS = "artists";
  @SerializedName(SERIALIZED_NAME_ARTISTS)
  private List<SimplifiedArtistObject> artists = new ArrayList<SimplifiedArtistObject>();


  public SimplifiedAlbumObject albumType(AlbumTypeEnum albumType) {
    
    this.albumType = albumType;
    return this;
  }

   /**
   * The type of the album. 
   * @return albumType
  **/
  @ApiModelProperty(example = "compilation", required = true, value = "The type of the album. ")

  public AlbumTypeEnum getAlbumType() {
    return albumType;
  }


  public void setAlbumType(AlbumTypeEnum albumType) {
    this.albumType = albumType;
  }


  public SimplifiedAlbumObject availableMarkets(List<String> availableMarkets) {
    
    this.availableMarkets = availableMarkets;
    return this;
  }

  public SimplifiedAlbumObject addAvailableMarketsItem(String availableMarketsItem) {
    this.availableMarkets.add(availableMarketsItem);
    return this;
  }

   /**
   * The markets in which the album is available: [ISO 3166-1 alpha-2 country codes](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). _**NOTE**: an album is considered available in a market when at least 1 of its tracks is available in that market._ 
   * @return availableMarkets
  **/
  @ApiModelProperty(example = "[\"CA\",\"BR\",\"IT\"]", required = true, value = "The markets in which the album is available: [ISO 3166-1 alpha-2 country codes](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). _**NOTE**: an album is considered available in a market when at least 1 of its tracks is available in that market._ ")

  public List<String> getAvailableMarkets() {
    return availableMarkets;
  }


  public void setAvailableMarkets(List<String> availableMarkets) {
    this.availableMarkets = availableMarkets;
  }


  public SimplifiedAlbumObject externalUrls(ExternalUrlObject externalUrls) {
    
    this.externalUrls = externalUrls;
    return this;
  }

   /**
   * Known external URLs for this album. 
   * @return externalUrls
  **/
  @ApiModelProperty(required = true, value = "Known external URLs for this album. ")

  public ExternalUrlObject getExternalUrls() {
    return externalUrls;
  }


  public void setExternalUrls(ExternalUrlObject externalUrls) {
    this.externalUrls = externalUrls;
  }


  public SimplifiedAlbumObject href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * A link to the Web API endpoint providing full details of the album. 
   * @return href
  **/
  @ApiModelProperty(required = true, value = "A link to the Web API endpoint providing full details of the album. ")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public SimplifiedAlbumObject id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The [Spotify ID](/documentation/web-api/#spotify-uris-and-ids) for the album. 
   * @return id
  **/
  @ApiModelProperty(example = "2up3OPMp9Tb4dAKM2erWXQ", required = true, value = "The [Spotify ID](/documentation/web-api/#spotify-uris-and-ids) for the album. ")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SimplifiedAlbumObject images(List<ImageObject> images) {
    
    this.images = images;
    return this;
  }

  public SimplifiedAlbumObject addImagesItem(ImageObject imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

   /**
   * The cover art for the album in various sizes, widest first. 
   * @return images
  **/
  @ApiModelProperty(required = true, value = "The cover art for the album in various sizes, widest first. ")

  public List<ImageObject> getImages() {
    return images;
  }


  public void setImages(List<ImageObject> images) {
    this.images = images;
  }


  public SimplifiedAlbumObject name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the album. In case of an album takedown, the value may be an empty string. 
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the album. In case of an album takedown, the value may be an empty string. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SimplifiedAlbumObject releaseDate(String releaseDate) {
    
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * The date the album was first released. 
   * @return releaseDate
  **/
  @ApiModelProperty(example = "1981-12", required = true, value = "The date the album was first released. ")

  public String getReleaseDate() {
    return releaseDate;
  }


  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }


  public SimplifiedAlbumObject releaseDatePrecision(ReleaseDatePrecisionEnum releaseDatePrecision) {
    
    this.releaseDatePrecision = releaseDatePrecision;
    return this;
  }

   /**
   * The precision with which &#x60;release_date&#x60; value is known. 
   * @return releaseDatePrecision
  **/
  @ApiModelProperty(example = "year", required = true, value = "The precision with which `release_date` value is known. ")

  public ReleaseDatePrecisionEnum getReleaseDatePrecision() {
    return releaseDatePrecision;
  }


  public void setReleaseDatePrecision(ReleaseDatePrecisionEnum releaseDatePrecision) {
    this.releaseDatePrecision = releaseDatePrecision;
  }


  public SimplifiedAlbumObject restrictions(AlbumRestrictionObject restrictions) {
    
    this.restrictions = restrictions;
    return this;
  }

   /**
   * Included in the response when a content restriction is applied. 
   * @return restrictions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Included in the response when a content restriction is applied. ")

  public AlbumRestrictionObject getRestrictions() {
    return restrictions;
  }


  public void setRestrictions(AlbumRestrictionObject restrictions) {
    this.restrictions = restrictions;
  }


  public SimplifiedAlbumObject totalTracks(Integer totalTracks) {
    
    this.totalTracks = totalTracks;
    return this;
  }

   /**
   * The number of tracks in the album.
   * @return totalTracks
  **/
  @ApiModelProperty(example = "9", required = true, value = "The number of tracks in the album.")

  public Integer getTotalTracks() {
    return totalTracks;
  }


  public void setTotalTracks(Integer totalTracks) {
    this.totalTracks = totalTracks;
  }


  public SimplifiedAlbumObject type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The object type. 
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The object type. ")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public SimplifiedAlbumObject uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for the album. 
   * @return uri
  **/
  @ApiModelProperty(example = "spotify:album:2up3OPMp9Tb4dAKM2erWXQ", required = true, value = "The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for the album. ")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public SimplifiedAlbumObject albumGroup(AlbumGroupEnum albumGroup) {
    
    this.albumGroup = albumGroup;
    return this;
  }

   /**
   * The field is present when getting an artist&#39;s albums. Compare to album_type this field represents relationship between the artist and the album. 
   * @return albumGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "compilation", value = "The field is present when getting an artist's albums. Compare to album_type this field represents relationship between the artist and the album. ")

  public AlbumGroupEnum getAlbumGroup() {
    return albumGroup;
  }


  public void setAlbumGroup(AlbumGroupEnum albumGroup) {
    this.albumGroup = albumGroup;
  }


  public SimplifiedAlbumObject artists(List<SimplifiedArtistObject> artists) {
    
    this.artists = artists;
    return this;
  }

  public SimplifiedAlbumObject addArtistsItem(SimplifiedArtistObject artistsItem) {
    this.artists.add(artistsItem);
    return this;
  }

   /**
   * The artists of the album. Each artist object includes a link in &#x60;href&#x60; to more detailed information about the artist. 
   * @return artists
  **/
  @ApiModelProperty(required = true, value = "The artists of the album. Each artist object includes a link in `href` to more detailed information about the artist. ")

  public List<SimplifiedArtistObject> getArtists() {
    return artists;
  }


  public void setArtists(List<SimplifiedArtistObject> artists) {
    this.artists = artists;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimplifiedAlbumObject simplifiedAlbumObject = (SimplifiedAlbumObject) o;
    return Objects.equals(this.albumType, simplifiedAlbumObject.albumType) &&
        Objects.equals(this.availableMarkets, simplifiedAlbumObject.availableMarkets) &&
        Objects.equals(this.externalUrls, simplifiedAlbumObject.externalUrls) &&
        Objects.equals(this.href, simplifiedAlbumObject.href) &&
        Objects.equals(this.id, simplifiedAlbumObject.id) &&
        Objects.equals(this.images, simplifiedAlbumObject.images) &&
        Objects.equals(this.name, simplifiedAlbumObject.name) &&
        Objects.equals(this.releaseDate, simplifiedAlbumObject.releaseDate) &&
        Objects.equals(this.releaseDatePrecision, simplifiedAlbumObject.releaseDatePrecision) &&
        Objects.equals(this.restrictions, simplifiedAlbumObject.restrictions) &&
        Objects.equals(this.totalTracks, simplifiedAlbumObject.totalTracks) &&
        Objects.equals(this.type, simplifiedAlbumObject.type) &&
        Objects.equals(this.uri, simplifiedAlbumObject.uri) &&
        Objects.equals(this.albumGroup, simplifiedAlbumObject.albumGroup) &&
        Objects.equals(this.artists, simplifiedAlbumObject.artists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(albumType, availableMarkets, externalUrls, href, id, images, name, releaseDate, releaseDatePrecision, restrictions, totalTracks, type, uri, albumGroup, artists);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimplifiedAlbumObject {\n");
    sb.append("    albumType: ").append(toIndentedString(albumType)).append("\n");
    sb.append("    availableMarkets: ").append(toIndentedString(availableMarkets)).append("\n");
    sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    releaseDatePrecision: ").append(toIndentedString(releaseDatePrecision)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
    sb.append("    totalTracks: ").append(toIndentedString(totalTracks)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    albumGroup: ").append(toIndentedString(albumGroup)).append("\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

