package application;

import java.security.SecureRandom;
import java.util.Scanner;

import entities.Tabuada;

public class Teste_Tabuada {

	public static void main(String[] args) {

		SecureRandom geradorDeNumeros = new SecureRandom();
		Scanner input = new Scanner(System.in);
		int controlador = 1;

		int x = 0;
		int y = 0;
		System.out.println("Escolha a operação: ");
		System.out.println("soma: 1, subtração: 2, multiplicação: 3, divisão: 4");
		int operacao = input.nextInt();

		if (operacao == 1) {

			do {
				x = geradorDeNumeros.nextInt(10);
				y = geradorDeNumeros.nextInt(10);
				System.out.print(x + " + " + y + " = ");
				int resultado = input.nextInt();
				if (resultado == Tabuada.soma(x, y)) {
					System.out.println("Correto!");
				} else {
					System.out.println("Errado!");
				}
			} while (controlador == 1);
		}

		if (operacao == 2) {
			x = geradorDeNumeros.nextInt(10);
			y = geradorDeNumeros.nextInt(10);
			System.out.print(x + " - " + y + " = ");
			int resultado = input.nextInt();
			if (resultado == Tabuada.subtracao(x, y)) {
				System.out.println("Correto!");
			} else {
				System.out.println("Errado!");
			}
		}
		if (operacao == 3) {
			x = geradorDeNumeros.nextInt(10);
			y = geradorDeNumeros.nextInt(10);
			System.out.print(x + " x " + y + " = ");
			int resultado = input.nextInt();
			if (resultado == Tabuada.multiplicacao(x, y)) {
				System.out.println("Correto!");
			} else {
				System.out.println("Errado!");
			}
		}
		if (operacao == 4) {
			x = geradorDeNumeros.nextInt(10);
			y = geradorDeNumeros.nextInt(10);
			System.out.print(x + " / " + y + " = ");
			int resultado = input.nextInt();
			if (resultado == Tabuada.divisao(x, y)) {
				System.out.println("Correto!");
			} else {
				System.out.println("Errado!");
			}
		}

		input.close();

	}
}
