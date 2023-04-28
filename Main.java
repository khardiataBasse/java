public class Main {

    public static void main(String[] args) {
        //etudiants
        Personne e1=new Etudiant("2023E28","Basse", "khardiatou", 20, Tsexe.Feminin, Tstatut.marié, "test@gmail.com", "07345678");
        Personne e2=new Etudiant("2023Z67","Basse", "test0", 20, Tsexe.M, Tstatut.marié, "test0@gmail.com", "07345678");
        

        //Professeur
        Personne p=new Professeur("test", "test1", 33, Tsexe.F,Tstatut.Celibataire, "test1@gmail.com", "5678909", "MATHS");

      //Prospect
        Prospect pr=new Prospect("prospect", "test", 0, null, null, null, null);

        //Afficher les informations de l'etudiant
        // e1.AfficherInformations();

        GererPersonne g=new GererPersonne();
        //Ajouter des personnes dans la liste
        g.ajouterPersonne(e1);
        g.ajouterPersonne(p);
        //g.ajouterPersonne(pr);
        
        //Afficher des personnes
        System.out.println("**************** Listes des Personnes avant supression *********");
        g.AfficherPersonne();

        //Supprimer une personne
        g.suppimerPersonne(pr);
        System.out.println("**************** Listes des Personnes apres supression *********");
        g.AfficherPersonne();

        //modifier les infos d'une personne

        g.modifierPersonne(e1, e2);
        System.out.println("**************** Listes des Personnes avec modification *********");


        g.AfficherPersonne();
        

      //le nombre de personnes
      System.out.println("Le nombre de personne dans la liste"+g.nbrePersonnes());
       
    }
    
}
