package com.mindtree.gooddeed.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.gooddeed.entity.CampusMind;
import com.mindtree.gooddeed.entity.GoodDeed;
import com.mindtree.gooddeed.entity.Supervisor;
import com.mindtree.gooddeed.repository.SupervisorRepository;
@Service
public class SupervisorService {
	@Autowired
	SupervisorRepository supervisorRepository;
	public Supervisor getGooddeedandMind(int supervisorId) {
		
		Supervisor supervisor=new Supervisor();
		supervisor=supervisorRepository.findById(supervisorId).get();
		return supervisor;
		
	}

}


//List<CampusMind> campusMinds=new ArrayList<>();
//GoodDeed goodDeed=new GoodDeed();
//goodDeed=goodDeedRepository.findById(gid).get();
//return campusMinds=goodDeed.getCampuMinds();
//
//List<GoodDeed> goodDeeds=new ArrayList<GoodDeed>();
//goodDeeds=goodDeedrepository.findAll();
//List<GoodDeed> goodDeeds1=new ArrayList<>();
//for (GoodDeed goodDeed : goodDeeds) {
//	if(goodDeed.getCampuMinds().size()<3)
//	{
//		goodDeeds1.add(goodDeed);
//	}
//}
//return goodDeeds1;