package com.rktirtho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.rktirtho.model.Education;

@Component
public interface EducationRepo extends JpaRepository<Education, Long>{

}
