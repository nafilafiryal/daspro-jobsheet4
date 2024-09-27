import java.util.Scanner;

/**
 * PemilihanHariDenganIf17
 */
public class PemilihanHariDenganIf17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        String dayType;
        System.out.print("Input number: ");
        number = input.nextInt();
        if (number <=5 && number >=1 ) {
            System.out.println("Number " + number + " is a Weekday ");

        }else if (number == 6 || number == 7) {
            System.out.println("Number " + number + " is a Weekend ");
        }
    }
}