/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamada;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author YNZ
 */
class Invoice {

    private String name;

    public Invoice(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

public class HandleCollection {

    public static void main(String[] args) {
        List<Invoice> invoices = new ArrayList<>();
        invoices.add(new Invoice("Dell laptop"));
        invoices.add(new Invoice("Desk"));
        invoices.add(new Invoice("Chair"));
        invoices.add(new Invoice("Dell screen"));
        invoices.add(new Invoice("Bose Airphone"));
        invoices.add(new Invoice("Chair"));
        invoices.add(new Invoice("Chair"));

        List<Invoice> sortedInv  = invoices.stream().filter(
                (Invoice inv) -> inv.getName().equals("Chair")).sorted(
                        (o1,o2)->o1.getName().compareTo(o2.getName()))
                .collect(Collectors.toList());
        System.out.println("" + sortedInv);

    }
}
