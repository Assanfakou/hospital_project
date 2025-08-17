import java.util.ArrayList;

public class Hospital
{
    /* Instance variables */
    private String name;

    private ArrayList<Cardiologist> cardiologists;
    private ArrayList<Neurosurgeon> neurosurgeons;
    private ArrayList<Dietitian> dietitians;

    /*Constructor Methods*/
    public Hospital(String name)
    {
        this.name = name;

        cardiologists = new ArrayList<Cardiologist>();
        neurosurgeons = new ArrayList<Neurosurgeon>();
        dietitians = new ArrayList<Dietitian>();
    }

    /* Adding doctor */
    public void addDoctor(String name, int age, String dep)
    {
        if(dep.equals("cardio"))
        {
            // Adding cardiologist
            Cardiologist c = new Cardiologist(name, age);
            cardiologists.add(c);
            return;
        }
        if(dep.equals("neuro"))
        {
            // Adding neurosurgeon
            Neurosurgeon n = new Neurosurgeon(name, age);
            neurosurgeons.add(n);
            return;
        }
        if(dep.equals("diet"))
        {
            // Adding dietitian
            Dietitian d = new Dietitian(name, age);
            dietitians.add(d);
            return;
        }
    }

    /* Getters */
    public String getName()
    {
        return name;
    }

    public ArrayList<Cardiologist> getCardiologists()
    {
        return cardiologists;
    }

    public ArrayList<Neurosurgeon> getNeurosurgeons()
    {
        return neurosurgeons;
    }

    public ArrayList<Dietitian> getDietitians()
    {
        return dietitians;
    }

    /* Printing patient */
    public void printPatient(Patient p)
    {
        System.out.println(p);
    }

    /* Printing doctor - overloaded methods */
    public void printDoctor(Cardiologist c)
    {
        System.out.println(c);
    }

    public void printDoctor(Neurosurgeon n)
    {
        System.out.println(n);
    }

    public void printDoctor(Dietitian d)
    {
        System.out.println(d);
    }

    /* Booking an appointment */
    public void bookAppointment(String name, int age, String docType)
    {
        if (docType.equals("cardiologist"))
        {
            // Assining doctor
            int rInt = (int)(Math.random() * cardiologists.size());
            System.out.println("Appointment scheduled with "+ cardiologists.get(rInt).getName());
            Patient p = new Patient(name, age, Patient.totalPatients+1);     // Creating a patient
            return;
        }

        if (docType.equals("neurosurgeon"))
        {
            // Assining doctor
            int rInt = (int)(Math.random() * neurosurgeons.size());
            System.out.println("Appointment scheduled with "+ neurosurgeons.get(rInt).getName());
            Patient p = new Patient(name, age, Patient.totalPatients+1);     // Creating a patient
            return;
        }

        if (docType.equals("dietitian"))
        {
            // Assining doctor
            int rInt = (int)(Math.random() * dietitians.size());
            System.out.println("Appointment scheduled with "+ dietitians.get(rInt).getName());
            Patient p = new Patient(name, age, Patient.totalPatients+1);     // Creating a patient
            return;
        }
    }
}