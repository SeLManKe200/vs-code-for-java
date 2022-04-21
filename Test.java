import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Hospital hospital1 = new Hospital("location", "Bezmialem");
        Scanner scan = new Scanner(System.in);

        System.out.println("Hasta girişi için 1'i tuşlayınız \n Doktor girişi için 2'i tuşlayınız \n");
        System.out.println("Eğer kaydınız yoksa 0'a basınız");
        int a = scan.nextInt();
        switch (a) {
            case 0:
                System.out.println("Doktor kaydı oluşturmak için 1'e basınız \nHasta kaydı için 2'e basınız");
                int b = scan.nextInt();
                switch (b) {
                    case 1:
                        System.out.println("Yaşınızı giriniz");
                        int age = scan.nextInt();
                        System.out.println("Adınızı giriniz");
                        String firstName = scan.nextLine();
                        System.out.println("Soyadınızı giriniz");
                        String lastName = scan.nextLine();
                        System.out.println("TC'nizi giriniz");
                        String TC = scan.nextLine();
                        System.out.println("Cinsiyetinizi giriniz");
                        String gender = scan.nextLine();

                        Person doctor1 = new Doctor(age, firstName, lastName, TC, gender, 31000, 1, hospital1);

                    case 2:

                }

            case 1:

            case 2:

        }

        System.out.println("");

    }
}