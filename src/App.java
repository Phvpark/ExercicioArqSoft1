public class App {
    public static void main(String[] args) throws Exception {

        Carro esportivo = new Carro("esportivo", TipoCombustivel.GASOLINA, 6, 45);

        System.out.println("Tipos de veiculos:");
        System.out.println(esportivo);

        System.out.println("\n\n----------------");
        System.out.println("\n Abastencendo carro "+ esportivo.getModelo() +" com gasolina");
        esportivo.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(esportivo);
        System.out.println("\n Viajando com o carro "+ esportivo.getModelo());
        esportivo.viaja(250);
        esportivo.viaja(150);
        System.out.println(esportivo);
    }
}
