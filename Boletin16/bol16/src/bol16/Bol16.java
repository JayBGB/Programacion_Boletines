
package bol16;

public class Bol16 {

    
    public static void main(String[] args) {
        
        Person people = new Person("Borja", "García Barrera", "12345678Z");
        
        CurrentAccount cA = new CurrentAccount (123, 5000, people);
        
        cA.deposit();
        cA.withdraw();
        cA.showBalance();
        
        Person people2 = new Person ("Nina", "Fontaiña", "87654321A");
        
        SavingsAccount sA = new SavingsAccount (15, 1500, 1234, 7806, people2);
        
        sA.deposit();
        sA.withdraw();
        sA.showBalance();
        
    }
    
}