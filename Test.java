public class Test {
    public static void main(String[] args) {
    People personnel = new Personnel(31,"feyz","asıl",31.0,131,"3131313131313131");
    Personnel doctor = new Doctor(personnel);
        System.out.println(personnel.getAge());
        System.out.println(doctor.getAge());
    }
}