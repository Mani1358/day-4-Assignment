package com.blz.SnakeandLadder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class UC3PlayerChecksOption {

    public String getRandomElement()
    {
        List<String> list = new ArrayList<String>();
        list.add("No Play");
        list.add("Ladder");
        list.add("Snake");
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }


}
