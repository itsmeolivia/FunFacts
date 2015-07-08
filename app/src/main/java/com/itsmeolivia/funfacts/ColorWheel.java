package com.itsmeolivia.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by olivia on 7/8/15.
 */
public class ColorWheel {

    public String[] mColors = {    "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int getColor() {

        String color = "";

        Random generator = new Random();
        int rand = generator.nextInt(mColors.length);

        color = mColors[rand];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}
