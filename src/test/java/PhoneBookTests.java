import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneBookTests {

    PhoneBook phoneBook;
    Contact tanya;

    @BeforeEach
    public void beforeEach() {
        System.out.println("before each test");
        phoneBook = new PhoneBook();
        phoneBook.addGroup("Family");
        tanya = new Contact("Tanya", "234-567");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after each test");
        phoneBook = null;
    }

    @Test
    public void testFindContact() {
        // given:
        phoneBook.addContact(tanya, "Family");
        Object expected = "Contact: name - Tanya, phone number: 234-567";

        // when:
        Object actual = phoneBook.findContact("234-567");

        // then:
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddContact() {
        Assertions.assertTrue(phoneBook.addContact(tanya, "Family"));
    }

    @Test
    public void testPhoneBookNotNull() {
        Assertions.assertNotNull(phoneBook);
    }

    @Test
    public void testContactNotNull() {
        Assertions.assertNotNull(tanya);
    }

    @Test
    public void testContactsInGroup() {
        // given:
        phoneBook.addGroup("Friends");
        phoneBook.addContact(tanya, "Friends");
        Object expected = "In group Friends contacts: [name - Tanya, phone number: 234-567]";

        // when:
        Object actual = phoneBook.contactsInGroup("Friends");

        //then:
        Assertions.assertEquals(expected, actual);
    }
}
