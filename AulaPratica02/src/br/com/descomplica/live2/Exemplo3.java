package br.com.descomplica.live2;

import javax.swing.JOptionPane;

public class Exemplo3 {

	public static void main(String[] args) {
		// declaração da variável:
		int idade;
		// entrada de dados:
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		// processamento de saída:
		if (idade >= 18) {
			JOptionPane.showMessageDialog(null, "Você pode votar e dirigir");
		} else if (idade >= 16) {
			JOptionPane.showMessageDialog(null, "Você pode votar, mas não pode dirigir");
		} else {
			JOptionPane.showMessageDialog(null, "Você não pode votar nem dirigir");
		}
	}

}
