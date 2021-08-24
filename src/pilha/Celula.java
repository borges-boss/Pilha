package pilha;

/**
 *
 * @author borge
 */
public class Celula {

    private int element;
    private Celula prox;

    public Celula() {
        this.element = 0;
    }

    public Celula(int element) {
        this.element = element;
        this.prox = null;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public int getElement() {
        return element;
    }

    public void setProx(Celula c) {
        this.prox = c;
    }

    public Celula getProx() {
        return this.prox;
    }

}
