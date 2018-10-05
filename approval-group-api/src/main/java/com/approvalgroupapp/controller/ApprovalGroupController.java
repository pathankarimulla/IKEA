package com.approvalgroupapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.approvalgroupapp.entity.ApprovalGroupEntity;
import com.approvalgroupapp.service.ApprovalGroupService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApprovalGroupController {
@Autowired
public ApprovalGroupService approvalGroupService;

@RequestMapping("/approvegroupdetails")
public List<ApprovalGroupEntity> get()
{
	return approvalGroupService.getdetails();
}

@RequestMapping(value="/approvegroupdetails", method=RequestMethod.POST)
public void addApprovalGroupDetails(@RequestBody ApprovalGroupEntity approvalGroupEntity) {
  
	approvalGroupService.addApprovalGroupDetails(approvalGroupEntity);
	
	
}

}
