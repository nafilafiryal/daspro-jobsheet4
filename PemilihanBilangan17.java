import java.util.Scanner;

/**
 * PemilihanBilangan17
 */
public class PemilihanBilangan17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan sebuah angka: ");
        angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " termasuk bilangan genap");
        }
        else {
            System.out.println("Angka " + angka + "termasuk bilangan ganjil");
        }
    }
}