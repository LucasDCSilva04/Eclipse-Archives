package helloworld;
import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) { 
			
		Scanner in = new Scanner(System.in);
		int op = 1;
		do {
			try {
				//Obtendo o valor do cliente
				System.out.println("Insira um valor em binário");
				String binary = in.next();
		        //Transformando de Binário, para Decimal
				int i = Integer.parseInt(binary, 2);
				System.out.println("Valor em Decimal:");
				System.out.println(i);
				//Transformndo de Decimal para tabela ASCII
		        char value_char  = (char) i;
		        System.out.println("Valor em ASCII:");
		        System.out.println(value_char);
				}
			
			catch (NumberFormatException e) {
				System.out.println("");
				System.out.println("O valor deve conter apenas \'0\' e \'1\' !!!");}
				System.out.println("");
			
		}while (op==1);
	}
}
