package com.mycompany.universityapp;

public class University {
    private String name;
    private String location;

    //------- Constructors -------- :
    public University(){
        name = "";
        location = "";
    }
    public University(String name ,String location) {
        this.name = name;
        this.location = location;
    }
    //-----------------------------

    //------- Setter & Getter -------- :
    public void SetName(String name) {
        this.name = name;
    }
    public String GetName() {
        return name;
    }

    public void SetLocation(String location) {
        this.location = location;
    }
    public String GetLocation() {
        return location;
    }
    //----------------------------------
}