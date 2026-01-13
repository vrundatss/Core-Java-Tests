package com.tss.test;

import com.tss.practice.SelectionSort;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesserGame {
    public static void main(String args[]) {

        Random random = new Random();

        int number = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);

        game(number);

        System.out.print("Do you want to play again? (Yes/No) : ");
        String again = scanner.next();
        if(again.equals("Yes")){
            game(number);
        }

//        if(input < 1 && input > 100){
//            System.out.println("Enter number between 1 to 100...");
//            return;
//        }



        }

        public static void game(int number){
            Scanner scanner = new Scanner(System.in);

            int tries = 0;
            while (tries < 5){
                System.out.print("Enter number : ");
                int input = scanner.nextInt();

                tries++;
                if(tries == 5 && input != number){
                    System.out.println("Better luck next time...");
                    System.out.println("Random number is : " + number);

                }
                else if (input == number) {
                    System.out.println("You won in " + tries+ " tries..." );
                    break;
                }else if(input > number){
                    System.out.println("Sorry, too high...");
                }else if (input < number){
                    System.out.println("Sorry, too low...");
                }

            }
        }
    }

