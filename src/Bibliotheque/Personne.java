

package Bibliotheque;

import java.io.*;

/**
 *
 * @author Jérôme
 */
public class Personne implements Serializable {
    private int numeroPers;
    private String nomPers;
    private String prenomPers;
    private int anNaissance;
    private static int dernierNumero=0;
    
    public Personne(String nom,String prenom, int an){
        dernierNumero++;
        numeroPers=dernierNumero;
        nomPers=nom;
        prenomPers=prenom;
        anNaissance=an;
    }
    public int getNumero(){
        return numeroPers;
    }
    public String getNom(){
        return nomPers;
    }
    public String getPrenom(){
            return prenomPers;
    }
    public int getAnNaissance(){
        return anNaissance;
    }
    public int getDernierNum(){
        return dernierNumero;
    }
    public void setNumPers(int num){
        numeroPers=num;
    }
    public void setNomPers(String nom){
        nomPers=nom;
    }
    public void setPrenomPers(String pnom){
        prenomPers=pnom;
    }
    public void setAnNaissance(int an){
        anNaissance=an;
    }
    @Override
    public String toString(){
        return " Numéro : "+numeroPers+"\n Nom : "+nomPers+"\n Prénom : "+prenomPers+"\n Année naissance : "+anNaissance;
    }
   
}
