package atividadepoo4;

public class IngressoEstudante extends Ingresso {
    private String instituicaoEnsino;

    public IngressoEstudante(String instituicaoEnsino, double valor) {
        this.instituicaoEnsino = instituicaoEnsino;
        setValor(valor);
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }

    @Override
    public double calcularValorFinal() {
        return getValor() / 2.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Instituição: " + instituicaoEnsino + ", Valor Final: R$ " + calcularValorFinal();
    }
}
