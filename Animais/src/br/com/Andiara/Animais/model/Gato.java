package br.com.Andiara.Animais.model;

public class Gato extends Animal{

	public Gato(String nome, String cor, int qnt_Patas) {
		super(nome, cor, qnt_Patas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String som_Animal() {
		String som;
		som = "\nMiau";
		return som;
	}

}
