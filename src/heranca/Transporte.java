package heranca;

public class Transporte {
	private int capacidade;

	public Transporte(int capacidade) {
		this.capacidade = capacidade;
	}
	public Transporte(){
	 
	 }

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public void visualizar() {
		System.out.println("Dados do meio de transporte: ");
		System.out.println("\nNúmero de passageiros: "+this.capacidade);
	}
}
