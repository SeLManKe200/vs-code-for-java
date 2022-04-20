public class Doctor extends Personnel {
    public Doctor(int age, String name, String surname, double weight, double height, String TC) {
        super(age, name, surname, weight, height, TC);
    }
    public Doctor(People personnel) {
        this(((Personnel)personnel).getAge(), ((Personnel)personnel).getName(), ((Personnel)personnel).getSurname(), ((Personnel)personnel).getWeight(), ((Personnel)personnel).getHeight(), ((Personnel)personnel).getTC());
    }
    

}
 