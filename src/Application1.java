import Bibliotheque.Personne;
import Bibliotheque.Livre;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;

/**
 *
 * @author Jérôme
 * @author Ludovic
 */
public class Application1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception, ClassNotFoundException {
        Personne a = new Personne("Radis","Jean",1652);
        Livre l = new Livre("Blanc",520,a);
        System.out.println(a);
        System.out.println(l);
        a.setNumPers(5);
        a.setNomPers("Carotte");
        a.setPrenomPers("Jacques");
        a.setAnNaissance(2000);
        a.getNumero();
        a.getNom();
        a.getPrenom();
        a.getAnNaissance();
        a.getDernierNum();
        
        l.getNumLivre();
        l.getTitre();
        l.getNbreDePages();
        l.getAuteur();
        l.setNumLivre(6);
        l.setTitre("Blanc comme neige");
        l.setAuteur(a);
        l.setNombreDePages(650);
        
        String nomFic="./FLivre";
        File f1 = new File(nomFic);
        
        //Création du flux
        FileOutputStream fo = new FileOutputStream(f1);
        ObjectOutputStream foObj = new ObjectOutputStream(fo);
        foObj.writeObject(f1);
                
    }
}
