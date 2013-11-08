
package Bibliotheque;

import java.util.*;

/**
 *
 * @author Jérôme
 */
public class Bibliotheque {
    private List<Livre> listeLivres = new ArrayList<>(100);
    private int nombreDeLivres;
    public Bibliotheque(){
        nombreDeLivres=0;
    }
    public Bibliotheque(ArrayList<Livre> liste){
        listeLivres=liste;
        nombreDeLivres=liste.size();
    }
    public void addLivre(Livre l){
        listeLivres.add(l);
        nombreDeLivres++;
    }
    @Override
    public String toString(){
        String chaine="";
        for(Livre l:listeLivres)
        {
            chaine += l+"\n";
        }
        return chaine;
    }
    public List<Livre> rechercheParNomAuteur(String nom) throws ExceptionAuteur{
        List<Livre> l= new ArrayList<>();
        for (Livre li : listeLivres)
        {
            if(li.getAuteur().getNom().equals(nom))
                l.add(li);
        }
        if (l.isEmpty())
            throw new ExceptionAuteur("Aucun livre ne correspond à cet auteur");
        else
            return l;
    }
    public Livre rechercheParTitre(String titre) throws ExceptionLivre{
        for(Livre l : listeLivres)
        {
            if(l.getTitre().equals(titre))
                return l;
        }
        throw new ExceptionLivre("Aucun livre ne correspond à votre recherche");
    }
}
