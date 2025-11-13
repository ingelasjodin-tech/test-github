import java.util.Scanner;

public class DragonTreasure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Välkommen till Dragon Treasure");
        System.out.println("Skriv ditt namn och tryck på [Enter] för att starta ett nytt spel...");
        String name = input.nextLine();
        System.out.println("Välkommen " + name + " till din skattjakt.");
        System.out.println("Du står utanför en grotta. Det luktar svavel från öppningen");
        System.out.println("Grottöppningen är österut. Skriv \"ö\" och tryck på [Enter] för att komma in i grottan");

        String command = input.nextLine();
        if (command.equals("ö")) {
            System.out.println("När du går in i grottan kollapsar ingången bakom dig.");
            // fortsätt bygga logiken här...
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragontreasure;

/**
 *
 * @author admin
 */
public class java {
   
}
