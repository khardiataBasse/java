package universite;

public interface IProfesseur {

    public void AfficherInfos();

}

class Professeur extends Personne implements IProfesseur{

    private static String university="Golden Collar";
    private String course;
    public Professeur(String nom, String prenom, int age, String course){
        super(nom,prenom,age);
         this.course=course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public static String getUniversity() {
        return university;
    }

    @Override
    public void AfficherInfos() {
        System.out.println(getNom()+" "+getPrenom()+" "+getAge()+"ans prof de "+getCourse()+" "+getUniversity());
    }
}
