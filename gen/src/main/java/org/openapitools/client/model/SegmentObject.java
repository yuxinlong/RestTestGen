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
import java.util.ArrayList;
import java.util.List;

/**
 * SegmentObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T15:44:39.866286+08:00[Asia/Shanghai]")
public class SegmentObject {
  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private BigDecimal confidence;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private BigDecimal duration;

  public static final String SERIALIZED_NAME_LOUDNESS_END = "loudness_end";
  @SerializedName(SERIALIZED_NAME_LOUDNESS_END)
  private BigDecimal loudnessEnd;

  public static final String SERIALIZED_NAME_LOUDNESS_MAX = "loudness_max";
  @SerializedName(SERIALIZED_NAME_LOUDNESS_MAX)
  private BigDecimal loudnessMax;

  public static final String SERIALIZED_NAME_LOUDNESS_MAX_TIME = "loudness_max_time";
  @SerializedName(SERIALIZED_NAME_LOUDNESS_MAX_TIME)
  private BigDecimal loudnessMaxTime;

  public static final String SERIALIZED_NAME_LOUDNESS_START = "loudness_start";
  @SerializedName(SERIALIZED_NAME_LOUDNESS_START)
  private BigDecimal loudnessStart;

  public static final String SERIALIZED_NAME_PITCHES = "pitches";
  @SerializedName(SERIALIZED_NAME_PITCHES)
  private List<BigDecimal> pitches = null;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private BigDecimal start;

  public static final String SERIALIZED_NAME_TIMBRE = "timbre";
  @SerializedName(SERIALIZED_NAME_TIMBRE)
  private List<BigDecimal> timbre = null;


  public SegmentObject confidence(BigDecimal confidence) {
    
    this.confidence = confidence;
    return this;
  }

   /**
   * The confidence, from 0.0 to 1.0, of the reliability of the segmentation. Segments of the song which are difficult to logically segment (e.g: noise) may correspond to low values in this field. 
   * minimum: 0
   * maximum: 1
   * @return confidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.435", value = "The confidence, from 0.0 to 1.0, of the reliability of the segmentation. Segments of the song which are difficult to logically segment (e.g: noise) may correspond to low values in this field. ")

  public BigDecimal getConfidence() {
    return confidence;
  }


  public void setConfidence(BigDecimal confidence) {
    this.confidence = confidence;
  }


  public SegmentObject duration(BigDecimal duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * The duration (in seconds) of the segment.
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.19891", value = "The duration (in seconds) of the segment.")

  public BigDecimal getDuration() {
    return duration;
  }


  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }


  public SegmentObject loudnessEnd(BigDecimal loudnessEnd) {
    
    this.loudnessEnd = loudnessEnd;
    return this;
  }

   /**
   * The offset loudness of the segment in decibels (dB). This value should be equivalent to the loudness_start of the following segment.
   * @return loudnessEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The offset loudness of the segment in decibels (dB). This value should be equivalent to the loudness_start of the following segment.")

  public BigDecimal getLoudnessEnd() {
    return loudnessEnd;
  }


  public void setLoudnessEnd(BigDecimal loudnessEnd) {
    this.loudnessEnd = loudnessEnd;
  }


  public SegmentObject loudnessMax(BigDecimal loudnessMax) {
    
    this.loudnessMax = loudnessMax;
    return this;
  }

   /**
   * The peak loudness of the segment in decibels (dB). Combined with &#x60;loudness_start&#x60; and &#x60;loudness_max_time&#x60;, these components can be used to describe the \&quot;attack\&quot; of the segment.
   * @return loudnessMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-14.25", value = "The peak loudness of the segment in decibels (dB). Combined with `loudness_start` and `loudness_max_time`, these components can be used to describe the \"attack\" of the segment.")

  public BigDecimal getLoudnessMax() {
    return loudnessMax;
  }


  public void setLoudnessMax(BigDecimal loudnessMax) {
    this.loudnessMax = loudnessMax;
  }


  public SegmentObject loudnessMaxTime(BigDecimal loudnessMaxTime) {
    
    this.loudnessMaxTime = loudnessMaxTime;
    return this;
  }

   /**
   * The segment-relative offset of the segment peak loudness in seconds. Combined with &#x60;loudness_start&#x60; and &#x60;loudness_max&#x60;, these components can be used to desctibe the \&quot;attack\&quot; of the segment.
   * @return loudnessMaxTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.07305", value = "The segment-relative offset of the segment peak loudness in seconds. Combined with `loudness_start` and `loudness_max`, these components can be used to desctibe the \"attack\" of the segment.")

  public BigDecimal getLoudnessMaxTime() {
    return loudnessMaxTime;
  }


  public void setLoudnessMaxTime(BigDecimal loudnessMaxTime) {
    this.loudnessMaxTime = loudnessMaxTime;
  }


  public SegmentObject loudnessStart(BigDecimal loudnessStart) {
    
    this.loudnessStart = loudnessStart;
    return this;
  }

   /**
   * The onset loudness of the segment in decibels (dB). Combined with &#x60;loudness_max&#x60; and &#x60;loudness_max_time&#x60;, these components can be used to describe the \&quot;attack\&quot; of the segment.
   * @return loudnessStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-23.053", value = "The onset loudness of the segment in decibels (dB). Combined with `loudness_max` and `loudness_max_time`, these components can be used to describe the \"attack\" of the segment.")

  public BigDecimal getLoudnessStart() {
    return loudnessStart;
  }


  public void setLoudnessStart(BigDecimal loudnessStart) {
    this.loudnessStart = loudnessStart;
  }


  public SegmentObject pitches(List<BigDecimal> pitches) {
    
    this.pitches = pitches;
    return this;
  }

  public SegmentObject addPitchesItem(BigDecimal pitchesItem) {
    if (this.pitches == null) {
      this.pitches = new ArrayList<BigDecimal>();
    }
    this.pitches.add(pitchesItem);
    return this;
  }

   /**
   * Pitch content is given by a “chroma” vector, corresponding to the 12 pitch classes C, C#, D to B, with values ranging from 0 to 1 that describe the relative dominance of every pitch in the chromatic scale. For example a C Major chord would likely be represented by large values of C, E and G (i.e. classes 0, 4, and 7).  Vectors are normalized to 1 by their strongest dimension, therefore noisy sounds are likely represented by values that are all close to 1, while pure tones are described by one value at 1 (the pitch) and others near 0. As can be seen below, the 12 vector indices are a combination of low-power spectrum values at their respective pitch frequencies. ![pitch vector](https://developer.spotify.com/assets/audio/Pitch_vector.png) 
   * @return pitches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[0.212,0.141,0.294]", value = "Pitch content is given by a “chroma” vector, corresponding to the 12 pitch classes C, C#, D to B, with values ranging from 0 to 1 that describe the relative dominance of every pitch in the chromatic scale. For example a C Major chord would likely be represented by large values of C, E and G (i.e. classes 0, 4, and 7).  Vectors are normalized to 1 by their strongest dimension, therefore noisy sounds are likely represented by values that are all close to 1, while pure tones are described by one value at 1 (the pitch) and others near 0. As can be seen below, the 12 vector indices are a combination of low-power spectrum values at their respective pitch frequencies. ![pitch vector](https://developer.spotify.com/assets/audio/Pitch_vector.png) ")

  public List<BigDecimal> getPitches() {
    return pitches;
  }


  public void setPitches(List<BigDecimal> pitches) {
    this.pitches = pitches;
  }


  public SegmentObject start(BigDecimal start) {
    
    this.start = start;
    return this;
  }

   /**
   * The starting point (in seconds) of the segment.
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.70154", value = "The starting point (in seconds) of the segment.")

  public BigDecimal getStart() {
    return start;
  }


  public void setStart(BigDecimal start) {
    this.start = start;
  }


  public SegmentObject timbre(List<BigDecimal> timbre) {
    
    this.timbre = timbre;
    return this;
  }

  public SegmentObject addTimbreItem(BigDecimal timbreItem) {
    if (this.timbre == null) {
      this.timbre = new ArrayList<BigDecimal>();
    }
    this.timbre.add(timbreItem);
    return this;
  }

   /**
   * Timbre is the quality of a musical note or sound that distinguishes different types of musical instruments, or voices. It is a complex notion also referred to as sound color, texture, or tone quality, and is derived from the shape of a segment’s spectro-temporal surface, independently of pitch and loudness. The timbre feature is a vector that includes 12 unbounded values roughly centered around 0. Those values are high level abstractions of the spectral surface, ordered by degree of importance.  For completeness however, the first dimension represents the average loudness of the segment; second emphasizes brightness; third is more closely correlated to the flatness of a sound; fourth to sounds with a stronger attack; etc. See an image below representing the 12 basis functions (i.e. template segments). ![timbre basis functions](https://developer.spotify.com/assets/audio/Timbre_basis_functions.png)  The actual timbre of the segment is best described as a linear combination of these 12 basis functions weighted by the coefficient values: timbre &#x3D; c1 x b1 + c2 x b2 + ... + c12 x b12, where c1 to c12 represent the 12 coefficients and b1 to b12 the 12 basis functions as displayed below. Timbre vectors are best used in comparison with each other. 
   * @return timbre
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[42.115,64.373,-0.233]", value = "Timbre is the quality of a musical note or sound that distinguishes different types of musical instruments, or voices. It is a complex notion also referred to as sound color, texture, or tone quality, and is derived from the shape of a segment’s spectro-temporal surface, independently of pitch and loudness. The timbre feature is a vector that includes 12 unbounded values roughly centered around 0. Those values are high level abstractions of the spectral surface, ordered by degree of importance.  For completeness however, the first dimension represents the average loudness of the segment; second emphasizes brightness; third is more closely correlated to the flatness of a sound; fourth to sounds with a stronger attack; etc. See an image below representing the 12 basis functions (i.e. template segments). ![timbre basis functions](https://developer.spotify.com/assets/audio/Timbre_basis_functions.png)  The actual timbre of the segment is best described as a linear combination of these 12 basis functions weighted by the coefficient values: timbre = c1 x b1 + c2 x b2 + ... + c12 x b12, where c1 to c12 represent the 12 coefficients and b1 to b12 the 12 basis functions as displayed below. Timbre vectors are best used in comparison with each other. ")

  public List<BigDecimal> getTimbre() {
    return timbre;
  }


  public void setTimbre(List<BigDecimal> timbre) {
    this.timbre = timbre;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentObject segmentObject = (SegmentObject) o;
    return Objects.equals(this.confidence, segmentObject.confidence) &&
        Objects.equals(this.duration, segmentObject.duration) &&
        Objects.equals(this.loudnessEnd, segmentObject.loudnessEnd) &&
        Objects.equals(this.loudnessMax, segmentObject.loudnessMax) &&
        Objects.equals(this.loudnessMaxTime, segmentObject.loudnessMaxTime) &&
        Objects.equals(this.loudnessStart, segmentObject.loudnessStart) &&
        Objects.equals(this.pitches, segmentObject.pitches) &&
        Objects.equals(this.start, segmentObject.start) &&
        Objects.equals(this.timbre, segmentObject.timbre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, duration, loudnessEnd, loudnessMax, loudnessMaxTime, loudnessStart, pitches, start, timbre);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentObject {\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    loudnessEnd: ").append(toIndentedString(loudnessEnd)).append("\n");
    sb.append("    loudnessMax: ").append(toIndentedString(loudnessMax)).append("\n");
    sb.append("    loudnessMaxTime: ").append(toIndentedString(loudnessMaxTime)).append("\n");
    sb.append("    loudnessStart: ").append(toIndentedString(loudnessStart)).append("\n");
    sb.append("    pitches: ").append(toIndentedString(pitches)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    timbre: ").append(toIndentedString(timbre)).append("\n");
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

