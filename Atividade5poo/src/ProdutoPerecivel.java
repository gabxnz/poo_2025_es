public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String nome, double precoBase, String categoria, String codigoBarras, String dataValidade) {
        setNome(nome);
        setPrecoBase(precoBase);
        setCategoria(categoria);
        setCodigoBarras(codigoBarras);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() { return dataValidade; }
    public void setDataValidade(String dataValidade) { this.dataValidade = dataValidade; }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 0.8;
    }
}
