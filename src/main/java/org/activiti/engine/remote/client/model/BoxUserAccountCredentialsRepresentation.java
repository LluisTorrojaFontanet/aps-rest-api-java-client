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
import org.threeten.bp.OffsetDateTime;

/**
 * BoxUserAccountCredentialsRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class BoxUserAccountCredentialsRepresentation {
  @SerializedName("authenticationURL")
  private String authenticationURL = null;

  @SerializedName("expireDate")
  private OffsetDateTime expireDate = null;

  @SerializedName("ownerEmail")
  private String ownerEmail = null;

  public BoxUserAccountCredentialsRepresentation authenticationURL(String authenticationURL) {
    this.authenticationURL = authenticationURL;
    return this;
  }

   /**
   * Get authenticationURL
   * @return authenticationURL
  **/
  @ApiModelProperty(value = "")
  public String getAuthenticationURL() {
    return authenticationURL;
  }

  public void setAuthenticationURL(String authenticationURL) {
    this.authenticationURL = authenticationURL;
  }

  public BoxUserAccountCredentialsRepresentation expireDate(OffsetDateTime expireDate) {
    this.expireDate = expireDate;
    return this;
  }

   /**
   * Get expireDate
   * @return expireDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(OffsetDateTime expireDate) {
    this.expireDate = expireDate;
  }

  public BoxUserAccountCredentialsRepresentation ownerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
    return this;
  }

   /**
   * Get ownerEmail
   * @return ownerEmail
  **/
  @ApiModelProperty(value = "")
  public String getOwnerEmail() {
    return ownerEmail;
  }

  public void setOwnerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxUserAccountCredentialsRepresentation boxUserAccountCredentialsRepresentation = (BoxUserAccountCredentialsRepresentation) o;
    return Objects.equals(this.authenticationURL, boxUserAccountCredentialsRepresentation.authenticationURL) &&
        Objects.equals(this.expireDate, boxUserAccountCredentialsRepresentation.expireDate) &&
        Objects.equals(this.ownerEmail, boxUserAccountCredentialsRepresentation.ownerEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationURL, expireDate, ownerEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxUserAccountCredentialsRepresentation {\n");
    
    sb.append("    authenticationURL: ").append(toIndentedString(authenticationURL)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
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
