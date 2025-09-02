public class Carro extends Veiculo {
    private int quantidadeDePortas;
    private static final double TAXA_LIMPEZA = 50.0;

    public Carro(String marca, String modelo, int ano, double valorDiaria, String placa, int quantidadeDePortas) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setValorDiaria(valorDiaria);
        setPlaca(placa);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getQuantidadeDePortas() { return quantidadeDePortas; }
    public void setQuantidadeDePortas(int quantidadeDePortas) { this.quantidadeDePortas = quantidadeDePortas; }

    @Override
    public double calcularAluguel(int dias) {
        return getValorDiaria() * dias + TAXA_LIMPEZA;
    }
}
