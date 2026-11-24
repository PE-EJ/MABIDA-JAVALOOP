/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acticity3;

/**
 *
 * @author RELLOSO_CPE113
 */
public class Acticity3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CampusWallet aly = new CampusWallet("Aly", 100);
        CampusWallet ben = new CampusWallet("Ben");

        System.out.println(aly.getOwner() + ": " + aly.getBalance()
                + ", " + ben.getOwner() + ": " + ben.getBalance());

        boolean t1 = aly.transferTo(ben, 35);
        System.out.println(t1 + "; " + aly.getOwner() + ": " + aly.getBalance()
                + ", " + ben.getOwner() + ": " + ben.getBalance());

        boolean t2 = aly.transferTo(ben, 70);
        System.out.println(t2 + "; " + aly.getOwner() + ": " + aly.getBalance()
                + ", " + ben.getOwner() + ": " + ben.getBalance());

        boolean t3 = aly.transferTo(aly, 10);
        System.out.println(t3 + "; " + aly.getOwner() + ": " + aly.getBalance()
                + ", " + ben.getOwner() + ": " + ben.getBalance());

        boolean d1 = ben.deposit(15);
        System.out.println(d1 + "; " + aly.getOwner() + ": " + aly.getBalance()
                + ", " + ben.getOwner() + ": " + ben.getBalance());

        boolean t4 = aly.transferTo(ben, 65);
        System.out.println(t4 + "; " + aly.getOwner() + ": " + aly.getBalance()
                + ", " + ben.getOwner() + ": " + ben.getBalance());

        // Added Test 1: Zero-credit transfer
        boolean zeroTransfer = ben.transferTo(aly, 0);
        System.out.println(zeroTransfer + "; " + aly.getOwner() + ": " + aly.getBalance()
                + ", " + ben.getOwner() + ": " + ben.getBalance());

        // Added Test 2: Transfer to null
        boolean nullTransfer = ben.transferTo(null, 10);
        System.out.println(nullTransfer + "; " + aly.getOwner() + ": " + aly.getBalance()
                + ", " + ben.getOwner() + ": " + ben.getBalance());
    }
}
