package varios;

/**
 * @author lprone
 */
public class busquedaBinaria {

    /**
     * @param in
     * @param e
     * @return
     */
    private boolean buscar(int[] in, int e) {
        int init = 0, fin = in.length;
        while (Math.abs(init - fin) > 1) {
            if (in[(init + fin) / 2] < e) {
                init = (init + fin) / 2;
            } else {
                fin = (init + fin) / 2;
            }
        }
        return in[fin] == e;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        busquedaBinaria b = new busquedaBinaria();
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(b.buscar(a, 0));
    }
}
