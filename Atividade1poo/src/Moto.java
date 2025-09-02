public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, double valorDiaria, String placa, int cilindrada) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setValorDiaria(valorDiaria);
        setPlaca(placa);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() { return cilindrada; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }

    @Override
    public double calcularAluguel(int dias) {
        double total = getValorDiaria() * dias;
        return total * 0.95;
    }
}
