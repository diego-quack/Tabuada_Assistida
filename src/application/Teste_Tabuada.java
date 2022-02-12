package application;

import java.security.SecureRandom;
import java.util.Scanner;

public class Teste_Tabuada {

	public static void main(String[] args) {

		SecureRandom geradorDeNumeros = new SecureRandom();
		Scanner input = new Scanner(System.in);

		int x = 0;
		int y = 0;
		System.out.println("soma: 1, subtração: 2, multiplicação: 3, divisão: 4");
		int operacao = input.nextInt();
		
		if(operacao == 1) {
			x = geradorDeNumeros.nextInt(10);
			y = geradorDeNumeros.nextInt(10);
			System.out.print(x + " + " + y + " = ");
			int resultado = input.nextInt();
			if(resultado == soma(x, y)) {
				System.out.println("Correto!");
			}
			else {
				System.out.println("Errado!");
			}
		}
		if(operacao == 2) {
			x = geradorDeNumeros.nextInt(10);
			y = geradorDeNumeros.nextInt(10);
			System.out.print(x + " - " + y + " = ");
			int resultado = input.nextInt();
			if(resultado == subtracao(x, y)) {
				System.out.println("Correto!");
			}
			else {
				System.out.println("Errado!");
			}
		}
		if(operacao == 3) {
			x = geradorDeNumeros.nextInt(10);
			y = geradorDeNumeros.nextInt(10);
			System.out.print(x + " x " + y + " = ");
			int resultado = input.nextInt();
			if(resultado == multiplicacao(x, y)) {
				System.out.println("Correto!");
			}
			else {
				System.out.println("Errado!");
			}
		}
		if(operacao == 4) {
			x = geradorDeNumeros.nextInt(10);
			y = geradorDeNumeros.nextInt(10);
			System.out.print(x + " / " + y + " = ");
			int resultado = input.nextInt();
			if(resultado == divisao(x, y)) {
				System.out.println("Correto!");
			}
			else {
				System.out.println("Errado!");
			}
		}
		
		input.close();

	}

	public static int soma(int x, int y) {

		int resultado = x + y;

		return resultado;
	}

	public static int subtracao(int x, int y) {

		int resultado = x - y;

		return resultado;
	}

	public static int multiplicacao(int x, int y) {

		int resultado = x * y;

		return resultado;
	}

	public static int divisao(int x, int y) {

		int resultado = x / y;

		return resultado;
	}
}
