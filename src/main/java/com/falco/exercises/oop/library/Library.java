package com.falco.exercises.oop.library;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library {

    ArrayList<Rent> rents;

    public Library() {
        rents = new ArrayList<>();
    }

    public boolean addRent(Rent rent) {
        return rents.add(rent);
    }

    public boolean removeRent(Rent rent) {
        return rents.remove(rent);
    }

    public ArrayList<Rent> getExpired(LocalDate date) {
        ArrayList<Rent> lateRents = new ArrayList<>();

        for (Rent rent : rents) {
            if (rent.isExpired(date)) {
                lateRents.add(rent);
            }
        }
        return lateRents;
    }
}
