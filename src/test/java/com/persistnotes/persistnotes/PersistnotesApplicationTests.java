package com.persistnotes.persistnotes;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

//import java.text.SimpleDateFormat;
import java.time.LocalDate;
//import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class PersistnotesApplicationTests {
	
	int expectedValue=1;
	@Test
	public void incrementID_WhenCalled_ReturnsPreviusIdPlusOne() {
		NotesList notesList = new NotesList();
		int result = notesList.incrementId();
		assertEquals(expectedValue,result);
	}

	
	@Test
	public void createNote_WhenCalled_ReturnsNotes() {
		Notes expectedNotes = new Notes(1, "some description", "some text", LocalDate.now(), LocalDate.parse("2022-10-24")
				, null, "some link", "some mention", "low");
		NotesList notesList = new NotesList();
		Notes result = notesList.createNote("some description", "some text", "2022-10-24", "some link", "some mention", "low");
		//assertEquals(expectedNotes, (result));
        assertThat(expectedNotes)
        .usingRecursiveComparison()
        .isEqualTo(result);
	}
	
	@Test
	public void addNoteToList_WhenCalled_ReturnsTheListWithObejectAdded() {
		int expectedSizeArray=1;
		NotesList notesList = new NotesList();
		Notes note = notesList.createNote("some description", "some text", "2022-10-24", "some link", "some mention", "low");
		ArrayList<Notes> list = notesList.addNoteToList(note);
		assertEquals(expectedSizeArray,list.size());
	}

	@Test
	public void removeNoteToList_WhenCalled_ReturnsTheListWithObejectRemoved() {		
		int expectedSizeArray=0;
		NotesList notesList = new NotesList();
		
		Notes note = notesList.createNote("some description", "some text", "2022-10-24", "some link", "some mention", "low");
		notesList.addNoteToList(note);
		ArrayList<Notes> list = notesList.removeNoteFromList(1);
		
		assertEquals(expectedSizeArray,list.size());
	}
	
	@Test
	public void editNoteFromList_WhenCalled_ReturnsTheListWithTheModifiedObject() {
		NotesList notesList = new NotesList();
		Notes note = notesList.createNote("some description", "some text", "2022-10-24", "some link", "some mention", "low");
		notesList.addNoteToList(note);
		
		Map<String, Object> values = new HashMap();
		values.put("id", 1);
		values.put("description", "some edited description");
		ArrayList<Notes> list = notesList.editNoteFromList(values);
		
		assertEquals(list.get(0).getDescription(),"some edited description");
		
	}
}
