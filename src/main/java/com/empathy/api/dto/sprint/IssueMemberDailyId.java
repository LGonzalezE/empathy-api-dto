package com.empathy.api.dto.sprint;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IssueMemberDailyId implements Serializable {
	private static final long serialVersionUID = 1L;


	@JsonProperty("sprintID")
	private String sprintID;

	@JsonProperty("projectID")
	private String projectID;

	@JsonProperty("issueID")
	private String issueID;

	@JsonProperty("memberID")
	private String memberID;

	@JsonProperty("dailyDate")
	private Date dailyDate;
	
	public Date getDailyDate() {
		return dailyDate;
	}
	
	public void setDailyDate(Date dailyDate) {
		this.dailyDate = dailyDate;
	}
	
	public IssueMemberDailyId() {

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

	/**
	 * @return the issueID
	 */
	public String getIssueID() {
		return issueID;
	}

	/**
	 * @param issueID the issueID to set
	 */
	public void setIssueID(String issueID) {
		this.issueID = issueID;
	}

	/**
	 * @return the memberID
	 */
	public String getMemberID() {
		return memberID;
	}

	/**
	 * @param memberID the memberID to set
	 */
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	
}
