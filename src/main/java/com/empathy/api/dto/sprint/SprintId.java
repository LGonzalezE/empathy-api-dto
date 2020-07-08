package com.empathy.api.dto.sprint;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SprintId implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@JsonProperty("sprintID")
	private String sprintID;

		
	@JsonProperty("projectID")
	private String projectID;

	public SprintId() {

	}

	public SprintId(String sprintID, String projectID) {
		this.sprintID = sprintID;
		this.projectID = projectID;
	}

	/**
	 * @return the sprintID
	 */
	public String getSprintID() {
		return sprintID;
	}

	/**
	 * @param sprintID the sprintID to set
	 */
	public void setSprintID(String sprintID) {
		this.sprintID = sprintID;
	}

	/**
	 * @return the projectID
	 */
	public String getProjectID() {
		return projectID;
	}

	/**
	 * @param projectID the projectID to set
	 */
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

}
