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

/**
 * DisallowsObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T15:44:39.866286+08:00[Asia/Shanghai]")
public class DisallowsObject {
  public static final String SERIALIZED_NAME_INTERRUPTING_PLAYBACK = "interrupting_playback";
  @SerializedName(SERIALIZED_NAME_INTERRUPTING_PLAYBACK)
  private Boolean interruptingPlayback;

  public static final String SERIALIZED_NAME_PAUSING = "pausing";
  @SerializedName(SERIALIZED_NAME_PAUSING)
  private Boolean pausing;

  public static final String SERIALIZED_NAME_RESUMING = "resuming";
  @SerializedName(SERIALIZED_NAME_RESUMING)
  private Boolean resuming;

  public static final String SERIALIZED_NAME_SEEKING = "seeking";
  @SerializedName(SERIALIZED_NAME_SEEKING)
  private Boolean seeking;

  public static final String SERIALIZED_NAME_SKIPPING_NEXT = "skipping_next";
  @SerializedName(SERIALIZED_NAME_SKIPPING_NEXT)
  private Boolean skippingNext;

  public static final String SERIALIZED_NAME_SKIPPING_PREV = "skipping_prev";
  @SerializedName(SERIALIZED_NAME_SKIPPING_PREV)
  private Boolean skippingPrev;

  public static final String SERIALIZED_NAME_TOGGLING_REPEAT_CONTEXT = "toggling_repeat_context";
  @SerializedName(SERIALIZED_NAME_TOGGLING_REPEAT_CONTEXT)
  private Boolean togglingRepeatContext;

  public static final String SERIALIZED_NAME_TOGGLING_REPEAT_TRACK = "toggling_repeat_track";
  @SerializedName(SERIALIZED_NAME_TOGGLING_REPEAT_TRACK)
  private Boolean togglingRepeatTrack;

  public static final String SERIALIZED_NAME_TOGGLING_SHUFFLE = "toggling_shuffle";
  @SerializedName(SERIALIZED_NAME_TOGGLING_SHUFFLE)
  private Boolean togglingShuffle;

  public static final String SERIALIZED_NAME_TRANSFERRING_PLAYBACK = "transferring_playback";
  @SerializedName(SERIALIZED_NAME_TRANSFERRING_PLAYBACK)
  private Boolean transferringPlayback;


  public DisallowsObject interruptingPlayback(Boolean interruptingPlayback) {
    
    this.interruptingPlayback = interruptingPlayback;
    return this;
  }

   /**
   * Interrupting playback. Optional field.
   * @return interruptingPlayback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Interrupting playback. Optional field.")

  public Boolean getInterruptingPlayback() {
    return interruptingPlayback;
  }


  public void setInterruptingPlayback(Boolean interruptingPlayback) {
    this.interruptingPlayback = interruptingPlayback;
  }


  public DisallowsObject pausing(Boolean pausing) {
    
    this.pausing = pausing;
    return this;
  }

   /**
   * Pausing. Optional field.
   * @return pausing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pausing. Optional field.")

  public Boolean getPausing() {
    return pausing;
  }


  public void setPausing(Boolean pausing) {
    this.pausing = pausing;
  }


  public DisallowsObject resuming(Boolean resuming) {
    
    this.resuming = resuming;
    return this;
  }

   /**
   * Resuming. Optional field.
   * @return resuming
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resuming. Optional field.")

  public Boolean getResuming() {
    return resuming;
  }


  public void setResuming(Boolean resuming) {
    this.resuming = resuming;
  }


  public DisallowsObject seeking(Boolean seeking) {
    
    this.seeking = seeking;
    return this;
  }

   /**
   * Seeking playback location. Optional field.
   * @return seeking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Seeking playback location. Optional field.")

  public Boolean getSeeking() {
    return seeking;
  }


  public void setSeeking(Boolean seeking) {
    this.seeking = seeking;
  }


  public DisallowsObject skippingNext(Boolean skippingNext) {
    
    this.skippingNext = skippingNext;
    return this;
  }

   /**
   * Skipping to the next context. Optional field.
   * @return skippingNext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skipping to the next context. Optional field.")

  public Boolean getSkippingNext() {
    return skippingNext;
  }


  public void setSkippingNext(Boolean skippingNext) {
    this.skippingNext = skippingNext;
  }


  public DisallowsObject skippingPrev(Boolean skippingPrev) {
    
    this.skippingPrev = skippingPrev;
    return this;
  }

   /**
   * Skipping to the previous context. Optional field.
   * @return skippingPrev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skipping to the previous context. Optional field.")

  public Boolean getSkippingPrev() {
    return skippingPrev;
  }


  public void setSkippingPrev(Boolean skippingPrev) {
    this.skippingPrev = skippingPrev;
  }


  public DisallowsObject togglingRepeatContext(Boolean togglingRepeatContext) {
    
    this.togglingRepeatContext = togglingRepeatContext;
    return this;
  }

   /**
   * Toggling repeat context flag. Optional field.
   * @return togglingRepeatContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Toggling repeat context flag. Optional field.")

  public Boolean getTogglingRepeatContext() {
    return togglingRepeatContext;
  }


  public void setTogglingRepeatContext(Boolean togglingRepeatContext) {
    this.togglingRepeatContext = togglingRepeatContext;
  }


  public DisallowsObject togglingRepeatTrack(Boolean togglingRepeatTrack) {
    
    this.togglingRepeatTrack = togglingRepeatTrack;
    return this;
  }

   /**
   * Toggling repeat track flag. Optional field.
   * @return togglingRepeatTrack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Toggling repeat track flag. Optional field.")

  public Boolean getTogglingRepeatTrack() {
    return togglingRepeatTrack;
  }


  public void setTogglingRepeatTrack(Boolean togglingRepeatTrack) {
    this.togglingRepeatTrack = togglingRepeatTrack;
  }


  public DisallowsObject togglingShuffle(Boolean togglingShuffle) {
    
    this.togglingShuffle = togglingShuffle;
    return this;
  }

   /**
   * Toggling shuffle flag. Optional field.
   * @return togglingShuffle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Toggling shuffle flag. Optional field.")

  public Boolean getTogglingShuffle() {
    return togglingShuffle;
  }


  public void setTogglingShuffle(Boolean togglingShuffle) {
    this.togglingShuffle = togglingShuffle;
  }


  public DisallowsObject transferringPlayback(Boolean transferringPlayback) {
    
    this.transferringPlayback = transferringPlayback;
    return this;
  }

   /**
   * Transfering playback between devices. Optional field.
   * @return transferringPlayback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transfering playback between devices. Optional field.")

  public Boolean getTransferringPlayback() {
    return transferringPlayback;
  }


  public void setTransferringPlayback(Boolean transferringPlayback) {
    this.transferringPlayback = transferringPlayback;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisallowsObject disallowsObject = (DisallowsObject) o;
    return Objects.equals(this.interruptingPlayback, disallowsObject.interruptingPlayback) &&
        Objects.equals(this.pausing, disallowsObject.pausing) &&
        Objects.equals(this.resuming, disallowsObject.resuming) &&
        Objects.equals(this.seeking, disallowsObject.seeking) &&
        Objects.equals(this.skippingNext, disallowsObject.skippingNext) &&
        Objects.equals(this.skippingPrev, disallowsObject.skippingPrev) &&
        Objects.equals(this.togglingRepeatContext, disallowsObject.togglingRepeatContext) &&
        Objects.equals(this.togglingRepeatTrack, disallowsObject.togglingRepeatTrack) &&
        Objects.equals(this.togglingShuffle, disallowsObject.togglingShuffle) &&
        Objects.equals(this.transferringPlayback, disallowsObject.transferringPlayback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interruptingPlayback, pausing, resuming, seeking, skippingNext, skippingPrev, togglingRepeatContext, togglingRepeatTrack, togglingShuffle, transferringPlayback);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisallowsObject {\n");
    sb.append("    interruptingPlayback: ").append(toIndentedString(interruptingPlayback)).append("\n");
    sb.append("    pausing: ").append(toIndentedString(pausing)).append("\n");
    sb.append("    resuming: ").append(toIndentedString(resuming)).append("\n");
    sb.append("    seeking: ").append(toIndentedString(seeking)).append("\n");
    sb.append("    skippingNext: ").append(toIndentedString(skippingNext)).append("\n");
    sb.append("    skippingPrev: ").append(toIndentedString(skippingPrev)).append("\n");
    sb.append("    togglingRepeatContext: ").append(toIndentedString(togglingRepeatContext)).append("\n");
    sb.append("    togglingRepeatTrack: ").append(toIndentedString(togglingRepeatTrack)).append("\n");
    sb.append("    togglingShuffle: ").append(toIndentedString(togglingShuffle)).append("\n");
    sb.append("    transferringPlayback: ").append(toIndentedString(transferringPlayback)).append("\n");
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
