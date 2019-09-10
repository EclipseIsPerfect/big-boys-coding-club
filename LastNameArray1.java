package wood.ryan;

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class LastNameArray1 {
	public static LastNameArray1 b = new LastNameArray1();

	// Global array
	public static int[] globalArray = new int[10];
	public static Scanner scanner = new Scanner(System.in);
	public static NumberFormat decimal = new DecimalFormat("#0.00");

	// Method initializes the array to have -1 in all places
	public int[] InitializeArray() {
		int[] initializeArray = globalArray;
		for (int i = 0; i < initializeArray.length; i++) {
			initializeArray[i] = -1;
		}
		return initializeArray;
	}

	// Method takes ten numbers from the user and writes them to the array
	public int[] EnterFromKeyboard() {

		// Uses the initializes array with -1 at all indexes
		int[] array = InitializeArray();
		System.out.println("Enter 10 random numbers: ");

		// Loops through the array and writes over with the new user numbers
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		// Returns the array
		return array;
	}

	// Method displays the array to the user
	public void DisplayArray() {
		System.out.println("The array looks like this: ");

		// Loops through the array, outputting each index to the console
		for (int i = 0; i < globalArray.length; i++) {
			System.out.print(globalArray[i] + " ");
		}
	}

	// Method finds the sum of all the numbers contained in the array
	public void SumOfArray() {
		int sum = 0;

		// Adds all the numbers within the array to a variable
		for (int i = 0; i < globalArray.length; i++) {
			sum += globalArray[i];
		}

		// Output the variable
		System.out.println("The sum of the array is: " + sum);
	}

	// Method averages all the numbers in the array
	public void AverageOfArray() {
		double average = 0;

		// Adds all the numbers contained within the array to a variable
		for (int i = 0; i < globalArray.length; i++) {
			average += globalArray[i];
		}

		// Divides the variable by the length of the array, and formats it to 1 decimal
		// place
		System.out.println("The average of the array is: " + decimal.format(average /= globalArray.length));
	}

	// Method matches a user-inputted number to any numbers within the array
	public void SearchArray() {
		boolean found = false;
		System.out.println("Enter number to search for: ");
		int request = scanner.nextInt();
		System.out.println("Number is found ");

		// For loop which searches the array one by one for matches to request number
		for (int i = 0; i < globalArray.length; i++) {

			// If the request number matches a number contained within the array, print the
			// index of the number
			if (globalArray[i] == request) {
				System.out.print("index " + i + ", ");
				found = true;
			}
		}
		// If the request number is not found, let the user know it isn't contained
		// anywhere
		if (found == false) {
			System.out.print("nowhere.");
		}

	}

	public static void main(String[] args) {
		boolean exit = false;
		b.InitializeArray();
		// Sets the value of the global array to the array the user made
		

		// Program loops so long as boolean 'exit' is not true
		while (exit == false) {
			System.out.println("\n\nDisplay Array - 1" + "\nSum of the Array - 2" + "\nAverage of the Array - 3"
					+ "\nSearch for a number - 4" + "\nEnter new Numbers - 5" + "\nExit - 0");
			int choice = scanner.nextInt();

			// Menu for selection of each method, and exit of the program
			switch (choice) {
			case 1:
				b.DisplayArray();
				break;

			case 2:
				b.SumOfArray();
				break;

			case 3:
				b.AverageOfArray();
				break;

			case 4:
				b.SearchArray();
				break;

			case 5:
				b.EnterFromKeyboard();
				break;

			case 0:
				exit = true;
				break;

			default:
				System.out.println("Error - Invalid selection.");
				break;
			}
		}
	}
}