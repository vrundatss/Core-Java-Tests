package com.tss.test;

import java.util.Random;
import java.util.Scanner;

public class PIGDiesGame {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        int points = 0;
        game(points);

        System.out.print("Do you want to play again? (Yes/No) : ");
        String again = scanner.next();
        if(again.equalsIgnoreCase("Yes")){
            game(points);
        }


    }

    private static void game(int points){

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int turns = 0 ;

        while (turns < 5){
            turns++;
            System.out.println("-----Turn "+ turns + "-----");

            if(turns == 5){
                System.out.println("Better luck next time...");
                return;
            }
            while(points < 20){
                System.out.print("Roll or hold? (r/h) : ");
                String inputString = scanner.nextLine();
                if(inputString.length() > 1){
                    System.out.println("Enter only character r or h...");
                    return;
                }

                char input = inputString.charAt(0);
//            if (input != 'r' || input != 'h'){
//                System.out.println("Enter only r or h...");
//                return;
//            }

                if(input == 'r') {

                    if (points == 20) {
                        System.out.println("Points : " + points);
                        System.out.println("You won in " + turns + " ...");
                        return;
                    }else{
                        int die = random.nextInt(6) + 1;
                        System.out.println("Die : " + die);

                        if (die == 1) {
                            points = 0;
                            continue;
                        }
                        else {
                            points += die;
                        }
                    }

                }
                else if (input == 'h') {
                    System.out.println("Points : " + points);
                    break;
                }
            }
            if (points == 20) {
                System.out.println("Points : " + points);
                System.out.println("You won in " + turns + " ...");
                return;
            }


        }
    }


    }

