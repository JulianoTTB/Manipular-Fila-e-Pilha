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

    public String remover(){
        if (vazia()) return "";

        Dados temporario = this.fronte;

        this.fronte = this.fronte.getProximo();

        if(this.fronte == null) this.cauda = null;

        temporario.setProximo(null);
        this.tamanho--;
        return "Valor removido: " + temporario.getValor();
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

    public int getPrimeiroValor(){
        if(vazia()) return -2_000_000_000;

        return this.fronte.getValor();
    }
}
