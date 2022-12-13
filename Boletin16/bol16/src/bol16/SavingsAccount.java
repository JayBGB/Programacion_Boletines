package bol16;

import javax.swing.JOptionPane;

/**
 *
 * @author JayBGB
 */
public class SavingsAccount extends Account{
    
    //Attributes
    
    private double interest, minWage;
    
    //Constructors

    public SavingsAccount(double interest, double minWage, long accountNumber, double balance, Person client) {
        super(accountNumber, balance+(balance*(interest/100)), client);
        this.interest = interest;
        this.minWage = minWage;
    }
    
    //Methods
    
    public void changeInterestRate (){
        double newInterest = Double.parseDouble(JOptionPane.showInputDialog("Current interest rate: "+interest+"%.\n Introduce the new rate: "));
        interest=newInterest;
        JOptionPane.showMessageDialog(null, "Operation successful.\nNew interest rate: "+interest+"%");
    }
    
    //toString

    @Override
    public String toString() {
        return "SavingsAccount{" + "interest=" + interest + ", minWage=" + minWage + '}';
    }
    
    
}
