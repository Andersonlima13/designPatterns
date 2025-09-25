import locadora.*;

public class Locadora {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Alex Sandro");

        // Antes: new Automovel(..., Automovel.LUXO)
        // Agora: new AutomovelLuxo(...)
        c1.adicionaLocacao(new Locacao(new AutomovelLuxo("Toyota Corolla xEi", 2021, "PLN0525"), 10));

        // Antes: new Automovel(..., Automovel.BASICO)
        // Agora: new AutomovelBasico(...)
        c1.adicionaLocacao(new Locacao(new AutomovelBasico("Fiat Mobi", 2021, "JPA2464"), 2));

        // Agora você pode usar as classes específicas para cada tipo de carro.
        c1.adicionaLocacao(new Locacao(new AutomovelLuxo("BMW Srie 7", 2022, "UBA0808"), 30));
        c1.adicionaLocacao(new Locacao(new AutomovelFamilia("Fiat Siena", 2023, "ABC0001"), 4));
        c1.adicionaLocacao(new Locacao(new AutomovelFamilia("Honda HRV", 2024, "KJD9745"), 10));
        c1.adicionaLocacao(new Locacao(new AutomovelBasico("Volkswagen Gol", 2024, "JJJ0055"), 3));

        System.out.println(c1.extrato());
		
	}
}
