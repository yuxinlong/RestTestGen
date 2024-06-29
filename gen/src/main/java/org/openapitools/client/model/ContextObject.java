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
import org.openapitools.client.model.ExternalUrlObject;

/**
 * ContextObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T15:44:39.866286+08:00[Asia/Shanghai]")
public class ContextObject {
  public static final String SERIALIZED_NAME_EXTERNAL_URLS = "external_urls";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URLS)
  private ExternalUrlObject externalUrls = null;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;


  public ContextObject externalUrls(ExternalUrlObject externalUrls) {
    
    this.externalUrls = externalUrls;
    return this;
  }

   /**
   * External URLs for this context.
   * @return externalUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "External URLs for this context.")

  public ExternalUrlObject getExternalUrls() {
    return externalUrls;
  }


  public void setExternalUrls(ExternalUrlObject externalUrls) {
    this.externalUrls = externalUrls;
  }


  public ContextObject href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * A link to the Web API endpoint providing full details of the track.
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A link to the Web API endpoint providing full details of the track.")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public ContextObject type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The object type, e.g. \&quot;artist\&quot;, \&quot;playlist\&quot;, \&quot;album\&quot;, \&quot;show\&quot;. 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The object type, e.g. \"artist\", \"playlist\", \"album\", \"show\". ")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ContextObject uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for the context. 
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [Spotify URI](/documentation/web-api/#spotify-uris-and-ids) for the context. ")

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
    ContextObject contextObject = (ContextObject) o;
    return Objects.equals(this.externalUrls, contextObject.externalUrls) &&
        Objects.equals(this.href, contextObject.href) &&
        Objects.equals(this.type, contextObject.type) &&
        Objects.equals(this.uri, contextObject.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUrls, href, type, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextObject {\n");
    sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

