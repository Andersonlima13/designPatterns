package locadora;

abstract class Automovel implements Alugavel{
    //public abstract double getValorTotalAluguel(Locacao locacao);
    private String descricao;
    private String placa;
    private int ano; // Ano de fabricacao
    private int codigoDoPreco;
    private double valorAutomovel;

    public Automovel(String descricao, int ano, String placa, int codigoDoPreco, double valorAutomovel) {
        this.descricao = descricao;
        this.placa = placa;
        this.ano = ano;
        this.codigoDoPreco = codigoDoPreco;
        this.valorAutomovel = valorAutomovel;
    }

    public String getDescricao() {
        return descricao;
    }
    public String getPlaca() {
        return placa;
    }
    public int getAno() {
        return ano;
    }
    public int getCodigoDoPreco() {return codigoDoPreco;}
    public void setCodigoDoPreco(int codigoDoPreco) {this.codigoDoPreco = codigoDoPreco;}
    public double getValorAutomovel(){return valorAutomovel;}
    public void setValorAutomovel(int valorAutomovel){this.valorAutomovel = valorAutomovel;}
}





public class AutomovelBasico extends Automovel {
    public AutomovelBasico(String descricao, int ano, String placa) {
        super(descricao, ano, placa, 0, 90.0);
    }

    @Override
    public double getValorTotalAluguel(Locacao locacao) {
        // DECISÃO DO AUTOMOVEL BÁSICO: Usar o valor SEM desconto.
        return locacao.valorDeUmaLocacao();
    }


}












