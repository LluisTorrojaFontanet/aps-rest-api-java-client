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

/**
 * VariableMappingRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class VariableMappingRepresentation {
  @SerializedName("inProcessVariable")
  private String inProcessVariable = null;

  @SerializedName("inVariableType")
  private String inVariableType = null;

  @SerializedName("mappedVariable")
  private String mappedVariable = null;

  @SerializedName("outProcessVariable")
  private String outProcessVariable = null;

  @SerializedName("outVariableType")
  private String outVariableType = null;

  @SerializedName("typeOfMapping")
  private String typeOfMapping = null;

  public VariableMappingRepresentation inProcessVariable(String inProcessVariable) {
    this.inProcessVariable = inProcessVariable;
    return this;
  }

   /**
   * Get inProcessVariable
   * @return inProcessVariable
  **/
  @ApiModelProperty(value = "")
  public String getInProcessVariable() {
    return inProcessVariable;
  }

  public void setInProcessVariable(String inProcessVariable) {
    this.inProcessVariable = inProcessVariable;
  }

  public VariableMappingRepresentation inVariableType(String inVariableType) {
    this.inVariableType = inVariableType;
    return this;
  }

   /**
   * Get inVariableType
   * @return inVariableType
  **/
  @ApiModelProperty(value = "")
  public String getInVariableType() {
    return inVariableType;
  }

  public void setInVariableType(String inVariableType) {
    this.inVariableType = inVariableType;
  }

  public VariableMappingRepresentation mappedVariable(String mappedVariable) {
    this.mappedVariable = mappedVariable;
    return this;
  }

   /**
   * Get mappedVariable
   * @return mappedVariable
  **/
  @ApiModelProperty(value = "")
  public String getMappedVariable() {
    return mappedVariable;
  }

  public void setMappedVariable(String mappedVariable) {
    this.mappedVariable = mappedVariable;
  }

  public VariableMappingRepresentation outProcessVariable(String outProcessVariable) {
    this.outProcessVariable = outProcessVariable;
    return this;
  }

   /**
   * Get outProcessVariable
   * @return outProcessVariable
  **/
  @ApiModelProperty(value = "")
  public String getOutProcessVariable() {
    return outProcessVariable;
  }

  public void setOutProcessVariable(String outProcessVariable) {
    this.outProcessVariable = outProcessVariable;
  }

  public VariableMappingRepresentation outVariableType(String outVariableType) {
    this.outVariableType = outVariableType;
    return this;
  }

   /**
   * Get outVariableType
   * @return outVariableType
  **/
  @ApiModelProperty(value = "")
  public String getOutVariableType() {
    return outVariableType;
  }

  public void setOutVariableType(String outVariableType) {
    this.outVariableType = outVariableType;
  }

  public VariableMappingRepresentation typeOfMapping(String typeOfMapping) {
    this.typeOfMapping = typeOfMapping;
    return this;
  }

   /**
   * Get typeOfMapping
   * @return typeOfMapping
  **/
  @ApiModelProperty(value = "")
  public String getTypeOfMapping() {
    return typeOfMapping;
  }

  public void setTypeOfMapping(String typeOfMapping) {
    this.typeOfMapping = typeOfMapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableMappingRepresentation variableMappingRepresentation = (VariableMappingRepresentation) o;
    return Objects.equals(this.inProcessVariable, variableMappingRepresentation.inProcessVariable) &&
        Objects.equals(this.inVariableType, variableMappingRepresentation.inVariableType) &&
        Objects.equals(this.mappedVariable, variableMappingRepresentation.mappedVariable) &&
        Objects.equals(this.outProcessVariable, variableMappingRepresentation.outProcessVariable) &&
        Objects.equals(this.outVariableType, variableMappingRepresentation.outVariableType) &&
        Objects.equals(this.typeOfMapping, variableMappingRepresentation.typeOfMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inProcessVariable, inVariableType, mappedVariable, outProcessVariable, outVariableType, typeOfMapping);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableMappingRepresentation {\n");
    
    sb.append("    inProcessVariable: ").append(toIndentedString(inProcessVariable)).append("\n");
    sb.append("    inVariableType: ").append(toIndentedString(inVariableType)).append("\n");
    sb.append("    mappedVariable: ").append(toIndentedString(mappedVariable)).append("\n");
    sb.append("    outProcessVariable: ").append(toIndentedString(outProcessVariable)).append("\n");
    sb.append("    outVariableType: ").append(toIndentedString(outVariableType)).append("\n");
    sb.append("    typeOfMapping: ").append(toIndentedString(typeOfMapping)).append("\n");
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
