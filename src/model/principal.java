package model;

public abstract class Principal {
	
	
	private int tamanho;
	private String boneca;
	private String cor;
	
	public Principal(int tamanho, String boneca, String cor) {
		this.tamanho = tamanho;
		this.cor = cor;
		this.boneca = boneca;
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
		String boneca = "";
		switch(this.boneca) {
		case 1:
			boneca = "Florzinha";
		break;
		case 2:
			boneca = "Lindinha";
		break;
		case 3:
			boneca = "Docinho";
		break;
			
		}
		System.out.println("Dados das bonecas");
		System.out.println("------------------------------");
		System.out.println("Nome: " + this.boneca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tamanho: " + this.tamanho);
	}
	
	
	}
