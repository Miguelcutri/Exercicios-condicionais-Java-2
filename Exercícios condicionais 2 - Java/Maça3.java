package PacoteJava3;
import java.util.*;
public class Maça3 {
	public static void main(String args []) {
		Scanner ler = new Scanner(System.in);
		int maças;
		float maçasM;
		
		System.out.println("Quantas maças foram compradas?: ");
		maças = ler.nextInt();
		
		if (maças<12) {
			maçasM = (float) (maças * 0.30);
		}
		
		else {
			maçasM = (float) (maças * 0.25);
		}
		System.out.println("A quantidade de maças deu R$ " + maçasM);
	}
}
