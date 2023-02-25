package com.mycompany.universityapp;

import java.util.ArrayList;

public class Building  extends University{ // Extends name from class University

    //------- Constructor -------- :
    public Building() {
        
    }
    //-----------------------------

    //------- Setter & Getter -------- :

    ArrayList<Room> roomList = new ArrayList<Room>(); // Array list from class room , becuse one building has many rooms
    public void SetRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }
    public ArrayList<Room> GetRoomList() {
        return roomList;
    }
    //----------------------------------
}