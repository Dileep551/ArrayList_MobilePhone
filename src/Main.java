// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone("850-567-3546");
        Contact contact1 = new Contact("John", "994833112");
        Contact contact2 = new Contact("Smith", "823-456-7899");

        mobilePhone.addNewContact(contact1);

        mobilePhone.printContacts();

        mobilePhone.updateContact(contact1, contact2);


    }
}