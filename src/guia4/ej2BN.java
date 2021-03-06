package guia4;

/**
 * @author lprone
 */
public class ej2BN {

    /**
     * @param n
     * @return
     */
    private double[][] triangulo(int n) {
        double[][] matriz = new double[n + 1][];
        matriz[0] = new double[]{1};

        for (int k = 1; k < matriz.length; k++) {
            matriz[k] = new double[k + 1];
            matriz[k][0] = matriz[k][k] = 1;
            for (int i = 1; i < k; i++) {
                matriz[k][i] = matriz[k - 1][i - 1] + matriz[k - 1][i];
            }
        }
        return matriz;
    }

    /**
     * @param m
     * @param n
     * @return
     */
    private double combDP(int m, int n) {
        return triangulo(m)[m][n];
    }

    /**
     * @param n
     * @return
     */
    private int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    /**
     * @param m
     * @param n
     * @return
     */
    public int comb(int m, int n) {
        return fact(m) / (fact(n) * fact(m - n));
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        ej2BN e = new ej2BN();
        int m = 1269, n = 1265;
//        System.out.println(e.combDP(m, n));
        System.out.printf("%.0f \n", e.combDP(m, n));
//        System.out.println(e.comb(m, n));

    }
}
