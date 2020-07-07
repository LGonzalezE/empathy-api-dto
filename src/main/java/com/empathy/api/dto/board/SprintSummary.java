package com.empathy.api.dto.board;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "sprintID", "name", "description", "startDate", "endDate", "stats" })
public class SprintSummary {

	@JsonProperty("sprintID")
	private SprintId sprintID;

	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	private String description;

	@JsonProperty("startDate")
	private Date startDate;

	@JsonProperty("endDate")
	private Date endDate;

	@JsonProperty("metaData")
	private Map<String, Object> metaData = new HashMap<String, Object>();

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the stats
	 */
	public Map<String, Object> getMetaData() {
		return metaData;
	}

	/**
	 * @param stats the stats to set
	 */
	public void setMetaData(Map<String, Object> stats) {
		this.metaData = stats;
	}

	/**
	 * @return the sprintID
	 */
	@JsonProperty("sprintID")
	public SprintId getSprintID() {
		return sprintID;
	}

	/**
	 * @param sprintID the sprintID to set
	 */
	@JsonProperty("sprintID")
	public void setSprintID(SprintId sprintID) {
		this.sprintID = sprintID;
	}
}