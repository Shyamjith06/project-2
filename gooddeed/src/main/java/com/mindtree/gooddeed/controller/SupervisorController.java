package com.mindtree.gooddeed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.gooddeed.entity.CampusMind;
import com.mindtree.gooddeed.entity.Supervisor;
import com.mindtree.gooddeed.service.SupervisorService;

@RestController
public class SupervisorController {

	@Autowired
	SupervisorService supervisor;
	@GetMapping("/getGooddeedandMind")
	public List<CampusMind> getGooddeedandMinds(@RequestParam int supervisorId)
	{
		
		 Supervisor result=new Supervisor();
		 result=supervisor.getGooddeedandMind(supervisorId);
		 return result.getGoodDeed().getCampuMinds();
	}
	
}
