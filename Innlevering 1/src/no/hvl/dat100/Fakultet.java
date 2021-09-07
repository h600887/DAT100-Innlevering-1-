package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Fakultet {
	
	public static void main(String[] args) {
		String txtNummer = showInputDialog("Skriv inn nummer");
		int n = Integer.parseInt(txtNummer);
		int i = 1;
		int fakultet = 1;
		
		for(i=1; i <= n; i++) {
			fakultet = fakultet * i;
		}
		
		System.out.println("Ditt nummer: " + n + "\n" + "Fakultet: " + fakultet);
	}

}
