package model;

public abstract class Principal {

	private int id;

	private int modelo;
	private int tamanho;
	private String boneca;
	private String cor;

	public Principal(int id, int modelo, int tamanho, String boneca, String cor) {
		this.id = id;
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.cor = cor;
		this.boneca = boneca;

		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getBoneca() {
		return boneca;
	}

	public void setBoneca(String boneca) {
		this.boneca = boneca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void visualizar() {

		System.out.println("Dados das bonecas");
		System.out.println("------------------------------");
		if (modelo == 1) {
			System.out.println("Nome: Florzinha ");
		} else if (modelo == 2) {
			System.out.println("Nome: Lindinha ");
		} else
			System.out.println("Nome: Docinho ");
		System.out.println("Cor: " + this.cor);
		System.out.println("Tamanho: " + this.tamanho);
	}

	

}
