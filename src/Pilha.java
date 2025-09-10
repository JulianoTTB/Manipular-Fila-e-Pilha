public class Pilha {
    private int tamanho;
    private Dados topo;

    public Pilha(){
        this.tamanho = 0;
        this.topo = null;
    }

    public void inserir(int numero){
        Dados d1 = new Dados(numero);
        d1.setProximo(this.topo);
        this.topo = d1;
        this.tamanho++;
    }

    public String remover(){
        if (vazia())
            return "A pilha tá vazia";

        Dados removido = this.topo;
        this.topo = this.topo.getProximo();
        this.tamanho--;

        return "Valor removido: " + removido.getValor();
    }

    public boolean vazia(){
        return this.topo == null;
    }


    public String imprimir() {
        if (vazia()) return "A pilha tá vazia";

        String numeros = "";
        Dados atual = this.topo;

        while (atual != null) {
            numeros += atual.getValor() + " ";  // concatenação simples
            atual = atual.getProximo();
        }

        return numeros;
    }

}
