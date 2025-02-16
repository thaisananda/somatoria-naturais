package Ex01;

import javax.swing.*;

import controller.SomatoriaNaturais;

public class Exercicio01 {
	
	public static void main (String[] args) {
		
		SomatoriaNaturais soma = new SomatoriaNaturais();
		
		int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		N = soma.somatoria(N);
		
        System.out.println(N);
 }
}	
