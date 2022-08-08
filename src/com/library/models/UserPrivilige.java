package com.library.models;

public enum UserPrivilige {
    USER, ADMIN, SUPERADMIN
}

package com.library.service;

import com.library.models.Rent;
import com.library.users.Customer;
import com.library.users.User;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Alert {

    private static HashSet<Customer> customers;

    public ArrayList<Rent> getOverdueRents() {
        return getSoonOverdueRents(Period.ZERO);
    }

    public static HashSet<Customer> getCustomers() {
        return customers;
    }

    public static void setCustomers(HashSet<Customer> customers) {
        Alert.customers = customers;
    }

    public ArrayList<Rent> getSoonOverdueRents(Period period) {
        ArrayList<Rent> result = new ArrayList<Rent>();
        for (Customer customer : customers) {
            for (Rent rent : customer.getRentedBooks()) {
                if (rent.getDateOfRent().plus(rent.getPeriod()).isAfter(LocalDate.now().minus(period))) {
                    result.add(rent);
                }
            }
        }
        return result;
    }

    public ArrayList<Rent> getAllRents() {
        ArrayList<Rent> result = new ArrayList<Rent>();
        for (Customer customer : customers) {
            for (Rent rent : customer.getRentedBooks()) {
                    result.add(rent);
            }
        }
        return result;
    }
}
