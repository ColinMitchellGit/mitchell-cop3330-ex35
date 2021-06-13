/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex35;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        String[] names = {};

        startNameLoop(names);
    }

    public static void startNameLoop(String[] names) {
        Scanner input = new Scanner(System.in);
        String name;

        do {
            System.out.print("Enter a name: ");
            name = input.nextLine();

            names = Arrays.copyOf(names, names.length + 1);
            names[names.length - 1] = name;

            if(name.isBlank()) {
                displayWinner(names);
            }

        }while(!name.isBlank());
    }
    public static String pickWinner(String[] names) {
        Random choice = new Random();
        return names[choice.nextInt(names.length - 1)];
    }

    public static void displayWinner(String[] names) {
        String winner = pickWinner(names);
        System.out.println("The winner is... " + winner);
    }
}