class Patient {
    
    private String name ;
    private int age;
    private int code;
    private static int lastCode = 0;

    public Patient(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.code = ++lastCode;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public int getCode()
    {
        return this.code;
    }
}