import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Veiculo> lista = new ArrayList<>();

        lista.add(new Carro("Ford", "Fiesta", 2020, 100, "ABC-1234", 4));
        lista.add(new Moto("Honda", "CB500", 2019, 80, "XYZ-5678", 500));
        lista.add(new Caminhao("Volvo", "FH", 2018, 300, "TRK-9012", 10));

        int diasAluguel = 3;

        for (Veiculo v : lista) {
            System.out.println("Marca: " + v.getMarca() +
                               ", Modelo: " + v.getModelo() +
                               ", Valor do aluguel (" + diasAluguel + " dias): R$ " + v.calcularAluguel(diasAluguel));
        }
    }
}
