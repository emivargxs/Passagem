public class Economy extends Passagem {

    public Economy(String cpf, String nome, String assento, double custoPassagem) {
        super(cpf, nome, assento, custoPassagem);
    }

    public double custoBagagem(int[] pesos) {
        double custo = 0;
        for (int i = 0; i < pesos.length; i++) {
            custo += pesos[i] * 0.5;
            custo += 10.0; // adicional de R$10,00 por bagagem
        }
        return custo;
    }
}
