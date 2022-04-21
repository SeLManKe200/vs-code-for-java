import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        Hospital hospital1 = new Hospital("location", "Bezmialem");
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
                        System.out.print("Cinsiyetinizi giriniz (Erkek, Kadın):");
                        String gender = scan.next();

                        doctors.add(new Doctor(age, firstName, lastName, TC, gender, 31000, hospital1));

                    case 2:

                }

            case 1:

            case 2:

        }

        System.out.println("");

    }
}
