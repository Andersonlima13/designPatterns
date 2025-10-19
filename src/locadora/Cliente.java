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



    public double getValorTotal() {
        double valorTotal = 0.0;

        for (Locacao locacao : carrosAlugados) {

            valorTotal += locacao.getItemAlugavel().getValorTotalAluguel(locacao);
        }
        return valorTotal;
    }

    public int getPontosDeLocadorFrequente() {
        int pontosDeLocadorFrequente = 0;

        for (Locacao locacao : carrosAlugados) {
            int diasAlugado = locacao.getDiasAlugado();

            // Lógica de pontos movida para cá, usando o getter de Locacao
            pontosDeLocadorFrequente += 1; // Ponto base
            if (diasAlugado > 2) {
                pontosDeLocadorFrequente += 2; // Bônus
            }
        }
        return pontosDeLocadorFrequente;
    }





    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = getValorTotal();
        int pontosDeLocadorFrequente = getPontosDeLocadorFrequente();
        int sequencia = 0;

        Iterator<Locacao> locacoes = carrosAlugados.iterator();
        String resultado = "Registro de Loca��es de " + getNome() + fimDeLinha;
        resultado += String.format("Seq Automovel             Ano  Diarias   Valor Pago"+fimDeLinha);
        resultado += String.format("=== ==================== ===== ========= ==========="+fimDeLinha);

        while(locacoes.hasNext()){
            Locacao carroAlugado = locacoes.next();
            Alugavel item = carroAlugado.getItemAlugavel();
            double valorCorrente = item.getValorTotalAluguel(carroAlugado);

            sequencia++;
            resultado += String.format("%02d. %-20s  %4d    %2d     R$ %8.2f"+fimDeLinha,
                    sequencia, item.getDescricao(), item.getAno(), carroAlugado.getDiasAlugado(), valorCorrente);

        }

        resultado += "====================================================" + fimDeLinha;
        resultado += String.format("Valor Acumulado em di�rias............:  R$ %8.2f" + fimDeLinha, valorTotal);
        resultado += "Voce acumulou " + pontosDeLocadorFrequente +
                " pontos de locador frequente";

        return resultado;
    }
}




