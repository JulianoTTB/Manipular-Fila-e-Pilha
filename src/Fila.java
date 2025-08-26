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

            this.fronte = new Dados(numero, null);
            this.cauda = fronte;
        }
        else{
            Dados temporario = new Dados(numero, null);

            this.cauda.setProximo(temporario);

            this.cauda = temporario;
        }
        this.tamanho++;
    }

    public void remover(){
        if (vazia()) return;
        this.fronte = this.fronte.getProximo();
        this.tamanho--;
    }

    public String imprimir(){
        if (vazia()) return null;
        String numeros = "";

        for(Dados i = this.fronte; i != null; i = i.getProximo()){
            numeros += i.getDado() + " ";
        }

        return numeros;
    }
    public int getTamanho(){
        return this.tamanho;
    }
}
