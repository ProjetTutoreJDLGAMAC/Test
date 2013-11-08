/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Emprunt;

import Bibliotheque.Livre;
import Bibliotheque.Personne;
import java.io.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Jérôme
 * @see Bibliotheque
 * @see java.io.FileInputStream
 * @see java.io.ObjectInputStream
 */
public class Application2 {
    public static void main(String[] args) throws Exception, ClassNotFoundException {
        String nomFic="./FLivre";
        File f1 = new File(nomFic);
     
        FileInputStream fi = new FileInputStream(f1);
        ObjectInputStream fiObj = new ObjectInputStream(fi);
        
        //Lecture du fichier
        System.out.println("Lecture du livre : \n"+(Livre)fiObj.readObject());
        
        Personne p1 = new Personne("Gianotti","Ludovic",0);
        Personne p2 = new Personne("Proust","Marcel",1895);
    }    
}
