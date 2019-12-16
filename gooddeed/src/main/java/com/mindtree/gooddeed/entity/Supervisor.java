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
@Table(name="supervisor")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="supervisorId")
public class Supervisor {
	@Id
	@Column(name="supervisor_id")
	private int supervisorId;
	@Column(name="supervisor_name")
	private String supervisorName;
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	GoodDeed goodDeed;
	public Supervisor() {
		super();
	}
	public int getSupervisorId() {
		return supervisorId;
	}
	public void setSupervisorId(int supervisorId) {
		this.supervisorId = supervisorId;
	}
	public String getSupervisorName() {
		return supervisorName;
	}
	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}
	public GoodDeed getGoodDeed() {
		return goodDeed;
	}
	public void setGoodDeed(GoodDeed goodDeed) {
		this.goodDeed = goodDeed;
	}
	
	
	

}