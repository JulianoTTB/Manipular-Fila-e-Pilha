public class Merge {
     private int ponteiro1;
     private int ponteiro2;

    public Merge() {
    }

    public Fila mergeNos(Fila f1, Fila f2) {
        Fila merge = new Fila();

        while (!f1.vazia() && !f2.vazia()) {
            if (f1.getPrimeiroValor() < f2.getPrimeiroValor()) {
                merge.inserir(f1.getPrimeiroValor());
                f1.remover();
            } else {
                merge.inserir(f2.getPrimeiroValor());
                f2.remover();
            }
        }

        while (!f1.vazia()) {
            merge.inserir(f1.getPrimeiroValor());
            f1.remover();
        }

        while (!f2.vazia()) {
            merge.inserir(f2.getPrimeiroValor());
            f2.remover();
        }
        return merge;
    }

}