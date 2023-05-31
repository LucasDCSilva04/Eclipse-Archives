package tryCatch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		 
		int valor = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número");
		try {
			valor = in.nextInt();
		}
		catch(InputMismatchException e) {
			System.err.println("Você digitou errado!");
		}
		catch(Exception e){
			System.err.println("Erro!");
		}
		System.out.println(valor);
	}
}