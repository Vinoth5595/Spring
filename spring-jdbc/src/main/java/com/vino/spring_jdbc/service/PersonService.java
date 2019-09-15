package com.vino.spring_jdbc.service;

import java.util.List;

import com.vino.spring_jdbc.bean.Person;

public interface PersonService {
	 
    public void addPerson(Person person);
 
    public void editPerson(Person person, int personId);
 
    public void deletePerson(int personId);
 
    public Person find(int personId);
 
    public List < Person > findAll();
    
    public void callProc();
}