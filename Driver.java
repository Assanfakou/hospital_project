import java.util.ArrayList;

class Driver
{
    public static void main(String args[]) 
    {
        /* Create a hospital */
        Hospital h = new Hospital("Public Care Center");

        /* Adding two cardiologists*/
        h.addDoctor("David", 43, "cardio");
        h.addDoctor("Linda", 31, "cardio");

        /* Adding two neurosurgeons*/
        h.addDoctor("Mike", 37, "neuro");
        h.addDoctor("Katherine", 50, "neuro");

        /* Adding two dietiants*/
        h.addDoctor("Bob", 29, "diet");
        h.addDoctor("Chris", 41, "diet");

        /* Booking an appointment */
        h.bookAppointment("Dave", 21, "neurosurgeon");
        h.bookAppointment("Kim", 19, "cardiologist");
        h.bookAppointment("Sarah", 27, "dieti");
    }
}
