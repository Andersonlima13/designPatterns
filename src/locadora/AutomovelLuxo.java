package locadora;

// Implementação para Carros de Luxo
public class AutomovelLuxo extends Automovel {
    public AutomovelLuxo(String descricao, int ano, String placa) {
        super(descricao, ano, placa, 2); // Código 2 = Luxo
    }

    @Override
    protected double getValorAluguel(int diasAlugado) {
        double valor = diasAlugado * 200.0;
        // Hook de desconto: 10% se alugar por mais de 4 dias
        if (diasAlugado > 4) {
            valor *= 0.9;
        }
        return valor;
    }

    @Override
    protected int getPontoDeLocadorFrequente(int diasAlugado) {
        if (diasAlugado > 2) {
            return 3;
        }
        return 1;
    }
}
