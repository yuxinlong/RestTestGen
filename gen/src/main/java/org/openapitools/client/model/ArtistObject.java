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
import org.openapitools.client.model.ExternalUrlObject;
import org.openapitools.client.model.FollowersObject;
import org.openapitools.client.model.ImageObject;

/**
 * ArtistObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T15:44:39.866286+08:00[Asia/Shanghai]")
public class ArtistObject {
  public static final String SERIALIZED_NAME_EXTERNAL_URLS = "external_urls";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URLS)
  private ExternalUrlObject externalUrls = null;

  public static final String SERIALIZED_NAME_FOLLOWERS = "followers";
  @SerializedName(SERIALIZED_NAME_FOLLOWERS)
  private FollowersObject followers = null;

  public static final String SERIALIZED_NAME_GENRES = "genres";
  @SerializedName(SERIALIZED_NAME_GENRES)
  private List<String> genres = null;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<ImageObject> images = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POPULARITY = "popularity";
  @SerializedName(SERIALIZED_NAME_POPULARITY)
  private Integer popularity;

  /**
   * The object type. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ARTIST("artist");

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


  public ArtistObject externalUrls(ExternalUrlObject externalUrls) {
    
    this.externalUrls = externalUrls;
    return this;
  }

   /**
   * Known external URLs for this artist. 
   * @return externalUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Known external URLs for this artist. ")

  public ExternalUrlObject getExternalUrls() {
    return externalUrls;
  }


  public void setExternalUrls(ExternalUrlObject externalUrls) {
    this.externalUrls = externalUrls;
  }


  public ArtistObject followers(FollowersObject followers) {
    
    this.followers = followers;
    return this;
  }

   /**
   * Information about the followers of the artist. 
   * @return followers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about the followers of the artist. ")

  public FollowersObject getFollowers() {
    return followers;
  }


  public void setFollowers(FollowersObject followers) {
    this.followers = followers;
  }


  public ArtistObject genres(List<String> genres) {
    
    this.genres = genres;
    return this;
  }

  public ArtistObject addGenresItem(String genresItem) {
    if (this.genres == null) {
      this.genres = new ArrayList<String>();
    }
    this.genres.add(genresItem);
    return this;
  }

   /**
   * A list of the genres the artist is associated with. If not yet classified, the array is empty. 
   * @return genres
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"Prog rock\",\"Grunge\"]", value = "A list of the genres the artist is associated with. If not yet classified, the array is empty. ")

  public List<String> getGenres() {
    return genres;
  }


  public void setGenres(List<String> genres) {
    this.genres = genres;
  }


  public ArtistObject href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * A link to the Web API endpoint providing full details of the artist. 
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A link to the Web API endpoint providing full details of the artist. ")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public ArtistObject id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The [Spotify ID](/documentation/web-api/#spotify-uris-and-ids) for the artist. 
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [Spotify ID](/documentation/web-api/#spotify-uris-and-ids) for the artist. ")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ArtistObject images(List<ImageObject> images) {
    
    this.images = images;
    return this;
  }

  public ArtistObject addImagesItem(ImageObject imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<ImageObject>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Images of the artist in various sizes, widest first. 
   * @return images
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Images of the artist in various sizes, widest first. ")

  public List<ImageObject> getImages() {
    return images;
  }


  public void setImages(List<ImageObject> images) {
    this.images = images;
  }


  public ArtistObject name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the artist. 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the artist. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ArtistObject popularity(Integer popularity) {
    
    this.popularity = popularity;
    return this;
  }

   /**
   * The popularity of the artist. The value will be between 0 and 100, with 100 being the most popular. The artist&#39;s popularity is calculated from the popularity of all the artist&#39;s tracks. 
   * @return popularity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The popularity of the artist. The value will be between 0 and 100, with 100 being the most popular. The artist's popularity is calculated from the popularity of all the artist's tracks. ")

  public Integer getPopularity() {
    return popularity;
  }


  public void setPopularity(Integer popularity) {
    this.popularity = popularity;
  }


  public ArtistObject type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The object type. 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The object type. ")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ArtistObject uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for the artist. 
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for the artist. ")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtistObject artistObject = (ArtistObject) o;
    return Objects.equals(this.externalUrls, artistObject.externalUrls) &&
        Objects.equals(this.followers, artistObject.followers) &&
        Objects.equals(this.genres, artistObject.genres) &&
        Objects.equals(this.href, artistObject.href) &&
        Objects.equals(this.id, artistObject.id) &&
        Objects.equals(this.images, artistObject.images) &&
        Objects.equals(this.name, artistObject.name) &&
        Objects.equals(this.popularity, artistObject.popularity) &&
        Objects.equals(this.type, artistObject.type) &&
        Objects.equals(this.uri, artistObject.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUrls, followers, genres, href, id, images, name, popularity, type, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtistObject {\n");
    sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

