package guia6.problems.darCambio;

import guia6.problems.State;

/**
 * @author lprone
 */
public class DarCambioState implements State {

    final int total;

    /**
     * @param total
     */
    public DarCambioState(int total) {
        this.total = total;
    }

    /**
     * @param o
     * @return
     */
    @Override
    public boolean equals(State o) {
        return this.total == ((DarCambioState) o).total;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return total + "";
    }
}
