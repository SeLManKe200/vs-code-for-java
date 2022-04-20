public abstract class People {
    private int age;
    private String name;
    private String surname;
    private double weight;
    private double height;
    private String TC;
    
    public People(int age, String name, String surname, double weight, double height, String TC) {
        this.setAge(age);
        this.setName(name);
        this.setSurname(surname);
        this.setWeight(weight);
        this.setHeight(height);
        this.setTC(TC);
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
    public abstract void addPersonnel();
    
}
