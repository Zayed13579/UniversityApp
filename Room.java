package com.mycompany.universityapp;

public class Room {
    private String roomNum;
    private String seatNum;

    //------- Constructor -------- :
    public Room(String roomNum , String seatNum){
        this.roomNum = roomNum;
        this.seatNum = seatNum;
    }
    //------------------------------

    //------- Setter & Getter -------- :
    public void SetRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }
    public String GetRoomNum() {
        return roomNum;
    }

    public void SetSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }
    public String GetSeatNum() {
        return seatNum;
    }
    //----------------------------------
}