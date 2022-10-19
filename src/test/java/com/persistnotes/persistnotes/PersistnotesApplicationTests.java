package com.persistnotes.persistnotes;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

//import java.text.SimpleDateFormat;
import java.time.LocalDate;
//import java.util.Date;
import java.util.ArrayList;

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
	public void addNote_WhenCalled_ReturnsNotes() {
		Notes expectedNotes = new Notes(1, "some description", "some text", LocalDate.now(), LocalDate.parse("2022-10-24")
				, null, "some link", "some mention", "low");
		NotesList notesList = new NotesList();
		Notes result = notesList.createNote("some description", "some text", "2022-10-24", "some link", "some mention", "low");
		//assertEquals(expectedNotes, (result));
        assertThat(expectedNotes)
        .usingRecursiveComparison()
        .isEqualTo(result);
	}
	int expectedSizeArray=1;
	@Test
	public void addNoteToList_WhenCalled_ReturnsTheListWithObejectAdded() {
		NotesList notesList = new NotesList();
		ArrayList<Notes> list = notesList.addNoteToList();
		assertEquals(expectedSizeArray,list.size());
	}
}
