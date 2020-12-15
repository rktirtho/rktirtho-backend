package com.rktirtho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.rktirtho.model.Training;

@Component
public interface TrainingRepository extends JpaRepository<Training, Long>{

}
