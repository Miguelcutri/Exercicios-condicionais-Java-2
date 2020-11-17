package PacoteJava3;
import java.util.*;
public class Validade2 {
	public static void main(String args []) {
		Scanner ler = new Scanner(System.in);
		int senha;
		System.out.println("Digite a senha: ");
		senha = ler.nextInt();
		
		if(senha== 1234) {
			System.out.println("Acesso permitido.");
		}
		
		else {
			System.out.println("Acesso negado.");
		}
	}

}
