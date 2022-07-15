package mafija2;

import java.util.ArrayList;
import java.util.Scanner;

public class app {
    public static void main(String[] args) throws InterruptedException {

        /////////////Wczytanie///////////////
        Scanner scan = new Scanner(System.in);
        System.out.println("Ile debili gra: ");
        int q = scan.nextInt();
        scan.nextLine();
        ArrayList listGlowna = new ArrayList();
        ArrayList list = new ArrayList();

        //////////////imiona osob///////////////////
        for (int i = 0; i < q; i++) {
            System.out.println("Podaj imiona: ");
            String name = scan.nextLine();
            listGlowna.add(name);
            list.add(name);
        }
        for (int z = 0; z < q; z++) {
            System.out.println("nr " + z + " " + listGlowna.get(z));
        }

        int l=1;
        while(l==1) {

            //
            System.out.println("NOC");
            System.out.println("NOC");
            System.out.println("NOC");
            //

            Thread.sleep(2000); // czekajka

            //MAFIA
            System.out.println("Budzi się mafia");
            System.out.println("Podaj numerki mafii: ");
            Scanner scan4 = new Scanner(System.in);
            int name_mafia = scan.nextInt();
            list.set(name_mafia, listGlowna.get(name_mafia) + " mafia");


            System.out.println("Kogo mafia chce zabić?");
            Scanner scan2 = new Scanner(System.in);
            int name_zabitego = scan.nextInt();
            list.set(name_zabitego, listGlowna.get(name_zabitego) + " umarty");
            for (int z = 0; z < q; z++) {
                System.out.println("nr " + z + " " + list.get(z));
            }

            Thread.sleep(2000); // czekajka


            //OCHRONIARZ
            System.out.println("Kogo ochroniarz chce ochronić?");
            Scanner scan3 = new Scanner(System.in);
            int name_ochronionego = scan.nextInt();
            list.set(name_ochronionego, listGlowna.get(name_ochronionego));
            for (int z = 0; z < q; z++) {
                System.out.println("nr " + z + " " + list.get(z));
            }

            //KOMISARZ
            System.out.println("Kogo komisarz chce sprawdzić?");
            Scanner scan5 = new Scanner(System.in);
            int name_sprawdzanego = scan.nextInt();
            System.out.println(list.get(name_sprawdzanego));

            Thread.sleep(2000); // czekajka

            System.out.println("DZIEŃ");
            System.out.println("DZIEŃ");
            System.out.println("DZIEŃ");

        }
    }
}
