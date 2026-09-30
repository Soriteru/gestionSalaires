/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class Developpeur extends Employe {
    
    protected String langages;
    
    public Developpeur(String nom, String prenom, int anciennete, String langages){
        super(nom, prenom, anciennete, "Développeur");
        this.langages = langages;
    }
    
    @Override
    public int getSalaire(){
        int prime = 0;
        
        if("java".equalsIgnoreCase(langages)){
            prime = 50;
        } else if("python".equalsIgnoreCase(langages)){
            prime = 70;
        } else if("php".equalsIgnoreCase(langages)){
            prime = 45;
        }
        return (1900+anciennete*100+prime);
    }
}
