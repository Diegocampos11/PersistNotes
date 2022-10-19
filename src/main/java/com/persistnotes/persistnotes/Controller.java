package com.persistnotes.persistnotes;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/test")
	public ArrayList<Notes> retrieveAllCourses(){
		NotesList notesList = new NotesList();
		Notes note = notesList.createNote("some description", "some text", "2022-10-24", "some link", "some mention", "low");
		ArrayList<Notes> list = notesList.addNoteToList(note);
		return list;
	}
}
