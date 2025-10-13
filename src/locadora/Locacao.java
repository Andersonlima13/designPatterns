package locadora;

public class Locacao {
	   private Automovel carro;
	   private int diasAlugado;
	 
	   public Locacao(Automovel carro, int diasAlugado) {
	      this.carro = carro;
	      this.diasAlugado = diasAlugado;
	   }
	 
	   public Automovel getCarro() {
	      return carro;
	   }
	 
	   public int getDiasAlugado() {
	      return diasAlugado;
	   }





    protected double getValorAluguelBase() {
        return carro.getValorAutomovel() * diasAlugado;
    }


    protected double getValorAluguelDescontado() {
        double valorBase = getValorAluguelBase();

        // A regra de negócio concentrada aqui
        if (diasAlugado > 4) {
            return valorBase * 0.9;
        }
        return valorBase;
    }



    public int getPontosLocadorFrequente() {
        int pontosDeAlugadorFrequente = 1;
        if (diasAlugado > 2){
            pontosDeAlugadorFrequente+=2;
        }
        return pontosDeAlugadorFrequente;
    }




}
