class Hospital {

    private String name;
    private ArrayList<Neurosurgeon> neurosurgeons;
    private ArrayList<Dietitian> dietitians;
    private ArrayList<Cardiologist> cardiologists;

    public Hospital(String name)
    {
        this.name = name;
        this.neurosurgeon = new ArrayList<>();
        this.dietitian = new ArrayList<>();
        this.cardiologist = new ArrayList<>();
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
