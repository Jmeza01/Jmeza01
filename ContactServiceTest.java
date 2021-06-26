package ContactServiceTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import ContactService.ContactService;




class ContactServiceTest {

	@Test
	void testContactServiceTest() {
		ContactService contactService = new ContactService("Customer", "1111 E Road", "12345");
		assertTrue(contactService.getName().equals("Customer"));
		assertTrue(contactService.getAddress().equals("1111 E Road"));
		assertTrue(contactService.getId().equals("12345"));
	}
	@Test
	void testContactIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactService("Customer", "1111 E Road", "123456");
		});
	}
}