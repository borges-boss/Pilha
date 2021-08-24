package pilha;

public class Pilha {

    Celula topo, bottom;

    public Pilha() {
        topo = null;
    }

    public void inserir(int x) {
        Celula tmp = topo;
        topo = new Celula(x);//Novo valor
        topo.setProx(tmp);

        if (bottom == null) {
            bottom = topo;
        }//Inicializar o ultimo
    }

    public void showElements(Celula tmp) {

        if (tmp != null) {
            System.out.println(tmp.getElement());
            showElements(tmp.getProx());
        }

    }

    public Celula toFila(Celula topo) {

        Celula c = new Celula();

        Celula tmp = bottom;
        Celula tmpTop = topo;
        Celula aux = topo;//ant

        while (tmp != topo) {

            if (tmp.equals(tmpTop)) {
                c.setProx(tmp);
                if (tmp.getProx() != null) {
                    c = tmp.getProx();
                }
                tmp = aux;
                tmpTop = topo;
            }

            aux = tmpTop;
            tmpTop = tmpTop.getProx();

        }

        c = tmp;
        return c;
    }

    public void showElements() {

        Celula tmp = bottom;
        Celula tmpTop = topo;
        Celula aux = topo;//ant

        while (tmp != topo) {

            if (tmp.equals(tmpTop)) {
                System.out.println(tmp.getElement());
                tmp = aux;
                tmpTop = topo;
            }

            aux = tmpTop;
            tmpTop = tmpTop.getProx();

        }

        System.out.println(tmp.getElement());
    }

    public int getBiggestElement() {

        Celula tmp = topo;
        int maior = 0;

        while (tmp != null) {
            if (maior < tmp.getElement()) {
                maior = tmp.getElement();
            }
            tmp = tmp.getProx();
        }

        return maior;
    }

    public int getBiggestElementRec(Celula tmp, int element) {

        int maior = element;

        if (tmp != null) {

            if (maior < tmp.getElement()) {
                maior = tmp.getElement();
            }

            return getBiggestElementRec(tmp.getProx(), maior);

        } else {
            return maior;
        }
    }

    public int sumElements() {

        Celula tmp = topo;
        int sum = 0;

        while (tmp != null) {
            sum += tmp.getElement();
            tmp = tmp.getProx();
        }

        return sum;
    }

    public int sumElementsRec(Celula tmp) {

        if (tmp != null) {
            return tmp.getElement() + sumElementsRec(tmp.getProx());
        } else {
            return 0;
        }

    }

}
