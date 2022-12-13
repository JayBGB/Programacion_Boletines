
package bol16;

/**
 *
 * @author JayBGB
 */
public class Person {
    
    //Attributes
    
    private String name, surname, NIF;
    
    //Constructors

    public Person(String name, String surname, String NIF) {
        this.name = name;
        this.surname = surname;
        this.NIF = NIF;
    }
    
    public Person (){}
    
    //Setters & Getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
    
    
    

}
