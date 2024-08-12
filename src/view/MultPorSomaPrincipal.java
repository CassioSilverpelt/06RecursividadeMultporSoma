package view;

import controller.MultPorSomaController;
import javax.swing.JOptionPane;

public class MultPorSomaPrincipal {
	public static void main (String[] args) {
		MultPorSomaController mulCon = new MultPorSomaController();
		int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número: "));
		
		System.out.println(mulCon.multPorSoma(a, b));
	}
}
