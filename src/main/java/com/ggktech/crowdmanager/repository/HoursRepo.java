package com.ggktech.crowdmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ggktech.crowdmanager.entities.Hours;

@Repository
public interface HoursRepo extends JpaRepository<Hours, Long> {

}
