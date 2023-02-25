package br.com.descomplica.live2;

import javax.swing.JOptionPane;

public class Exemplo2 {

	public static void main(String[] args) {
		int idade; //declaração de variáveis:
		//entrada de dados:
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade "));
		//processamento e saída:
		if (idade >= 18) {
			JOptionPane.showMessageDialog(null, "Você tem " + idade +
					" anos, \nportanto é maior de idade");
		} else
			JOptionPane.showMessageDialog(null, "Você tem " + idade +
					" anos, \nportanto é menor de idade");
			

	}

}
