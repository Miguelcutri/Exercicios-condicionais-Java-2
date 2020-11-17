//4. Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).
//Calcular e imprimir o seguinte:

//− Se o número de lados for igual a 3 escrever TRI NGULO e o valor da área 
//− Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área. 
//−Se o número de lados for igual a 5 escrever PENTÁGONO.


package PacoteJava3;
import java.util.*;
public class Poligono4 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int lados, medida, medida2;
		float area;
		
		System.out.println("Digite a quantidade de lados do poligono: ");
		lados = ler.nextInt();
		
		if (lados == 3) {
			System.out.println("É um triângulo! Digite sua base: ");
			medida = ler.nextInt();
			
			System.out.println("É um triângulo! Digite sua altura: ");
			medida2 = ler.nextInt();
			
			area = medida * medida2 / 2;
			System.out.println("É um triângulo! sua área é de " + area);
		}
		
		if (lados== 4) {
			System.out.println("É um quadrado! Digite sua largura: ");
			medida = ler.nextInt();
			
			System.out.println("É um quadrado! Digite sua altura: ");
			medida2 = ler.nextInt();
			
			area = medida * medida2;
			
			System.out.println("É um quadrado! sua área é : "+ area);
		}
		if (lados ==5) {
			System.out.println("É um Pentágono!");
		}
		
		else if (lados < 3) {
			System.out.println("Não é um polígono.");
		}
		
		else {
			System.out.println("Poligono não identificado");
		}
	}
}
