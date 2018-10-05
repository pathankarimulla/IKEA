package com.approvalgroupapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.approvalgroupapp.entity.ApprovalGroupEntity;
import com.approvalgroupapp.repository.ApprovalGroupRepository;
@Service
public class ApprovalGroupService {

	@Autowired
private ApprovalGroupRepository approvalGroupRepository;

/*List<ApprovalGroupEntity> data=new ArrayList<ApprovalGroupEntity>(Arrays.asList(	
		new ApprovalGroupEntity("AGRP0001", "IBM0001", "SLACK", "05/10/2018", "10/10/2018", "we are doing modification"),
		new ApprovalGroupEntity("AGRP0002", "IBM0002", "SNOOF", "05/10/2018", "10/10/2018", "we are doing snoof")
		));*/
	
	
	public void addApprovalGroupDetails(ApprovalGroupEntity approvalGroupEntity)
	{
		approvalGroupRepository.save(approvalGroupEntity);
	}
	public List<ApprovalGroupEntity> getdetails() {
		
		List<ApprovalGroupEntity> details=new ArrayList<>();
		
		approvalGroupRepository.findAll().forEach(details::add);
	
		return details;
	}

}
