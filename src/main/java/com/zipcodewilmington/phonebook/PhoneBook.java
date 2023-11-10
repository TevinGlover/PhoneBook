package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */



public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {

        this.phonebook = map; //setting to map
    }

    public PhoneBook() {
        this.phonebook = new HashMap<String, List<String>>();
    }

    public void add(String name, String phoneNumber) {
        ArrayList<String>phoneNumbers = new ArrayList<>();
        phoneNumbers.add(phoneNumber);
        this.phonebook.put(name, phoneNumbers);
    }

    public void addAll(String name, String... phoneNumbers) {
        ArrayList<String>phone = new ArrayList<>();
       for( String number : phoneNumbers){
           phone.add(number);
        }
        this.phonebook.put(name, phone);
    }

    public void remove(String name) {
    }

    public Boolean hasEntry(String name) {
        return null;
    }

    public Boolean hasEntry(String name, String phoneNumber) {
        return null;
    }

    public List<String> lookup(String name) {

        return  phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return new HashMap<String, List<String>>(); // seting the getter method to new map
    }
}
