package com.skilldistillery;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nWelcome to our Automatic Checkout!");
		System.out.print("\n\tPlease enter the total price amount: ");
		double price = sc.nextDouble();
		System.out.print("\n\tPlease enter how much money is being tendered: ");
		double payment = sc.nextDouble();

		sc.close();
		// Here we are going to convert our double variables
		// into int (by * 100) to avoid decimals being lost by Java
		int price2 = (int) (price * 100);
		int payment2 = (int) (payment * 100);
		int changeLeftover = (payment2 - price2);

		// These are our 3 message options for 1)payment made, 2)ERROR, and 3)correct
		// change
		if (payment > price) {
			System.out.print("\n\tThe correct change is: \n");
		} else if (payment < price) {
			System.out.println("\n\t\tERROR: Insufficient funds. Program terminating");
		} else if (payment == price) {
			System.out.println("\n\t\tThe correct payment has been made. Thank you.");
		}
		// Used while loops to be able to "continue" to ensure
		// only applicable change denominations are printed
		while (changeLeftover >= 2000) {
			int num20Bills = changeLeftover / 2000;
			changeLeftover = changeLeftover % 2000;
			if (num20Bills >= 2) {
				System.out.print("\n\t\t" + num20Bills + " twenty dollar bills ");
			} else {
				System.out.print("\n\t\t" + num20Bills + " twenty dollar bill ");
			} // Just used if / else statements so the console can
				// print out the differences between having several of the same
				// change denomination versus just a singular bill / coin
			if (changeLeftover < 2000) {
				continue;
			}
		}
		while (changeLeftover >= 1000) {
			int num10Bills = changeLeftover / 1000;
			changeLeftover = changeLeftover % 1000;
			if (num10Bills >= 2) {
				System.out.print("\n\t\t" + num10Bills + " ten dollar bills");
			} else {
				System.out.print("\n\t\t" + num10Bills + " ten dollar bill ");
			}
			if (changeLeftover < 1000) {
				continue;
			}
		}
		while (changeLeftover >= 500) {
			int num5Bills = changeLeftover / 500;
			changeLeftover = changeLeftover % 500;
			if (num5Bills >= 2) {
				System.out.print("\n\t\t" + num5Bills + " five dollar bills ");
			} else {
				System.out.print("\n\t\t" + num5Bills + " five dollar bill ");
			}
			if (changeLeftover < 500) {
				continue;
			}
		}
		while (changeLeftover >= 100) {
			int num1Bills = changeLeftover / 100;
			changeLeftover = changeLeftover % 100;
			if (num1Bills >= 2) {
				System.out.print("\n\t\t" + num1Bills + " one dollar bills ");
			} else {
				System.out.print("\n\t\t" + num1Bills + " one dollar bill ");
			}
			if (changeLeftover < 100) {
				continue;
			}
		}
		while (changeLeftover >= 25) {
			int numQuarters = changeLeftover / 25;
			changeLeftover = changeLeftover % 25;
			if (numQuarters >= 2) {
				System.out.print("\n\t\t" + numQuarters + " quarters ");
			} else {
				System.out.print("\n\t\t" + numQuarters + " quarter ");
			}
			if (changeLeftover < 25) {
				continue;
			}
		}
		while (changeLeftover >= 10) {
			int numDimes = changeLeftover / 10;
			changeLeftover = changeLeftover % 10;
			if (numDimes >= 2) {
				System.out.print("\n\t\t" + numDimes + " dimes ");
			} else {
				System.out.print("\n\t\t" + numDimes + " dime ");
			}
			if (changeLeftover < 10) {
				continue;
			}
		}
		while (changeLeftover >= 5) {
			int numNickels = changeLeftover / 5;
			changeLeftover = changeLeftover % 5;
			if (numNickels >= 2) {
				System.out.print("\n\t\t" + numNickels + " nickels ");
			} else {
				System.out.print("\n\t\t" + numNickels + " nickel ");
			}
			if (changeLeftover < 5) {
				continue;
			}
		} // No need for a while loop with pennies since its our
			// lowest denomination
		int numPennies = changeLeftover;
		if (numPennies >= 2) {
			System.out.print("\n\t\t" + (int) numPennies + " pennies");
		} else if (numPennies == 1) {
			System.out.print("\n\t\t" + (int) numPennies + " penny");
		}

	}
}
