
//Filewriter and Printwriter implementation in Java
import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) throws IOException {
		Record rec = new Record();
		int userChoice = 1;
		
		//creates the file
		File f = new File("C:/Test/Test.txt");
		
		//creates the objects to write to file
		FileWriter fw = new FileWriter(f, true);
		PrintWriter output = new PrintWriter(fw);
		
		Scanner keyboard = new Scanner(System.in);

		//gets the employee information and appends to the file
		do {
			System.out.println("Please enter the employee name: ");

			keyboard = new Scanner(System.in);
			String name = keyboard.nextLine();

			System.out.println("Please enter the employee id: ");


			int id = keyboard.nextInt();

			output.println(rec.userInput(name, id));
			System.out.println("Would you like to enter more employees to the system? ");
			System.out.println("1 for yes, 2 for no");
			if (keyboard.nextInt() == 2) {
				userChoice = 2;
			}
			System.out.println("Writing the employee info to your file");
		}

		while (userChoice == 1);

		output.close();

	}
}
