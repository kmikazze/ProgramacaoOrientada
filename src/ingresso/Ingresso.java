package ingresso;

public class Ingresso {
	private String tituloEvento;
	private String local;
	private String setor;
	private int data;
	private int horario;
	
	public Ingresso(String tituloEvento, String local, String setor, int data, int horario) {
		super();
		this.tituloEvento = tituloEvento;
		this.local = local;
		this.setor = setor;
		this.data = data;
		this.horario = horario;
	}
	
	public String getTituloEvento() {
		return tituloEvento;
	}
	public void setTituloEvento(String tituloEvento) {
		this.tituloEvento = tituloEvento;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	
	public void visualizar() {
		System.out.println("");

	}

}
