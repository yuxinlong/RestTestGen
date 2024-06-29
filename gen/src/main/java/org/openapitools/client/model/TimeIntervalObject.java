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
import java.math.BigDecimal;

/**
 * TimeIntervalObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T15:44:39.866286+08:00[Asia/Shanghai]")
public class TimeIntervalObject {
  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private BigDecimal confidence;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private BigDecimal duration;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private BigDecimal start;


  public TimeIntervalObject confidence(BigDecimal confidence) {
    
    this.confidence = confidence;
    return this;
  }

   /**
   * The confidence, from 0.0 to 1.0, of the reliability of the interval.
   * minimum: 0
   * maximum: 1
   * @return confidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.925", value = "The confidence, from 0.0 to 1.0, of the reliability of the interval.")

  public BigDecimal getConfidence() {
    return confidence;
  }


  public void setConfidence(BigDecimal confidence) {
    this.confidence = confidence;
  }


  public TimeIntervalObject duration(BigDecimal duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * The duration (in seconds) of the time interval.
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.18749", value = "The duration (in seconds) of the time interval.")

  public BigDecimal getDuration() {
    return duration;
  }


  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }


  public TimeIntervalObject start(BigDecimal start) {
    
    this.start = start;
    return this;
  }

   /**
   * The starting point (in seconds) of the time interval.
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.49567", value = "The starting point (in seconds) of the time interval.")

  public BigDecimal getStart() {
    return start;
  }


  public void setStart(BigDecimal start) {
    this.start = start;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeIntervalObject timeIntervalObject = (TimeIntervalObject) o;
    return Objects.equals(this.confidence, timeIntervalObject.confidence) &&
        Objects.equals(this.duration, timeIntervalObject.duration) &&
        Objects.equals(this.start, timeIntervalObject.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, duration, start);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeIntervalObject {\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

