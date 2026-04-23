

package com.mycompany.hospitalsystem;


public class HospitalSystem {

    public static void main(String[] args) {

        Patient p = new Patient("123", "Ahmed", "Allianz", "2026-04-01", "2026-04-10");
        Doctors d = new Doctors("456", "Dr. Mohamed", "Cardiology");
        Test t = new Test("T001", "Blood Test", "2024-01-05", "09:30", "Normal");
        System.out.println("Patient : "+p);
        System.out.println("Doctors : "+d);
        System.out.println("Test : "+t);
    }
}
    

