package com.syne.positions.dto;

import java.util.Date;

public class OpenPositionsDTO {

	private String syneOptId;
	private String  reqDate;//Date
	private Long aging;
	private String hiringManager;
	private String  priority;
	private String project;
	private String lineOfBusiness;
	private String roleCategory;
	private String location;
	private String role;
	private String mustHaveSkills;
	private String experience;
	private String finalStatus;
	private Long clientSubmission;
	private Long processing;
	private String bizOwner;
	private String recruiterLead;


	public String getReqDate() {
		return reqDate;
	}
	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}
	public Long getAging() {
		return aging;
	}
	public void setAging(Long aging) {
		this.aging = aging;
	}
	public String getHiringManager() {
		return hiringManager;
	}
	public void setHiringManager(String hiringManager) {
		this.hiringManager = hiringManager;
	}

	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getLineOfBusiness() {
		return lineOfBusiness;
	}
	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}
	public String getRoleCategory() {
		return roleCategory;
	}
	public void setRoleCategory(String roleCategory) {
		this.roleCategory = roleCategory;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getMustHaveSkills() {
		return mustHaveSkills;
	}
	public void setMustHaveSkills(String mustHaveSkills) {
		this.mustHaveSkills = mustHaveSkills;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getFinalStatus() {
		return finalStatus;
	}
	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}
	public Long getClientSubmission() {
		return clientSubmission;
	}
	public void setClientSubmission(Long clientSubmission) {
		this.clientSubmission = clientSubmission;
	}
	public Long getProcessing() {
		return processing;
	}
	public void setProcessing(Long processing) {
		this.processing = processing;
	}
	public String getBizOwner() {
		return bizOwner;
	}
	public void setBizOwner(String bizOwner) {
		this.bizOwner = bizOwner;
	}

	public String getRecruiterLead() {
		return recruiterLead;
	}
	public void setRecruiterLead(String recruiterLead) {
		this.recruiterLead = recruiterLead;
	}
	public String getSyneOptId() {
		return syneOptId;
	}
	public void setSyneOptId(String syneOptId) {
		this.syneOptId = syneOptId;
	}


}
