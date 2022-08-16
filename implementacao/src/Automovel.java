
abstract public class Automovel {
    private Motor motor;

    public Automovel(Motor motor) {
        this.motor = motor;
    }

    public void acelerar() {
        this.motor.girar(this.motor.getRotacao() + 1, new Combustivel("Gasolina"));
        System.out.println("Acelerou Veículo");
    }

    public void freiar() {
        this.motor.girar(this.motor.getRotacao() - 1, null);
        System.out.println("Freiou Veículo");
    }
}
