package PacoteJava3;
import java.util.*;
public class ValoresMaiores1 {
	
	public static void main(String args []) {
		Scanner ler = new Scanner(System.in);
		int n1, n2;
		System.out.println("Digite N1: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite N2: ");
		n2 = ler.nextInt();
		
		if (n1 != n2 && n1>n2 ) {
			System.out.println("O valor maior é de N1: "+ n1);
		}
		
		if (n2 != n1 && n1<n2 ) {
			System.out.println("O valor maior é de N2:" + n2);
		}
		
		else {
			System.out.println("Não é permitido valores iguais");
		}
		
	}
}
