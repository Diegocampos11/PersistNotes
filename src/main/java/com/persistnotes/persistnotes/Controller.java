package com.persistnotes.persistnotes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/test")
	public String retrieveAllCourses(){
		return "Test";
	}
}