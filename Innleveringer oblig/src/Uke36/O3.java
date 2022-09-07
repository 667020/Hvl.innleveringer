package Uke36;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O3 {

	public static void main(String[] args) {
		int n = parseInt(showInputDialog("Skriv et tall:"));

		int x = 1;

		int a = n;

		while (n > 1) {
			x *= n;
			n--;
		}
		System.out.println(a + "! = " + x);

	}

}
