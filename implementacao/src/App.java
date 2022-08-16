import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Roda> rodas = new ArrayList<Roda>();
        rodas.add(new Roda(32));
        rodas.add(new Roda(32));
        rodas.add(new Roda(32));
        rodas.add(new Roda(32));

        Carro corsa = new Carro(new Motor(25), rodas);

        corsa.acelerar();
        corsa.freiar();
        corsa.acelerar();
    }
}
