/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package varios;

import java.util.ArrayList;

/**
 *
 * @author lprone
 */
public class FiboDp {

    private boolean isBase(int in) {
        return in == 0 || in == 1;
    }

    private int base(int elem) {
        return 1;
    }

    private ArrayList<Integer> split(int a) {
        ArrayList<Integer> ret = new ArrayList();
        int p1 = a - 1;
        int p2 = a - 2;
        ret.add(p1);
        ret.add(p2);
        return ret;
    }

    private int join(ArrayList<Integer> l) {
        int aux = 0;
        for (int elem : l) {
            aux += elem;
        }
        return aux;
    }

    public int fibo(int a) {

        ArrayList<Integer> sp = new ArrayList();
        sp.add(a);
        ArrayList<Integer> cb = new ArrayList();

        while (!sp.isEmpty()) {
            if (isBase(sp.get(0))) {
                cb.add(sp.get(0));
            } else {
                sp.add(split(sp.get(0)).get(0));
                sp.add(split(sp.get(0)).get(1));
            }
            sp.remove(0);

//            for (int p : sp) {                
//                    System.out.print(p + " ");               
//            }
//            System.out.println("");
        }
        return join(map(cb));
    }

    private ArrayList<Integer> map(ArrayList<Integer> cb) {
        ArrayList<Integer> sols = new ArrayList();
        for (int is : cb) {
            sols.add(base(is));
        }
        return sols;
    }

    public static void main(String[] args) {
        FiboDp b = new FiboDp();
        System.out.println(b.fibo(50));
    }
}
