package model;

public class Florzinha extends Principal {

	private String nome;

	public Florzinha(int id, int modelo, int tamanho, String boneca, String cor, String nome) {
		super( id,modelo, tamanho, boneca, cor);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Nome: " + this.nome);
    }
}   