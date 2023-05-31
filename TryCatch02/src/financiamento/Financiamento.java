package financiamento;

public class Financiamento {
	public Double valorTotal;
	public Double entrada;
	public Integer parcelas;
	
	public Financiamento(Double valorTotal, Double entrada, Integer parcelas){
		
		if(entrada<valorTotal*0.2) {
			System.out.println("");
			throw new RuntimeException("A entrada deve ser pelo menos 20% do valor total");
		}
		else if(parcelas<6) {
			System.out.println("");
			throw new RuntimeException("No mínimo, o número de parcelas deve ser 6");
		}
		
		this.valorTotal = valorTotal;
		this.entrada = entrada;
		this.parcelas = parcelas;
	}
	
	
	
	public double prestação() {
		return (valorTotal-entrada) / parcelas;
	}
	
}
