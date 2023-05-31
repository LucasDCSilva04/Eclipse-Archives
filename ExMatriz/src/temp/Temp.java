package temp;

public class Temp {

	public static void main(String[] args) {
		int [] [] matriz = {{1,2,3},
							{4,5,6},
							{7,8,9}};
		
		System.out.println("Matriz Original");
		for(int [] vetor: matriz) {
			for(int n : vetor) {
				System.out.print(n);
			}
			System.out.println(" ");
		}
		
		System.out.println("\nDiagonal principal");
		for(int i=0;i<matriz.length;i++) {
			System.out.print(matriz[i][i]);
		}
		
		System.out.println("\n\nDiagonal secundaria");
		for(int i=0;i<matriz.length;i++) {
			System.out.print(matriz[i][(matriz[0].length-1)-i]);
		}
		
		System.out.println("\n\nGiro de 90°");
		for(int col=0;col<matriz[0].length;col++){
			for(int lin=matriz.length-1;lin>=0;lin--) {
				System.out.print(matriz[lin][col]);
			}
			System.out.println(" ");
		}
	}
}