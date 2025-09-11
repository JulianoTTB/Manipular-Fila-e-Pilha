import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pilha pilha = new Pilha();
        Fila fila1 = new Fila();
        Fila fila2 = new Fila();
        int numAnterior1 = -1_000_000_000;
        int numAnterior2 = -1_000_000_000;
        int opcao = 0;
        Merge merge = new Merge();

        int valor;
        while(opcao != 11){
            System.out.println("***************************");
            System.out.println("1 - Inserir número na Pilha");
            System.out.println("2 - Remover número da Pilha");
            System.out.println("3 - Imprimir Pilha");
            System.out.println("4 - Inserir número na Fila 1");
            System.out.println("5 - Remover número da Fila 1");
            System.out.println("6 - Imprimir Fila 1");
            System.out.println("7 - Inserir número na Fila 2");
            System.out.println("8 - Remover número da Fila 2");
            System.out.println("9 - Imprimir Fila 2");
            System.out.println("10 - Merge Fila 1 e Fila 2");
            System.out.println("11 - Merge Fila 1 e Fila 2 de forma vetorial");
            System.out.println("12 - Fechar Programa");
            System.out.println("***************************");
            System.out.print("Digite a sua escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            int numero;
            switch (opcao){
                case 1:
                    System.out.print("Digite um número inteiro: ");
                    numero = scanner.nextInt();
                    scanner.nextLine();
                    pilha.inserir(numero);
                    System.out.println("Valor inserido!");
                    break;
                case 2:
                    System.out.println(pilha.remover());
                    break;
                case 3:
                    System.out.println(pilha.imprimir());
                    break;
                case 4:
                    do {
                        System.out.print("Digite um número inteiro (maior que " + numAnterior1 + "): ");
                        numero = scanner.nextInt();
                    }while (numAnterior1 >= numero);
                    numAnterior1 = numero;
                    fila1.inserir(numero);
                    scanner.nextLine();
                    System.out.println("Valor inserido!");
                    break;
                case 5:
                    valor = fila1.remover();
                    if (valor == -2_000_000_000)
                        System.out.println("Fila 1 vazia!");
                    else
                        System.out.println("Valor Removido: " + valor);
                    if(fila1.vazia()) numAnterior1 = -1_000_000_000;
                    break;
                case 6:
                    System.out.println("Fila 1: " + fila1.imprimir());
                    break;
                case 7:
                    do {
                        System.out.print("Digite um número inteiro (maior que " + numAnterior2 + "): ");
                        numero = scanner.nextInt();
                    }while (numAnterior2 >= numero);
                    numAnterior2 = numero;
                    fila2.inserir(numero);
                    scanner.nextLine();
                    System.out.println("Valor inserido!");
                    break;
                case 8:
                    valor = fila2.remover();
                    if (valor == -2_000_000_000)
                        System.out.println("Fila 2 vazia!");
                    else
                        System.out.println("Valor Removido: " + valor);

                    if(fila2.vazia()) numAnterior2 = -1_000_000_000;
                    break;
                case 9:
                    System.out.println("Fila 2: " + fila2.imprimir());
                    break;
                case 10:
                    System.out.println("Fila 1: " + fila1.imprimir());
                    System.out.println("Fila 2: " + fila2.imprimir());
                    System.out.println("Merge da Fila 1 + Fila 2: " +merge.mergeNos(fila1, fila2).imprimir());
                    break;
                case 11:
                    int[] merge_vetorial = Merge.mergeVetorial(fila1, fila2);

                    System.out.print("Merge de forma vetorial da Fila 1 e Fila 2: ");
                    for(int i = 0; i < fila1.getTamanho() + fila2.getTamanho(); i++)
                        System.out.print(merge_vetorial[i] + " ");
                    System.out.println();
                    break;
                default: break;
            }

            System.out.print("Pressione qualquer botão para continuar");
            scanner.nextLine();
        }

        scanner.close();
    }
}
