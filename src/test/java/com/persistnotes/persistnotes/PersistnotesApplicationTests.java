package com.persistnotes.persistnotes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.peratest.springboot.learnspringbootperaframework.TaskNotes;

@SpringBootTest
class PersistnotesApplicationTests {

	@Test
	void contextLoads() {
	}
	
	int expectedValue=1;
	@Test
	public void incrementID_WhenCalled_ReturnsPreviusIdPlusOne() {
		NotesList notesList = new NotesList();
		int result = notesList.incrementId();
		assertEquals(result,expectedValue);
	}

}
