class Dietitian implements Doctor {
    
    private String name;
    private int age;
    private boolean available;

    public Dietitian(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.available = true;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public boolean getAvailability()
    {
        return this.available;
    }
}