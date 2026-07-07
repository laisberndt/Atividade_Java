import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 'S';
        
        do {
            System.out.println("== SISTEMA APRENDA & CALCULE ==");
            System.out.println("1. Menu Calculadora");
            System.out.println("2. Guia de Conceitos");
            System.out.println("3. Sair do Sistema");
            System.out.println("----------------------------------");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt(); // Lendo a opção do usuário
            
            switch (opcao) {
                case 1:
                    System.out.println("== MENU CALCULADORA ==");

                    System.out.print("Digite o primeiro número: ");
                    double numero1 = scanner.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    double numero2 = scanner.nextDouble();

                    Calculadora calculo = new Calculadora(numero1, numero2);

                    // Exibindo as opções de operação
                    System.out.println("Escolha a operação:");
                    System.out.println("1. Somar");
                    System.out.println("2. Subtrair");
                    System.out.println("3. Multiplicar");
                    System.out.println("4. Dividir");
                    System.out.print("Opção escolhida: ");
                    int operacao = scanner.nextInt();

                    // Estrutura de decisão com if
                    if (operacao == 1) {
                        System.out.println("Resultado: " + calculo.somar());
                    } else if (operacao == 2) {
                        System.out.println("Resultado: " + calculo.subtrair());
                    } else if (operacao == 3) {
                        System.out.println("Resultado: " + calculo.multiplicar());
                    } else if (operacao == 4) {
                        System.out.println("Resultado: " + calculo.dividir());
                    } else {
                        System.out.println("Opção de operação inválida!");
                    }
                    break;
                    
                case 2:
                    System.out.println("Você entrou no Guia de Conceitos!");
                    // Aqui dentro você vai mostrar os flashcards de estudo
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