package backend_mechanics;

import java.util.Random;
import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		 System.out.println("Enter the number of sides for a dice: ");
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        System.out.println("Enter the number of dices: ");
	        int m = sc.nextInt();
	        Random rand = new Random();
	        
	        do 
 	        {
 	            System.out.println("The values on dice are: ");
 	            for(int i=0; i<m; i++)
 	                System.out.println(rand.nextInt(n)+1);
 	 
 	            System.out.println("Continue: true/false");
 	        } while (sc.nextBoolean() == true);
 	        sc.close();
	}
}
