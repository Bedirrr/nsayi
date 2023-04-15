import java.util.Scanner;

public class nsayi {
    public static void main(String[] args) {

        int N, number, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz?: ");
        N = input.nextInt();

        for(int i = 1; i <= N; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            number = input.nextInt();

            if(number > max) {
                max = number;
            }

            if(number < min) {
                min = number;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

        input.close();
    }
}