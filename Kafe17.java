import java.util.Scanner;

public class Kafe17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        String menu;
        char ukuranCup;
        int jumlah;
        double diskon, totalHarga, nominalBayar;
        System.out.print("Masukkan menu: ");
        menu = input.nextLine();
        System.out.print("Masukkan ukuran cup: ");
        ukuranCup = input.next().charAt(0);
        System.out.print("Masukkan jumlah: ");
        jumlah = input.nextInt();
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        double hargaMenu = 0;
        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;    
        }
        totalHarga = hargaMenu * jumlah;
        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;    
        }
        diskon = keanggotaan ? 0.1 : 0;
        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar: " + nominalBayar);
    }
}
