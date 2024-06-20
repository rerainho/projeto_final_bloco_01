package repository;

public interface Boneca {

	public void salvarBoneca(Boneca boneca);

	Boneca buscarBonecaPorNome(String nome);

	public void listarBonecas();

	public void cadastrarCompra();
	
}
