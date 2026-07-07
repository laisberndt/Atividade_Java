public class Calculadora {
    // Atributos privados (Encapsulamento)
    private double numero1;
    private double numero2;

    // Construtor
    public Calculadora (double numero1, double numero2) {
    this.numero1 = numero1;
    this.numero2 = numero2;
    }

    // Métodos Getters e Setters
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) { 
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

    public double dividir() {
        // Validação de divisão por zero
        if ()
        return this.numero1 / this.numero2;
    }
}
