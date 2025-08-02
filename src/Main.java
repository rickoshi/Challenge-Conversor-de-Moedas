public class Main {
    public static void main(String[] args) {

        // The base currency is set in the second to last parameter and the target currency is set in the last parameter
        String endereco = "https://v6.exchangerate-api.com/v6/6b46ad142b98f85a3b33e80b/latest/USD";

        ConsultaMoeda consultaMoeda = new ConsultaMoeda();

        Moeda novaMoeda = consultaMoeda.consultaMoeda(endereco);

        System.out.println(novaMoeda);

    }
}
