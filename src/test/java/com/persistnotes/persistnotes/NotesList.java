package com.persistnotes.persistnotes;

import java.time.LocalDate;
import java.util.ArrayList;

public class NotesList {
	
	private int id = 0;
	private ArrayList<Notes> notesList;

	public ArrayList<Notes> NotesList() {
		return notesList = new ArrayList<Notes>();
	}
	
	public int incrementId() {
		return ++id;
	}

	
	//("some description", "some text", "2022-10-24", "some link", "some mention", "low");
	public Notes createNote(String description, String text,String estimatedDate, String link, String mention, String priority) {
		Notes newNote = new Notes(incrementId(), description, text, LocalDate.now(), LocalDate.parse(estimatedDate)
					, null, link, mention, priority);
		return newNote;
	}
}
