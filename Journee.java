public class Journee{
    private Style matin;
    private Style apresMidi;
    private Style soiree;
    private int nbSpec;

    public Journee(Style matin, Style apresMidi, Style soiree) {
        this.matin = matin;
        this.apresMidi = apresMidi;
        this.soiree = soiree;
    }

    public int scoreJournee( Auteur auteur ){
        return scoreAuteur( auteur, this.matin)+scoreAuteur( auteur,  this.apresMidi)+scoreAuteur( auteur, this.soiree);
    }

    public int scoreAuteur(Auteur auteur, Journee epreuve){
        return auteur.qualiteStyle(epreuve) * this.nbSpec;
    }
}