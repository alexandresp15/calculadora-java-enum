import java.util.Scanner;

public class Calculadora {

    public static void main (String[] args) {
        System.out.println("Calculadora em Java");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Operações disponíveis:");
        for (Operacao op : Operacao.values()) {
            System.out.println(op.name() + " -> " + op.getSimbolo());
        }

        System.out.println();
        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = sc.nextLine().trim();

        System.out.print("Entre com o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Entre com o segundo número: ");
        double numero2 = sc.nextDouble();

        try {
            Operacao operacao = Operacao.fromSimbolo(operador);
            
            double resultado = switch (operacao) {
                case SOMA -> soma(numero1, numero2);
                case SUBTRACAO -> subtracao(numero1, numero2);
                case MULTIPLICACAO -> multiplicacao(numero1, numero2 );
                case DIVISAO -> divisao(numero1, numero2);
            };

            System.out.println();
            System.out.printf("Resultado: %.2f %s %.2f = %.2f%n", numero1, operacao.getSimbolo(), numero2, resultado);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Erro matemático: " + e.getMessage());
        }
        sc.close();
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisao(double num1, double num2) {
        if (num2 == 0) throw new ArithmeticException("Divisão por zero.");
        return num1 / num2;
    }
}
