package locadora;

public interface Alugavel {
    double getValorTotalAluguel(Locacao locacao);
    String getDescricao();
    int getAno();
    double getValorAutomovel(); // O valo
}
