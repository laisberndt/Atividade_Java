import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 'S';
        
        do {

        System.out.print("\nDeseja voltar ao menu principal? (S/N): ");
        continuar = scanner.next().toUpperCase().charAt(0);
        } 
        while (continuar == 'S');

        System.out.println("Sistema encerrado. Bons estudos!");
        scanner.close();
    }
}