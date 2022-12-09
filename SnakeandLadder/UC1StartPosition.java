package com.blz.SnakeandLadder;

import java.util.Scanner;
import com.blz.SnakeandLadder.UC2PlayerDiceRoll;

public class UC1StartPosition {
    static int singlePlayerValue = 0;

    public static void hello(){
        int player = 0;
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("initial playerPosition: " + player);

        while (player<= 100 ){
            if(player == 100){
                System.out.println("player 1 reached:100 'WIN POINT' ");
                break;
            }else{

                int diceValue = new UC2PlayerDiceRoll().dicePlay();
                player = player+diceValue;
                String option = new UC3PlayerChecksOption().getRandomElement();

                if(option == "No play"){
                    System.out.println("PLAYER POSITION IS SAME");
                }else if(option == "Ladder"){
                player = player+10;
                } else if (option == "Snake") {
                    player = player-10;
                }

                System.out.println("diceValue: " + diceValue);
                System.out.println("playerPosition: " + player);
                System.out.println("option: " + option);
            }
        }


    }

    public static void main(String[] args) {
        hello();
    }

}
