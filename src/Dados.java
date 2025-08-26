public class Dados {
    private int dado;
    private Dados proximo;

    public Dados(int dado, Dados proximo){
        this.dado = dado;
        this.proximo = proximo;
    }

    public Dados(int dado){
        this.dado = dado;
        this.proximo = null;
    }

    public int getDado(){
        return this.dado;
    }

    public Dados getProximo(){
        return this.proximo;
    }

    public void setProximo(Dados proximo){
        this.proximo = proximo;
    }
}
