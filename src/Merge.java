public class Merge {
     private int ponteiro1;
     private int ponteiro2;
     private int ponteiro3;

    public Merge() {
    }

    public int [] merge(Pilha p1, Lista l1) {
        int tamanhoTotal = p1.getTamanho + l1.getTamanho;
        int [] c = new int [tamanhoTotal];

        ponteiro1 = 0;
        ponteiro2 = 0;
        ponteiro3 = 0;

        while(ponteiro1 < p1.getTamanho && ponteiro2 < l1.getTamanho) {
            if(p1.getPilha[ponteiro1] < l1.getLista[ponteiro2]) {
                c[ponteiro3] = p1.getPilha[ponteiro1];
                ponteiro3 += 1;
                ponteiro1 += 1;
                c[ponteiro3] = l1.getLista[ponteiro2];
                ponteiro3 += 1;
                ponteiro2 += 1;
            } else {
                c[ponteiro3] = l1.getLista[ponteiro2];
                ponteiro3 += 1;
                ponteiro2 += 1;
                c[ponteiro3] = p1.getPilha[ponteiro1];
                ponteiro3 += 1;
                ponteiro1 += 1;
            }
        }

        while(ponteiro1 < p1.getTamanho) {
            c[ponteiro3] = p1.getPilha[ponteiro1];
            ponteiro3 += 1;
            ponteiro1 += 1;
        }

        while(ponteiro2 < l1.getTamanho) {
            c[ponteiro3] = l1.getPilha[ponteiro2];
            ponteiro3 += 1;
            ponteiro2 += 1;
        }
        return c;
    }

}
