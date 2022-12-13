
package bol16;

import javax.swing.JOptionPane;

/**
 *
 * @author JayBGB
 */
public class Account extends Person {
    
    //Attributes
    
    private long accountNumber;
    private static double balance;
    private Person client;
    
    // Constructors

    public Account(long accountNumber, double balance, Person client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }
    
    public Account(){}
    
    //Setters & Getters

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
        this.client = client;
    }

//Methods

public void deposit (){
    long accountRequest= Long.parseLong(JOptionPane.showInputDialog("Introduce the account number: "));
    if (accountRequest==accountNumber){
        JOptionPane.showMessageDialog(null, "Welcome, "+client+".\nYour balance is: "+balance+"€\n");
        double newDeposit = Double.parseDouble(JOptionPane.showInputDialog("Introduce the ammount you would like to deposit: "));
        double newBalance = newDeposit+balance;
        balance=newBalance;
        JOptionPane.showMessageDialog(null, "You have successfully deposited "+newDeposit+"€.\nNew balance: "+balance+"€.");
}
    else {
        JOptionPane.showMessageDialog(null, "The account number is incorrect.");
    }
}

public void withdraw (){
    long accountRequest= Long.parseLong(JOptionPane.showInputDialog("Introduce the account number: "));
    if ((accountRequest==accountNumber)&&(balance>0)){
        JOptionPane.showMessageDialog(null, "Welcome, "+client+".\nYour balance is "+balance+"€\n");
        double newWithdrawal = Double.parseDouble(JOptionPane.showInputDialog("Introduce the ammount you would like to withdraw: "));
        double newBalance=balance-newWithdrawal;
        balance=newBalance;
        JOptionPane.showMessageDialog(null, "You have successfully withdrawn "+newWithdrawal+"€.\nNew balance: "+newBalance+"€");
    
    }
    else if (accountRequest!=accountNumber){
        JOptionPane.showMessageDialog(null, "The account number is incorrect.");
    }
    else {
        JOptionPane.showMessageDialog(null, "Insufficient funds.");
   
    }
}

public void showBalance (){
    JOptionPane.showMessageDialog(null, "Your balance is: "+balance);
}
    
    
}


    

