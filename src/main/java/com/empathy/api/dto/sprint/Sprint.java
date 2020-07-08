package com.empathy.api.dto.sprint;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import com.empathy.types.SprintStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "sprintID", "name", "description", "startDate", "endDate", "createdBy", "createdDate" })
public class Sprint {


	@JsonProperty("sprintID")
	private SprintId sprintID;

	@NotNull
	@JsonProperty("statusID")
	private SprintStatus statusID;

	@NotNull	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("description")
	private String description;

	@NotNull
	@JsonProperty("startDate")
	private Date startDate;

	@NotNull	
	@JsonProperty("endDate")
	private Date endDate;

	@NotNull	
	@JsonProperty("createdBy")
	private String createdBy;
	
	@JsonProperty("createdDate")
	private Date createdDate;
	
	@JsonProperty("metaData")
	private Map<String, Object> metaData = new HashMap<String, Object>();

	@JsonProperty("sprintID")
	public SprintId getSprintID() {
		return sprintID;
	}

	@JsonProperty("sprintID")
	public void setSprintID(SprintId sprintID) {
		this.sprintID = sprintID;
	}

	@JsonProperty("statusID")
	public SprintStatus getStatusID() {
		return statusID;
	}

	@JsonProperty("statusID")
	public void setName(SprintStatus statusID) {
		this.statusID = statusID;
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

	@JsonProperty("createdBy")
	public String getCreatedBy() {
		return createdBy;
	}

	@JsonProperty("createdBy")
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@JsonProperty("startDate")
	public Date getStartDate() {
		return startDate;
	}

	@JsonProperty("startDate")
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("endDate")
	public Date getEndDate() {
		return endDate;
	}

	@JsonProperty("endDate")
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
