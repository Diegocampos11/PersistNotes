package com.persistnotes.persistnotes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

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

	Notes expectedNotes = new Notes(1, "some description", "some text", LocalDate.now(), LocalDate.parse("2022-10-24")
			, null, "some link", "some mention", "low");
	@Test
	public void addNote_WhenCalled_ReturnsNotes() {
		NotesList notesList = new NotesList();
		Notes result = notesList.createNote("some description", "some text", "2022-10-24", "some link", "some mention", "low");
		assertEquals(expectedValue, result);
	}
}
