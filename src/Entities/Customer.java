package Entities;

import Abstract.Entity;

import java.util.Date;

public class Customer implements Entity {
     private int id;
     private String firstName;
     private String lastName;
     private Date dateOfBirth;
     private String natinolatiyId;

     public Customer()
     {

     }

    public Customer(int id, String firstName, String lastName, Date dateOfBirth, String natinolatiyId) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setDateOfBirth(dateOfBirth);
        this.setNatinolatiyId(natinolatiyId);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNatinolatiyId() {
        return natinolatiyId;
    }

    public void setNatinolatiyId(String natinolatiyId) {
        this.natinolatiyId = natinolatiyId;
    }
}
