package com.empathy.api.dto.project;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "projectID", "name", "description", "tags", "ownerID", "estimatedDate", "createdDate" })
public class Project {

	@JsonProperty("projectID")
	private String projectID;

	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	private String description;

	@JsonProperty("tags")
	private String tags;

	@JsonProperty("ownerID")
	private String ownerID;

	@JsonProperty("estimatedDate")
	private Date estimatedDate;

	@JsonProperty("createdDate")
	private Date createdDate;

	@JsonIgnore
	private Map<String, Object> metaData = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Project() {
	}

	@JsonProperty("projectID")
	public String getProjectID() {
		return projectID;
	}

	@JsonProperty("projectID")
	public void setProjectID(String projectID) {
		this.projectID = projectID;
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

	@JsonProperty("tags")
	public String getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(String tags) {
		this.tags = tags;
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

	@JsonAnyGetter
	public Map<String, Object> getMetaData() {
		return this.metaData;
	}

	@JsonAnySetter
	public void setMetaData(String name, Object value) {
		this.metaData.put(name, value);
	}

}
