package br.com.Andiara.Animais.model;

public class Cachorro extends Animal{

	public Cachorro(String nome, String cor, int qnt_Patas) {
		super(nome, cor, qnt_Patas);
		
	}

	@Override
	public String som_Animal() {
		String som;
		som = "\nAuAu";
		return som;
	}
	


}
