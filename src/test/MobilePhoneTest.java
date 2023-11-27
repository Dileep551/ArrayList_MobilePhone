import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MobilePhoneTest {

    private MobilePhone mobilePhone;
    private Contact contact1;
    private Contact contact2;

    @BeforeEach
    public void setUp() {
        mobilePhone = new MobilePhone("850-567-3546");
        contact1 = new Contact("John", "994833112");
        contact2 = new Contact("Smith", "823-456-7899");
    }

    @Test
    public void testAddNewContact() {


        assertTrue(mobilePhone.addNewContact(contact1));
        assertFalse(mobilePhone.addNewContact(contact1));
        assertTrue(mobilePhone.addNewContact(contact2));
    }

    @Test
    public void testUpdateContact() {
        mobilePhone.addNewContact(contact1);

        Contact updatedContact = new Contact("John Doe", "111-222-3333");
        assertFalse(mobilePhone.updateContact(new Contact("Dileep", "1234567890"), updatedContact));
        assertFalse(mobilePhone.updateContact(contact1, new Contact("John", "555-1234")));
        assertTrue(mobilePhone.updateContact(contact1, updatedContact));
        assertEquals(updatedContact, mobilePhone.queryContact("John Doe"));
    }

    @Test
    public void testRemoveContact() {
        mobilePhone.addNewContact(contact1);
        assertTrue(mobilePhone.removeContact(contact1));
        assertFalse(mobilePhone.removeContact(contact1));
        assertFalse(mobilePhone.removeContact(new Contact("Dileep", "1234567890")));
    }

    @Test
    public void testQueryContact() {
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);

        assertEquals(contact1, mobilePhone.queryContact("John"));
        assertEquals(contact2, mobilePhone.queryContact("Smith"));

    }
}