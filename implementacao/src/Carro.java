import java.util.ArrayList;

public class Carro extends Automovel {

    private String modelo;
    private String placa;
    private ArrayList<Roda> rodas;

    public Carro(Motor motor, ArrayList<Roda> rodas) {
        super(motor);
        this.rodas = rodas;
    }
}
