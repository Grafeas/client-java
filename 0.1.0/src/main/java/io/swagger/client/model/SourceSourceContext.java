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
import io.swagger.client.model.SourceCloudRepoSourceContext;
import io.swagger.client.model.SourceGerritSourceContext;
import io.swagger.client.model.SourceGitSourceContext;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A SourceContext is a reference to a tree of files. A SourceContext together with a path point to a unique revision of a single file or directory.
 */
@ApiModel(description = "A SourceContext is a reference to a tree of files. A SourceContext together with a path point to a unique revision of a single file or directory.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-22T18:45:44.983-04:00")
public class SourceSourceContext {
  @SerializedName("cloud_repo")
  private SourceCloudRepoSourceContext cloudRepo = null;

  @SerializedName("gerrit")
  private SourceGerritSourceContext gerrit = null;

  @SerializedName("git")
  private SourceGitSourceContext git = null;

  @SerializedName("labels")
  private Map<String, String> labels = null;

  public SourceSourceContext cloudRepo(SourceCloudRepoSourceContext cloudRepo) {
    this.cloudRepo = cloudRepo;
    return this;
  }

   /**
   * A SourceContext referring to a revision in a Google Cloud Source Repo.
   * @return cloudRepo
  **/
  @ApiModelProperty(value = "A SourceContext referring to a revision in a Google Cloud Source Repo.")
  public SourceCloudRepoSourceContext getCloudRepo() {
    return cloudRepo;
  }

  public void setCloudRepo(SourceCloudRepoSourceContext cloudRepo) {
    this.cloudRepo = cloudRepo;
  }

  public SourceSourceContext gerrit(SourceGerritSourceContext gerrit) {
    this.gerrit = gerrit;
    return this;
  }

   /**
   * A SourceContext referring to a Gerrit project.
   * @return gerrit
  **/
  @ApiModelProperty(value = "A SourceContext referring to a Gerrit project.")
  public SourceGerritSourceContext getGerrit() {
    return gerrit;
  }

  public void setGerrit(SourceGerritSourceContext gerrit) {
    this.gerrit = gerrit;
  }

  public SourceSourceContext git(SourceGitSourceContext git) {
    this.git = git;
    return this;
  }

   /**
   * A SourceContext referring to any third party Git repo (e.g., GitHub).
   * @return git
  **/
  @ApiModelProperty(value = "A SourceContext referring to any third party Git repo (e.g., GitHub).")
  public SourceGitSourceContext getGit() {
    return git;
  }

  public void setGit(SourceGitSourceContext git) {
    this.git = git;
  }

  public SourceSourceContext labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public SourceSourceContext putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Labels with user defined metadata.
   * @return labels
  **/
  @ApiModelProperty(value = "Labels with user defined metadata.")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceSourceContext sourceSourceContext = (SourceSourceContext) o;
    return Objects.equals(this.cloudRepo, sourceSourceContext.cloudRepo) &&
        Objects.equals(this.gerrit, sourceSourceContext.gerrit) &&
        Objects.equals(this.git, sourceSourceContext.git) &&
        Objects.equals(this.labels, sourceSourceContext.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudRepo, gerrit, git, labels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceSourceContext {\n");
    
    sb.append("    cloudRepo: ").append(toIndentedString(cloudRepo)).append("\n");
    sb.append("    gerrit: ").append(toIndentedString(gerrit)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
