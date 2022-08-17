public class App {
    public static void main(String[] args) {
        Carro corsa = new Carro("corsa", "234-423", new Motor(), 1);

        corsa.dirigir(new Motorista("Henrique"));
        corsa.abastecer(2);
        corsa.acelerar();
        corsa.freiar();
        corsa.acelerar();
        corsa.acelerar();
    }   
}
