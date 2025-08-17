
import java.util.ArrayList;
class Hospital {

    private String name;
    private ArrayList<Neurosurgeon> neurosurgeons;
    private ArrayList<Dietitian> dietitians;
    private ArrayList<Cardiologist> cardiologists;

    public Hospital(String name)
    {
        this.name = name;
        this.neurosurgeons = new ArrayList<>();
        this.dietitians = new ArrayList<>();
        this.cardiologists = new ArrayList<>();
    }
    public void addDoctor(String name, int age, String dep)
    {
       if (dep.equals("cardio"))
       {
            Cardiologist card = new Cardiologist(name, age);
            cardiologists.add(card);
       } 
       else if (dep.equals("neuro"))
       {
            Neurosurgeon neu = new Neurosurgeon(name, age);
            neurosurgeons.add(neu);
       }
       else if (dep.equals("diet"))
       {
            Dietitian diet = new Dietitian(name, age);
            dietitians.add(diet);
       }
    }
    public void bookAppointement(String name, int age, String doctype)
    {
        Patient newPatient = new Patient(name, age);
        Doctor assignDoc = null;
        if (doctype.equals("cardio"))
        {
            if (cardiologists.size() == 0)
            {
                System.out.println("No cardiologists");
                return;
            }
            int x = (int) (Math.random() * cardiologists.size());
            assignDoc = cardiologists.get(x);
        }
        else if (doctype.equals("neuro"))
        {
            if (neurosurgeons.size() == 0)
            {
                System.out.println("No Neurosurgens");
                return ;
            }
            int x = (int) (Math.random() * neurosurgeons.size());
            assignDoc = neurosurgeons.get(x);
        }
        else if (doctype.equals("diet"))
        {
            if (dietitians.size() == 0)
            {
                System.out.println("No dietitians");
                return ;
            }
            int x = (int) (Math.random() * dietitians.size());
            assignDoc = dietitians.get(x);
        }
        else 
        {
            System.out.println("Invalide doctype");
            return ;
        }
        System.out.println("Apointement set with Dr" + assignDoc.getName());
    }
    public void printAllCardiologists(){

        if (cardiologists.size() == 0) 
        {
            System.out.println("No cardiologists are hired");
            return;
        }
        for (Cardiologist c : cardiologists)
            Driver.printDoctor(c);
    }
    public void printAllNeu()
    {
        if (neurosurgeons.size() == 0) 
        {
            System.out.println("No Neurosurgeons are hired");
            return;
        }
        for (Neurosurgeon n : neurosurgeons)
            Driver.printDoctor(n);
    }
    public void printAllDiet()
    {
        if (dietitians.size() == 0) 
        {
            System.out.println("No Dietitians are hired");
            return;
        }
        for (Dietitian d : dietitians)
            Driver.printDoctor(d);
    }
    public String getHosName()
    {
        return this.name;
    }
    public ArrayList<Neurosurgeon> getNeursu()
    {
        return this.neurosurgeons;
    }
    public ArrayList<Dietitian> getDiet()
    {
        return this.dietitians;
    }
    public ArrayList<Cardiologist> getCard()
    {
        return this.cardiologists;
    }


}
