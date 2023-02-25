package br.com.descomplica.live2;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		// declaração das variáveis
		double qtdHoras, valorH, salario;
		try (//entrada:
		Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite a quantidade de horas: ");
			qtdHoras = entrada.nextDouble();
			System.out.println("Digite o valor da hora: ");
			valorH = entrada.nextDouble();
		}
		//processamento:
		salario = qtdHoras * valorH;
		//salario = qtdHoras * valorH++;quando o ++ vem antes ele incrementa 1 e depois faz o cálculo
		//salario = qtdHoras * ++valorH; quando o ++ vem depois ele faz o calculo primeiro e depois incrementa 1   
		//double pot = Math.pow(valorH, 3);
		//saída:
		System.out.println("Salário bruto: R$ " + salario);
		System.out.println("Valor por Hora " + valorH);
		//System.out.println(pot);

	}

}
