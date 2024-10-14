import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan bir sayı alıyoruz
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        // Palindrom kontrolü yapıyoruz
        if (isPalindrome(number)) {
            System.out.println(number + " bir palindrom sayıdır.");
        } else {
            System.out.println(number + " bir palindrom sayı değildir.");
        }
    }

    // Palindrom kontrolü için bir metot
    static boolean isPalindrome(int num) {
        int original = num; // Orijinal sayıyı saklıyoruz
        int reversed = 0;   // Ters çevrilmiş sayıyı saklamak için bir değişken

        // Sayıyı ters çeviriyoruz
        while (num != 0) {
            int digit = num % 10;       // Sayının en sağdaki basamağını alıyoruz
            reversed = reversed * 10 + digit; // Ters sayıyı oluşturuyoruz
            num /= 10;                  // Sayıyı bir basamak küçültüyoruz
        }

        // Orijinal sayı ile ters çevrilmiş sayıyı karşılaştırıyoruz
        return original == reversed;
    }
}
