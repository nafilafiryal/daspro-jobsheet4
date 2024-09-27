import java.util.Scanner;

public class operatorTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        String hasil;

        System.out.println("Masukkan angka: ");
        angka = input.nextInt();

        hasil = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println("Angka " + angka + " Merupakan " + hasil);
    }
}
