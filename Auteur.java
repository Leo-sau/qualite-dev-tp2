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

    public int getQualiteComedie(){
        return this.qualiteComedie;
    }

    public String getCitationComedie(){
        return this.citationComedie;
    }

    public int getQualiteDrame(){
        return this.qualiteDrame;
    }

    public String getCitationDrame(){
        return this.citationDrame;
    }

    public String pointFort() {
        if (this.qualiteComedie>this.qualiteDrame && this.qualiteComedie>this.qualiteTragedie) {
            return Style.COMÉDIE.toString();
        }
        else if (this.qualiteTragedie>this.qualiteDrame && this.qualiteComedie<this.qualiteTragedie) {
            return Style.TRAGÉDIE.toString();
        }
        else {
            return Style.DRAME.toString();
        }
    }

    public int qualiteStyle(Style s) {
        if(s== Style.COMÉDIE) {
            return this.qualiteComedie;
        }
        else if (s== Style.TRAGÉDIE) {
            return this.qualiteTragedie;
        }
        else {
            return this.qualiteDrame;
        }
    }
    public String citationStyle(Style s) {
        if(s== Style.COMÉDIE) {
            return this.citationComedie;
        }
        else if (s== Style.TRAGÉDIE) {
            return this.citationTragedie;
        }
        else {
            return this.citationDrame;
        }
    }
    @Override
    public String toString() {
        String s1 = "L'honorable ";
        return s1.concat(this.nom);
    }
}