package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String best=JOptionPane.showInputDialog("So first how many nickels do you have");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int num=Integer.parseInt(best);
		// Ask the user how many dimes they have, and convert their answer
		String bestq=JOptionPane.showInputDialog("ok so you have "+num+" nickels how many dimes do you have");
		// Ask the user how many quarters they have, and convert their answer
		int num1=Integer.parseInt(bestq);
		// Calculate how much money the user has.  Hint: Use a double variable 
		String besqtq=JOptionPane.showInputDialog("ok so you have "+num+" nickels and "+num1+" dimes ok so how many quaters do you have");
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		int num11=Integer.parseInt(besqtq);
		double money= 0.05*num+num1*0.1+num11*0.25;
		JOptionPane.showMessageDialog(null, "in total you have $"+money+" cool right");
	}
}

