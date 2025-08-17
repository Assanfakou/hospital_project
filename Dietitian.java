public class Dietitian implements Doctor
{
    /* Instance variables */
    private String name;
    private int age;  
    private boolean availability;    

    /*Constructor Method*/
    public Dietitian(String name, int age)
    {
        this.name = name;
        this.age = age;
        availability = true;
    }

    /* Getters */
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public boolean getAvailability()
    {
        return availability;
    }

    /* Overriding toString method */
    public String toString()
    {
        return ("Diettitian:-\n\tName: "+ name+ "\n\tAge: "+age+"\n\tAvailable:"+availability);
    }

    /* Setter */
    public void setAvailability(boolean status)
    {
        availability = status;
    }
}