
/**
* Laboratório de Programação 2 - Lab 1
* 
* @author Luiggy Silva - 117211159
*/
import java.util.Scanner;

public class CresceDecresce {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		
		if(n1 < n2 && n2 < n3 && n3 < n4) {
			System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
		}
		else if(n1 > n2 && n2 > n3 && n3 > n4) {
			System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
		}
		else {
			System.out.print("FUNCAO NAO ESTRITAMENTE CRES/DECR");
		}

	}

}