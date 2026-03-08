package Giochi;

import java.util.Scanner;
import java.util.Random;

public class Tombola {
	
	// Sviluppa i vari metodi per giocare al gioco della tombola
	//Chiedi all'utente quanti numeri estrarre su un set di 90 numeri
	//Chiedi all'untente quanti numeri estrarre su un set impostato dall'utente stesso
	//ATT: tutte le estrazioni dovranno essere univoche. Non posso estrarre 2 volte lo stesso numero

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       Random random = new Random();
       
       System.out.println("==== Gioco della Tombola ====");
       System.out.println("Quanti numeri vuoi estrarre");
       int quanti = scanner.nextInt();
       
       System.out.println("Scegli su un set di 90");
       int max = scanner.nextInt();
       
       if (quanti > max) {
    	   System.out.println("Errore: Non puoi scegliere due numeri due volte");
       }else {
    	   int[] risultato = new int[quanti];
    	   int estrarre = 0;
    	   
    	   while (estrarre < quanti) {
    		   int numTirare = random.nextInt(max) + 1;
    		   
    		   boolean giaPresente = false;
    		   for (int i = 0; i < estrarre; i++) {
    			   if(risultato[i] == numTirare) {
    				   giaPresente = true;
    				   break;
    			   }
    		   }
    		   
    		   if(!giaPresente) {
    			   risultato[estrarre] = numTirare;
    			   estrarre++;
    		   }
    		   
    	   }
    	   
    	   System.out.println("Numeri estratti : ");
    	   for (int n : risultato) {
    		   System.out.println(n + " ");
    	   }
       }
       
       scanner.close();
    }
}