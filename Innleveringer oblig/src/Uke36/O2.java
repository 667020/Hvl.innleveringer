package Uke36;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O2 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {

			int poeng = parseInt(showInputDialog("Skriv oppnådd poengsum på prøve: ")); // Input Poengsum

			String ut = "Du fikk ";

			if (poeng <= 100 && poeng >= 90) {
				ut += "A";
			} else if (poeng <= 89 && poeng >= 80) {
				ut += "B";
			} else if (poeng <= 79 && poeng >= 60) {
				ut += "C";
			} else if (poeng <= 59 && poeng >= 50) {
				ut += "D";
			} else if (poeng <= 49 && poeng >= 40) {
				ut += "E";
			} else if (poeng <= 39 && poeng >= 0) {
				ut += "F";
			} else {
				ut = "Feil! Poengsum må være mellom 0 og 100, prøv igjen.";
				i = i - 1;
			}

			System.out.println(ut);

		}
	}

}
