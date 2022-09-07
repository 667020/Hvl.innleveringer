package Uke36;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O1 {

	public static void main(String[] args) {
		// Input

		double brutto = parseInt(showInputDialog("Skriv inn bruttoinntekt: "));
		String ut = "Du skal betale ";

		// Beregning

		double trinn1 = (brutto * 1.7) / 100;
		double trinn2 = (brutto * 4.0) / 100;
		double trinn3 = (brutto * 13.4) / 100;
		double trinn4 = (brutto * 16.4) / 100;
		double trinn5 = (brutto * 17.4) / 100;
		
		// 
		if (brutto <= 190349) {
			ut += "0 kr i skatt";
		} else if (brutto >= 190350 && brutto <= 267899) { // trinn1
			ut += trinn1 + " kr i skatt";
		} else if (brutto >= 267900 && brutto <= 643799) { // trinn2
			ut += trinn2 + " kr i skatt";
		} else if (brutto >= 643800 && brutto <= 969199) { // trinn3
			ut += trinn3 + " kr i skatt";
		} else if (brutto >= 969200 && brutto <= 1999999) { // trinn4
			ut += trinn4 + " kr i skatt";
		} else if (brutto >= 2000000) { // trinn5
			ut += trinn5 + " kr i skatt";
		} else if (brutto < 0) {
			ut = "Feil, beløp må være 0 eller mer.";
		}

		System.out.println(ut);
	}


	}

}
