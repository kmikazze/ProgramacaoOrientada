package farmacia;

public class Farmacia {
	private String nomeProduto;
	private String setor;
	private int quantidade;
	private float valorCada;
	private float valorTotal;
	
	public Farmacia(String nomeProduto, String setor, int quantidade, float valorCada, float valorTotal) {
		super();
		this.nomeProduto = nomeProduto;
		this.setor = setor;
		this.quantidade = quantidade;
		this.valorCada = valorCada;
		this.valorTotal = valorTotal;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getValorCada() {
		return valorCada;
	}
	public void setValorCada(float valorCada) {
		this.valorCada = valorCada;
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void visualizar() {
		System.out.println("==============================================");
		System.out.println("Setor: "+setor);
		System.out.println("Nome do produto: "+nomeProduto);
		System.out.println("Quantidade: "+quantidade);
		System.out.println("Valor: R$"+valorCada);
		System.out.println("Valor da compra: R$"+valorTotal);
		System.out.println("==============================================");
	}
}
