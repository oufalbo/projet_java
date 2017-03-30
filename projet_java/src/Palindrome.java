/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author The ONS
 */
import java.util.Scanner;
public class Palindrome {
     public static void main(String[] args ){
            
        String renverse= "";
       
 
        Scanner st = new Scanner(System.in);
          System.out.println("veuillez entrer un mot:");
        String n = st.nextLine();
        for(int i=n.length()-1;i>=0;i--) {
            renverse = renverse + n.charAt(i);
        }
        if(n.equals(renverse)){
            
                      System.out.println("ce mot est un palindrome");
            }
        else{System.out.println("ce mot n'est pas un palindrome");
        }   
    } 
    

}
