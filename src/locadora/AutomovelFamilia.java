package locadora;

// Implementação para Carros Sedan ou SUV (Família)
public class AutomovelFamilia extends Automovel {
    public AutomovelFamilia(String descricao, int ano, String placa) {
        super(descricao, ano, placa, 1); // Código 1 = Família
    }

    @Override
    protected double getValorAluguel(int diasAlugado) {
        return diasAlugado * 130.0;
    }

    @Override
    protected int getPontoDeLocadorFrequente(int diasAlugado) {
        // Regra padrão: 1 ponto por aluguel
        return 1;
    }
}
