package com.bctecnica.houseHunt;

import android.graphics.Color;
import java.util.Random;

public class ColorWheel {

    // list of background colors to use
    private String[] colors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7", // light grey
            "#990000", // blood red
            "#808080", // grey
            "#93CB56"  // green
    };

    // Used to get a random color from array then returns converted the hash to int
    public int getColor(){
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        int color = Color.parseColor(colors[randomNumber]);
        return color;
    }

}

