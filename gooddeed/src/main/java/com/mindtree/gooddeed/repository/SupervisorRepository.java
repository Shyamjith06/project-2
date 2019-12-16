package com.mindtree.gooddeed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.gooddeed.entity.Supervisor;

public interface SupervisorRepository extends JpaRepository<Supervisor, Integer> {
}