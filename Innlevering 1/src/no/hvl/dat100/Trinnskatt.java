package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Trinnskatt {

	public static void main(String[] args) {
		String txtInntekt = showInputDialog("Inntekt?");
		
		double numInntekt = Double.parseDouble(txtInntekt); 
		double trinnSkatt = 0;
		
		if (numInntekt == 0) {
			trinnSkatt = 0;
		}
		else if (numInntekt <= 184800) {
			trinnSkatt = 1.7;
		}
		else if (numInntekt <= 260100) {
			trinnSkatt = 4.0;
		}
		else if (numInntekt <= 651250) {
			trinnSkatt = 13.2;
		}
		else if (numInntekt < 1021550) {
			trinnSkatt = 16.2;
		}
		
		showMessageDialog(null, "Du tjente " + txtInntekt + " kr og betaler " + trinnSkatt + "% trinnskatt");

	}

}
