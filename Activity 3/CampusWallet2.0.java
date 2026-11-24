/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acticity3;

/**
 *
 * @author RELLOSO_CPE113
 */
public class CampusWallet {
private String owner;
    private int balance;


    public CampusWallet(String owner, int balance) {
        this.owner = owner;

        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

  
    public CampusWallet(String owner) {
        this(owner, 0);
    }

  
    public boolean deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }

        return false;
    }


    public boolean transferTo(CampusWallet recipient, int amount) {

        if (recipient == null) {
            return false;
        }

        if (recipient == this) {
            return false;
        }

        if (amount <= 0) {
            return false;
        }

        if (balance < amount) {
            return false;
        }

        balance -= amount;
        recipient.balance += amount;

        return true;
    }

  
    public int getBalance() {
        return balance;
    }

  
    public String getOwner() {
        return owner;
    }
}