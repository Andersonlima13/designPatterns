package locadora;

// Implementação para Carros de Luxo
public class AutomovelLuxo extends Automovel {
    public AutomovelLuxo(String descricao, int ano, String placa) {
        super(descricao, ano, placa, 3, 90.0);
    }
    @Override
    public double getValorTotalAluguel(Locacao locacao) {
        // DECISÃO DO AUTOMOVEL BÁSICO: Usar o valor SEM desconto.
        return locacao.valorDeUmaLocacao();
    }
}
