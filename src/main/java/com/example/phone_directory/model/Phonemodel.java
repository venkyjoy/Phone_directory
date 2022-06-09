package com.example.phone_directory.model;

import javax.persistence.*;

@Entity
@Table(name ="phone")

public class Phonemodel {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int  id;



    private  String Firstname;
    private  String Lastname;
    private  String State;
    private  String Phone;

    public  Phonemodel(){

    }

    public Phonemodel(int id, String firstname, String lastname, String state, String phone) {
        this.id = id;
        Firstname = firstname;
        Lastname = lastname;
        State = state;
        Phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
