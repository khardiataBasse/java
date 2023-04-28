
public class Personne {
    
    
    private String nom;
    private String prenom;
    private int age;
    private Tsexe genre;
    private Tstatut statut;
    private String mail;
    private String telephone;


    public Personne(){}
    public Personne(String nom, String prenom, int age,
                    Tsexe genre, Tstatut statut, String mail, String telephone){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
        this.genre=genre;
        this.statut=statut;
        this.mail=mail;
        this.telephone=telephone;
    }
    //nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
        //prenom
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
     //age
    public int getAge() {
        return age;
    }
     
    public void setAge(int age) {
        this.age = age;
    }
    //statut
    public Tstatut getStatut(){
        return statut;
    }
    public void setStatut(Tstatut statut){
        this.statut=statut;
    }

    //genre
    public Tsexe getGenre(){
        return genre;
    }
    public void setGenre(Tsexe genre){
        this.genre=genre;
    }
    //mail
    public String getMail(){
        return mail;
    }
    public void setMail(String mail){
        this.mail=mail;
    }
    //telephone
    public String getTelephone(){
        return telephone;
    }
    public void setTelephone(String telephone){
        this.telephone=telephone;
    }

   
}
