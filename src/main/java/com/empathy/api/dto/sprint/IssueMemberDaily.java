package com.empathy.api.dto.sprint;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import com.empathy.types.IssueStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "issueMemberDailyID", "statusID", "description", "createdDate", "impediments", "metaData" })
public class IssueMemberDaily {


	@JsonProperty("issueMemberDailyID")
	private IssueMemberDailyId issueMemberDailyID;

	@NotNull
	@JsonProperty("statusID")
	private IssueStatus statusID;

	@NotNull
		@JsonProperty("description")
	private String description;

	
	@JsonProperty("createdDate")
	private Date createdDate;
	
	
	@JsonProperty("impediments")
	private List<Issue> impediments = new ArrayList<Issue>();
	
	
	@JsonProperty("metaData")
	private Map<String, Object> metaData = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public IssueMemberDaily() {
	}

		@JsonProperty("issueMemberDailyID")
	public IssueMemberDailyId getIssueMemberDailyID() {
		return issueMemberDailyID;
	}

	@JsonProperty("issueMemberDailyID")
	public void setIssueMemberDailyID(IssueMemberDailyId issueMemberDailyID) {
		this.issueMemberDailyID = issueMemberDailyID;
	}

	@JsonProperty("statusID")
	public IssueStatus getStatusID() {
		return statusID;
	}

	@JsonProperty("statusID")
	public void setStatusID(IssueStatus statusID) {
		this.statusID = statusID;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
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

		/**
	 * @return the impediments
	 */
	@JsonProperty("impediments")
	public List<Issue> getImpediments() {
		return impediments;
	}

	/**
	 * @param impediments the impediments to set
	 */
	@JsonProperty("impediments")
	public void setImpediments(List<Issue> impediments) {
		this.impediments = impediments;
	}

}
