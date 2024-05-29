package April15thAssignments;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> contacts = new HashMap<>();

        while (true) {
            System.out.println("\nPhonebook Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addContact(contacts, scanner);
                    break;
                case 2:
                    searchContact(contacts, scanner);
                    break;
                case 3:
                    System.out.println("Exiting Phonebook.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    private static void addContact(HashMap<String, String> contacts, Scanner scanner) {
        System.out.print("Enter Name: ");
        String name = scanner.next();
        System.out.print("Enter Phone Number: ");
        String number = scanner.next();

        if (contacts.containsKey(name)) {
            System.out.println("Contact already exists! Update (y/n)? ");
            char update = scanner.next().charAt(0);
            if (update == 'y' || update == 'Y') {
                contacts.put(name, number);
                System.out.println("Contact Updated!");
            }
        } else {
            contacts.put(name, number);
            System.out.println("Contact Added!");
        }
    }

    private static void searchContact(HashMap<String, String> contacts, Scanner scanner) {
        System.out.print("Enter Name to Search: ");
        String name = scanner.next();

        if (contacts.containsKey(name)) {
            System.out.println("Contact Found! Phone Number: " + contacts.get(name));
        } else {
            System.out.println("Contact Not Found!");
        }
    }
}