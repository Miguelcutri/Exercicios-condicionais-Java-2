package PacoteJava3;
import java.util.*;
public class Maior6 {
	public static void main(String args []) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		System.out.println("Digite N1: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite N2: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite N3: ");
		n3 = ler.nextInt();
		
		if (n1!=n2 && n2 != n3 && n3 != n1) {
			
		
		if (n1 > n2 && n1 < n3) {
			System.out.println("N1 é o maior");
		}
		if (n1 < n2 && n3 < n2) {
			System.out.println("N2 é o maior");
		}
		if (n3 > n2 && n2 < n3) {
			System.out.println("N3 é o maior");
		}
		}
		else {
			System.out.println("Os números devem ser diferentes");
		}
		
		
		
	}
}
