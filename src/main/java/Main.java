public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        Contact petya = new Contact("Petya", "123-456");
        Contact tanya = new Contact("Tanya", "234-567");
        Contact kolya = new Contact("Kolya", "345-678");

        phoneBook.addGroup("Family");
        phoneBook.addGroup("Coworkers");

        phoneBook.addContact(tanya, "Family");
        phoneBook.addContact(kolya, "Coworkers");
        phoneBook.addContact(kolya, "Friends");
        phoneBook.addContact(petya, "Family");
        
        System.out.println(phoneBook.contactsInGroup("Family"));
        System.out.println(phoneBook.contactsInGroup("Coworkers"));
        System.out.println(phoneBook.contactsInGroup("Friends"));

        System.out.println(phoneBook.findContact("234-567"));
        System.out.println(phoneBook.findContact("234-56"));
    }
}
