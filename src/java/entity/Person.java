package entity;

import javax.persistence.*;

public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String firstname;
    private String lastname;
    private int phone;

    public Person(long id, String firstname, String lastname, int phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getPhone() {
        return phone;
    }
}
