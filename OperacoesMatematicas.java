public class OperacoesMatematicas {
    private double numero1;
    private double numero2;

    OperacoesMatematicas (double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

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

    public static double soma(double numero1, double numero2) {
       return  numero1 + numero2;
    }

    public static double subtracao(double numero1, double numero2) {
        return numero1 - numero2;
    }
    
    public static double multiplicacao(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double divisao(double numero1, double numero2) {
        if (numero2 == 0) throw new ArithmeticException("Divisão por zero");
        return numero1 / numero2; 
    }
}
