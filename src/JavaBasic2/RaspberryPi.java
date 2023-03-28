package JavaBasic2;

import java.util.Random;

/*

If you want to build something using a Raspberry Pi, you'll probably use resistors.
For this exercise, you need to know two things about them:

Each resistor has a resistance value.
Resistors are small - so small in fact that if you printed the resistance value on them, it would be hard to read.
To get around this problem, manufacturers print color-coded bands onto the resistors to denote their resistance values.
Each band has a position and a numeric value.

The first 2 bands of a resistor have a simple encoding scheme: each color maps to a single number.

In this exercise you are going to create a helpful program so that you don't have to remember the values of the bands.

These colors are encoded as follows:

Black: 0
Brown: 1
Red: 2
Orange: 3
Yellow: 4
Green: 5
Blue: 6
Violet: 7
Grey: 8
White: 9
The goal of this exercise is to create a way:

to look up the numerical value associated with a particular color band
to list the different band colors
Mnemonics map the colors to the numbers, that, when stored as an array,
happen to map to their index in the array: Better Be Right Or Your Great Big Values Go Wrong.
 */
public class RaspberryPi {
    public static void main(String[] args) {

        RaspberryPi object = new RaspberryPi();
        System.out.println(object.convert(new String[]{"Orange", "Red", "Yellow"}));

    }

    public int colors(String a) {

        switch (a) {
            case "Black":
                return 0;
            case "Brown":
                return 1;
            case "Red":
                return 2;
            case "Orange":
                return 3;
            case "Yellow":
                return 4;
            case "Green":
                return 5;
            case "blue":
                return 6;
            case "Violet":
                return 7;
            case "grey":
                return 8;
            case "White":
                return 9;
            default:
                return -1;
        }

    }

    public int convert(String[] colorsCode) {
        int number = 0;
        for (int i = 0; i < colorsCode.length; i++) {
            number = number * 10 + colors(colorsCode[i]);

        }

        return number;
    }
}
