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

    public void setNum1(double num1) { 
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) { 
        this.num2 = num2;
    }

    // Métodos de Operações (Exemplo)
    public double somar() {
        return this.num1 + this.num2;
    }

    public double subtrair() {
        return this.numero1 - this.num2;
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