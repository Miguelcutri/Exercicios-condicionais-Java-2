package PacoteJava3;
import java.util.*;
public class Ma�a3 {
	public static void main(String args []) {
		Scanner ler = new Scanner(System.in);
		int ma�as;
		float ma�asM;
		
		System.out.println("Quantas ma�as foram compradas?: ");
		ma�as = ler.nextInt();
		
		if (ma�as<12) {
			ma�asM = (float) (ma�as * 0.30);
		}
		
		else {
			ma�asM = (float) (ma�as * 0.25);
		}
		System.out.println("A quantidade de ma�as deu R$ " + ma�asM);
	}
}
