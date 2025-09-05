/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guessthenumber;

/**
 *
 * @author Njabulo Skondo (ST10469706)
 */
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            int secretNumber = 7; // You can change this to any number you want the user to guess
            int userGuess;

        System.out.println("Guess a number between 1 and 10:");

        while (true) {
            userGuess = scanner.nextInt();

            if (userGuess == secretNumber) {
                System.out.println("Congratulations! You've guessed right!");
                break; // Exit the loop if the guess is correct
            }

            
        }
    }
}
