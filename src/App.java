public class App {
    public static void main(String[] args) throws Exception {

        Carro SUV = new Carro("SUV", TipoCombustivel.GASOLINA, 8, 55);

        System.out.println("Tipos de veiculos:");
        System.out.println(SUV);

        System.out.println("\n\n----------------");
        System.out.println("\n Abastencendo carro "+ SUV.getModelo() +" com "+ TipoCombustivel.GASOLINA.toString());
        SUV.abastece(TipoCombustivel.GASOLINA,55);
        System.out.println(SUV);
        System.out.println("\n Viajando com o carro "+ SUV.getModelo());
        SUV.viaja(250);
        SUV.viaja(150);
        System.out.println(SUV);
    }
}
