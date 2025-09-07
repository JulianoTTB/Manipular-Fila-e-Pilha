public class Merge {
     private int ponteiro1;
     private int ponteiro2;

    public Merge() {
    }

    public Fila mergePonteiro(Fila f1, Fila f2) {
        Fila merge = new Fila();

        ponteiro1 = 0;
        ponteiro2 = 0;

        while(ponteiro1 < f1.getTamanho() && ponteiro2 < f2.getTamanho()) {
            if(f1.getInfo(ponteiro1) < f2.getInfo(ponteiro2)) {
                merge.inserir(f1.getInfo(ponteiro1));
                ponteiro1 += 1;
            } else {
                merge.inserir(f2.getInfo(ponteiro2));
                ponteiro2 += 1;
            }
        }

        while(ponteiro1 < f1.getTamanho()) {
            merge.inserir(f1.getInfo(ponteiro1));
            ponteiro1 += 1;
        }

        while(ponteiro2 < f2.getTamanho()) {
            merge.inserir(f2.getInfo(ponteiro2));
            ponteiro2 += 1;
        }
        return merge;
    }

    public Fila mergeNos(Fila f1, Fila f2) {
        Fila merge = new Fila();

        Dados no1Atual = f1.getPrimeiroValor();
        Dados no2Atual = f2.getPrimeiroValor();

        while(no1Atual != null && no2Atual != null) {
            if (no1Atual.getValor() < no2Atual.getValor()) {
                merge.inserir(no1Atual.getValor());
                no1Atual = no1Atual.getProximo();
            } else {
                merge.inserir(no2Atual.getValor());
                no2Atual = no2Atual.getProximo();
            }
        }

        while(no1Atual != null) {
            merge.inserir(no1Atual.getValor());
            no1Atual = no1Atual.getProximo();
        }
        while(no2Atual != null) {
            merge.inserir(no2Atual.getValor());
            no2Atual = no2Atual.getProximo();
        }
        return merge;
    }

}
