import java.util.Map ;
import java.util.HashMap ;

public class Auteur{
    private String nom;
    private String citationTragedie;
    private int qualiteTragedie;    
    private String citationComedie;
    private int qualiteComedie; 
    private String citationDrame;
    private int qualiteDrame;


    public Auteur(String nom, int qualiteTragedie, String citationTragedie, int qualiteComedie, String citationComedie, int qualiteDrame, String citationDrame){
        this.qualiteTragedie = qualiteTragedie;
        this.citationTragedie = citationTragedie;
        this.qualiteComedie = qualiteComedie;
        this.citationComedie = citationComedie;
        this.qualiteDrame = qualiteDrame;
        this.citationDrame = citationDrame;
        this.nom=nom;

    } 
    public int getQualiteTragedie(){
        return this.qualiteTragedie;
    }

    public String getCitationTragedie(){
        return this.citationTragedie;
    }

    @Override
    public String toString() {
        String s1 = "L'honorable ";
        return s1.concat(this.nom);
    }
}