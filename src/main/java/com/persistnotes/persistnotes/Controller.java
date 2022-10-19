package com.persistnotes.persistnotes;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pera.rest.webservices.restufulwebservices.user.User;
import com.pera.rest.webservices.restufulwebservices.user.UserNotFoundException;

@RestController
public class Controller {
	
	@GetMapping("/notes")
	public ArrayList<Notes> retrieveAllCourses(){
		NotesList notesList = new NotesList();
		Notes note = notesList.createNote("some description", "some text", "2022-10-24", "some link", "some mention", "low");
		ArrayList<Notes> list = notesList.addNoteToList(note);
		return list;
	}
	
//	@GetMapping("/notes/{id}")
//	public ArrayList<Notes> retrieveUser(@PathVariable int id){
//		User user= service.findOne(id);
//		
//		if (user==null) {
//			throw new UserNotFoundException("id:"+id);
//		}
//		return list;
//	}
	
}
