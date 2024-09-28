import java.util.Scanner;

/**
 * assignment1week5
 */
public class assignment1week5 {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        int weaponChoice;
        double distance;

        System.out.println("1. Melee weapon");
        System.out.println("2. Ranged weapon");
        System.out.print("Enter 1 or 2: ");
        weaponChoice = input.nextInt();
        System.out.print("Enter distance to target: ");
        distance = input.nextDouble();

        if (weaponChoice == 1) {
            if (distance <= 5) {
                System.out.println("Use melee weapon : Approach target and execute attack.");
            } else {
                System.out.println("Melee weapon is not effective at this distance.");
            }
            
        } else if (weaponChoice == 2) {
            if (distance > 5) {
                System.out.println("Use ranged weapon; Aim at target and fire."); 
            } else {
                System.out.println("Ranged weapon might not be optimal at this close range.");
            }
        } else {
            System.out.println("Invalid weapon choice.");
        }
    }
}