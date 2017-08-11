package br.com.Andiara.Animais.model;

public class Porquinho_India extends Animal{

	public Porquinho_India(String nome, String cor, int qnt_Patas) {
		super(nome, cor, qnt_Patas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String som_Animal() {
		String som;
		som = "\nNhôi";
		return som;
	}

}
