package trabalhopoo2;

public class Leao extends Animal {
    private double tamanhoJuba;

    public double getTamanhoJuba() {
        return tamanhoJuba;
    }

    public void setTamanhoJuba(double tamanhoJuba) {
        this.tamanhoJuba = tamanhoJuba;
    }

    public String emitirSom() {
        return "Rugido";
    }

    
    public String alimentar() {
        return "carne";
    }
}