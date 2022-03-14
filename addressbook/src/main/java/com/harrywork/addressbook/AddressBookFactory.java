package com.harrywork.addressbook;

/**
 * Factory class to create an instance of AddressBook.
 */
public class AddressBookFactory {
    private static AddressBook instance = null;

    public static AddressBook createAddressBook() {
        if (instance == null) {
            instance = new AddressBookImpl();
        }
        return instance;
    }
}
