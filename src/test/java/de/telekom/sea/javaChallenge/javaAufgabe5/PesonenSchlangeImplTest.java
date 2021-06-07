
package de.telekom.sea.javaChallenge.javaAufgabe5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;


class PesonenSchlangeImplTest {

			private PersonenSchlangeImpl cut;
			
			@BeforeEach 
			void setup() {
				cut = new PersonenSchlangeImpl();
			}
			
			@Test
			void add_anlegen_test() {

				// Arrange
	
				Person person1 = new PersonImpl("Hans",   "Maier");
				Person person2 = new PersonImpl("Hansi",  "Maierle");
				Person person3 = new PersonImpl("Gustl",  "Gans");
				Person person4 = new PersonImpl("Gerda",  "Schmid");
				Person person5 = new PersonImpl("Erika",  "Keller");
				Person person6 = new PersonImpl("Susi",   "Niklax");
				Person person7 = new PersonImpl("Harry",  "Treter");
				Person person8 = new PersonImpl("Elke",   "Luckert");

				// Act
				
				cut.add(person1);
				cut.add(person2);
				cut.add(person3);
				cut.add(person4);
				cut.add(person5);
				cut.add(person6);
				cut.add(person7);
				cut.add(person8);	

				// Assert
				
//				assertEquals("Hans", vorname);
//				assertEquals("Maier", nachname);
			}
			
			@Test
			void add_voll_test() {

				// Arrange
	
				Person person1 = new PersonImpl("Hans",   "Maier");
				Person person2 = new PersonImpl("Hansi",  "Maierle");
				Person person3 = new PersonImpl("Gustl",  "Gans");
				Person person4 = new PersonImpl("Gerda",  "Schmid");
				Person person5 = new PersonImpl("Erika",  "Keller");
				Person person6 = new PersonImpl("Susi",   "Niklax");
				Person person7 = new PersonImpl("Harry",  "Treter");
				Person person8 = new PersonImpl("Elke",   "Luckert");
				Person person9 = new PersonImpl("Maria",   "Luckert");

				// Act
				
				cut.add(person1);
				cut.add(person2);
				cut.add(person3);
				cut.add(person4);
				cut.add(person5);
				cut.add(person6);
				cut.add(person7);
				cut.add(person8);	

				
				boolean withException = false;
				try {
				cut.add(person9);
			}
			catch (Exception e ) {
				withException =true;
				System.out.println(" Das Array ist vollständig gefüllt. ");
			}
				
				// Assert
				
			assertTrue(withException);
//				assertEquals("Maier", nachname);
			}
				
			@AfterEach
			void teardown() {
				cut = null;
			}

}