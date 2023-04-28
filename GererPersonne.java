import java.util.ArrayList;
import java.util.List;
public class GererPersonne {
    
    public List<Personne> personnes =  new ArrayList<Personne>();

    public GererPersonne(){}
    public GererPersonne(List<Personne> personnes){
        this.personnes=personnes;
        
    }

    public  void ajouterPersonne( Personne personne){
        // personne=new Etudiant();
       
        //this.personnes.add(personne); 
        this.personnes.add(personne);
        
        

        
    }

    //supprimer un vehicule
    public  void suppimerPersonne(Personne personne){
        int index=this.personnes.indexOf(personne);
        
        for(int i=0; i<=this.personnes.size();i++){
            if(i==index){
                this.personnes.remove(index);
                System.out.println("personne supprimer"); 
                break;
                 
            }else{
                  System.out.println("Cette personne n'existe pas dans la liste");
            }
            
        }
        
        
    }
  //modifier une liste
   public void modifierPersonne(Personne p1, Personne p2){
    int index=this.personnes.indexOf(p1);
    this.personnes.set(index, p2);

   }
    //afficher Personne
    public void AfficherPersonne(){
        for(Personne p: this.personnes){
           // System.out.println("position :"+ this.personnes.indexOf(p)+" Nom: "+p.getNom().toString());
        
           System.out.println("position :"+ this.personnes.indexOf(p)+" Nom: "+p.getNom().toString()+
           "Prenom: "+p.getPrenom().toString());

        }
        
    }

    //nombres de vehicules totals
    public int nbrePersonnes(){
        return this.personnes.size();

    }
}