
package com.mycompany.hospitalsystem;
public class Patient extends Person {
    
    private String medicalInsurance;
    private String dateAdmitted;
    private String dateCheckedOut;
    
    public Patient(String ssn, String name, String medicalInsurance, 
        String dateAdmitted, String dateCheckedOut) {
        super(ssn, name);
        this.medicalInsurance = medicalInsurance;
        this.dateAdmitted = dateAdmitted;
        this.dateCheckedOut = dateCheckedOut;
    }

    public String getMedicalInsurance() {
        return medicalInsurance;
    }

    public void setMedicalInsurance(String medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    public String getDateAdmitted() {
        return dateAdmitted;
    }

    public void setDateAdmitted(String dateAdmitted) {
        this.dateAdmitted = dateAdmitted;
    }

    public String getDateCheckedOut() {
        return dateCheckedOut;
    }

    public void setDateCheckedOut(String dateCheckedOut) {
        this.dateCheckedOut = dateCheckedOut;
    }
    // عملنا Override 
    
     @Override
    public String toString() {
        return super.toString() +  ", Insurance: " + medicalInsurance + ", Admitted: " + dateAdmitted + ", Checked Out: " + dateCheckedOut;
    }
}
    

