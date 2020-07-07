package com.empathy.api.dto.board;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "parentIssueID", "userID", "name" })
public class IssueTeamMember {

	@JsonProperty("parentIssueID")
	private String parentIssueID;

	@JsonProperty("userID")
	private String userID;

	@JsonProperty("name")
	private String name;

	@JsonProperty("metaData")
	private Map<String, Object> metaData = new HashMap<String, Object>();

	/**
	 * @return the parentIssueID
	 */
	@JsonProperty("parentIssueID")
	public String getParentIssueID() {
		return parentIssueID;
	}

	/**
	 * @param parentIssueID the parentIssueID to set
	 */
	@JsonProperty("parentIssueID")
	public void setParentIssueID(String parentIssueID) {
		this.parentIssueID = parentIssueID;
	}

	/**
	 * @return the userID
	 */
	@JsonProperty("userID")
	public String getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	@JsonProperty("userID")
	public void setUserID(String userID) {
		this.userID = userID;
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

	@JsonProperty("metaData")
	public Map<String, Object> getMetadaData() {
		return this.metaData;
	}

	@JsonProperty("metaData")
	public void setMetadaData(String name, Object value) {
		this.metaData.put(name, value);
	}
}
