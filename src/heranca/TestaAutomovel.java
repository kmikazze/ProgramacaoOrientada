package heranca;

public class TestaAutomovel {

	public static void main(String[] args) {
		Automovel carro = new Automovel(5,4,80f,"Branco",4,"GEN 7458",4);
		Automovel carro2 = new Automovel("Branco",4,"GEN 7458",4);
		
		carro.setCapacidade(2);
		carro.visualizar();
		carro2.visualizar();
	}

}
