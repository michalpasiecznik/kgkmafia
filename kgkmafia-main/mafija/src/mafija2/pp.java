package mafija2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class pp {

    public static ArrayList wczytwanie(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ile osób gra: ");
        int liczba_graczy = scan.nextInt();
        ArrayList lista_graczy = new ArrayList(liczba_graczy);
        scan.nextLine();

        for (int i = 0; i < liczba_graczy; i++) {
            System.out.println("Podaj imię: ");
            String name = scan.nextLine();
            lista_graczy.add(name);

            System.out.println("Podaj klasę: ");
            String klasa = scan.nextLine();
            lista_graczy.set(i,name + "|" + klasa);
        }
        return lista_graczy;
    }

    public static void mafia() {
        System.out.println("Budzi się mafia");
        System.out.println("Kogo mafia chce zabić?");
        Scanner scan_mafia = new Scanner(System.in);
        int zabity = scan_mafia.nextInt();
        scan_mafia.nextInt();
    }




    public static void wyświetlanie() throws InterruptedException {
System.out.println(wczytwanie());
    }

    public static void main(String[] args) throws InterruptedException {
wyświetlanie();
    }
}
