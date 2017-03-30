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
public class Somme_tableau {
    
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
int []t;
int taille;
int somme=0;
System.out.println("Entrez le plus grand indice:");
        taille=sc.nextInt();
//Terminal.ecrireString("Entrez  le  plus  grand  indice:  ");
//taille = Terminal.lireInt();
   t = new int[taille+1];
for (int i=0; i<= taille; i++){
somme = 0;
for (int j=0; j<=i; j++){
somme = somme+j;
}
t[i]=somme;
}
for (int i=0; i<= taille; i++){
    System.out.println("Indice " +i+" valeur " + t[i]);
    
//Terminal.ecrireStringln("Indice  " + i + "  valeur  " + t[i]);
}
}
    
}