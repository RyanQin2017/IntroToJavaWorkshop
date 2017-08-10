package day3;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your Name.");
		if(name != null){
		JOptionPane.showMessageDialog(null, "Hello " + name);
		}
	}

}
