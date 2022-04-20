import java.util.ArrayList;

public abstract class Hospital {
    private String location;
    private String hospitalName;

    public Hospital(ArrayList<Personnel> personnels, String location, String hospitalName) {
        this.location = location;
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}
