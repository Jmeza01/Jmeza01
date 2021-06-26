package ContactTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import Contact.Contact;




class ContactTest {

	@Test
	void testContactTest() {
		Contact contacts = new Contact("Customer", "12345");
		assertTrue(contacts.getName().equals("Customer"));
		assertTrue(contacts.getId().equals("12345"));
	}
	@Test
	void testContactNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Customer", "12345");
		});
	}
}