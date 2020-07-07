package com.empathy.api.dto.board;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import com.empathy.types.IssueType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "sprintID", "issueOrder", "issueID", "projectID", "typeID", "name", "description", "effort",
		"ownerID", "estimatedDate", "createdDate" })
public class BacklogIssue {

	@JsonProperty("issueID")
	private String issueID;

	@JsonProperty("sprintID")
	private String sprintID;

	@JsonProperty("issueOrder")
	private String issueOrder;

	@JsonProperty("projectID")
	private String projectID;

	@NotNull
	@JsonProperty("typeID")
	private IssueType typeID;

	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	private String description;

	@JsonProperty("effort")
	private Integer effort;

	@JsonProperty("ownerID")
	private String ownerID;

	@JsonProperty("estimatedDate")
	private Date estimatedDate;

	@JsonProperty("createdDate")
	private Date createdDate;
	
	@JsonProperty("metaData")
	private Map<String, Object> metaData = new HashMap<String, Object>();

	/**
	 * @return the issueID
	 */
	@JsonProperty("issueID")
	public String getIssueID() {
		return issueID;
	}

	/**
	 * @param issueID the issueID to set
	 */
	@JsonProperty("issueID")
	public void setIssueID(String issueID) {
		this.issueID = issueID;
	}

	/**
	 * @return the sprintID
	 */
	@JsonProperty("sprintID")
	public String getSprintID() {
		return sprintID;
	}

	/**
	 * @param sprintID the sprintID to set
	 */
	@JsonProperty("sprintID")
	public void setSprintID(String sprintID) {
		this.sprintID = sprintID;
	}

	/**
	 * @return the issueOrder
	 */
	@JsonProperty("issueOrder")
	public String getIssueOrder() {
		return issueOrder;
	}

	/**
	 * @param issueOrder the issueOrder to set
	 */
	@JsonProperty("issueOrder")
	public void setIssueOrder(String issueOrder) {
		this.issueOrder = issueOrder;
	}

	/**
	 * @return the projectID
	 */
	@JsonProperty("projectID")
	public String getProjectID() {
		return projectID;
	}

	/**
	 * @param projectID the projectID to set
	 */
	@JsonProperty("projectID")
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	/**
	 * @return the typeID
	 */
	@JsonProperty("typeID")
	public IssueType getTypeID() {
		return typeID;
	}

	/**
	 * @param typeID the typeID to set
	 */
	@JsonProperty("typeID")
	public void setTypeID(IssueType typeID) {
		this.typeID = typeID;
	}

	/**
	 * @return the name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the effort
	 */
	@JsonProperty("effort")
	public Integer getEffort() {
		return effort;
	}

	/**
	 * @param effort the effort to set
	 */
	@JsonProperty("effort")
	public void setEffort(Integer effort) {
		this.effort = effort;
	}

	/**
	 * @return the ownerID
	 */
	@JsonProperty("ownerID")
	public String getOwnerID() {
		return ownerID;
	}

	/**
	 * @param ownerID the ownerID to set
	 */
	@JsonProperty("ownerID")
	public void setOwnerID(String ownerID) {
		this.ownerID = ownerID;
	}

	/**
	 * @return the estimatedDate
	 */
	@JsonProperty("estimatedDate")
	public Date getEstimatedDate() {
		return estimatedDate;
	}

	/**
	 * @param estimatedDate the estimatedDate to set
	 */
	@JsonProperty("estimatedDate")
	public void setEstimatedDate(Date estimatedDate) {
		this.estimatedDate = estimatedDate;
	}

	/**
	 * @return the createdDate
	 */
	@JsonProperty("createdDate")
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	@JsonProperty("createdDate")
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@JsonProperty("metaData")
	public Map<String, Object> getMetadaData() {
		return this.metaData;
	}

	@JsonProperty("metaData")
	public void setMetadaData(String name, Object value) {
		this.metaData.put(name, value);
	}
}