package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContactTest {
	private void setupScenary1() {
	}
		
	@Test
	public void testContact() {
		setupScenary1();
		
		String n = "Juan Reyes";
		String e = "jmreyes@icesi.edu.co";
		String p = "3019876543";
		
		Contact newContact = new Contact(n, e, p);
		
		assertNotNull("Fail creating a new contact", newContact);
		
		assertTrue("The contact name assignment fail", n.equals(newContact.getName()));
		assertTrue("The contact email assignment  fail", e.equals(newContact.getEmail()));
		assertTrue("The contact phone assignment fail", p.equals(newContact.getPhone()));
	}

}
