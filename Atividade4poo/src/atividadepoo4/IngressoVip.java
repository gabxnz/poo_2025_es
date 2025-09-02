package atividadepoo4;

public class IngressoVip extends Ingresso {
    private String areaVIP;

    public IngressoVip(String areaVIP, double valor) {
        this.areaVIP = areaVIP;
        setValor(valor);
    }

    public String getAreaVIP() {
        return areaVIP;
    }

    public void setAreaVIP(String areaVIP) {
        this.areaVIP = areaVIP;
    }

    @Override
    public double calcularValorFinal() {
        return getValor() + 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Área VIP: " + areaVIP + ", Valor Final: R$ " + calcularValorFinal();
    }
}
