package com.example.jonathanmontanez.myapplication;

import java.util.ArrayList;

/**
 * Created by jonathanmontanez on 4/9/16.
 */
public class UserClass {

    private String first_name;
    private String last_name;
    private String username;
    private String local_user;
    private String org_name;
    private String password;
    private int attended_events;
    private int pending_events;
    private ArrayList<Integer> attended_events_id;
    private String picture_path;
    private ArrayList<Integer> pending_events_id;

    UserClass(){
    }

    UserClass(String first, String last, String u_name, String password, String org_name, String pic_path){

        first_name = first;
        last_name = last;
        username = u_name;
        local_user = u_name;
        this.password = password;
        attended_events = 0;
        pending_events = 0;
        this.org_name = org_name;
        picture_path = pic_path;
        attended_events_id.clear();
        pending_events_id.clear();

    }

    /** Methods to set user credentials*/

    String getUsername(){

        return username;
    }

    String getLocal_user(){

        return local_user;
    }

    String getFirst_name(){

        return first_name;
    }

    String getLast_name(){

        return last_name;
    }

    void setUsername(String u_name){

        username = u_name;
    }
    void setFirst_name(String f_name){

        first_name = f_name;
    }

    void setLast_name(String l_name){

        last_name = l_name;
    }

    String getOrg_name(){

        return org_name;
    }

    String getPassword(){

        return password;
    }

    void setOrg_name(String name){

        org_name = name;
    }

    void setPassword(String p_word){

        password = p_word;
    }

    String getPicture_path(){

        return picture_path;
    }

    void setPicture_path(String p_path){

        picture_path = p_path;
    }

    /**Methods used to verify user credentials*/

    boolean verifyPassword(String p_word){

            if(p_word == this.password){
                return true;
            }

            return false;
    }

    boolean verifyUserName(String u_name){

        if(u_name == this.username){
            return true;
        }

        return false;
    }

    /** Methods to handle events */

    void addEvent(EventsClass event){

        pending_events_id.add(event.eventID);
        pending_events++;
    }

    void removeEvent(EventsClass event){

        pending_events_id.remove(event.eventID);
        pending_events--;
    }

    int getAttended_events(){

        return attended_events;
    }

    int getPending_events(){

        return pending_events;
    }






}
