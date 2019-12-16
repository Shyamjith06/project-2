package com.mindtree.gooddeed.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.gooddeed.entity.GoodDeed;
import com.mindtree.gooddeed.repository.GoodDeedRepository;
@Service
public class GoodDeedService {
	@Autowired
	GoodDeedRepository goodDeedrepository;

	public List<GoodDeed> displayGoodDeed() {
		List<GoodDeed> goodDeeds=new ArrayList<GoodDeed>();
		goodDeeds=goodDeedrepository.findAll();
		List<GoodDeed> goodDeeds1=new ArrayList<>();
		for (GoodDeed goodDeed : goodDeeds) {
			if(goodDeed.getCampuMinds().size()<3)
			{
				goodDeeds1.add(goodDeed);
			}
		}
		return goodDeeds1;
	}
	

}
