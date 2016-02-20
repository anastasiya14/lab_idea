package l1;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author anastasiya
 */
public class Bolzano {

    private double a;
    private double b;
    final double e = Math.pow(10, -2);
    /*конструктор, который получает как параметр концы интервала*/

    public Bolzano(double a, double b) {
        a = this.a;
        b = this.b;

    }

    public double BolzanoMin(double a, double b) {
        double xk, lk;
        int k = 1;
        //if(normal(a,b)){}else{System.out.println("не верный интервал");}
        while (true) {
            xk = (a + b) / 2;
            lk = Math.abs(b - a);
            if (Math.abs(derivative(xk)) <= e & lk <= e) {
                return xk;
            } else {
                if (derivative(xk) > 0) {
                    a = a;
                    b = xk;

                } else {

                    b = b;
                    a = xk;

                }
            }
        }

    }


    /*производная функции 30x^2+6x+x+5 в заданной точке x*/
    public static double derivative(double x) {
        return (2 * (30 * Math.pow(x, 2) + 6 * x + 1) * (10 * Math.pow(x, 3) + 3 * Math.pow(x, 2) + x + 5));
    }
    /*проверка корректности интервала*/

    public static boolean normal(double a, double b) {
        return (derivative(a) * derivative(b)) < 0;
    }
}
