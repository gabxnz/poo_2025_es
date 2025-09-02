import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Produto p1 = new ProdutoPerecivel("Leite", 5.0, "Laticínio", "1234567890", "25/09/2025");
        Produto p2 = new ProdutoImportado("Queijo Importado", 20.0, "Laticínio", "0987654321", "França");
        Produto p3 = new ProdutoNacional("Arroz", 10.0, "Alimento", "1122334455", "Tio João");

        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);

        for (Produto p : listaProdutos) {
            System.out.println("Produto: " + p.getNome() +
                               " | Categoria: " + p.getCategoria() +
                               " | Preço Final: R$ " + p.calcularPrecoFinal());
        }
    }
}
