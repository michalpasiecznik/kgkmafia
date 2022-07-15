package mafija;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App extends Quantity {

	public static void main(String[] args) throws FileNotFoundException {
		/////////////Wczytanie///////////////
		Scanner scan = new Scanner(System.in);
		System.out.println("Ile debili gra: ");
		int q = scan.nextInt();
		openFile(q);
		
		scan.nextLine();

		//////////////nr osob///////////////////
		for(int i = 0; i < q; i++) {
			System.out.println("Funkcja osoby nr: " + (i+1));
			ArrayList list = new ArrayList();
			String name = scan.nextLine();
			list.add(name);
		}
	}

}
