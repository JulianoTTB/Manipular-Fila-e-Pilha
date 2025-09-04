public class Fila {
    private int tamanho;
    private Dados fronte;
    private Dados cauda;

    public Fila(){
        this.tamanho = 0;
        this.fronte = null;
        this.cauda = null;
    }

    public boolean vazia(){
        return this.fronte == null;
    }


    public void inserir(int numero){
        if(vazia()){

            this.fronte = new Dados(numero);
            this.cauda = fronte;
        }
        else{
            Dados temporario = new Dados(numero);

            this.cauda.setProximo(temporario);

            this.cauda = temporario;
        }
        this.tamanho++;
    }

    public void remover(){
        if (vazia()) return;

        Dados temporario = this.fronte;

        this.fronte = this.fronte.getProximo();

        temporario.setProximo(null);
        this.tamanho--;
    }

    public String imprimir(){
        if (vazia()) return null;
        String numeros = "";

        for(Dados i = this.fronte; i != null; i = i.getProximo()){
            numeros += i.getValor() + " ";
        }

        return numeros;
    }
    public int getTamanho(){
        return this.tamanho;
    }

    public int getInfo(int indice){
        Dados inicio = this.fronte;

        for(int i = 0; i < indice; i++)
               inicio = inicio.getProximo();

        return inicio.getValor();
    }
}
