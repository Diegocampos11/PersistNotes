package com.persistnotes.persistnotes;

import java.time.LocalDate;
import java.util.ArrayList;

public class NotesList {
	
	private int id = 0;
	private ArrayList<Notes> notesList;

	public NotesList() {
		notesList = new ArrayList<Notes>();
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

	public ArrayList<Notes> addNoteToList(Notes note){
		notesList.add(note);	
		return notesList;
	}

	public ArrayList<Notes> removeNoteFromList(int noteId) {
	
		for(int i=0;i < notesList.size() ;i++) {
			if (notesList.get(i).getId() == noteId) {
				notesList.remove(i);
				return notesList;
			}
		}

		return notesList;
	}
	
	
}
