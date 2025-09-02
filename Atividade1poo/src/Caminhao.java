public class Caminhao extends Veiculo {
    private double capacidadeDeCarga;
    private static final double TAXA_MANUTENCAO = 200.0;

    public Caminhao(String marca, String modelo, int ano, double valorDiaria, String placa, double capacidadeDeCarga) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setValorDiaria(valorDiaria);
        setPlaca(placa);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public double getCapacidadeDeCarga() { return capacidadeDeCarga; }
    public void setCapacidadeDeCarga(double capacidadeDeCarga) { this.capacidadeDeCarga = capacidadeDeCarga; }

    @Override
    public double calcularAluguel(int dias) {
        return getValorDiaria() * dias + TAXA_MANUTENCAO;
    }
}
