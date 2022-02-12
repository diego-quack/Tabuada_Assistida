package application;

import java.security.SecureRandom;
import java.util.Scanner;

public class Teste_Tabuada {

	public static void main(String[] args) {
		
		SecureRandom geradorDeNumeros = new SecureRandom();
		Scanner input = new Scanner(System.in);
		
		int x = geradorDeNumeros.nextInt(10);
		int y = geradorDeNumeros.nextInt(10);
		System.out.print(x + " + " + y + " = ");
		int resultado = input.nextInt();
		if(resultado == soma(x, y)) {
			System.out.println("Muito bem!");
		}
		else {
			System.out.println("Errado!");
		}
		
		input.close();

	}
	
	public static int soma(int x, int y) {
		
		int resultado = x + y;
		
		return resultado;
	}
}
