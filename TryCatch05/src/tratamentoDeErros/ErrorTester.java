package tratamentoDeErros;
import java.util.Scanner;
import java.util.InputMismatchException;

/* Exercício:
 * As senhas nas posições 5,6 e 7 do vetor senhas não podem
 * ser acessadas, lance uma exceção caso o usuário tente
 * acessa-las.
 * Trate todas as axcessão possíveis para esta aplicação. 
 */

public class ErrorTester {

    public static void main(String[] args ){
        String []senhas = {"p@ssw0rd", "sEnh@", "1234","admin",
                            "paralelepipedo","321","010203"};
        int i=0;
        Scanner in = new Scanner(System.in);
        do {
        	try {
            System.out.println("Informe a posição do vetor que deseja expor: ");
            i = in.nextInt();
            if(i>=4 && i<=6) {
            	throw new Exception("Senha restrita! Sai fora irmão.");
            }else if(i<0) {
            	throw new Exception("Programa encerrado");
            }
            System.out.println(senhas[i]);
        	}
        	catch(InputMismatchException e){
        		in.nextLine();
        		System.err.println("Entrada inválida! Tente novamente.");
        	}catch(ArrayIndexOutOfBoundsException e) {
        		in.nextLine();
        		System.err.println("Senha inexistente! Tente novamente.");
        	}catch(Exception e) {
        		System.err.println(e);
        	}
        }while(i>=0);
    }
 }