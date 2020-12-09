package com.rktirtho.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rktirtho.model.Education;
import com.rktirtho.repository.EducationRepo;

@RestController
@RequestMapping("api")
public class EducatonApi {
	
	@Autowired
	EducationRepo repo;
	
	@GetMapping("educations")
	public List<Education> getAll(){
		
		return repo.findAll();
	}
	
	@PostMapping("education/add")
	public void save() {
		Education education = new Education("SSC", "Dhaka Board", "Business Studies", 4.75f, 5.00f,
				"A", 2f, 2012);
		repo.save(education);
		
	}
	

}
