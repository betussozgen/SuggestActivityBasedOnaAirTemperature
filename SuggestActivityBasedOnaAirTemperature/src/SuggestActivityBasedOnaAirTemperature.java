//Kullanıcıdan veri alabilmek için Scanner sınıfını dahil ediyoruz.
import java.util.Scanner;
public class SuggestActivityBasedOnaAirTemperature {
    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz.
        int heat;

        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);

        //Sıcaklık değerini girmesini istiyoruz.
        System.out.println("Enter Tempareture:");
        heat = input.nextInt();

        //Sıcaklık değerine göre etkinlik sunuyoruz.
        if(heat < 5) {
            System.out.println("You can Ski!");

        }if (heat >= 5 && heat <= 15){
                System.out.println("You can go to cinema!");

        }if (heat >= 10 && heat <= 25) {
                System.out.println("You can go on a picnic");

        }else {
            System.out.println("You can swim!");

        }


    }
}