package l1;

import java.util.ArrayList;

import static l1.Sven.function;


/**
 *
 * @author anastasiya
 */
public class Fibonachchi {

    //private double a;
    //private double b;
    //private double n;
    final private double e = Math.pow(10, -4);

    public double process(double a, double b, int n) {

        ArrayList<Integer> list = FibonachchilList(n + 1);
        double u, k, l = (b - a);
        n = n - 1;
        //проверка правильности выбора n
        if (list.get(n) > (b - a) / e) {
            if (e <= (b - a) / (double)list.get(n - 1)) {
                System.out.println(l /(double) list.get(n));

            }

            u = (a + ((double)list.get(n - 2)/(double)list.get(n)) * (b - a));
            k = (a + ((double)list.get(n - 1)/(double)list.get(n)) * (b - a));
            
          //  System.out.println("\n u="+u+ "   "+ list.get(n - 2)+"  "+ list.get(n)+"  "+((double)list.get(n - 1)/(double)list.get(n)));
          //  System.out.println(" k="+k+ "   "+ list.get(n - 1)+"  "+ list.get(n));
            for (int i = 1; i < n; i++) {
                if (i == n - 1) {
                    k = u + l /(double) list.get(n + 1);
                    if (function(u) > function(k)) {
                        return ((u + b) / 2);
                    } else {
                        return ((a + k) / 2);
                    }
                }

                if (function(u) < function(k)) {
                    b = k;
                    k = u;
                    u = a + ((double)list.get(n - i - 2) /(double) list.get(n - i)) * (b - a);

                } else {
                    a = u;
                    u = k;
                    k = a + ((double)list.get(n - i - 1) / (double)list.get(n - i)) * (b - a);
                }
              //  System.out.println(" u="+u+ " на шаге "+ i);
              //  System.out.println(" k="+k+ " на шаге "+ i); 
            }

        } else {
            System.out.println("не верно выбрано n");
        }

        return 0;
    }

    //возвращает n чисел последовательности Фибоначчи
    public ArrayList<Integer> FibonachchilList(int n) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(1);
        for (int i = 2; i < n; i++) {
            int j, k, f;
            j = i - 1;
            k = i - 2;
            list.add(list.get(j) + list.get(k));
        }
        return list;
    }
}
