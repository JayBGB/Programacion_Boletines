package bol16;

/**
 *
 * @author JayBGB
 */
public class CurrentAccount extends Account{
    //Attributes
    
    private final double INTEREST=0.015;
    
    //Constructors

    public CurrentAccount(long accountNumber, double balance, Person client) {
        super(accountNumber, balance+(balance*0.015), client);
    }
    
    //toString

    @Override
    public String toString() {
        return "CurrentAccount{" + "INTEREST=" + INTEREST + '}';
    }
    
    

}
