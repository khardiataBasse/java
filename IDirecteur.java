package universite;

import java.util.Date;

public interface IDirecteur {

    public void AfficherDetails();
    public void RDV(Date date_rdv);
}


class Directeur extends Personne implements IDirecteur{
    public Directeur(){};
    public Directeur(String nom,String prenom, int age){
        super(nom,prenom,age);
    }

    public void AfficherDetails(){
        System.out.println("Mr(Mme) le directeur "+getNom()+" "+getPrenom()+ " " +getAge()+" ans");
    }
    public void RDV(Date date_rdv){
        System.out.println("vous avez rendez-vous le "+date_rdv);
    }

}