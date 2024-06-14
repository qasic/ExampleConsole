package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cmd = null;

        while (!"exit".equalsIgnoreCase(cmd)) {
            System.out.print("Enter command (type exit to quit): ");
            cmd = scanner.nextLine();

            if (!"exit".equalsIgnoreCase((cmd))) {
                System.out.println("You entered: " + cmd);
                System.out.println();
            }
        }
    }

}
