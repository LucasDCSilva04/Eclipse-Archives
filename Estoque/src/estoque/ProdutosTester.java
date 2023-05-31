package estoque;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ProdutosTester {
	
	public static void main(String[] args) {
		
		int tempIdProduto = 0;
		String tempNome = " ";
		double tempPreco = 0.0;
		int tempQuantidade = 0;
		int maxSize = -1;
		
		Scanner in = new Scanner(System.in);
		
		do{
			try {
				System.out.println("Insira o número de produtos que gostaria de adicionar:");
				System.out.println("(insira 0 (zero) se não quiser adicionar produtos)");
				maxSize = in.nextInt();
				
				if(maxSize<0)
					throw new Exception();
				
			}catch(InputMismatchException e) {
				in.nextInt();
				System.err.println("O número de produtos não confere");
				
			}catch(Exception e) {
				in.nextLine();
				System.err.println("Valor incorreto inserido");
			
			}
			
		}while(maxSize<0);
		
		if(maxSize == 0) {
			System.err.println("Não há produtos!");
		}else {
			Produto [] produtos = new Produto [maxSize];
		
		//Criando e definindo atributos para objetos
		for(int i = 0; i<maxSize; i++) {
			
			tempIdProduto = 0;
			tempNome = " ";
			tempPreco = 0.0;
			tempQuantidade = 0;
			
			try {
				in.nextLine();
				System.out.println("\n*** Estoque do livro " +(i+1)+ "***" );
				System.out.println("Digite o Id do livro " +(i+1)+ " :" );
				tempIdProduto = in.nextInt();
				in.nextLine();
				System.out.println("Digite o nome do livro " + (i+1) + " :" );
				tempNome = in.nextLine();
				System.out.println("Digite o preço do livro " + (i+1) + " :" );
				tempPreco = in.nextDouble();
				System.out.println("Digite a quantidade de livros "+ (i+1) + " :" );
				tempQuantidade = in.nextInt();
			
			}catch(Exception e) {
				System.err.println("Valor inválido!");
			
			}	
			
			produtos[i] = new Produto (tempIdProduto, tempNome, tempPreco, tempQuantidade);
			
			System.out.println(" ");
		}//for
		
		in.close();
			
		System.out.println("%Estoque:\n");
			for(Produto p : produtos) {
				System.out.println(p);
			}
			
		}//fim else

	}//fim main				
}
