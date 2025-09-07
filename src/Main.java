public class Main {
    public static void main(String[] args) {
        Fila f1 = new Fila();
        f1.inserir(2);
        f1.inserir(5);
        f1.inserir(10);
        f1.inserir(211);

        Fila f2 = new Fila();
        f2.inserir(3);
        f2.inserir(4);


        Merge merge = new Merge();
        Fila filamerge = merge.mergeNos(f1, f2);
        System.out.println(filamerge.imprimir());

    }
}
