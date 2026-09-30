/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author sohan
 */
public class Administratif extends Employe {
    
    public Administratif(String nom, String prenom, int anciennete){
        super(nom, prenom, anciennete, "Administratif");
    }
    
    @Override
    public double getSalaire(){
        return (1900);
    }
}
