import java.util.*;
public class Driver {
    public static void main(String[] args) {
        // Create hospital
        Hospital hospital = new Hospital("CityCare");

        // Add doctors
        hospital.addDoctor("Dr. Smith", 45, "cardio");
        hospital.addDoctor("Dr. Adams", 50, "neuro");
        hospital.addDoctor("Dr. Rose", 39, "diet");

        // Print hospital details
        System.out.println("Hospital: " + hospital.getHosName());
        System.out.println("=== Cardiologists ===");
        hospital.printAllCardiologists();

        System.out.println("=== Neurosurgeons ===");
        hospital.printAllNeu();

        System.out.println("=== Dietitians ===");
        hospital.printAllDiet();

        // Book appointments
        System.out.println("\nBooking Appointments:");
        hospital.bookAppointement("John Doe", 30, "cardio");
        hospital.bookAppointement("Jane Doe", 25, "neuro");
        hospital.bookAppointement("Mike Lee", 40, "diet");
    }

    // Utility method to print doctor details
    public static void printDoctor(Doctor d) {
        System.out.println("Doctor: " + d.getName() + ", Age: " + d.getAge()};

    // Utility method to print patient details
    public static void printPatient(Patient p) {
        System.out.println("Patient: " + p.getName() + ", Age: " + p.getAge());
    }
}
