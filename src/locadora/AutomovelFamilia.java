package locadora;

// Implementação para Carros Sedan ou SUV (Família)
public class AutomovelFamilia extends Automovel {
    public AutomovelFamilia(String descricao, int ano, String placa) {
        super(descricao, ano, placa, 2, 90.0);
    }
    @Override
    public double getValorTotalAluguel(Locacao locacao) {
        // DECISÃO DO AUTOMOVEL BÁSICO: Usar o valor SEM desconto.
        return locacao.getValorAluguelBase();
    }



}
