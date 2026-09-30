/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author sohan
 */
public class Developpeurexpert extends Developpeur {
    
    public Developpeurexpert(String nom, String prenom, int anciennete, String langages){
        super(nom, prenom, anciennete, langages);
        this.poste = "Développeur expert";
    }
    
    @Override
    public double getSalaire(){
        double salaire = super.getSalaire() * 1.1;
        
        return Math.round(salaire * 10) / 10.0;
    }
}
