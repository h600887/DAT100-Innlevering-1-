package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Karakterer {

	public static void main(String[] args) {

		for (int studentnummer = 1; studentnummer <= 10; studentnummer++) {

			String txtPoeng = showInputDialog("Kor mange poeng");
			int numPoeng = Integer.parseInt(txtPoeng);
			String karakter = " ";

			if (numPoeng > 0 && numPoeng <= 39) {
				karakter = "F";
			} else if (numPoeng > 39 && numPoeng <= 49) {
				karakter = "E";
			} else if (numPoeng > 49 && numPoeng <= 59) {
				karakter = "D";
			} else if (numPoeng > 59 && numPoeng <= 79) {
				karakter = "C";
			} else if (numPoeng > 79 && numPoeng <= 89) {
				karakter = "B";
			} else if (numPoeng > 89 && numPoeng <= 100) {
				karakter = "A";
			} else {
				studentnummer--;
				karakter = "Ugyldig";
			}

			if (karakter == "Ugyldig") {
				System.out.println("Ugyldig karakter. Skriv inn på nytt");
			} else {
				System.out.println(
						"Student " + studentnummer + " fekk " + txtPoeng + " poeng og fekk karakteren " + karakter + ".");
			}

		}

	}
}
