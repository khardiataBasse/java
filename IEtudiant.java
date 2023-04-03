package universite;

public interface IEtudiant {

    public void AfficherInformations();
    public boolean Ispresent(String present);
}
class Etudiant extends Personne implements IEtudiant {

    public Etudiant(String nom,String prenom, int age){
        super(nom,prenom,age);
    }

    public void AfficherInformations(){
        System.out.println("Etudiant(e):"+getNom()+" "+getPrenom()+" "+getAge()+" ans");
    }

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