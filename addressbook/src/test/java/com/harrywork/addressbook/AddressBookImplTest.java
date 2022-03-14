package com.harrywork.addressbook;

import org.junit.*;

import java.util.Iterator;

import static org.junit.Assert.*;

public class AddressBookImplTest {
    private static AddressBook addressBook;


    @Before
    public void setUpEachTest() throws Exception {
        addressBook = AddressBookFactory.createAddressBook();
        addressBook.clear();
    }

    @After
    public void tearDownEachTest() throws Exception {
        addressBook = null;
    }


    @Test
    public void testAddBrandNew() {
        Integer sizeBefore = addressBook.size();
        Contact contact = new Contact("first_name", "last_name", "416-1234567", "account@gmail.com");
        addressBook.add(contact);
        Integer sizeAfter = addressBook.size();
        assert (sizeAfter == sizeBefore + 1);
        displayContacts("testAddBrandNew");
    }

    @Test
    public void testAddDuplicate() {
        Integer sizeBefore = addressBook.size();
        Contact contact = new Contact("first_name", "last_name", "416-1234567", "account@gmail.com");
        addressBook.add(contact);
        Integer sizeAfter = addressBook.size();
        assert (sizeAfter == sizeBefore + 1);


        sizeBefore = addressBook.size();
        boolean result = addressBook.add(contact);
        assertFalse(result);
        displayContacts("testAddDuplicate");

    }

    private void displayContacts(String testMessage) {
        System.out.println(testMessage);
        Iterator<Contact> allContacts = addressBook.listAll();
        while (allContacts.hasNext()) {
            Contact c = allContacts.next();
            System.out.format("ID = %s, Name = %s email= %s\n", c.getId(), c.getFirstName() + " " + c.getLastName(), c.getEmail() == null ? "" : c.getEmail());
        }
    }


    @Test
    public void testUpdateExistingContact() {
        Contact contact = new Contact("first_name", "last_name", "416-1234567", "account@gmail.com");
        // addressBook.update();
    }

    @Test
    public void remove() {
    }
}