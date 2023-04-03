package universite;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principale {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String present;
       // Date date = null;
        System.out.println("Test de la classe etudiante");
        Etudiant E1 = new Etudiant("Basse", "Khardiatou", 23);
        E1.AfficherInformations();
        System.out.println("l'etudiant est-il present?oui ou non?");
        do {
            System.out.println("Vous devez repondre par oui ou non");
            present = sc.next();
        } while (!present.equals("oui") && !present.equals("non"));
         E1.Ispresent(present);

         System.out.println("Test de la classe professeur");
         Professeur p=new Professeur("jean","jack", 32, "pc");
              p.AfficherInfos();

         System.out.println("Test de la classe directeur");
          //Test de la fonction rendez pour le directeur
         /* System.out.println("renseigner la date du rendez-vous");
             String daterv = sc.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                date = dateFormat.parse(daterv);
            } catch (ParseException e) {
                 e.printStackTrace();
            }*/
         Directeur d=new Directeur("Basse", "khardiatou",21);
                d.AfficherDetails();
           //d.RDV(date);
    }
}
