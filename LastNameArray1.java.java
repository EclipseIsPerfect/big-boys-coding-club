import java.text.NumberFormat;
import java.util.Scanner;

public class LastNameArray1 {

	public static int[] array1 = new int[10];

	public static Scanner input1 = new Scanner(System.in);

	public static NumberFormat decimal = NumberFormat.getNumberInstance();

	public static void main(String[] args) {

		initializeArray();
		
		int select = 0;

		//menu
		
		while (select != -1) {

			System.out.println("Enter From Keyboard 1\n");

			System.out.println("Display Array 2\n");

			System.out.println("Sum 3\n");

			System.out.println("Average 4\n");

			System.out.println("Search 5\n");

			System.out.println("Min or Max 6\n");

			System.out.println("Exit -1");

			select = input1.nextInt();

			switch (select) {

			case 1:

				enterFromKeyboard();

				break;

			case 2:

				displayArray();

				break;

			case 3:

				sum();

				break;

			case 4:

				average();

				break;

			case 5:

				search();

				break;

			case 6:

				minMax();

				break;
			}

		}

	}

	public static void initializeArray() {

		//loops until array is only -1
		
		for (int i = 0; i < array1.length; i++) {

			array1[i] = -1;

		}

	}

	public static void enterFromKeyboard() {

		//Loops until a number has been entered for each element
		
		for (int i = 0; i < array1.length; i++) {

			System.out.println("Enter element " + i);

			array1[i] = input1.nextInt();

		}

	}

	public static void displayArray() {

		//loops until each element of the array has been displayed
		
		for (int i = 0; i < array1.length; i++) {

			System.out.print(array1[i] + " ");

		}

		System.out.println(" ");

		System.out.println(" ");

	}

	public static void sum() {

		int sum = 0;

		//adds all elements of the array
		
		for (int i = 0; i < array1.length; i++) {
			sum = sum + array1[i];
		}

		System.out.println(sum);

	}

	public static void average() {

		double sum = 0, average = 0;

		//finds average of the array
		
		for (int i = 0; i < array1.length; i++) {

			sum = sum + array1[i];

		}

		average = sum / array1.length;

		System.out.println(decimal.format(average));

	}

	public static void search() {

		int number = 0, test = 0;

		System.out.println("Enter number you want found");

		number = input1.nextInt();

		//test to see if the number entered is in the array
		
		for (int i = 0; i < array1.length; i++) {

			if (array1[i] == number) {
				test = 1;
			}

		}
		
		//finds the number
		
		if(test == 1) {
			for (int i = 0; i < array1.length; i++) {

				if (array1[i] == number) {

					System.out.println(number + " is in position " + i + " in the array");

				}

			}
		
		}else{
			
			System.out.println("Number is not found");
		
		}
	}
	
	public static void minMax() {

		int select, num = 0;

		System.out.println("Find the Min 1 or Max 2");

		select = input1.nextInt();

		//choice between minimum or max
		
		//find minimum
		
		if (select == 1) {

			num = array1[0];

			for (int i = 1; i < array1.length; i++) {

				if (array1[i] < num) {

					num = array1[i];

				}

			}

			System.out.println("The minimum number in the array is " + num);

		} else {

			//find max
			
			num = array1[0];

			for (int i = 1; i < array1.length; i++) {

				if (array1[i] > num) {

					num = array1[i];

				}

			}

			System.out.println("The maximum number in the array is " + num);
		}

	}

}