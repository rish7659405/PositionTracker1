package com.syne.positions.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Submissions {
	@Id

	@GeneratedValue

	private String syneSubmissionId;
	private String syneOptId;
	private String submissionDate;
	private String clientResponse;
	private String candidateName;
	private String employeeId;
	//private String skillSet;
	private String experience;
	private String currentLocation;
	private String prefferedLocation;
	//private String currentCompany;
	//private String submissionValidity;
	/*
	 * private String submissionStatus; private String selectionStatus; private
	 * String selectOrDropoutDate; private String l1panelist; private String
	 * l1panelist2; private String l1interviewDate; private String l2interviewDate;
	 * private String l3interviewDate;
	 */
	private String submissionStatus;
	private boolean is_selected;
	//private String dropout;

	public String getSyneSubmissionId() {
		return syneSubmissionId;
	}
	public void setSyneSubmissionId(String syneSubmissionId) {
		this.syneSubmissionId = syneSubmissionId;
	}
	public String getSyneOptId() {
		return syneOptId;
	}
	public void setSyneOptId(String syneOptId) {
		this.syneOptId = syneOptId;
	}

	public String getSubmissionDate() {
		return submissionDate;
	}
	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}
	public String getClientResponse() {
		return clientResponse;
	}
	public void setClientResponse(String clientResponse) {
		this.clientResponse = clientResponse;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	/*
	 * public String getSkillSet() { return skillSet; } public void
	 * setSkillSet(String skillSet) { this.skillSet = skillSet; }
	 */
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	public String getPrefferedLocation() {
		return prefferedLocation;
	}
	public void setPrefferedLocation(String prefferedLocation) {
		this.prefferedLocation = prefferedLocation;
	}
	/*
	 * public String getCurrentCompany() { return currentCompany; } public void
	 * setCurrentCompany(String currentCompany) { this.currentCompany =
	 * currentCompany; } public String getSubmissionValidity() { return
	 * submissionValidity; } public void setSubmissionValidity(String
	 * submissionValidity) { this.submissionValidity = submissionValidity; } public
	 * String getSubmissionStatus() { return submissionStatus; } public void
	 * setSubmissionStatus(String submissionStatus) { this.submissionStatus =
	 * submissionStatus; } public String getSelectionStatus() { return
	 * selectionStatus; } public void setSelectionStatus(String selectionStatus) {
	 * this.selectionStatus = selectionStatus; } public String getSelected() {
	 * return selected; } public void setSelected(String selected) { this.selected =
	 * selected; } public String getDropout() { return dropout; } public void
	 * setDropout(String dropout) { this.dropout = dropout; } public String
	 * getSelectOrDropoutDate() { return selectOrDropoutDate; } public void
	 * setSelectOrDropoutDate(String selectOrDropoutDate) { this.selectOrDropoutDate
	 * = selectOrDropoutDate; }
	 * 
	 * public String getL1panelist() { return l1panelist; } public void
	 * setL1panelist(String l1panelist) { this.l1panelist = l1panelist; } public
	 * String getL1panelist2() { return l1panelist2; } public void
	 * setL1panelist2(String l1panelist2) { this.l1panelist2 = l1panelist2; } public
	 * String getL1interviewDate() { return l1interviewDate; } public void
	 * setL1interviewDate(String l1interviewDate) { this.l1interviewDate =
	 * l1interviewDate; } public String getL2interviewDate() { return
	 * l2interviewDate; } public void setL2interviewDate(String l2interviewDate) {
	 * this.l2interviewDate = l2interviewDate; } public String getL3interviewDate()
	 * { return l3interviewDate; } public void setL3interviewDate(String
	 * l3interviewDate) { this.l3interviewDate = l3interviewDate; }
	 */
	public String getEmployeeID() {
		return employeeId;
	}
	public void setEmployeeID(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getSubmissionStatus() {
		return submissionStatus;
	}
	public void setSubmissionStatus(String submissionStatus) {
		this.submissionStatus = submissionStatus;
	}
	public boolean isIs_selected() {
		return is_selected;
	}
	public void setIs_selected(boolean is_selected) {
		this.is_selected = is_selected;
	}



}


