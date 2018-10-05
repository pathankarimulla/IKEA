package com.approvalgroupapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ApprovalGroupEntity {

	@Id
	private String approvalgroup_id;
	private String organization_id;
	private String name;
	private String created_ts;
	private String modified_ts;
	private String description;
	
	public ApprovalGroupEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public ApprovalGroupEntity(String approvalgroup_id, String organization_id, String name, String created_ts,
			String modified_ts, String description) {
		super();
		this.approvalgroup_id = approvalgroup_id;
		this.organization_id = organization_id;
		this.name = name;
		this.created_ts = created_ts;
		this.modified_ts = modified_ts;
		this.description = description;
	}
	public String getApprovalgroup_id() {
		return approvalgroup_id;
	}
	public void setApprovalgroup_id(String approvalgroup_id) {
		this.approvalgroup_id = approvalgroup_id;
	}
	public String getOrganization_id() {
		return organization_id;
	}
	public void setOrganization_id(String organization_id) {
		this.organization_id = organization_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreated_ts() {
		return created_ts;
	}
	public void setCreated_ts(String created_ts) {
		this.created_ts = created_ts;
	}
	public String getModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(String modified_ts) {
		this.modified_ts = modified_ts;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
