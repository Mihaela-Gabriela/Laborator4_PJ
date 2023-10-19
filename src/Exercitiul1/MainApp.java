package Exercitiul1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {
        int opt;
        Scanner scanner = new Scanner(System.in);
        Scanner scannerFisier=null;
        String denumire;
        int nr_inv;
        float pret;
        magazie zona_mag;
        try {
            scannerFisier = new Scanner(new File("src/Exercitiul1/echipamente.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<Echipament> echipamente = new ArrayList<Echipament>();

        while(scannerFisier.hasNextLine())
        {
            denumire = scanner.nextLine();
            pret = scanner.nextFloat();
            nr_inv=scanner.nextInt();

        }

        do {
            System.out.println("Meniul");
            System.out.println("0. Iesire din program");
            System.out.println("1. Afisarea tuturor echipamentelor");
            System.out.println("2. Afisarea imprimantelor");
            System.out.println("3. Afisarea copiatoarelor");
            System.out.println("4. Afişarea sistemelor de calcul");
            System.out.println("5. Modificarea stării în care se află un echipament");
            System.out.println("6. Setarea unui anumit mod de scriere pentru o imprimantă");
            System.out.println("7. Setarea unui format de copiere pentru copiatoare");
            System.out.println("8. Instalarea unui anumit sistem de operare pe un sistem de calcul");
            System.out.println("9. Afişarea echipamentelor vândute");
            System.out.println("10. Să se realizeze două metode statice pentru serializarea / deserializarea colecției de obiecte în fișierul echip.bin\n");
            System.out.print("Introduceti optiunea dorita: ");

            opt = scanner.nextInt();

            switch (opt)
            {
                case 0:
                    System.out.println("Programul a fost inchis");
                    System.exit(0);
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ati introdus o optiune gresita!");
                    break;
            }

        }while(true);
    }
}