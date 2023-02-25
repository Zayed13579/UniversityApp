package com.mycompany.universityapp;

public class Instructor extends University{ // Extends variable name from class University
    private String age;
    private String email;
    private String subject;
    private String roomNum;

    //------- Constructor -------- :
    public Instructor(String name ,String age, String email, String subject, String roomNum) {
        this.age = age;
        this.email = email;
        this.subject = subject;
        this.roomNum = roomNum;
    }
    //-----------------------------

    //------- Setter & Getter -------- :
    public void SetAge(String age) {
        this.age = age;
    }
       public String GetAge() {
        return age;
    }

    public void SetEmail(String email) {
        this.email = email;
    }
    public String GetEmail() {
        return email;
    }

    public void SetSubject(String subject) {
        this.subject = subject;
    }
    public String GetSubject() {
        return subject;
    }


    public void SetRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }
       public String GetRoomNum() {
        return roomNum;
    }
    //----------------------------------
}