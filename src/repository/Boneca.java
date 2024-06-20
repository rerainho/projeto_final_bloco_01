package repository;

import java.security.Principal;

public interface Boneca {

	public void cadastrarCompra(Principal principal);
	
	public void listarBonecas();
	
	public void atualizar(Principal principal);
	
	public void deletar(int id);

		
}
