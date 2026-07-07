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
                    // Aqui dentro você vai pedir os números e chamar a sua classe Calculadora
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