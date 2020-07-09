package com.empathy.api.dto.project;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import com.empathy.types.IssueStatus;
import com.empathy.types.IssueType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "issueID", "projectID", "parentID", "typeID", "statusID", "name", "description", "effort",
		"ownerID", "estimatedDate", "createdDate", "metaData" })
public class Issue {

	@JsonProperty("issueID")
	private String issueID;


	@JsonProperty("projectID")
	private String projectID;


	@JsonProperty("parentID")
	private String parentID;


	@NotNull
	@JsonProperty("typeID")
	private IssueType typeID;


	@NotNull
	@JsonProperty("statusID")
	private IssueStatus statusID;

	
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

	
	@JsonProperty("issueID")
	public String getIssueID() {
		return issueID;
	}

	@JsonProperty("issueID")
	public void setIssueID(String issueID) {
		this.issueID = issueID;
	}

	@JsonProperty("projectID")
	public String getProjectID() {
		return projectID;
	}

	@JsonProperty("projectID")
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	@JsonProperty("parentID")
	public String getParentID() {
		return parentID;
	}

	@JsonProperty("parentID")
	public void setParentID(String parentID) {
		this.parentID = parentID;
	}

	@JsonProperty("typeID")
	public IssueType getTypeID() {
		return typeID;
	}

	@JsonProperty("typeID")
	public void setTypeID(IssueType typeID) {
		this.typeID = typeID;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("effort")
	public Integer getEffort() {
		return effort;
	}

	@JsonProperty("effort")
	public void setEffort(Integer effort) {
		this.effort = effort;
	}

	@JsonProperty("ownerID")
	public String getOwnerID() {
		return ownerID;
	}

	@JsonProperty("ownerID")
	public void setOwnerID(String ownerID) {
		this.ownerID = ownerID;
	}

	@JsonProperty("estimatedDate")
	public Date getEstimatedDate() {
		return estimatedDate;
	}

	@JsonProperty("estimatedDate")
	public void setEstimatedDate(Date estimatedDate) {
		this.estimatedDate = estimatedDate;
	}

	@JsonProperty("createdDate")
	public Date getCreatedDate() {
		return createdDate;
	}

	@JsonProperty("createdDate")
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@JsonProperty("metaData")
	public Map<String, Object> getMetaData() {
		return this.metaData;
	}

	@JsonProperty("metaData")
	public void setMetaData(String name, Object value) {
		this.metaData.put(name, value);
	}

}
