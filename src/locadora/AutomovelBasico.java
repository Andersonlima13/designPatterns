package locadora;

abstract class Automovel {
    protected  abstract double getValorAluguel(int diasAlugado);
    protected abstract int getPontoDeLocadorFrequente(int diasAlugado);
// ainda nao  existe uma regra geral de alugueis frequentes e atribuicoes de ponto, o metodo aqui é apenas
// uma abstacao e cada modelo de carro tem sua propria logica em lidar com o esquema de pontos
    private String descricao;
    private String placa;
    private int ano; // Ano de fabricacao
    private int codigoDoPreco;

    public Automovel(String descricao, int ano, String placa, git aint codigoDoPreco) {
        this.descricao = descricao;
        this.placa = placa;
        this.ano = ano;
        this.codigoDoPreco = codigoDoPreco;
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
}

// Implementação para Carros Hatch (Básico)
public class AutomovelBasico extends Automovel {
    // Chama o construtor da superclasse
    public AutomovelBasico(String descricao, int ano, String placa) {
        super(descricao, ano, placa, 0); // Código 0 = Básico
    }

    @Override
    protected double getValorAluguel(int diasAlugado) {
        return diasAlugado * 90.0;
    }

    @Override
    protected int getPontoDeLocadorFrequente(int diasAlugado) {
        // Regra padrão: 1 ponto por aluguel
        return 1;
    }
}












