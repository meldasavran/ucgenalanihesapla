import java.util.Scanner;
public class proje {
    public static void main(String[] args) {

      int a,b,c;

        Scanner giris = new Scanner(System.in);
        System.out.print("1. kenarı giriniz :");
        a = giris.nextInt();
        System.out.print("2. kenarı giriniz :");
        b = giris.nextInt();
        System.out.print("3. kenarı giriniz :");
        c = giris.nextInt();
 /*  Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
                𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) */

       double u = (a+b+c)/2;
        //Karekök hesaplamak için Java'nın  Math sınıfının sqrt() metodunu kullandık.
        double S = Math.sqrt((u*(u-a)*(u-b)*(u-c)));

        System.out.println("Üçgenin alanı :" + S);







    }
}
