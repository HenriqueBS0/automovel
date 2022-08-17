abstract public class Automovel {

    private Motor motor;

    private int capacidadeTanque;
    private int quantidadeTanque = 0;

    private boolean dirigindo = false;

    public Automovel(Motor motor, int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
        this.motor = motor;
    }

    public void dirigir(Motorista motorista) {
        dirigindo = true;
        System.out.println("Motorista " + motorista.getNome() + " dirigindo.");
    }

    public void acelerar() {
        if(!this.dirigindo) {
            System.out.println("Automóvel não está sendo dirigido!");
            return;
        }

        if(this.quantidadeTanque == 0) {
            System.out.println("Automóvel sem combustível!");
            return;
        }
        
        this.quantidadeTanque--;
        this.motor.setRotacao(this.motor.getRotacao() + 1);

        System.out.println("Acelerou, rotação: " + this.motor.getRotacao());
    }

    public void freiar() {
        if(!this.dirigindo) {
            System.out.println("Automóvel não está sendo dirigido!");
            return;
        }

        if(this.motor.getRotacao() == 0) {
            System.out.println("Automóvel já está parado!");
            return;
        }

        this.motor.setRotacao(this.motor.getRotacao() - 1);
        System.out.println("Freiou, rotação: " + this.motor.getRotacao());
    }

    public void pararDeDirigir() {
        this.dirigindo = false;
        motor.setRotacao(0);
    }

    public void abastecer(int quantidade) {
        if((this.quantidadeTanque + quantidade) > this.capacidadeTanque) {
            this.quantidadeTanque = this.capacidadeTanque; 
            return;
        }

        this.quantidadeTanque += quantidade;
    }

}
