public class App {
    public static void main(String[] args) throws Exception {

        Carro Utilitario = new Carro("Utilitario", TipoCombustivel.DIESEL, 5, 70);

        System.out.println("Tipos de veiculos:");
        System.out.println(Utilitario);

        System.out.println("\n\n----------------");
        System.out.println("\n Abastencendo carro "+ Utilitario.getModelo() +" com "+ TipoCombustivel.DIESEL.toString());
        Utilitario.abastece(TipoCombustivel.DIESEL,70);
        System.out.println(Utilitario);
        System.out.println("\n Viajando com o carro "+ Utilitario.getModelo());
        Utilitario.viaja(250);
        Utilitario.viaja(150);
        System.out.println(Utilitario);
    }
}
