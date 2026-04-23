
package com.mycompany.hospitalsystem;

public class Doctors extends Person {
    private String specialization;

    public Doctors(String ssn, String name,String specialization ) {
        super(ssn, name);
        this.specialization=specialization;
        
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
}
