package com.falco.exercises.oop.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements PhoneBook {
    public static int MAX_PERSONS = 256;
    Person[] phoneBook = new Person[0];
    private int size;

    public PhoneBookArray(Person[] phoneBook) {
        this.phoneBook = phoneBook;
        this.size = phoneBook.length;
    }

    @Override
    public void addPerson(Person person) {
        if (size >= MAX_PERSONS) {
            System.out.println("You reached the maximum limit!");
        } else {
            Person[] tmp = new Person[phoneBook.length + 1];
            System.arraycopy(phoneBook, 0, tmp, 0, phoneBook.length);
            tmp[tmp.length - 1] = person;
            phoneBook = tmp;
            size++;
        }
    }

    @Override
    public void removePerson(Person person) {
        for (int i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i].equals(person)) {
                System.arraycopy(phoneBook, i + 1, phoneBook, i, phoneBook.length - i - 1);
                break;
            }
        }
        size--;
    }

    @Override
    public Person searchByLastname(String lastname) {
        int i;
        for (i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i].lastname == lastname) {
                return phoneBook[i];
            }
        }
        return null;
    }

    @Override
    public Person searchByName(String name) {
        int i;
        for (i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i].name == name) {
                return phoneBook[i];
            }
        }
        return null;
    }

    @Override
    public Person searchByNumber(String number) {
        int i;
        for (i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i].phone == number) {
                return phoneBook[i];
            }
        }
        return null;
    }
}
