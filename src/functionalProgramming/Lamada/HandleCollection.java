/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalProgramming.Lamada;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/** @author YNZ */
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

class DoSomething implements Consumer<Invoice> {

  @Override
  public void accept(Invoice t) {
    if (t.getName().equals("Chair")) {
      System.out.println(t);
    }
  }
}

class DoPredicate implements Predicate<Invoice> {

  @Override
  public boolean test(Invoice t) {
    throw new UnsupportedOperationException(
        "Not supported yet."); // To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Predicate<Invoice> and(Predicate<? super Invoice> other) {
    return Predicate.super.and(
        other); // To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Predicate<Invoice> negate() {
    return Predicate.super
        .negate(); // To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Predicate<Invoice> or(Predicate<? super Invoice> other) {
    return Predicate.super.or(
        other); // To change body of generated methods, choose Tools | Templates.
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

    List<Invoice> sortedInv =
        invoices.stream()
            .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
            .collect(Collectors.toList());
    System.out.println("" + sortedInv);

    invoices.stream().forEach((Invoice inv) -> System.out.println("" + inv));
    Boolean b = invoices.stream().allMatch(inv -> inv.getName().equals("Chair"));
    System.out.println("b= " + b);
    invoices.stream().filter(inv -> inv.getName().equals("Chair")).collect(Collectors.toList());
    invoices.removeIf(inv -> inv.getName().equals("Chair"));
    System.out.println(invoices);
  }
}
