package com.persistnotes.persistnotes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

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

	public ArrayList<Notes> editNoteFromList(Map<String, Object> values) {
		int noteId = (int) values.get("id");
		for(Notes note : notesList) {
			if (note.getId() == noteId) {
				// getting the rest of values
				String description = values.containsKey("description") ? (String) values.get("description") : note.getDescription();
				String text = values.containsKey("text") ? (String) values.get("text") : note.getText();
				LocalDate dateOfCreation = values.containsKey("dateOfCreation") ? (LocalDate) values.get("dateOfCreation") : note.getDateOfCreation();
				LocalDate estimatedDateOfCompletion = values.containsKey("estimatedDateOfCompletion") ? (LocalDate) values.get("estimatedDateOfCompletion") : note.getEstimatedDateOfCompletion();
				LocalDate dateOfCompleation = values.containsKey("dateOfCompleation") ? (LocalDate) values.get("dateOfCompleation") : note.getDateOfCompleation();
				String link = values.containsKey("link") ? (String) values.get("link") : note.getLink();
				String mentions = values.containsKey("mentions") ? (String) values.get("mentions") : note.getMentions();
				String priority = values.containsKey("priority") ? (String) values.get("priority") : note.getPriority();
				//
				note.setDescription(description);
				note.setText(text);
				note.setDateOfCreation(dateOfCreation);
				note.setEstimatedDateOfCompletion(estimatedDateOfCompletion);
				note.setDateOfCompleation(dateOfCompleation);
				note.setLink(link);
				note.setMentions(mentions);
				note.setPriority(priority);
			}
		}
		return notesList;
	}
	
	public Notes retrieveNote(int noteId) {
		for(int i=0;i < notesList.size() ;i++) {
			if (notesList.get(i).getId() == noteId) {
				return notesList.get(i);
			}
		}
		return null;
	}

	public int getId() {
		return id;
	}

	public ArrayList<Notes> getNotesList() {
		return notesList;
	}
}
