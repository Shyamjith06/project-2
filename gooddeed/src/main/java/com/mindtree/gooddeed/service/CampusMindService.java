package com.mindtree.gooddeed.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.gooddeed.entity.CampusMind;
import com.mindtree.gooddeed.entity.GoodDeed;
import com.mindtree.gooddeed.repository.CampusMindRepository;
import com.mindtree.gooddeed.repository.GoodDeedRepository;

@Service
public class CampusMindService {
	
	@Autowired
	CampusMindRepository campusMindRepository;
	
	@Autowired
	GoodDeedRepository goodDeedRepository;
	
	
	public CampusMind addCampusMind(CampusMind campusMind) 
	{
		List<CampusMind> campusMinds=new ArrayList<>();
		campusMinds.add(campusMind);
		campusMind.getGoodDeed().setCampuMinds(campusMinds);
		campusMindRepository.save(campusMind);
		return campusMind;
		
		
	}
	
	public List<CampusMind> displayCampusMind(int gid)
	{
		List<CampusMind> campusMinds=new ArrayList<>();
		GoodDeed goodDeed=new GoodDeed();
		goodDeed=goodDeedRepository.findById(gid).get();
		return campusMinds=goodDeed.getCampuMinds();
	
	}

	
				
		
		
	}


