package com.mindtree.gooddeed.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="campusminds")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="mid")
public class CampusMind {

	@Id
	@Column(name="mid")
	private  int mid;
	@Column(name="name")
	private String  name;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private GoodDeed goodDeed;   
	public CampusMind() {
		super();
		
	}
	
	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GoodDeed getGoodDeed() {
		return goodDeed;
	}

	public void setGoodDeed(GoodDeed googDeed) {
		this.goodDeed = googDeed;
	}

	public CampusMind(int mid, String name, GoodDeed googDeed) {
		super();
		this.mid = mid;
		this.name = name;
		this.goodDeed = googDeed;
	}
	
		
	
}
