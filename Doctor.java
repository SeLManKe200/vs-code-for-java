public class Doctor extends Person {
    private double salary;
    private int id;
    private Hospital hospital;
    public static int numberOfPersonnels;

    public Doctor(int age, String firstName, String lastName, String TC, String gender, double salary, int id,
            Hospital hospital) {
        super(age, firstName, lastName, TC, gender);
        this.salary = salary;
        this.hospital = hospital;
        this.id = id;
        numberOfPersonnels++;
    }
    
    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Hospital getHospital() {
        return this.hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

}
 