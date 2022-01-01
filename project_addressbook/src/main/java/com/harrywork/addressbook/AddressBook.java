package com.harrywork.addressbook;
import java.util.Iterator;
import java.util.Set;

/**
 * public APIs for address book application. a high-level functionality list.
 */
public interface AddressBook {
    boolean add(Contact contact);  //add new contact

    Iterator<Contact> listAll(); //list all contacts in addressbook

    void update(Contact contact);

    void remove(Contact contact);

    Integer size();

    Set<Contact> getContacts();

    void clear();

}
