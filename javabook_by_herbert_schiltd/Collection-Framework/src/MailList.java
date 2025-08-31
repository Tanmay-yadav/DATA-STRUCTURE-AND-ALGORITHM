// A simple mailing list example.

import java.util.*;

// Class to hold address details
class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    // Constructor to initialize address fields
    Address(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    // Override toString() to display the address in a readable format
    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " + code + " ";
    }
}

public class MailList {
    public static void main(String[] args) {
        // Create a linked list to store Address objects
        LinkedList<Address> ml = new LinkedList<Address>();

        // Add elements (addresses) to the linked list
        ml.add(new Address("J.w. west", "l1 Oak Ave", "urbana", "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1141 Maple Lane", "Mahomet", "IL", "61853"));
        ml.add(new Address("Tom carlton", "867 Elm St", "champaign", "IL", "61820"));

        // Display the mailing list using a for-each loop
        for (Address element : ml)   // 🔹 Why Address and not String?
            /*
             * ml is a LinkedList<Address> → it stores objects of type Address, not String.
             * In a for-each loop, the type of the loop variable must match the type
             * of the collection elements.
             *
             * So:
             * - If ml was LinkedList<String> → you would use String element.
             * - But since ml is LinkedList<Address> → you must use Address element.
             *
             * 🔹 But then how are we able to print it like a string?
             * That’s because the Address class overrides the toString() method:
             *
             *   public String toString() {
             *       return name + "\n" + street + "\n" + city + " " + state + " " + code + " ";
             *   }
             *
             * When you do System.out.println(element);
             * Java automatically calls element.toString().
             *
             * That’s why you see the formatted address as text,
             * even though element is not a String but an Address object.
             */
            System.out.println(element + "\n");  // Calls toString() of Address automatically

        // Print a blank line at the end
        System.out.println();
    }
}
