import l1.Bolzano;
import l1.Fibonachchi;
import l1.Sven;

import static l1.Bolzano.normal;

public class Main {

    public static void main(String[] args) {
        double b1=-1, b2=5;
        Bolzano a = new Bolzano(b1, b2);
        if (normal(b1, b2)) {
            // =-0,859902
            System.out.printf( "%f",a.BolzanoMin(b1, b2));
        } else {
            System.out.println("Введите другой промежуток");
        }
        Sven b = new Sven();
        double[] arr=b.SvenMin(2, Math.pow(10, -2));

        //list= b.SvenMin(2, Math.pow(10, -2));
        //if(arr[0]< (-0.859901) && -0.859901< arr[1]){
        //  System.out.println("\n значение -0.859901 входит в промежуток ["+arr[0]+" "+arr[1]+"]");
        System.out.printf( "%f", a.BolzanoMin(arr[0], arr[1]));
        Fibonachchi f =new Fibonachchi();

        System.out.println("\n"+f.FibonachchilList(30));
        System.out.println((arr[1]-arr[0])/Math.pow(10, -4)+" < F_{n+2}");
        System.out.println(f.process(arr[0],arr[1], 25));

    }
}
