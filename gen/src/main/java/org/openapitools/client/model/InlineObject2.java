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
import org.openapitools.client.model.PlaylistsPlaylistIdTracksTracks;

/**
 * InlineObject2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T15:44:39.866286+08:00[Asia/Shanghai]")
public class InlineObject2 {
  public static final String SERIALIZED_NAME_SNAPSHOT_ID = "snapshot_id";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_ID)
  private String snapshotId;

  public static final String SERIALIZED_NAME_TRACKS = "tracks";
  @SerializedName(SERIALIZED_NAME_TRACKS)
  private List<PlaylistsPlaylistIdTracksTracks> tracks = new ArrayList<PlaylistsPlaylistIdTracksTracks>();


  public InlineObject2 snapshotId(String snapshotId) {
    
    this.snapshotId = snapshotId;
    return this;
  }

   /**
   * The playlist&#39;s snapshot ID against which you want to make the changes. The API will validate that the specified items exist and in the specified positions and make the changes, even if more recent changes have been made to the playlist. 
   * @return snapshotId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The playlist's snapshot ID against which you want to make the changes. The API will validate that the specified items exist and in the specified positions and make the changes, even if more recent changes have been made to the playlist. ")

  public String getSnapshotId() {
    return snapshotId;
  }


  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }


  public InlineObject2 tracks(List<PlaylistsPlaylistIdTracksTracks> tracks) {
    
    this.tracks = tracks;
    return this;
  }

  public InlineObject2 addTracksItem(PlaylistsPlaylistIdTracksTracks tracksItem) {
    this.tracks.add(tracksItem);
    return this;
  }

   /**
   * An array of objects containing [Spotify URIs](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) of the tracks or episodes to remove. For example: &#x60;{ \&quot;tracks\&quot;: [{ \&quot;uri\&quot;: \&quot;spotify:track:4iV5W9uYEdYUVa79Axb7Rh\&quot; },{ \&quot;uri\&quot;: \&quot;spotify:track:1301WleyT98MSxVHPZCA6M\&quot; }] }&#x60;. A maximum of 100 objects can be sent at once. 
   * @return tracks
  **/
  @ApiModelProperty(required = true, value = "An array of objects containing [Spotify URIs](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) of the tracks or episodes to remove. For example: `{ \"tracks\": [{ \"uri\": \"spotify:track:4iV5W9uYEdYUVa79Axb7Rh\" },{ \"uri\": \"spotify:track:1301WleyT98MSxVHPZCA6M\" }] }`. A maximum of 100 objects can be sent at once. ")

  public List<PlaylistsPlaylistIdTracksTracks> getTracks() {
    return tracks;
  }


  public void setTracks(List<PlaylistsPlaylistIdTracksTracks> tracks) {
    this.tracks = tracks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject2 inlineObject2 = (InlineObject2) o;
    return Objects.equals(this.snapshotId, inlineObject2.snapshotId) &&
        Objects.equals(this.tracks, inlineObject2.tracks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotId, tracks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject2 {\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
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

