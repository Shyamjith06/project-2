package com.mindtree.gooddeed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.gooddeed.entity.CampusMind;
import com.mindtree.gooddeed.entity.GoodDeed;
import com.mindtree.gooddeed.service.GoodDeedService;


@RestController
public class GoodDeedController {
	@Autowired
	GoodDeedService goodDeedservice;	
	
	@GetMapping("/displayGooddeed")
	public List<GoodDeed> displayGoodDeed()
	{
		return goodDeedservice.displayGoodDeed();
	}
	

}
