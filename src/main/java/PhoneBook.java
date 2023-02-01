import java.util.*;

public class PhoneBook {
    private final Map<String, List<Contact>> phoneBook = new HashMap<>();

    public void addGroup(String group) {
        if (phoneBook.containsKey(group)) {
            System.out.println("This group already exists.");
        } else {
            phoneBook.put(group, new ArrayList<>());
        }
    }

    public boolean addContact(Contact contact, String group) {
        if (phoneBook.containsKey(group)) {
            phoneBook.get(group).add(contact);
            System.out.println("Contact " + contact.getName() + " added in " + group);
            return true;
        } else {
            System.out.println("Group " + group + ", does not exist.");
        }
        return false;
    }

    public Object contactsInGroup(String group) {
        if (phoneBook.containsKey(group)) {
            return "In group " + group + " contacts: " + phoneBook.get(group);
        }
        return "Group " + group + ", does not exist.";
    }

    public Object findContact(String phone) {
        for (List<Contact> contacts : phoneBook.values()) {
            for (Contact contact : contacts) {
                if (contact.getPhoneNumber().equals(phone)) {
                    return "Contact: " + contact;
                }
            }
        }
        return "Contact, with number " + phone + ", not found.";
    }

}
