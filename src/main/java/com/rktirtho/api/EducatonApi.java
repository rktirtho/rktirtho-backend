package com.rktirtho.api;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rktirtho.model.Education;

@RestController
@RequestMapping("api")
public class EducatonApi {
	
	public List<Education> getAll(){
		return null;
	}
	

}
