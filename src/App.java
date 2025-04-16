 public class App{
    public static void main(String[] args) {
        int[] pesos = {10, 15, 5};

        Economy economy = new Economy("111.111.111-11", "Maria", "10A", 400);
        System.out.println("Economy - Custo Bagagem: R$" + economy.custoBagagem(pesos));
        System.out.println("Economy - Custo Assento: R$" + economy.defineAssento("12B"));

        Executive executive = new Executive("222.222.222-22", "João", "5C", 1000);
        System.out.println("Executive - Custo Bagagem: R$" + executive.custoBagagem(pesos));
        System.out.println("Executive - Milhas: " + executive.getMilhas());
        System.out.println("Executive - Custo Assento: R$" + executive.defineAssento("6A"));

        Premier premier = new Premier("333.333.333-33", "Ana", "1A", 1500);
        System.out.println("Premier - Custo Bagagem: R$" + premier.custoBagagem(pesos));
        System.out.println("Premier - Milhas: " + premier.getMilhas());
        System.out.println("Premier - Custo Assento: R$" + premier.defineAssento("2B"));
    }
}
 