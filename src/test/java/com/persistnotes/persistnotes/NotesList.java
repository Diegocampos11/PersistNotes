package com.persistnotes.persistnotes;

import java.util.ArrayList;

public class NotesList {
	
	private static int id = 0;
	private static ArrayList<Notes> notesList;

	public NotesList() {
		notesList = new ArrayList<Notes>();
	}
	
	public int incrementId() {
		return ++id;
	}
}
