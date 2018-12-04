import java.util.Scanner;

import static java.lang.Math.*;


public class Main {

    public static double lenght1;
    public static double lenght2;
    public static double lenght3;
    public static void main(String[] args) {

        Point p1 = new Point(2,-3);
        Point p2 = new Point(-5,8);
        Point p3 = new Point(8, 1);

         lenght1 = Point.length(p1,p2);
         lenght2 = Point.length(p2,p3);
         lenght3 = Point.length(p3,p1);

        if(isTriangle(lenght1, lenght2, lenght3))
        {
            System.out.println("Triangle with lenght 1 = " + lenght1 + " lenght 2 = " + lenght2 + "lenght 3 = " + lenght3 + " exist");
        }
        else
        {
            System.out.println("Your triangle doesnt exist");
        }


    }

    public static boolean isTriangle(double lenght1, double lenght2, double lenght3)
    {
        return !(lenght1 + lenght2 <= lenght3) || (lenght1 + lenght3 <= lenght2) || (lenght2 + lenght3 <= lenght1);
    }
    public static boolean isIsosceles(double lenght1, double lenght2, double lenght3)
    {
        return((lenght1 == lenght2 && lenght1 != lenght3) || (lenght2 == lenght3 && lenght2 != lenght1)
                || (lenght3 == lenght1 && lenght3 != lenght2) );
    }
    public static boolean isEquilateral(double lenght1, double lenght2, double lenght3)
    {
        return(lenght1 == lenght2 && lenght2 == lenght3);
    }
    public static boolean isRight_angled(double lenght1, double lenght2, double lenght3)
    {
        return(pow(lenght1, 2) + pow(lenght2, 2) == pow(lenght3, 2) ||
                pow(lenght2, 2) + pow(lenght3 ,2) == pow(lenght1, 2) ||
                pow(lenght1,2) + pow(lenght3, 2) == pow(lenght2, 2));
    }

}
