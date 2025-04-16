public class Passagem {
    protected String cpf;
    protected String nome;
    protected String assento;
    protected double custoPassagem;

    public Passagem(String cpf, String nome, String assento, double custoPassagem) {
        this.cpf = cpf;
        this.nome = nome;
        this.assento = assento;
        this.custoPassagem = custoPassagem;
    }


    public double custoBagagem(int quantidadeBagagem,int[] pesos) {
        double custo = 0;
        if(quantidadeBagagem == 0){
            return custo;
        } else{
        for (int i = 0; i < pesos.length; i++) {
            custo += pesos[i] * 0.5; // R$0,50 por kg
        }
        return custo;
    }
    }

    public double defineAssento(String assento) {
        this.assento = assento;
        return 5.0; // custo fixo de R$5,00
    }
}
