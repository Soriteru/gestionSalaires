/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author sohan
 */
public abstract class Employe {
   protected String nom;
   protected String prenom;
   protected int anciennete;
   protected String poste;

    public Employe(String nom, String prenom, int anciennete, String poste) {
        this.poste= poste;
        this.nom = nom;
        this.prenom = prenom;
        this.anciennete = anciennete;
    }
    
    public abstract int getSalaire();
    
    public String getDescription(){
        return nom+" "+prenom+" est "+poste+" depuis "+anciennete+" ans et gagne "+getSalaire()+" €.";
    }
}
