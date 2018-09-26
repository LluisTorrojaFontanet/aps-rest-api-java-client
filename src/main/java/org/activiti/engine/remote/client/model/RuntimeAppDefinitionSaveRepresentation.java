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
import org.activiti.engine.remote.client.model.AppDefinitionRepresentation;

/**
 * RuntimeAppDefinitionSaveRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class RuntimeAppDefinitionSaveRepresentation {
  @SerializedName("appDefinitions")
  private List<AppDefinitionRepresentation> appDefinitions = null;

  public RuntimeAppDefinitionSaveRepresentation appDefinitions(List<AppDefinitionRepresentation> appDefinitions) {
    this.appDefinitions = appDefinitions;
    return this;
  }

  public RuntimeAppDefinitionSaveRepresentation addAppDefinitionsItem(AppDefinitionRepresentation appDefinitionsItem) {
    if (this.appDefinitions == null) {
      this.appDefinitions = new ArrayList<AppDefinitionRepresentation>();
    }
    this.appDefinitions.add(appDefinitionsItem);
    return this;
  }

   /**
   * Get appDefinitions
   * @return appDefinitions
  **/
  @ApiModelProperty(value = "")
  public List<AppDefinitionRepresentation> getAppDefinitions() {
    return appDefinitions;
  }

  public void setAppDefinitions(List<AppDefinitionRepresentation> appDefinitions) {
    this.appDefinitions = appDefinitions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeAppDefinitionSaveRepresentation runtimeAppDefinitionSaveRepresentation = (RuntimeAppDefinitionSaveRepresentation) o;
    return Objects.equals(this.appDefinitions, runtimeAppDefinitionSaveRepresentation.appDefinitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDefinitions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeAppDefinitionSaveRepresentation {\n");
    
    sb.append("    appDefinitions: ").append(toIndentedString(appDefinitions)).append("\n");
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
