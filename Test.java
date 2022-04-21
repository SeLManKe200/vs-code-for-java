import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        Hospital[] hospitals = new Hospital[] {
                new Hospital("location", "bezmialem"),
                new Hospital("İstanbul", "hisar")
        };
        Scanner scan = new Scanner(System.in);

        System.out.print("Hasta girişi için 1'i tuşlayınız \nDoktor girişi için 2'i tuşlayınız \n");
        System.out.print("Eğer kaydınız yoksa 0'a basınız\n");
        int a = scan.nextInt();
        switch (a) {
            case 0:
                System.out.print("Doktor kaydı oluşturmak için 1'e basınız \nHasta kaydı için 2'e basınız\n");
                int b = scan.nextInt();
                switch (b) {
                    case 1:
                        System.out.print("Yaşınızı giriniz:");
                        int age = scan.nextInt();
                        System.out.print("Adınızı giriniz:");
                        String firstName = scan.next();
                        System.out.print("Soyadınızı giriniz:");
                        String lastName = scan.next();
                        System.out.print("TC'nizi giriniz (11 haneli):");
                        String TC = scan.next();
                        int tcLength = TC.length();
                        while (tcLength != 11) {
                            System.out.print("11 haneli olması lazım:");
                            TC = scan.next();
                            tcLength = TC.length();
                        }
                        System.out.print("Cinsiyetinizi giriniz (Erkek, Kadın):");
                        String gender = scan.next();
                        System.out.print("Çalıştığınız Hastane ismini giriniz:");
                        String hospitalName = scan.next().toLowerCase();

                        boolean isSame = false;
                        Hospital hospital = null;

                        do {
                            for (Hospital hos : hospitals) {
                                if (hos.getHospitalName().equals(hospitalName)) {
                                    isSame = true;
                                    hospital = hos;
                                    break;
                                }
                            }
                            if (!isSame) {
                                System.out.print("Hastane ismi Mevcut değil tekrar giriniz:");
                                hospitalName = scan.next();
                            }

                        } while (!isSame);

                        doctors.add(new Doctor(age, firstName, lastName, TC, gender, 31000, hospital));

                    case 2:

                }

            case 1:

            case 2:

        }

        System.out.println("");

    }
}
