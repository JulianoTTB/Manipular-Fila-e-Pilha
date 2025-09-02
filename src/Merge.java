public class Merge {
     private int ponteiro1;
     private int ponteiro2;
     private int ponteiro3;

    public Merge() {
    }

    public int [] merge(Fila f1, Fila f2) {
        int tamanhoTotal = f1.getTamanho() + f2.getTamanho();
        int [] c = new int [tamanhoTotal];

        ponteiro1 = 0;
        ponteiro2 = 0;
        ponteiro3 = 0;

        while(ponteiro1 < f1.getTamanho() && ponteiro2 < f2.getTamanho()) {
            if(f1.getFila[ponteiro1] < f2.getFila[ponteiro2]) {
                c[ponteiro3] = f1.getFila[ponteiro1];
                ponteiro3 += 1;
                ponteiro1 += 1;
                c[ponteiro3] = f2.getFila[ponteiro2];
                ponteiro3 += 1;
                ponteiro2 += 1;
            } else {
                c[ponteiro3] = f2.getFila[ponteiro2];
                ponteiro3 += 1;
                ponteiro2 += 1;
                c[ponteiro3] = f1.getFila[ponteiro1];
                ponteiro3 += 1;
                ponteiro1 += 1;
            }
        }

        while(ponteiro1 < f1.getTamanho()) {
            c[ponteiro3] = f1.getFila[ponteiro1];
            ponteiro3 += 1;
            ponteiro1 += 1;
        }

        while(ponteiro2 < f2.getTamanho()) {
            c[ponteiro3] = f2.getFila[ponteiro2];
            ponteiro3 += 1;
            ponteiro2 += 1;
        }
        return c;
    }

}
