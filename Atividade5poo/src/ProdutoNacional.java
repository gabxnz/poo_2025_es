public class ProdutoNacional extends Produto {
    private String fabricante;

    public ProdutoNacional(String nome, double precoBase, String categoria, String codigoBarras, String fabricante) {
        setNome(nome);
        setPrecoBase(precoBase);
        setCategoria(categoria);
        setCodigoBarras(codigoBarras);
        this.fabricante = fabricante;
    }

    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase();
    }
}
