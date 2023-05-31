package carro;

public class Carro {
	
	private String chassi;
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public void ligar() {
		//Encapsulamento
		confereCambio();
		confereCombustivel();
		System.out.println("Carro ligado!");
	}
	private void confereCombustivel() {
		System.out.println("Conferindo combustível!");
	}
	private void confereCambio() {
		System.out.println("Conferindo câmbio em N!");
	}
}
