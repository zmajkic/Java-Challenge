package de.telekom.sea.javaChallenge.javaAufgabe5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

class PersonImplTest {

	private PersonImpl cut;

	@BeforeEach
	void setup() {
		cut = new PersonImpl();
	}

	@Test
	void test() {

		// Arrange
		Person cut = new PersonImpl("Hans", "Maier");

		// Act
		String vorname = cut.getVorname();
		String nachname = cut.getNachname();

		// Assert
		assertEquals("Hans", vorname);
		assertEquals("Maier", nachname);

//		fail("Not yet implemented");
	}

	@AfterEach
	void teardown() {
		cut = null;
	}

}
