/*
 * grafeas.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.V1beta1Occurrence;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Response for listing occurrences for a note.
 */
@ApiModel(description = "Response for listing occurrences for a note.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-22T18:45:44.983-04:00")
public class V1beta1ListNoteOccurrencesResponse {
  @SerializedName("occurrences")
  private List<V1beta1Occurrence> occurrences = null;

  @SerializedName("next_page_token")
  private String nextPageToken = null;

  public V1beta1ListNoteOccurrencesResponse occurrences(List<V1beta1Occurrence> occurrences) {
    this.occurrences = occurrences;
    return this;
  }

  public V1beta1ListNoteOccurrencesResponse addOccurrencesItem(V1beta1Occurrence occurrencesItem) {
    if (this.occurrences == null) {
      this.occurrences = new ArrayList<V1beta1Occurrence>();
    }
    this.occurrences.add(occurrencesItem);
    return this;
  }

   /**
   * The occurrences attached to the specified note.
   * @return occurrences
  **/
  @ApiModelProperty(value = "The occurrences attached to the specified note.")
  public List<V1beta1Occurrence> getOccurrences() {
    return occurrences;
  }

  public void setOccurrences(List<V1beta1Occurrence> occurrences) {
    this.occurrences = occurrences;
  }

  public V1beta1ListNoteOccurrencesResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * Token to provide to skip to a particular spot in the list.
   * @return nextPageToken
  **/
  @ApiModelProperty(value = "Token to provide to skip to a particular spot in the list.")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ListNoteOccurrencesResponse v1beta1ListNoteOccurrencesResponse = (V1beta1ListNoteOccurrencesResponse) o;
    return Objects.equals(this.occurrences, v1beta1ListNoteOccurrencesResponse.occurrences) &&
        Objects.equals(this.nextPageToken, v1beta1ListNoteOccurrencesResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(occurrences, nextPageToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ListNoteOccurrencesResponse {\n");
    
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

