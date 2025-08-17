import java.util.*;

public class Driver {

    public static void printPatient(Patient p)
    {
        System.out.println("Patient:-");
        System.out.println("  Name: " + p.getName());
        System.out.println("  Age: " + p.getAge());
        System.out.println("  Code: " + p.getCode());
    }
    public static void printDoctor(Cardiologist c) {
        System.out.println("Cardiologist:-");
        System.out.println("  Name: " + c.getName());
        System.out.println("  Age: " + c.getAge());
        System.out.println("  Available: " + c.getAvailability());
    }

    public static void printDoctor(Neurosurgeon n) {
        System.out.println("Neurosurgeon:-");
        System.out.println("  Name: " + n.getName());
        System.out.println("  Age: " + n.getAge());
        System.out.println("  Available: " + n.getAvailability());
    }

    public static void printDoctor(Dietitian d) {
        System.out.println("Dietitian:-");
        System.out.println("  Name: " + d.getName());
        System.out.println("  Age: " + d.getAge());
        System.out.println("  Available: " + d.getAvailability());
    }

    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Add some doctors
        hospital.addDoctor("Dr. Smith", 45, "cardio");
        hospital.addDoctor("Dr. Lee", 50, "neuro");
        hospital.addDoctor("Dr. Kim", 40, "diet");

        // Add a patient
        Patient patient = new Patient("Alice", 30, 101);

        // Print patient info
        printPatient(patient);

        // Print all doctors info
        for (Cardiologist c : hospital.getCard()) {
            printDoctor(c);
        }
        for (Neurosurgeon n : hospital.getNeursu()) {
            printDoctor(n);
        }
        for (Dietitian d : hospital.getDiet()) {
            printDoctor(d);
        }
    }
}
