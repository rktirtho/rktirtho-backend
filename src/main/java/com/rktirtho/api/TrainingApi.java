package com.rktirtho.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rktirtho.model.Training;
import com.rktirtho.repository.TrainingRepository;

@RestController
@RequestMapping("api/v1/training")
public class TrainingApi {
	
	@Autowired
	TrainingRepository repository;
	
	public List<Training> getAll(){
		return repository.findAll();
	}
	
	@GetMapping("training/{id}")
	public Training getOne(@PathVariable("id") int id) {
		return repository.findById((long) id).orElse(null);
	}

}
