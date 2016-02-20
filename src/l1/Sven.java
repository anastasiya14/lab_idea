package l1;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author anastasiya
 */
public class Sven {
    /*x0 и величину шага d*/

    public double[] SvenMin(double x, double d) {
        double x1, x2, x3, h;
        x1 = x;
        x2 = x1 + d;
        if (function(x2) > function(x1)) {
            d = -d;
        }
        while (true) {
            d = 2 * d;
            x3 = x2 + d;
            if (function(x3) > function(x2)) {
                break;
            }

            x1 = x2;
            x2 = x3;
        }
        if (x1 > x3) {
            h = x3;
            x3 = x1;
            x1 = h;
        }
        //System.out.println(x1 + "  " + x3);
        double[] arr={x1,x3};
        return arr;
    }

    public static double function(double x) {
        return Math.pow((10 * Math.pow(x, 3) + 3 * Math.pow(x, 2) + x + 5),2);
    }
}
