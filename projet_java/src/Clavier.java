
import java.util.Scanner;

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
public class Clavier {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[]tab = { 12, 15, 13, 10, 8, 9, 13, 14};
        int n;
        boolean estLa=false;
       
        System.out.println("Entrez le nombre a chercher:");
        n=sc.nextInt();
        //Terminal.ecrireStrigln("entrez le nombre a chercher:");
        //n=Terminal.lireIn();
        for (int i=0; i<tab.length; i++){
            if(tab[i]==n){ 
                estLa=true;
            }
        }
        if(estLa){
            System.out.println("le nombre est dans le tableau");
        }
        else{ 
            System.out.println("le nombre n'est pas dans le tableau");
            }
        }
    
}
