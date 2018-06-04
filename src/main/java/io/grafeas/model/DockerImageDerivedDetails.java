/*
 * Grafeas API
 * An API to insert and retrieve annotations on cloud artifacts.
 *
 * OpenAPI spec version: v1alpha1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.grafeas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.grafeas.model.DockerImageFingerprint;
import io.grafeas.model.DockerImageLayer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Derived describes the derived image portion (Occurrence) of the DockerImage relationship.  This image would be produced from a Dockerfile with FROM &lt;DockerImage.Basis in attached Note&gt;.
 */
@ApiModel(description = "Derived describes the derived image portion (Occurrence) of the DockerImage relationship.  This image would be produced from a Dockerfile with FROM <DockerImage.Basis in attached Note>.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T13:20:14.121-07:00")
public class DockerImageDerivedDetails {
  @SerializedName("fingerprint")
  private DockerImageFingerprint fingerprint = null;

  @SerializedName("distance")
  private Long distance = null;

  @SerializedName("layer_info")
  private List<DockerImageLayer> layerInfo = null;

  @SerializedName("base_resource_url")
  private String baseResourceUrl = null;

  public DockerImageDerivedDetails fingerprint(DockerImageFingerprint fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Get fingerprint
   * @return fingerprint
  **/
  @ApiModelProperty(value = "")
  public DockerImageFingerprint getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(DockerImageFingerprint fingerprint) {
    this.fingerprint = fingerprint;
  }

  public DockerImageDerivedDetails distance(Long distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Output only. The number of layers by which this image differs from the associated image basis.
   * @return distance
  **/
  @ApiModelProperty(value = "Output only. The number of layers by which this image differs from the associated image basis.")
  public Long getDistance() {
    return distance;
  }

  public void setDistance(Long distance) {
    this.distance = distance;
  }

  public DockerImageDerivedDetails layerInfo(List<DockerImageLayer> layerInfo) {
    this.layerInfo = layerInfo;
    return this;
  }

  public DockerImageDerivedDetails addLayerInfoItem(DockerImageLayer layerInfoItem) {
    if (this.layerInfo == null) {
      this.layerInfo = new ArrayList<DockerImageLayer>();
    }
    this.layerInfo.add(layerInfoItem);
    return this;
  }

   /**
   * This contains layer-specific metadata, if populated it has length \&quot;distance\&quot; and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer.
   * @return layerInfo
  **/
  @ApiModelProperty(value = "This contains layer-specific metadata, if populated it has length \"distance\" and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer.")
  public List<DockerImageLayer> getLayerInfo() {
    return layerInfo;
  }

  public void setLayerInfo(List<DockerImageLayer> layerInfo) {
    this.layerInfo = layerInfo;
  }

  public DockerImageDerivedDetails baseResourceUrl(String baseResourceUrl) {
    this.baseResourceUrl = baseResourceUrl;
    return this;
  }

   /**
   * Get baseResourceUrl
   * @return baseResourceUrl
  **/
  @ApiModelProperty(value = "")
  public String getBaseResourceUrl() {
    return baseResourceUrl;
  }

  public void setBaseResourceUrl(String baseResourceUrl) {
    this.baseResourceUrl = baseResourceUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DockerImageDerivedDetails dockerImageDerivedDetails = (DockerImageDerivedDetails) o;
    return Objects.equals(this.fingerprint, dockerImageDerivedDetails.fingerprint) &&
        Objects.equals(this.distance, dockerImageDerivedDetails.distance) &&
        Objects.equals(this.layerInfo, dockerImageDerivedDetails.layerInfo) &&
        Objects.equals(this.baseResourceUrl, dockerImageDerivedDetails.baseResourceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fingerprint, distance, layerInfo, baseResourceUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DockerImageDerivedDetails {\n");
    
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    layerInfo: ").append(toIndentedString(layerInfo)).append("\n");
    sb.append("    baseResourceUrl: ").append(toIndentedString(baseResourceUrl)).append("\n");
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
