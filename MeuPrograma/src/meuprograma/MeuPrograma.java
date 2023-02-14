/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprograma;

/**
 *
 * @author Unicesumar
 */
import javax.swing.JOptionPane;

public class MeuPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println ("Hello word");
        System.out.println ("Minha primeira aplicação em Java");
        
        System.out.println ("Quero tornar um grande programador, trabalhar como freelancer etc!");
        
        String nome = null;
        nome =JOptionPane.showInputDialog("Qual é o seu nome por favor?");
        
        
        String sobrenome = null;
        sobrenome =JOptionPane.showInputDialog("Qual é o seu sobrenome por favor?");
        
        JOptionPane.showConfirmDialog(null, "O seu nome completo é " +nome+ " " +sobrenome);
        
        System.out.println ("Bom dia " +nome +" "+sobrenome);
        
        int idade_fed = 20 + 2;
        System.out.println (idade_fed);
        
        int divisão = 6 / 2;
        System.out.println (divisão);
        
        // Idade dos meus amiginhos
        int idade_maria = idade_fed * 2;
        System.out.println ("Idade Maria :" +idade_maria);
        
        int idade_joão = idade_maria  - 10;
        System.out.println ("Idade João :" +idade_joão);
        
        
    }
    
}
