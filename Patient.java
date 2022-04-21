import java.util.ArrayList;

public class Patient extends Person implements Appointment {
    private Doctor doctor;
    private ArrayList<Appointment> appointments;
    public static int numberOfPatients;
   
    public Patient(int age, String firstName, String lastName, String TC, String gender) {
        super(age, firstName, lastName, TC, gender);
        numberOfPatients++;
    }

    @Override
    public void addAppointment() {

    }

    @Override
    public void cancelAppointment() {

    }

}