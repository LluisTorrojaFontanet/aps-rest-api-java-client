/*
 * Process Services Enterprise API
 * Provides access to the complete features provided by Alfresco Process Services powered by Activiti.  You can use this API to integrate Alfresco Process Services with external applications.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.activiti.engine.remote.client.model;

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
import org.activiti.engine.remote.client.model.FormRepresentation;
import org.activiti.engine.remote.client.model.ProcessScopeIdentifierRepresentation;

/**
 * FormSaveRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class FormSaveRepresentation {
  @SerializedName("comment")
  private String comment = null;

  @SerializedName("formImageBase64")
  private String formImageBase64 = null;

  @SerializedName("formRepresentation")
  private FormRepresentation formRepresentation = null;

  @SerializedName("newVersion")
  private Boolean newVersion = null;

  @SerializedName("processScopeIdentifiers")
  private List<ProcessScopeIdentifierRepresentation> processScopeIdentifiers = null;

  @SerializedName("reusable")
  private Boolean reusable = null;

  public FormSaveRepresentation comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public FormSaveRepresentation formImageBase64(String formImageBase64) {
    this.formImageBase64 = formImageBase64;
    return this;
  }

   /**
   * Get formImageBase64
   * @return formImageBase64
  **/
  @ApiModelProperty(value = "")
  public String getFormImageBase64() {
    return formImageBase64;
  }

  public void setFormImageBase64(String formImageBase64) {
    this.formImageBase64 = formImageBase64;
  }

  public FormSaveRepresentation formRepresentation(FormRepresentation formRepresentation) {
    this.formRepresentation = formRepresentation;
    return this;
  }

   /**
   * Get formRepresentation
   * @return formRepresentation
  **/
  @ApiModelProperty(value = "")
  public FormRepresentation getFormRepresentation() {
    return formRepresentation;
  }

  public void setFormRepresentation(FormRepresentation formRepresentation) {
    this.formRepresentation = formRepresentation;
  }

  public FormSaveRepresentation newVersion(Boolean newVersion) {
    this.newVersion = newVersion;
    return this;
  }

   /**
   * Get newVersion
   * @return newVersion
  **/
  @ApiModelProperty(value = "")
  public Boolean isNewVersion() {
    return newVersion;
  }

  public void setNewVersion(Boolean newVersion) {
    this.newVersion = newVersion;
  }

  public FormSaveRepresentation processScopeIdentifiers(List<ProcessScopeIdentifierRepresentation> processScopeIdentifiers) {
    this.processScopeIdentifiers = processScopeIdentifiers;
    return this;
  }

  public FormSaveRepresentation addProcessScopeIdentifiersItem(ProcessScopeIdentifierRepresentation processScopeIdentifiersItem) {
    if (this.processScopeIdentifiers == null) {
      this.processScopeIdentifiers = new ArrayList<ProcessScopeIdentifierRepresentation>();
    }
    this.processScopeIdentifiers.add(processScopeIdentifiersItem);
    return this;
  }

   /**
   * Get processScopeIdentifiers
   * @return processScopeIdentifiers
  **/
  @ApiModelProperty(value = "")
  public List<ProcessScopeIdentifierRepresentation> getProcessScopeIdentifiers() {
    return processScopeIdentifiers;
  }

  public void setProcessScopeIdentifiers(List<ProcessScopeIdentifierRepresentation> processScopeIdentifiers) {
    this.processScopeIdentifiers = processScopeIdentifiers;
  }

  public FormSaveRepresentation reusable(Boolean reusable) {
    this.reusable = reusable;
    return this;
  }

   /**
   * Get reusable
   * @return reusable
  **/
  @ApiModelProperty(value = "")
  public Boolean isReusable() {
    return reusable;
  }

  public void setReusable(Boolean reusable) {
    this.reusable = reusable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormSaveRepresentation formSaveRepresentation = (FormSaveRepresentation) o;
    return Objects.equals(this.comment, formSaveRepresentation.comment) &&
        Objects.equals(this.formImageBase64, formSaveRepresentation.formImageBase64) &&
        Objects.equals(this.formRepresentation, formSaveRepresentation.formRepresentation) &&
        Objects.equals(this.newVersion, formSaveRepresentation.newVersion) &&
        Objects.equals(this.processScopeIdentifiers, formSaveRepresentation.processScopeIdentifiers) &&
        Objects.equals(this.reusable, formSaveRepresentation.reusable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, formImageBase64, formRepresentation, newVersion, processScopeIdentifiers, reusable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormSaveRepresentation {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    formImageBase64: ").append(toIndentedString(formImageBase64)).append("\n");
    sb.append("    formRepresentation: ").append(toIndentedString(formRepresentation)).append("\n");
    sb.append("    newVersion: ").append(toIndentedString(newVersion)).append("\n");
    sb.append("    processScopeIdentifiers: ").append(toIndentedString(processScopeIdentifiers)).append("\n");
    sb.append("    reusable: ").append(toIndentedString(reusable)).append("\n");
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

