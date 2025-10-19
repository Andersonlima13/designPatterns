package locadora;

public class Locacao {
	   //private Automovel carro;
       private Alugavel itemAlugavel;
	   private int diasAlugado;



	   public Locacao(Alugavel item, int diasAlugado) {
           this.itemAlugavel = item;
           this.diasAlugado = diasAlugado;
	   }

	   //public Automovel getCarro() {
	   //   return carro;
	   // }

        public Alugavel getItemAlugavel() {
            return itemAlugavel;
        }


	 
	   public int getDiasAlugado() {
	      return diasAlugado;
	   }





    protected double valorDeUmaLocacao() {
        return itemAlugavel.getValorAutomovel() * diasAlugado;
    }


    protected double getValorAluguelDescontado() {
        double valorBase = valorDeUmaLocacao();

        // A regra de negócio concentrada aqui
        if (diasAlugado > 4) {
            return valorBase * 0.9;
        }
        return valorBase;
    }





}
