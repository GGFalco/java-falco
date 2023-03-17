package com.falco.exercises.oop.phonebook;

public interface PhoneBook {
    public void addPerson(Person person);
    public void removePerson(Person person);
    public Person searchByLastname(String lastname);
    public Person searchByName(String name);
    public Person searchByNumber(String number);
}
