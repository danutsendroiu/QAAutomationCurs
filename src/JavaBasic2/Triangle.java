package JavaBasic2;
/*
Instructions
Determine if a triangle is equilateral, isosceles, or scalene.

An equilateral triangle has all three sides the same length.

An isosceles triangle has at least two sides the same length.
(It is sometimes specified as having exactly two sides the same length, but for the purposes of this exercise we'll say at least two.)

A scalene triangle has all sides of different lengths.

Note
For a shape to be a triangle at all, all sides have to be of length > 0,
and the sum of the lengths of any two sides must be greater
than or equal to the length of the third side. See Triangle Inequality.\

Dig Deeper
The case where the sum of the lengths of two sides equals that of the third is known as a degenerate triangle -
it has zero area and looks like a single line. Feel free to add your own code/tests to check for degenerate triangles.
 */

import Utils.Utils;

public class Triangle {
    public static void main(String[] args) {
        Triangle object = new Triangle();
//        object.triangleType(Utils.scanner().nextInt(), Utils.scanner().nextInt(), Utils.scanner().nextInt());
        object.determineTriangle(Utils.scanner().nextInt(), Utils.scanner().nextInt(), Utils.scanner().nextInt());


    }

    public void triangleType(int side1, int side2, int side3) {
        if (side1 != side2 && side2 != side3) {
            System.out.println("The triangle is scalene");
            if (side1 + side2 == side3 || side2 + side3 == side1 || side1 + side3 == side2) {
                System.out.println("The triangle is degenerate");
            } else if (side1 <= 0 || side2 <= 0 || side3 <= 0 && side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
                System.out.println("This is not a triangle");
            } else if (side1 == side2 && side1 == side3) {
                System.out.println("The triangle is equilateral");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("The triangle is Isosceles");
            } else {
                System.out.println("The triangle is scalene");
            }
        } else {
            System.out.println("Checked");
        }
    }
    public void  determineTriangle(int a, int b, int c){
        if ( (a != 0) && ( b !=0 ) && (c !=0)) {
            if ((a + b >= c) && (a + c >= b) && (b + c >= a)) {
                if (a == b && a == c && b == c) {
                    System.out.println("Triangle is e equilateral");
                } else if (a == b || a == c || b == c) {
                    System.out.println("Triangle is isoscel");

                } else if (!(a == b) && !(a == c) && !(b == c)) {
                    System.out.println("Triangel is scalene");

                }
            }else {
                System.out.println("Suma a doua laturi nu este mai mare sau egala");
            }
        }else {
            System.out.println("Adaouga o valoare diferita de 0");
        }

    }

}
