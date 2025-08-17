class Patient {
    
    private String name ;
    private int age;
    private int code;

    public Patient(String name, int age, int code)
    {
        this.name = name;
        this.age = age;
        this.code = code;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public boolean getCode()
    {
        return this.code;
    }
}