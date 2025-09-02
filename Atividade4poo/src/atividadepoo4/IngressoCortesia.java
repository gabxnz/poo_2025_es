package atividadepoo4;

public class IngressoCortesia extends Ingresso {
    private String patrocinador;

    public IngressoCortesia(String patrocinador, double valor) {
        this.patrocinador = patrocinador;
        setValor(valor);
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    @Override
    public double calcularValorFinal() {
        return 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Patrocinador: " + patrocinador + ", Valor Final: R$ " + calcularValorFinal();
    }
}
