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
import org.activiti.engine.remote.client.model.AuditLogFormDataRepresentation;

/**
 * AuditLogEntryRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class AuditLogEntryRepresentation {
  @SerializedName("activityId")
  private String activityId = null;

  @SerializedName("activityName")
  private String activityName = null;

  @SerializedName("activityType")
  private String activityType = null;

  @SerializedName("durationInMillis")
  private Long durationInMillis = null;

  @SerializedName("endTime")
  private String endTime = null;

  @SerializedName("formData")
  private List<AuditLogFormDataRepresentation> formData = null;

  @SerializedName("index")
  private Integer index = null;

  @SerializedName("selectedOutcome")
  private String selectedOutcome = null;

  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("taskAssignee")
  private String taskAssignee = null;

  @SerializedName("taskName")
  private String taskName = null;

  @SerializedName("type")
  private String type = null;

  public AuditLogEntryRepresentation activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * Get activityId
   * @return activityId
  **/
  @ApiModelProperty(value = "")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public AuditLogEntryRepresentation activityName(String activityName) {
    this.activityName = activityName;
    return this;
  }

   /**
   * Get activityName
   * @return activityName
  **/
  @ApiModelProperty(value = "")
  public String getActivityName() {
    return activityName;
  }

  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }

  public AuditLogEntryRepresentation activityType(String activityType) {
    this.activityType = activityType;
    return this;
  }

   /**
   * Get activityType
   * @return activityType
  **/
  @ApiModelProperty(value = "")
  public String getActivityType() {
    return activityType;
  }

  public void setActivityType(String activityType) {
    this.activityType = activityType;
  }

  public AuditLogEntryRepresentation durationInMillis(Long durationInMillis) {
    this.durationInMillis = durationInMillis;
    return this;
  }

   /**
   * Get durationInMillis
   * @return durationInMillis
  **/
  @ApiModelProperty(value = "")
  public Long getDurationInMillis() {
    return durationInMillis;
  }

  public void setDurationInMillis(Long durationInMillis) {
    this.durationInMillis = durationInMillis;
  }

  public AuditLogEntryRepresentation endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public AuditLogEntryRepresentation formData(List<AuditLogFormDataRepresentation> formData) {
    this.formData = formData;
    return this;
  }

  public AuditLogEntryRepresentation addFormDataItem(AuditLogFormDataRepresentation formDataItem) {
    if (this.formData == null) {
      this.formData = new ArrayList<AuditLogFormDataRepresentation>();
    }
    this.formData.add(formDataItem);
    return this;
  }

   /**
   * Get formData
   * @return formData
  **/
  @ApiModelProperty(value = "")
  public List<AuditLogFormDataRepresentation> getFormData() {
    return formData;
  }

  public void setFormData(List<AuditLogFormDataRepresentation> formData) {
    this.formData = formData;
  }

  public AuditLogEntryRepresentation index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(value = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public AuditLogEntryRepresentation selectedOutcome(String selectedOutcome) {
    this.selectedOutcome = selectedOutcome;
    return this;
  }

   /**
   * Get selectedOutcome
   * @return selectedOutcome
  **/
  @ApiModelProperty(value = "")
  public String getSelectedOutcome() {
    return selectedOutcome;
  }

  public void setSelectedOutcome(String selectedOutcome) {
    this.selectedOutcome = selectedOutcome;
  }

  public AuditLogEntryRepresentation startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public AuditLogEntryRepresentation taskAssignee(String taskAssignee) {
    this.taskAssignee = taskAssignee;
    return this;
  }

   /**
   * Get taskAssignee
   * @return taskAssignee
  **/
  @ApiModelProperty(value = "")
  public String getTaskAssignee() {
    return taskAssignee;
  }

  public void setTaskAssignee(String taskAssignee) {
    this.taskAssignee = taskAssignee;
  }

  public AuditLogEntryRepresentation taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

   /**
   * Get taskName
   * @return taskName
  **/
  @ApiModelProperty(value = "")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public AuditLogEntryRepresentation type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogEntryRepresentation auditLogEntryRepresentation = (AuditLogEntryRepresentation) o;
    return Objects.equals(this.activityId, auditLogEntryRepresentation.activityId) &&
        Objects.equals(this.activityName, auditLogEntryRepresentation.activityName) &&
        Objects.equals(this.activityType, auditLogEntryRepresentation.activityType) &&
        Objects.equals(this.durationInMillis, auditLogEntryRepresentation.durationInMillis) &&
        Objects.equals(this.endTime, auditLogEntryRepresentation.endTime) &&
        Objects.equals(this.formData, auditLogEntryRepresentation.formData) &&
        Objects.equals(this.index, auditLogEntryRepresentation.index) &&
        Objects.equals(this.selectedOutcome, auditLogEntryRepresentation.selectedOutcome) &&
        Objects.equals(this.startTime, auditLogEntryRepresentation.startTime) &&
        Objects.equals(this.taskAssignee, auditLogEntryRepresentation.taskAssignee) &&
        Objects.equals(this.taskName, auditLogEntryRepresentation.taskName) &&
        Objects.equals(this.type, auditLogEntryRepresentation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, activityName, activityType, durationInMillis, endTime, formData, index, selectedOutcome, startTime, taskAssignee, taskName, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogEntryRepresentation {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    durationInMillis: ").append(toIndentedString(durationInMillis)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    selectedOutcome: ").append(toIndentedString(selectedOutcome)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    taskAssignee: ").append(toIndentedString(taskAssignee)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

