package controller;

import java.util.ArrayList;

import model.Principal;
import repository.Boneca;

public class ControllerBonecas implements Boneca {

	private ArrayList<Principal> listarBonecas = new ArrayList<Principal>();
	int id = 0;

	@Override
	public void cadastrarCompra(Principal principal) {
		listarBonecas.add(principal);
		System.out.println("Boneca " + principal.getId() + "cadastrada para a sua compra com sucesso!");
		}

	@Override
	public void listarBonecas() {

		for (var boneca : listarBonecas) {
			boneca.visualizar();
		}
	}

	@Override
	public void atualizar(Principal principal) {

	}

	@Override
	public void deletar(int id) {

	}

	public int gerarId() {
		return ++id;

	}

}
