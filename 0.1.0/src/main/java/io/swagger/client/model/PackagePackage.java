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
import io.swagger.client.model.PackageDistribution;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This represents a particular package that is distributed over various channels. E.g., glibc (aka libc6) is distributed by many, at various versions.
 */
@ApiModel(description = "This represents a particular package that is distributed over various channels. E.g., glibc (aka libc6) is distributed by many, at various versions.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-22T18:45:44.983-04:00")
public class PackagePackage {
  @SerializedName("name")
  private String name = null;

  @SerializedName("distribution")
  private List<PackageDistribution> distribution = null;

  public PackagePackage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Required. Immutable. The name of the package.
   * @return name
  **/
  @ApiModelProperty(value = "Required. Immutable. The name of the package.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PackagePackage distribution(List<PackageDistribution> distribution) {
    this.distribution = distribution;
    return this;
  }

  public PackagePackage addDistributionItem(PackageDistribution distributionItem) {
    if (this.distribution == null) {
      this.distribution = new ArrayList<PackageDistribution>();
    }
    this.distribution.add(distributionItem);
    return this;
  }

   /**
   * The various channels by which a package is distributed.
   * @return distribution
  **/
  @ApiModelProperty(value = "The various channels by which a package is distributed.")
  public List<PackageDistribution> getDistribution() {
    return distribution;
  }

  public void setDistribution(List<PackageDistribution> distribution) {
    this.distribution = distribution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackagePackage packagePackage = (PackagePackage) o;
    return Objects.equals(this.name, packagePackage.name) &&
        Objects.equals(this.distribution, packagePackage.distribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, distribution);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackagePackage {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
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

