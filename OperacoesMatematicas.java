public class OperacoesMatematicas {

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
