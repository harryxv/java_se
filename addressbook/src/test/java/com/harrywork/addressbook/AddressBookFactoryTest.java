package com.harrywork.addressbook;
import static org.junit.Assert.*;

public class AddressBookFactoryTest {

    @org.junit.Test
    public void createAddressBook() {
        AddressBook addressBook = AddressBookFactory.createAddressBook();
        assertNotNull(addressBook);
    }
}