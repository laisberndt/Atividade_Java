public class Calculadora {
    // Atributos privados (Encapsulamento)
    private double num1;
    private double num2;

    // Construtor
    public Calculadora (double num1, double num2) {
    this.num1 = num1;
    this.num2 = num2;
    }

    // Métodos Getters e Setters
    public double getNum1() {
        return num1;
    }

    public void setNum1(double numero1) { 
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) { 
        this.numero2 = numero2;
    }

    // Métodos de Operações (Exemplo)
    public double somar() {
        return this.numero1 + this.numero2;
    }

    public double subtrair() {
        return this.numero1 - this.numero2;
    }

    public double multiplicar() {
        return this.numero1 * this.numero2;
    }

    public double dividir() {
        // Validação de divisão por zero
        if (this.numero2 == 0.0) {
            System.out.println("ERRO! A divisão não pode ser por Zero!");
            return 0;
        } else {
        return this.numero1 / this.numero2;
        }
    }
}