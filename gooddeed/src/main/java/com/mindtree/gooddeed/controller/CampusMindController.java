package com.mindtree.gooddeed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.gooddeed.entity.CampusMind;
import com.mindtree.gooddeed.service.CampusMindService;

@RestController
public class CampusMindController {
	@Autowired
	CampusMindService campusService;
	@PostMapping("/addminds")
	public CampusMind addCampusMind(@RequestBody CampusMind campusMind)
	{
		return campusService.addCampusMind(campusMind);
	}
	@GetMapping("/displayCampusMind")
	public List<CampusMind> displayCampusMind(@RequestParam int gid)
	{
		return campusService.displayCampusMind(gid);
	}
	
	

}
