public class App {
    public static void main(String[] args) throws Exception {

        Carro SUVFlex = new Carro("SUVFlex", TipoCombustivel.GASOLINA, 20, 55);

        System.out.println("Tipos de veiculos:");
        System.out.println(SUVFlex);

        System.out.println("\n\n----------------");
        System.out.println("\n Abastencendo carro "+ SUVFlex.getModelo() +" com "+ TipoCombustivel.GASOLINA.toString());
        SUVFlex.abastece(TipoCombustivel.GASOLINA,65);
        System.out.println(SUVFlex);
        System.out.println("\n Viajando com o carro "+ SUVFlex.getModelo());
        SUVFlex.viaja(250);
        SUVFlex.viaja(150);
        System.out.println(SUVFlex);
    }
}
