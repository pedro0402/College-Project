package conversordemoedas;
public enum MoedaEnum {
    USD(5.24, "Dolar"),
    EUR(5.69, "Euro"),
    GBP(6.42, "Libra esterlina"),
    CHF(5.71, "Franco Suico");

    private double valor;
    private String descricao;

    MoedaEnum(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}