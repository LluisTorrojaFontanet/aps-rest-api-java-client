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
 * AccountRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class AccountRepresentation {
  @SerializedName("authorizationUrl")
  private String authorizationUrl = null;

  @SerializedName("authorized")
  private Boolean authorized = null;

  @SerializedName("metaDataAllowed")
  private Boolean metaDataAllowed = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("serviceId")
  private String serviceId = null;

  public AccountRepresentation authorizationUrl(String authorizationUrl) {
    this.authorizationUrl = authorizationUrl;
    return this;
  }

   /**
   * Get authorizationUrl
   * @return authorizationUrl
  **/
  @ApiModelProperty(value = "")
  public String getAuthorizationUrl() {
    return authorizationUrl;
  }

  public void setAuthorizationUrl(String authorizationUrl) {
    this.authorizationUrl = authorizationUrl;
  }

  public AccountRepresentation authorized(Boolean authorized) {
    this.authorized = authorized;
    return this;
  }

   /**
   * Get authorized
   * @return authorized
  **/
  @ApiModelProperty(value = "")
  public Boolean isAuthorized() {
    return authorized;
  }

  public void setAuthorized(Boolean authorized) {
    this.authorized = authorized;
  }

  public AccountRepresentation metaDataAllowed(Boolean metaDataAllowed) {
    this.metaDataAllowed = metaDataAllowed;
    return this;
  }

   /**
   * Get metaDataAllowed
   * @return metaDataAllowed
  **/
  @ApiModelProperty(value = "")
  public Boolean isMetaDataAllowed() {
    return metaDataAllowed;
  }

  public void setMetaDataAllowed(Boolean metaDataAllowed) {
    this.metaDataAllowed = metaDataAllowed;
  }

  public AccountRepresentation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountRepresentation serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @ApiModelProperty(value = "")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountRepresentation accountRepresentation = (AccountRepresentation) o;
    return Objects.equals(this.authorizationUrl, accountRepresentation.authorizationUrl) &&
        Objects.equals(this.authorized, accountRepresentation.authorized) &&
        Objects.equals(this.metaDataAllowed, accountRepresentation.metaDataAllowed) &&
        Objects.equals(this.name, accountRepresentation.name) &&
        Objects.equals(this.serviceId, accountRepresentation.serviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationUrl, authorized, metaDataAllowed, name, serviceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRepresentation {\n");
    
    sb.append("    authorizationUrl: ").append(toIndentedString(authorizationUrl)).append("\n");
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    metaDataAllowed: ").append(toIndentedString(metaDataAllowed)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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
