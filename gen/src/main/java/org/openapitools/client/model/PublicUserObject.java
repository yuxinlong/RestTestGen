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
 * PublicUserObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T15:44:39.866286+08:00[Asia/Shanghai]")
public class PublicUserObject {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_EXTERNAL_URLS = "external_urls";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URLS)
  private ExternalUrlObject externalUrls = null;

  public static final String SERIALIZED_NAME_FOLLOWERS = "followers";
  @SerializedName(SERIALIZED_NAME_FOLLOWERS)
  private FollowersObject followers = null;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<ImageObject> images = null;

  /**
   * The object type. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    USER("user");

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


  public PublicUserObject displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name displayed on the user&#39;s profile. &#x60;null&#x60; if not available. 
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name displayed on the user's profile. `null` if not available. ")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public PublicUserObject externalUrls(ExternalUrlObject externalUrls) {
    
    this.externalUrls = externalUrls;
    return this;
  }

   /**
   * Known public external URLs for this user. 
   * @return externalUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Known public external URLs for this user. ")

  public ExternalUrlObject getExternalUrls() {
    return externalUrls;
  }


  public void setExternalUrls(ExternalUrlObject externalUrls) {
    this.externalUrls = externalUrls;
  }


  public PublicUserObject followers(FollowersObject followers) {
    
    this.followers = followers;
    return this;
  }

   /**
   * Information about the followers of this user. 
   * @return followers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about the followers of this user. ")

  public FollowersObject getFollowers() {
    return followers;
  }


  public void setFollowers(FollowersObject followers) {
    this.followers = followers;
  }


  public PublicUserObject href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * A link to the Web API endpoint for this user. 
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A link to the Web API endpoint for this user. ")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public PublicUserObject id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The [Spotify user ID](/documentation/web-api/#spotify-uris-and-ids) for this user. 
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [Spotify user ID](/documentation/web-api/#spotify-uris-and-ids) for this user. ")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PublicUserObject images(List<ImageObject> images) {
    
    this.images = images;
    return this;
  }

  public PublicUserObject addImagesItem(ImageObject imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<ImageObject>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * The user&#39;s profile image. 
   * @return images
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's profile image. ")

  public List<ImageObject> getImages() {
    return images;
  }


  public void setImages(List<ImageObject> images) {
    this.images = images;
  }


  public PublicUserObject type(TypeEnum type) {
    
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


  public PublicUserObject uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for this user. 
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for this user. ")

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
    PublicUserObject publicUserObject = (PublicUserObject) o;
    return Objects.equals(this.displayName, publicUserObject.displayName) &&
        Objects.equals(this.externalUrls, publicUserObject.externalUrls) &&
        Objects.equals(this.followers, publicUserObject.followers) &&
        Objects.equals(this.href, publicUserObject.href) &&
        Objects.equals(this.id, publicUserObject.id) &&
        Objects.equals(this.images, publicUserObject.images) &&
        Objects.equals(this.type, publicUserObject.type) &&
        Objects.equals(this.uri, publicUserObject.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, externalUrls, followers, href, id, images, type, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicUserObject {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
