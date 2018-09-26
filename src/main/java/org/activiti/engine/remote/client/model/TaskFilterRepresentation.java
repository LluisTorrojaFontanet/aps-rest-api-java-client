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
 * TaskFilterRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class TaskFilterRepresentation {
  @SerializedName("asc")
  private Boolean asc = null;

  @SerializedName("assignment")
  private String assignment = null;

  @SerializedName("dueAfter")
  private OffsetDateTime dueAfter = null;

  @SerializedName("dueBefore")
  private OffsetDateTime dueBefore = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("processDefinitionId")
  private String processDefinitionId = null;

  @SerializedName("processDefinitionKey")
  private String processDefinitionKey = null;

  @SerializedName("sort")
  private String sort = null;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ACTIVE("active"),
    
    COMPLETED("completed"),
    
    ALL("all");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  public TaskFilterRepresentation asc(Boolean asc) {
    this.asc = asc;
    return this;
  }

   /**
   * Get asc
   * @return asc
  **/
  @ApiModelProperty(value = "")
  public Boolean isAsc() {
    return asc;
  }

  public void setAsc(Boolean asc) {
    this.asc = asc;
  }

  public TaskFilterRepresentation assignment(String assignment) {
    this.assignment = assignment;
    return this;
  }

   /**
   * Get assignment
   * @return assignment
  **/
  @ApiModelProperty(value = "")
  public String getAssignment() {
    return assignment;
  }

  public void setAssignment(String assignment) {
    this.assignment = assignment;
  }

  public TaskFilterRepresentation dueAfter(OffsetDateTime dueAfter) {
    this.dueAfter = dueAfter;
    return this;
  }

   /**
   * Get dueAfter
   * @return dueAfter
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDueAfter() {
    return dueAfter;
  }

  public void setDueAfter(OffsetDateTime dueAfter) {
    this.dueAfter = dueAfter;
  }

  public TaskFilterRepresentation dueBefore(OffsetDateTime dueBefore) {
    this.dueBefore = dueBefore;
    return this;
  }

   /**
   * Get dueBefore
   * @return dueBefore
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDueBefore() {
    return dueBefore;
  }

  public void setDueBefore(OffsetDateTime dueBefore) {
    this.dueBefore = dueBefore;
  }

  public TaskFilterRepresentation name(String name) {
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

  public TaskFilterRepresentation processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * Get processDefinitionId
   * @return processDefinitionId
  **/
  @ApiModelProperty(value = "")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public TaskFilterRepresentation processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

   /**
   * Get processDefinitionKey
   * @return processDefinitionKey
  **/
  @ApiModelProperty(value = "")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public TaskFilterRepresentation sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(value = "")
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public TaskFilterRepresentation state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskFilterRepresentation taskFilterRepresentation = (TaskFilterRepresentation) o;
    return Objects.equals(this.asc, taskFilterRepresentation.asc) &&
        Objects.equals(this.assignment, taskFilterRepresentation.assignment) &&
        Objects.equals(this.dueAfter, taskFilterRepresentation.dueAfter) &&
        Objects.equals(this.dueBefore, taskFilterRepresentation.dueBefore) &&
        Objects.equals(this.name, taskFilterRepresentation.name) &&
        Objects.equals(this.processDefinitionId, taskFilterRepresentation.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, taskFilterRepresentation.processDefinitionKey) &&
        Objects.equals(this.sort, taskFilterRepresentation.sort) &&
        Objects.equals(this.state, taskFilterRepresentation.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asc, assignment, dueAfter, dueBefore, name, processDefinitionId, processDefinitionKey, sort, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskFilterRepresentation {\n");
    
    sb.append("    asc: ").append(toIndentedString(asc)).append("\n");
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
    sb.append("    dueAfter: ").append(toIndentedString(dueAfter)).append("\n");
    sb.append("    dueBefore: ").append(toIndentedString(dueBefore)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
