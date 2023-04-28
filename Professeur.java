public class Professeur extends Personne{

    private static String universite="Golden Collar";
          private String course;
    public Professeur(String nom, String prenom,int age,
                Tsexe genre, Tstatut statut, String mail, String telephone, String course){
        super(nom,prenom,age,genre,statut,mail,telephone);
        this.course=course;

    }


    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public static String getUniversite() {
        return universite;
    }


    public void AfficherInfos() {
        System.out.println(getNom()+" "+getPrenom()+" "+getAge()+"ans prof de "+getCourse()+" "+getUniversite());
    }
         
}
