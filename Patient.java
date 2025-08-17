public class Patient
{
    /* Instance variables */
    private String name;
    private int age;
    private int code;
    public static int totalPatients; // maintain count of patients

    /*Constructor Method*/
    public Patient(String name, int age, int code)
    {
        this.name = name;
        this.age = age;
        this.code = code;
        totalPatients++; // increase with every patient getting registered
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

    public int getCode()
    {
        return code;
    }

    /* Overriding toString method */
    public String toString()
    {
        return ("Patient:-\n\tName: "+ name+ "\n\tAge: "+age);
    }
}