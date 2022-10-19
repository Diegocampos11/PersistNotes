package com.persistnotes.persistnotes;

import java.net.URI;
import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
public class Controller {
	NotesList notesList = new NotesList();
	@GetMapping("/notes")
	public ArrayList<Notes> retrieveAllNotes(){
		//Notes note = notesList.createNote("some description", "some text", "2022-10-24", "some link", "some mention", "low");
		//ArrayList<Notes> list = notesList.addNoteToList(note);
		return notesList.getNotesList();
	}
	@GetMapping("/notes/create/{description}")
	public Notes createNote(@PathVariable String description){
		Notes note = notesList.createNote(description , "some text", "2022-10-24", "some link", "some mention", "low");
		notesList.addNoteToList(note);
		return notesList.retrieveNote(note.getId());
	}
	@GetMapping("/notes/{id}")
	public Notes showNote(@PathVariable int id){
		Notes note;
		try {
			note = notesList.retrieveNote(id);
			return note;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@PostMapping("/notes")
	public ResponseEntity<Notes> createUser(@RequestBody Notes notes) {
		ArrayList<Notes> newNote = notesList.addNoteToList(notes);
		URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}/").buildAndExpand(newNote.get(newNote.size()-1).getId()).toUri();
		return ResponseEntity.created(location).build();
		
	}
	
}
