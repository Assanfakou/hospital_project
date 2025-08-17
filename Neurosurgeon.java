class Neurosurgeon implements Doctor {
    private String name;
    private int age;
    private boolean available;

    public Neurosurgeon(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.available = true;
    }
}
