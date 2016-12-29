/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

/**
 *
 * @author YNZ
 */
public class Invoice {

    private double Id;
    private String title;
    private double amount;

    public Invoice() {
    }

    public double getId() {
        return Id;
    }

    public void setId(double Id) {
        this.Id = Id;
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
