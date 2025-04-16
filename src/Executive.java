public class Executive extends Passagem {

    public Executive(String cpf, String nome, String assento, double custoPassagem) {
        super(cpf, nome, assento, custoPassagem);
    }

    public double custoBagagem(int[] pesos) {
        double custo = 0;
        for (int i = 0; i < pesos.length; i++) {
            if (i > 2) { // duas bagagens grátis
                custo += pesos[i] * 0.5;
            }
        }
        return custo;
    }

    public double getMilhas() {
        return this.custoPassagem * 0.10;
    }
}
