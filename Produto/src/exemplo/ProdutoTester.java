package exemplo;

import java.util.Scanner;


public class ProdutoTester {
	public static void main(String[] args) {
		int tempIdProduto;
		int tempQuantidade;
		String tempNome = " ";
		double tempPreco;
		
		Produto [] produtos = new Produto[6];
		
		Scanner in = new Scanner(System.in);
		for(int i=0;i<6;i++) {
			System.out.println("Digite o Id do produto "+ (i+1) +":");
			tempIdProduto = in.nextInt();
			in.nextLine();
			System.out.println("Digite a quantidade do produto "+ (i+1) +":");
			tempQuantidade = in.nextInt();
			in.nextLine();
			System.out.println("Digite o nome do produto "+ (i+1) +":");
			tempNome = in.nextLine();
			System.out.println("Digite o preço do produto "+ (i+1) +":");
			tempPreco= in.nextDouble();

			produtos[i] = new Produto(tempIdProduto, tempQuantidade, tempNome, tempPreco);
		}
		in.close();
		
		for (int i=0; i<6;i++) {
			System.out.println(produtos[i]);
		}
		
	}

}
