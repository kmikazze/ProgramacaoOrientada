package farmacia;

public class TestaFarmacia {

	public static void main(String[] args) {
		Farmacia cliente1 = new Farmacia ("Protetor Solar","Cosméticos",2,80.19f,160.38f);
		Farmacia cliente2 = new Farmacia("Loratadina - 10mg","Medicamentos",5,2.99f,14.95f);
		cliente1.visualizar();
		cliente2.visualizar();
	}

}
