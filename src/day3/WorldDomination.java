package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String code = JOptionPane.showInputDialog(null, "Do you know how to write code? Please write all code in lowercase letters and do not put a period.");
		// 2. If they say "yes", tell them they will rule the world.
		if(code.equals("yes")){
			JOptionPane.showMessageDialog(null, "You will rule the world! :)");
		}else
		{
			JOptionPane.showMessageDialog(null, "Good luck washing the dishes. :(");
		}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

