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

    public static int[] tranformarFilaEmVetor(Fila f1) {
        Fila f1Copia = new Fila();

        while(!f1.vazia()) {
            int no = f1.remover();
            f1Copia.inserir(no);
        }

        int [] f1Vetor = new int[f1.getTamanho()];
        int i = 0;

        while(!f1Copia.vazia()) {
            int no = f1Copia.remover();
            f1Vetor[i++] = no;
            f1.inserir(no);
        }

        return f1Vetor;
    }

    public static int [] mergeVetorial(Fila f1, Fila f2) {
        int [] f1Vetor = tranformarFilaEmVetor(f1);
        int [] f2Vetor = tranformarFilaEmVetor(f2);

        int [] mergeVetor = new int[f1.getTamanho() + f2.getTamanho()];

        int ponteiro1 = 0;
        int ponteiro2 = 0;
        int ponteiro3 = 0;
        while(ponteiro1 < f1.getTamanho() && ponteiro2 < f2.getTamanho()) {
            if (f1Vetor[ponteiro1] < f2Vetor[ponteiro2]) {
                mergeVetor[ponteiro3] = f1Vetor[ponteiro1];
                ponteiro3 += 1;
                ponteiro1 += 1;
            } else {
                mergeVetor[ponteiro3] = f2Vetor[ponteiro2];
                ponteiro3 += 1;
                ponteiro2 += 1;
            }
        }

        while (ponteiro1 < f1.getTamanho()) {
            mergeVetor[ponteiro3] = f1Vetor[ponteiro1];
            ponteiro3 += 1;
            ponteiro1 += 1;
        }

        while (ponteiro2 < f2.getTamanho()) {
            mergeVetor[ponteiro3] = f2Vetor[ponteiro2];
            ponteiro3 += 1;
            ponteiro2 += 1;
        }

        return mergeVetor;
    }


}