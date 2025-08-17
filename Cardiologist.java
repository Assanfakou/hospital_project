class Cardiologist implements Doctor {
    private String naem;
    private int age;
    private boolean available;

    public Cardiologist(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.available = true;
    }
}