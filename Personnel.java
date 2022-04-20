import java.util.ArrayList;

public class Personnel extends People {
    private ArrayList<Personnel> personnels = new ArrayList<>();
    public static int numberOfPersonnels;

    public Personnel(int age, String name, String surname, double weight, double height, String TC) {
        super(age, name, surname, weight, height, TC);
        // addPersonnel();        
    }
    public Personnel(People person) {
        this(person.getAge(), person.getName(), person.getSurname(), person.getWeight(), person.getHeight(), person.getTC());
    }

    public ArrayList<Personnel> getPersonnels() {
        return personnels;
    }

    public void setPersonnels(ArrayList<Personnel> personnels) {
        this.personnels = personnels;
    }

    @Override
    public void addPersonnel() {
        personnels.add(this);
    }

}