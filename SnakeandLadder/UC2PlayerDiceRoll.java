package com.blz.SnakeandLadder;

import java.util.Random;
import java.util.Scanner;

public class UC2PlayerDiceRoll {
    public static void main(String[] args) {
        int player = 0;
        Scanner sc = new Scanner(System.in);
        String str;
        int diceValue = 0;
        Random r =new Random();
        diceValue = r.nextInt(7);
        //("diceValue==0?1:diceValue");
        System.out.println("diceValue: " + diceValue);
    }

    public int dicePlay(){
        int diceValue = 0;
        Random r =new Random();
        diceValue = r.nextInt(7);
        return  diceValue;
    }

}


