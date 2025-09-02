public class ProdutoImportado extends Produto {
    private String paisOrigem;

    public ProdutoImportado(String nome, double precoBase, String categoria, String codigoBarras, String paisOrigem) {
        setNome(nome);
        setPrecoBase(precoBase);
        setCategoria(categoria);
        setCodigoBarras(codigoBarras);
        this.paisOrigem = paisOrigem;
    }

    public String getPaisOrigem() { return paisOrigem; }
    public void setPaisOrigem(String paisOrigem) { this.paisOrigem = paisOrigem; }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 1.15;
    }
}
