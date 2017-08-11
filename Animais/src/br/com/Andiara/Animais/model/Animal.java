package br.com.Andiara.Animais.model;

public abstract class Animal {

	private String nome;
	private String cor;
	private int qnt_Patas;

	public Animal(String nome, String cor, int qnt_Patas) {
		setNome(nome);
		setCor(cor);
		setQnt_Patas(qnt_Patas);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQnt_Patas() {
		return qnt_Patas;
	}

	public void setQnt_Patas(int qnt_Patas) {
		this.qnt_Patas = qnt_Patas;
	}
	
	@Override
	public String toString() {
		String dados;
		dados = "\nNome: "+getNome();
		dados+="\nCor: "+getCor();
		dados+="\nQuantidade de patas: "+getQnt_Patas()+" patas";
		return dados;
	}
	
	public abstract String som_Animal();
	
	
		
	}
