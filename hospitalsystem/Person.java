
package com.mycompany.hospitalsystem;

//كلاس الاب اللي هنورث منه 
public class Person {
    private String ssn;
    private String name;
//Constructor
    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }

    public String getSsn() {
        return ssn; 
    }
    public void setSsn(String ssn) {
        this.ssn = ssn; 
    }

    public String getName() {
        return name; 
    }
    public void setName(String name) {
        this.name = name; 
    }


    @Override
    public String toString() {
        return "SSN: " + ssn + ", Name: " + name;
    }
}