public abstract class Person {
    private int age;
    private String firstName;
    private String lastName;
    private String TC;
    private String gender;

    public Person(int age, String firstName, String lastName, String TC, String gender) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.TC = TC;
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTC() {
        return this.TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "İsim: " + firstName + "Soyisim: " + "TC: " + TC;
    }
}
