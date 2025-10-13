package locadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente  {
    private String nome;
    Integer valorCorrente = 0;
    private List<Locacao> carrosAlugados = new ArrayList<Locacao>();

    public Cliente (String nome) {this.nome = nome;}



    public String getNome() {
        return nome;
    }

    public void adicionaLocacao(Locacao locacao) {
        carrosAlugados.add(locacao);
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeLocadorFrequente = 0;
        int sequencia = 0;

        Iterator<Locacao> locacoes = carrosAlugados.iterator();
        String resultado = "Registro de Loca��es de " + getNome() + fimDeLinha;
        resultado += String.format("Seq Automovel             Ano  Diarias   Valor Pago"+fimDeLinha);
        resultado += String.format("=== ==================== ===== ========= ==========="+fimDeLinha);

        while(locacoes.hasNext()){
            Locacao carroAlugado = locacoes.next();
            double valorCorrente = carroAlugado.getCarro().getValorTotalAluguel(carroAlugado);
            int pontos = carroAlugado.getPontosLocadorFrequente();


            sequencia++;
            resultado += String.format("%02d. %-20s  %4d    %2d     R$ %8.2f"+fimDeLinha,
                    sequencia, carroAlugado.getCarro().getDescricao(), carroAlugado.getCarro().getAno(), carroAlugado.getDiasAlugado(), valorCorrente);

            valorTotal += valorCorrente;
            pontosDeLocadorFrequente += pontos;
        }

        resultado += "====================================================" + fimDeLinha;
        resultado += String.format("Valor Acumulado em di�rias............:  R$ %8.2f" + fimDeLinha, valorTotal);
        resultado += "Voce acumulou " + pontosDeLocadorFrequente +
                " pontos de locador frequente";

        return resultado;
    }
}




