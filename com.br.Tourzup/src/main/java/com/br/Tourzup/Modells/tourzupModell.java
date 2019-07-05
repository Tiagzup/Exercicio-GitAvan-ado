package com.br.Tourzup.Modells;

public class tourzupModell {
	
	private String empresa;
	private String destino;
	private double tempoViagem;
	private int lugares;
	private int lugaresDisponiveis;
	private String clientes;
	
	
	
	public tourzupModell() {
		
	}



	public tourzupModell(String empresa, String destino, double tempoViagem, int lugares, int lugaresDisponiveis,
			String clientes) {
		this.empresa = empresa;
		this.destino = destino;
		this.tempoViagem = tempoViagem;
		this.lugares = lugares;
		this.lugaresDisponiveis = lugaresDisponiveis;
		this.clientes = clientes;
	}



	public String getDestino() {
		return destino;
	}



	public void setDestino(String destino) {
		this.destino = destino;
	}



	public double getTempoViagem() {
		return tempoViagem;
	}



	public void setTempoViagem(double tempoViagem) {
		this.tempoViagem = tempoViagem;
	}



	public int getLugares() {
		return lugares;
	}



	public void setLugares(int lugares) {
		this.lugares = lugares;
	}



	public int getLugaresDisponiveis() {
		return lugaresDisponiveis;
	}



	public void setLugaresDisponiveis(int lugaresDisponiveis) {
		this.lugaresDisponiveis = lugaresDisponiveis;
	}



	public String getClientes() {
		return clientes;
	}



	public void setClientes(String clientes) {
		this.clientes = clientes;
	}



	public String getEmpresa() {
		return empresa;
	}
	
	@Override
	public String toString() {
		
		StringBuilder modelo = new StringBuilder();
		
		modelo.append("Empresa: " + this.getEmpresa() + "\n");
		modelo.append("Destino: " + this.getDestino() + "\n");
		modelo.append("Tempo de Viagem: " + this.getTempoViagem() + "\n");
		modelo.append("Lugares: " + this.getLugares() + "\n");
		modelo.append("Lugares disponiveis: " + this.getLugaresDisponiveis() + "\n");
		modelo.append("Clientes: " + this.getClientes() + "\n");
		
		return modelo.toString();
	}
	

	
}
