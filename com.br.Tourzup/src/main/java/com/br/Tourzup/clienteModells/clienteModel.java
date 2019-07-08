package com.br.Tourzup.clienteModells;

public class clienteModel {
	
	private String nome;
	private String email;
	private int idade;
	private int QuantidadeMalas;
	
	public clienteModel() {
	
	}

	public clienteModel(String nome, String email, int idade, int quantidadeMalas) {
		
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.QuantidadeMalas = quantidadeMalas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getQuantidadeMalas() {
		return QuantidadeMalas;
	}

	public void setQuantidadeMalas(int quantidadeMalas) {
		QuantidadeMalas = quantidadeMalas;
	}
	
	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		
		modelo.append("Nome: " + this.getNome() + "\n");
		modelo.append("Email: " + this.getEmail() + "\n");
		modelo.append("Idade: " + this.getIdade() + "\n");
		modelo.append("Quantidade de malas: " + this.getQuantidadeMalas());
		
		return modelo.toString();
	}
	
	
	
	
}
