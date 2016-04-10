package com.example.jonathanmontanez.myapplication;

/**
 * Created by jonathanmontanez on 4/9/16.
 */
public class EventsClass {

    String nameOfEvent;
    String date;
    boolean status;
    String location;
    String description;
    String organizer;
    int eventID;

    EventsClass(String name, String creator, String dat, String loc, String desc, int id, boolean stat){
        nameOfEvent = name;
        organizer = creator;
        date = dat;
        location = loc;
        description = desc;
        eventID = id;
        status = stat;
    }
}
