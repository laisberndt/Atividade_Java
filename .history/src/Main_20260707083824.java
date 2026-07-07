import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(String.in);
        char continuar = 'S';
        do {
        // 1. Exibir Menu Principal
        // 2. Capturar opção com Switch-Case
        // 3. Executar a lógica escolhida
         // 4. Perguntar se deseja continuar
         
System.out.print("\nDeseja voltar ao menu
principal? (S/N): ");
continuar =
scanner.next().toUpperCase().charAt(0);
} while (continuar == 'S');
System.out.println("Sistema encerrado. Bons estudos!");
scanner.close();
}