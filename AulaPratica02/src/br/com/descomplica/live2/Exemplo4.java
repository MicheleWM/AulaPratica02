package br.com.descomplica.live2;

import javax.swing.JOptionPane;

public class Exemplo4 {

	public static void main(String[] args) {
		// declaração:
		int nota;
		nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota"));
		//processamento:
		switch(nota) {
		case 5: JOptionPane.showMessageDialog(null, "Otimo");
		break;
		case 4: JOptionPane.showMessageDialog(null, "Muito bom");
		break;
		case 3: JOptionPane.showMessageDialog(null, "Bom");
		break;
		case 2: JOptionPane.showMessageDialog(null, "Regular");
		break;
		case 1: JOptionPane.showMessageDialog(null, "Ruim");
		break;
		default: JOptionPane.showMessageDialog(null, "Nota inválida");
		}

	}

}
