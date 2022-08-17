public class Carro extends Automovel {
    private String modelo;
    private String placa;

    public Carro(String modelo, String placa, Motor motor, int capacidadeTanque) {
        super(motor, capacidadeTanque);
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }
}
