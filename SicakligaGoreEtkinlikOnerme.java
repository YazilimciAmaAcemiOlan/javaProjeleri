import java.util.Scanner;

public class SicakligaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        /*
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
         */

        double sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı Giriniz:");
        sicaklik = input.nextDouble();

        if (sicaklik <5){
            System.out.println("Bu hava sıcaklıklarında size Kayak yapmayı önerebilirim.");
        } else if ((sicaklik >= 5) && (sicaklik < 15)) {
            System.out.println("Bu hava sıcaklıklarında size Sinemaya gitmeyi önerebilirim.");
        } else if ((sicaklik >= 15) && (sicaklik < 25)) {
            System.out.println("Bu hava sıcaklıklarında size Piknik yapmayı önerebilirim.");
        } else {
            System.out.println("Bu hava sıcaklıklarında size Yüzmeyi önerebilirim.");
        }
    }

}
