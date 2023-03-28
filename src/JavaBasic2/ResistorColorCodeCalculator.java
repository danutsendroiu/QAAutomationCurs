package JavaBasic2;

import Utils.Utils;

public class ResistorColorCodeCalculator {
    public static void main(String[] args) {
        String firstDigit = Utils.scanner().nextLine();
        String secondDigit = Utils.scanner().nextLine();
        String multiplier = Utils.scanner().nextLine();
        String tolerance = Utils.scanner().nextLine();
        ResistorColorCodeCalculator object = new ResistorColorCodeCalculator();
        object.resistanceCalculator(firstDigit, secondDigit, multiplier, tolerance);

    }

    public int numericValue(String color) {

        switch (color.toLowerCase()) {
            case "black":
                return 0;
            case "brown":
                return 1;
            case "red":
                return 2;
            case "orange":
                return 3;
            case "yellow":
                return 4;
            case "green":
                return 5;
            case "blue":
                return 6;
            case "violet":
                return 7;
            case "gray":
                return 8;
            case "white":
                return 9;
            default:
                return -1;
        }
    }

    public double multiplier(String color) {

        switch (color.toLowerCase()) {
            case "black":
                return 1;
            case "brown":
                return 10;
            case "red":
                return Math.pow(10,2);
            case "orange":
                return Math.pow(10,3);
            case "yellow":
                return Math.pow(10,4);
            case "green":
                return Math.pow(10,5);
            case "blue":
                return Math.pow(10,6);
            case "violet":
                return Math.pow(10,7);
            case "gray":
                return Math.pow(10,8);
            case "white":
                return Math.pow(10,9);
            case "gold":
                return 0.1;
            case "silver":
                return 0.01;
            default:
                return -1;
        }
    }

    public String tolerance(String color) {

        switch (color.toLowerCase()) {
            case "brown":
                return "1%";
            case "red":
                return "2%";
            case "orange":
                return "3%";
            case "yellow":
                return "4%";
            case "green":
                return "0.5%";
            case "blue":
                return "0.25%";
            case "violet":
                return "0.10%";
            case "gray":
                return "0.05%";
            case "gold":
                return "5%";
            case "silver":
                return "10%";
            default:
                return null;
        }
    }

    public void resistanceCalculator(String colorA, String colorB, String colorC, String colorD) {
        String value = String.valueOf(numericValue(colorA)) + numericValue(colorB);
        int signifiantDigit = Integer.parseInt(value);
        double resistence = signifiantDigit * multiplier(colorC);
        if (resistence > 1000000) {
            resistence = resistence / 1000000;
            System.out.println("The resistence of 4-band resistor is: " + resistence + "M Ohms with " + tolerance(colorD) + " tolerance");
        } else {
            System.out.println("The resistence of 4-band resistor is: " + resistence + " Ohms with " + tolerance(colorD) + " tolerance");

        }

    }

}
