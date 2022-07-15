package mafija;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quantity {


	public static void openFile(int a) throws FileNotFoundException {

		String fileName = "lista.txt";
		File textFile = new File(fileName);
		Scanner in = new Scanner(textFile);
		
		for (int i = 0; i < a; i++) {
			String line = in.nextLine();
			System.out.println(line);
		}
	}
}
