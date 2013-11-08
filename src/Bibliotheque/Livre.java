
package Bibliotheque;

import java.io.*;

/**
 *
 * @author Jérôme
 */
public class Livre implements Serializable{
    private int numLivre;
    private String titre;
    private int nombreDePages;
    private Personne auteur;
    private static int dernierNum=0;
    
    public Livre(String title, int nb, Personne aut){
        dernierNum++;
        nombreDePages=nb;
        titre=title;
        auteur=aut;
        numLivre=dernierNum;
    }
    public int getNumLivre(){
        return numLivre;
    }
    public String getTitre(){
        return titre;
    }
    public int getNbreDePages(){
        return nombreDePages;
    }
    public Personne getAuteur(){
        return auteur;
    }
    public void setNumLivre(int num){
        numLivre=num;
    }
    public void setTitre(String title){
        titre=title;
    }
    public void setAuteur(Personne aut){
        auteur=aut;
    }
    public void setNombreDePages(int nb){
        nombreDePages=nb;
    }
    @Override
    public String toString(){
        return " Numero de livre : "+numLivre+"\n Titre : "+titre+"\n Nombre de Pages : "+nombreDePages+"\n Auteur : "+auteur.getNom()+" "+auteur.getPrenom();
    }
    
     private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
    {
        in.defaultReadObject();
        dernierNum=in.readInt();
    }
    
    private void writeObject(ObjectOutputStream out) throws IOException
    {
        out.defaultWriteObject();
        out.writeInt(dernierNum);
    }
}
