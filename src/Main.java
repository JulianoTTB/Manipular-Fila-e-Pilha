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

        while(opcao != 11){
            System.out.println("***************************");
            System.out.println("1 - Inserir número na Pilha");
            System.out.println("2 - Remover número da Pilha");
            System.out.println("3 - Imprimir Pilha");
            System.out.println("4 - Inserir número na Fila 1");
            System.out.println("5 - Remover número da Fila 1");
            System.out.println("6 - Imprimir Fial 1");
            System.out.println("7 - Inserir número na Fila 2");
            System.out.println("8 - Remover número da Fila 2");
            System.out.println("9 - Imprimir Fila 2");
            System.out.println("10 - Merge Fila 1 e Fila 2");
            System.out.println("11 - Fechar Programa");
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
                    System.out.println(fila1.remover());
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
                    System.out.println(fila2.remover());
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
                default: break;
            }

            System.out.print("Pressione qualquer botão para continuar");
            scanner.nextLine();
        }

        scanner.close();
    }
}
