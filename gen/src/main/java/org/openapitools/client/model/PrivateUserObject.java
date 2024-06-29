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
import org.openapitools.client.model.ExplicitContentSettingsObject;
import org.openapitools.client.model.ExternalUrlObject;
import org.openapitools.client.model.FollowersObject;
import org.openapitools.client.model.ImageObject;

/**
 * PrivateUserObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T15:44:39.866286+08:00[Asia/Shanghai]")
public class PrivateUserObject {
  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EXPLICIT_CONTENT = "explicit_content";
  @SerializedName(SERIALIZED_NAME_EXPLICIT_CONTENT)
  private ExplicitContentSettingsObject explicitContent = null;

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

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private String product;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;


  public PrivateUserObject country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country of the user, as set in the user&#39;s account profile. An [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). _This field is only available when the current user has granted access to the [user-read-private](/documentation/general/guides/authorization-guide/#list-of-scopes) scope._ 
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country of the user, as set in the user's account profile. An [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). _This field is only available when the current user has granted access to the [user-read-private](/documentation/general/guides/authorization-guide/#list-of-scopes) scope._ ")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public PrivateUserObject displayName(String displayName) {
    
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


  public PrivateUserObject email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The user&#39;s email address, as entered by the user when creating their account. _**Important!** This email address is unverified; there is no proof that it actually belongs to the user._ _This field is only available when the current user has granted access to the [user-read-email](/documentation/general/guides/authorization-guide/#list-of-scopes) scope._ 
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's email address, as entered by the user when creating their account. _**Important!** This email address is unverified; there is no proof that it actually belongs to the user._ _This field is only available when the current user has granted access to the [user-read-email](/documentation/general/guides/authorization-guide/#list-of-scopes) scope._ ")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public PrivateUserObject explicitContent(ExplicitContentSettingsObject explicitContent) {
    
    this.explicitContent = explicitContent;
    return this;
  }

   /**
   * The user&#39;s explicit content settings. _This field is only available when the current user has granted access to the [user-read-private](/documentation/general/guides/authorization-guide/#list-of-scopes) scope._ 
   * @return explicitContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's explicit content settings. _This field is only available when the current user has granted access to the [user-read-private](/documentation/general/guides/authorization-guide/#list-of-scopes) scope._ ")

  public ExplicitContentSettingsObject getExplicitContent() {
    return explicitContent;
  }


  public void setExplicitContent(ExplicitContentSettingsObject explicitContent) {
    this.explicitContent = explicitContent;
  }


  public PrivateUserObject externalUrls(ExternalUrlObject externalUrls) {
    
    this.externalUrls = externalUrls;
    return this;
  }

   /**
   * Known external URLs for this user.
   * @return externalUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Known external URLs for this user.")

  public ExternalUrlObject getExternalUrls() {
    return externalUrls;
  }


  public void setExternalUrls(ExternalUrlObject externalUrls) {
    this.externalUrls = externalUrls;
  }


  public PrivateUserObject followers(FollowersObject followers) {
    
    this.followers = followers;
    return this;
  }

   /**
   * Information about the followers of the user.
   * @return followers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about the followers of the user.")

  public FollowersObject getFollowers() {
    return followers;
  }


  public void setFollowers(FollowersObject followers) {
    this.followers = followers;
  }


  public PrivateUserObject href(String href) {
    
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


  public PrivateUserObject id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The [Spotify user ID](/documentation/web-api/#spotify-uris-and-ids) for the user. 
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [Spotify user ID](/documentation/web-api/#spotify-uris-and-ids) for the user. ")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PrivateUserObject images(List<ImageObject> images) {
    
    this.images = images;
    return this;
  }

  public PrivateUserObject addImagesItem(ImageObject imagesItem) {
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
  @ApiModelProperty(value = "The user's profile image.")

  public List<ImageObject> getImages() {
    return images;
  }


  public void setImages(List<ImageObject> images) {
    this.images = images;
  }


  public PrivateUserObject product(String product) {
    
    this.product = product;
    return this;
  }

   /**
   * The user&#39;s Spotify subscription level: \&quot;premium\&quot;, \&quot;free\&quot;, etc. (The subscription level \&quot;open\&quot; can be considered the same as \&quot;free\&quot;.) _This field is only available when the current user has granted access to the [user-read-private](/documentation/general/guides/authorization-guide/#list-of-scopes) scope._ 
   * @return product
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's Spotify subscription level: \"premium\", \"free\", etc. (The subscription level \"open\" can be considered the same as \"free\".) _This field is only available when the current user has granted access to the [user-read-private](/documentation/general/guides/authorization-guide/#list-of-scopes) scope._ ")

  public String getProduct() {
    return product;
  }


  public void setProduct(String product) {
    this.product = product;
  }


  public PrivateUserObject type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The object type: \&quot;user\&quot; 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The object type: \"user\" ")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public PrivateUserObject uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for the user. 
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for the user. ")

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
    PrivateUserObject privateUserObject = (PrivateUserObject) o;
    return Objects.equals(this.country, privateUserObject.country) &&
        Objects.equals(this.displayName, privateUserObject.displayName) &&
        Objects.equals(this.email, privateUserObject.email) &&
        Objects.equals(this.explicitContent, privateUserObject.explicitContent) &&
        Objects.equals(this.externalUrls, privateUserObject.externalUrls) &&
        Objects.equals(this.followers, privateUserObject.followers) &&
        Objects.equals(this.href, privateUserObject.href) &&
        Objects.equals(this.id, privateUserObject.id) &&
        Objects.equals(this.images, privateUserObject.images) &&
        Objects.equals(this.product, privateUserObject.product) &&
        Objects.equals(this.type, privateUserObject.type) &&
        Objects.equals(this.uri, privateUserObject.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, displayName, email, explicitContent, externalUrls, followers, href, id, images, product, type, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateUserObject {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    explicitContent: ").append(toIndentedString(explicitContent)).append("\n");
    sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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
