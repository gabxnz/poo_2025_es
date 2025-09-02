package trabalhopoo2;

public class Cachorro extends Animal {
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    
    public String emitirSom() {
        return "latido";
    }

    
    public String alimentar() {
        return "ração";
        }
    }
