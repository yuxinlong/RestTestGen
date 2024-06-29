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
import org.openapitools.client.model.PagingObject;
import org.openapitools.client.model.PagingSimplifiedChapterObjectAllOf;
import org.openapitools.client.model.SimplifiedChapterObject;

/**
 * PagingSimplifiedChapterObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T15:44:39.866286+08:00[Asia/Shanghai]")
public class PagingSimplifiedChapterObject {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_PREVIOUS = "previous";
  @SerializedName(SERIALIZED_NAME_PREVIOUS)
  private String previous;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<SimplifiedChapterObject> items = new ArrayList<SimplifiedChapterObject>();


  public PagingSimplifiedChapterObject href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * A link to the Web API endpoint returning the full result of the request 
   * @return href
  **/
  @ApiModelProperty(example = "https://api.spotify.com/v1/me/shows?offset=0&limit=20 ", required = true, value = "A link to the Web API endpoint returning the full result of the request ")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public PagingSimplifiedChapterObject limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The maximum number of items in the response (as set in the query or by default). 
   * @return limit
  **/
  @ApiModelProperty(example = "20", required = true, value = "The maximum number of items in the response (as set in the query or by default). ")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public PagingSimplifiedChapterObject next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * URL to the next page of items. ( &#x60;null&#x60; if none) 
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.spotify.com/v1/me/shows?offset=1&limit=1", required = true, value = "URL to the next page of items. ( `null` if none) ")

  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
  }


  public PagingSimplifiedChapterObject offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The offset of the items returned (as set in the query or by default) 
   * @return offset
  **/
  @ApiModelProperty(example = "0", required = true, value = "The offset of the items returned (as set in the query or by default) ")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public PagingSimplifiedChapterObject previous(String previous) {
    
    this.previous = previous;
    return this;
  }

   /**
   * URL to the previous page of items. ( &#x60;null&#x60; if none) 
   * @return previous
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.spotify.com/v1/me/shows?offset=1&limit=1", required = true, value = "URL to the previous page of items. ( `null` if none) ")

  public String getPrevious() {
    return previous;
  }


  public void setPrevious(String previous) {
    this.previous = previous;
  }


  public PagingSimplifiedChapterObject total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * The total number of items available to return. 
   * @return total
  **/
  @ApiModelProperty(example = "4", required = true, value = "The total number of items available to return. ")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public PagingSimplifiedChapterObject items(List<SimplifiedChapterObject> items) {
    
    this.items = items;
    return this;
  }

  public PagingSimplifiedChapterObject addItemsItem(SimplifiedChapterObject itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(required = true, value = "")

  public List<SimplifiedChapterObject> getItems() {
    return items;
  }


  public void setItems(List<SimplifiedChapterObject> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagingSimplifiedChapterObject pagingSimplifiedChapterObject = (PagingSimplifiedChapterObject) o;
    return Objects.equals(this.href, pagingSimplifiedChapterObject.href) &&
        Objects.equals(this.limit, pagingSimplifiedChapterObject.limit) &&
        Objects.equals(this.next, pagingSimplifiedChapterObject.next) &&
        Objects.equals(this.offset, pagingSimplifiedChapterObject.offset) &&
        Objects.equals(this.previous, pagingSimplifiedChapterObject.previous) &&
        Objects.equals(this.total, pagingSimplifiedChapterObject.total) &&
        Objects.equals(this.items, pagingSimplifiedChapterObject.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, limit, next, offset, previous, total, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagingSimplifiedChapterObject {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

