public class Dados {
    private int valor;
    private Dados proximo;

    public Dados(int valor, Dados proximo){
        this.valor = valor;
        this.proximo = proximo;
    }

    public Dados(int valor){
        this.valor = valor;
        this.proximo = null;
    }

    public int getValor(){
        return this.valor;
    }

    public Dados getProximo(){
        return this.proximo;
    }

    public void setProximo(Dados proximo){
        this.proximo = proximo;
    }
}
