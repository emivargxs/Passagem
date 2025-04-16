public class Premier extends Passagem {

    public Premier(String cpf, String nome, String assento, double custoPassagem) {
        super(cpf, nome, assento, custoPassagem);
    }

    public double custoBagagem(int[] pesos) {
        double custoExecutive = 0;
        for (int i = 0; i < pesos.length; i++) {
            if (i >= 2) {
                custoExecutive += pesos[i] * 0.5;
            }
        }
        return custoExecutive * 0.5; // 50% de desconto sobre Executive
    }

    public double defineAssento(String assento) {
        this.assento = assento;
        return 0.0; // sem custo
    }

    public double getMilhas() {
        return this.custoPassagem * 0.20;
    }
}
