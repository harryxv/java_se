package com.harrywork.addressbook;

import java.util.*;

public class AddressBookImpl implements AddressBook {
    @Override
    public Set<Contact> getContacts() {
        return contacts;
    }

    @Override
    public void clear() {
        contacts.clear();
    }

    private Set<Contact> contacts = new TreeSet<>(); //All existing contacts without duplication
    private Integer nextId = 1;

    public AddressBookImpl() {
    }

    @Override
    public boolean add(Contact contact) {
        if (contacts.contains(contact)) {
            return false;
        }

        contact.setId(nextId++);
        return contacts.add(contact);
    }

    @Override
    public Iterator<Contact> listAll() {
        return contacts.iterator();
    }

    @Override
    public void update(Contact contact) {
        Contact current = this.loadContactById(contact.getId());
        if (current != null) {
            current.setFirstName(contact.getFirstName());
            current.setLastName(contact.getLastName());
            current.setTelephone(contact.getTelephone());
            current.setEmail(contact.getEmail());
        }
    }

    private Contact loadContactById(Integer id) {
        for (Contact contact : contacts) {
            if (contact.getId().equals(id)) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public void remove(Contact contact) {
        Contact current = this.loadContactById(contact.getId());
        if (current != null) {
            contacts.remove(current);
        }
    }

    @Override
    public Integer size() {
        return contacts.size();
    }

}
