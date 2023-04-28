//Creation d'une interface etudiant

public interface IEtudiant {

    public void AfficherInformations();
    public boolean Ispresent(String present);
}
class Etudiant extends Personne implements IEtudiant {
    
    private String num_etudiant;
    private String domaine_etudes;
    private String[] liste_cours;

    public Etudiant(){}

    public Etudiant(String num_etudiant,String nom,String prenom, int age,
                      Tsexe genre, Tstatut statut, String mail, String telephone){
        super(nom,prenom,age,genre,statut,mail,telephone);
        this.num_etudiant=num_etudiant;
    }

    public void AfficherInformations(){
        System.out.println("Etudiant(e):"+getNom()+" "+getPrenom()+" "+getAge()+" ans");
    }




    public String getNum_etudiant() {
        return num_etudiant;
    }
    public void setNum_etudiant(String num_etudiant) {
        this.num_etudiant = num_etudiant;
    }
    public String getDomaine_etudes() {
        return domaine_etudes;
    }
    public void setDomaine_etudes(String domaine_etudes) {
        this.domaine_etudes = domaine_etudes;
    }
    public String[] getListe_cours() {
        return liste_cours;
    }
    public void setListe_cours(String[] liste_cours) {
        this.liste_cours = liste_cours;
    }
    
   //verifier la presense de l'etudiant
    public boolean Ispresent(String present){
        if(present.equals("oui")) {
            System.out.println("Present(e)");
            return true;
        }else if(present.equals("non")){
            System.out.println("Absent(e)");
            return false;
        }else{
            System.out.println("Faut repondre par oui ou non. Merci!");
        }
        return false;
   }

}