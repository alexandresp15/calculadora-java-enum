public enum Operacao {
    SOMA("+"),
    SUBTRACAO("-"),
    MULTIPLICACAO("*"),
    DIVISAO("/");

    private final String simbolo;

    Operacao(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
    
    public static Operacao fromSimbolo(String simbolo) {
        for (Operacao op : Operacao.values()) {
            if (op.simbolo.equals(simbolo)) {
                return op;
            }
        }
        throw new IllegalArgumentException("Operação inválida: " + simbolo);
    }
}
