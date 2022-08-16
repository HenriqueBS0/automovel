public class Motor {
    private int potencia;
    private int rotacao = 0;

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public int getRotacao() {
        return this.rotacao;
    }

    public void girar(int rotacao, Combustivel combustivel) {
        this.rotacao = rotacao;

        if(combustivel != null) {
            combustivel.queimar();
        }
        System.out.println("Girando o motor em " + this.rotacao + " rpm");
    }
}
