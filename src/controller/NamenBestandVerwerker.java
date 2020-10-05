package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class NamenBestandVerwerker {

    public static void main(String[] args) {


        String bestandsnaam = "resources/9.2 GesorteerdeNamenOrigineel.txt";
//        System.out.println(telNamenBestand(bestandsnaam));

        ArrayList<String> namenLijst = leesNamenBestand(bestandsnaam);
        System.out.println(namenLijst);

    }


    public static void voegNaamToeAanGesorteerdeLijst (String naam, ArrayList<String> lijst) {

    }

    public static ArrayList<String> leesNamenBestand(String bestandsnaam) {
        File inputbestand = new File(bestandsnaam);
        Scanner invoer = null;
        ArrayList<String> namen = new ArrayList<>();

        try {
            invoer = new Scanner(inputbestand);
            while (invoer.hasNextLine()) {
                namen.add((invoer.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Bestand niet gevonden");
        } finally {
            if (invoer != null) {
                invoer.close();
            }
        }
        return namen;
    }

    public static int telNamenBestand(String bestandsnaam) {
        File inputbestand = new File(bestandsnaam);
        Scanner invoer = null;
        int teller = 0;

        try {
            invoer = new Scanner(inputbestand);
            while (invoer.hasNext()) {
                invoer.next();
                teller++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Bestand niet gevonden");
        } finally {
            if (invoer != null) {
                invoer.close();
            }
        }
        return teller;
    }
}
