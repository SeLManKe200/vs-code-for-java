public class Doctor extends Person {
    private double salary;
    private Hospital hospital;
    public static int numberOfPersonnels;

    public Doctor(int age, String firstName, String lastName, String TC, String gender, double salary,
            Hospital hospital) {
        super(age, firstName, lastName, TC, gender);
        this.salary = salary;
        this.hospital = hospital;
        numberOfPersonnels++;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Hospital getHospital() {
        return this.hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

}
