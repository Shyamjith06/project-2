package com.mindtree.gooddeed.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="good_deed")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="goodDeedId")
public class GoodDeed {
	@Id
	@Column(name="good_deed_id")
	private int goodDeedId;
	@Column(name="good_deed_name")
	private String goodDeedName;
	@OneToOne(mappedBy="goodDeed",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	Supervisor supervisor;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	List<CampusMind> campuMinds;
	
	public int getGoodDeedId() {
		return goodDeedId;
	}
	public void setGoodDeedId(int goodDeedId) {
		this.goodDeedId = goodDeedId;
	}
	public String getGoodDeedName() {
		return goodDeedName;
	}
	public void setGoodDeedName(String goodDeedName) {
		this.goodDeedName = goodDeedName;
	}
	public Supervisor getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}
	public List<CampusMind> getCampuMinds() {
		return campuMinds;
	}
	public void setCampuMinds(List<CampusMind> campuMinds) {
		this.campuMinds = campuMinds;
	}
	
	

}
