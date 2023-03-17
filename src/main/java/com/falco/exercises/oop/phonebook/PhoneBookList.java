package com.falco.exercises.oop.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook{
    public final int MAX_PERSONS = 256;
    ArrayList<Person> phoneBook;
    int size;

    public PhoneBookList(ArrayList<Person> phoneBook) {
        this.phoneBook = phoneBook;
        this.size = phoneBook.size();
    }

    @Override
    public void addPerson(Person person) {
        if(size >= MAX_PERSONS){
            System.out.println("You reached the maximum limit");
        } else{
            phoneBook.add(person);
            size++;
        }
    }

    @Override
    public void removePerson(Person person) {
        phoneBook.remove(person);
        size--;
    }

    @Override
    public Person searchByLastname(String lastname) {
        for(int i = 0; i < phoneBook.size(); i++){
            if(phoneBook.get(i).lastname == lastname){
                return phoneBook.get(i);
            }
        }
        return null;
    }

    @Override
    public Person searchByName(String name) {
        for(int i = 0; i < phoneBook.size(); i++){
            if(phoneBook.get(i).name == name){
                return phoneBook.get(i);
            }
        }
        return null;
    }

    @Override
    public Person searchByNumber(String number) {
        for(int i = 0; i < phoneBook.size(); i++){
            if(phoneBook.get(i).phone == number){
                return phoneBook.get(i);
            }
        }
        return null;
    }
}
