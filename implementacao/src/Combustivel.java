public class Combustivel {
    private String tipo;

    public Combustivel(String tipo) {
        this.tipo = tipo;
    }

    public void queimar() {
        System.out.println("Queimou " + this.tipo + "!");
    }
}
