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
import io.swagger.client.model.VersionVersionKind;
import java.io.IOException;

/**
 * Version contains structured information about the version of a package.
 */
@ApiModel(description = "Version contains structured information about the version of a package.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-22T18:45:44.983-04:00")
public class PackageVersion {
  @SerializedName("epoch")
  private Integer epoch = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("revision")
  private String revision = null;

  @SerializedName("kind")
  private VersionVersionKind kind = null;

  public PackageVersion epoch(Integer epoch) {
    this.epoch = epoch;
    return this;
  }

   /**
   * Used to correct mistakes in the version numbering scheme.
   * @return epoch
  **/
  @ApiModelProperty(value = "Used to correct mistakes in the version numbering scheme.")
  public Integer getEpoch() {
    return epoch;
  }

  public void setEpoch(Integer epoch) {
    this.epoch = epoch;
  }

  public PackageVersion name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Required only when version kind is NORMAL. The main part of the version name.
   * @return name
  **/
  @ApiModelProperty(value = "Required only when version kind is NORMAL. The main part of the version name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PackageVersion revision(String revision) {
    this.revision = revision;
    return this;
  }

   /**
   * The iteration of the package build from the above version.
   * @return revision
  **/
  @ApiModelProperty(value = "The iteration of the package build from the above version.")
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public PackageVersion kind(VersionVersionKind kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Required. Distinguishes between sentinel MIN/MAX versions and normal versions.
   * @return kind
  **/
  @ApiModelProperty(value = "Required. Distinguishes between sentinel MIN/MAX versions and normal versions.")
  public VersionVersionKind getKind() {
    return kind;
  }

  public void setKind(VersionVersionKind kind) {
    this.kind = kind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageVersion packageVersion = (PackageVersion) o;
    return Objects.equals(this.epoch, packageVersion.epoch) &&
        Objects.equals(this.name, packageVersion.name) &&
        Objects.equals(this.revision, packageVersion.revision) &&
        Objects.equals(this.kind, packageVersion.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(epoch, name, revision, kind);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageVersion {\n");
    
    sb.append("    epoch: ").append(toIndentedString(epoch)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

