package financiamento;
import java.util.Scanner;

public class FinanciamentoMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int op = 1;	
		double valorTotal;
		double entrada;
		int parcelas;
		do {
			System.out.println("Digite o valor total.");
			valorTotal = in.nextDouble();
			System.out.println("Digite o valor da entrada");
			entrada = in.nextDouble();
			System.out.println("Digite o número de parcelas");
			parcelas = in.nextInt();
		try {
			Financiamento f = new Financiamento(valorTotal,entrada,parcelas);
			System.out.println("");
			System.out.printf("R$ %.2f",f.prestação());
		}
		catch(RuntimeException e){
			System.out.println(e.getMessage());
		}
		System.out.println("");
		System.out.println("Deseja inserir um novo valor? 1-sim 2-não");
		op = in.nextInt();
		System.out.println("");
		}while(op==1);	
		in.close();
	}
}
