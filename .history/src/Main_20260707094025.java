import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 'S';
        
        do {
            System.out.println("\n== SISTEMA APRENDA & CALCULE ==");
            System.out.println("1. Menu Calculadora");
            System.out.println("2. Guia de Conceitos");
            System.out.println("3. Sair do Sistema");
            System.out.println("----------------------------------");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt(); // Lendo a opção do usuário
            
            switch (opcao) {
                case 1:
                    System.out.println("\n== MENU CALCULADORA ==\n");

                    System.out.print("Digite o primeiro número: ");
                    double num1 = scanner.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    double num2 = scanner.nextDouble();

                    Calculadora calculo = new Calculadora(num1, num2);

                    // Exibindo as opções de operação
                    System.out.println("\nEscolha a operação:");
                    System.out.println("1. Somar");
                    System.out.println("2. Subtrair");
                    System.out.println("3. Multiplicar");
                    System.out.println("4. Dividir");
                    System.out.print("Opção escolhida: ");
                    int operacao = scanner.nextInt();

                    // Estrutura de decisão com if
                    if (operacao == 1) {
                        System.out.println("\nO resultado de " + num1 + " + " + num2 + " é " + calculo.somar());
                    } else if (operacao == 2) {
                        System.out.println("\nO resultado de " + num1 + " - " + num2 + " é " + calculo.subtrair());
                    } else if (operacao == 3) {
                        System.out.println("\nO resultado de " + num1 + " * " + num2 + " é " + calculo.multiplicar());
                    } else if (operacao == 4) {
                        if (num2 == 0) {
                            System.out.println("\nERRO! Não pode ser feita a divisão por Zero!");
                            break;
                        } else {
                            System.out.println("\nO resultado de " + num1 + " / " + num2 + " é " + calculo.dividir());
                        }
                    } else {
                        System.out.println("\nOpção de operação inválida!");
                    }
                    break;
                    
                case 2:
                    System.out.println("\n== GUIA DE CONCEITOS ==\n");
                    
                    // Exibindo as opções de operação
                    System.out.println("Escolha o conceito que você quer aprender:");
                    System.out.println("1. O que é POO");
                    System.out.println("2. O que são Classes");
                    System.out.println("3. O que são Atributos");
                    System.out.println("4. O que é Encapsulamento");
                    System.out.println("5. O que são Requisitos e Regras de Negócio");
                    System.out.print("Opção escolhida: ");
                    int conceito = scanner.nextInt();

                    if (conceito == 1) {
                        System.out.println("\nPOO Java\n" +
                        "POO refere-se ao uso da Programação Orientada a Objetos (POO) na linguagem de programação Java.\n" +
                        "É um modelo de desenvolvimento onde o código é organizado em \"objetos\" que representam\n" +
                        "entidades do mundo real, facilitando a reutilização, a manutenção e a organização de sistemas complexos.");
                    } else if (conceito == 2) {
                        System.out.println("\nClasses em Java\n");
                        System.out.println("A classe é um elemento do código Java utilizado para representar objetos do mundo real.\n" + 
                        "Dentro dela é comum serem declarados atributos, que são as características e métodos, os comportamentos. Ela é uma estrutura fundamental que define um tipo de objeto, serve como modelo para criar objetos que compartilham características em comum, mas podem assumir estado próprio.");
                    } else if (conceito == 3) {
                        System.out.println("\nAtributos em Java\n");
                    } else if (conceito == 4) {
                        System.out.println("Encapsulamento em Java");
                    } else if (conceito == 5) {
                        System.out.println("\nRequisitos e Regras de Negócio\n");
                    } else {
                        System.out.println("\n Opção inválida, escolha de 1 a 5!");
                    }
                    break;
                    
                case 3:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        System.out.print("\nDeseja voltar ao menu principal? (S/N): ");
        continuar = scanner.next().toUpperCase().charAt(0);
        } 
        while (continuar == 'S');
        System.out.println("Sistema encerrado. Bons estudos!");
        scanner.close();
    }
}