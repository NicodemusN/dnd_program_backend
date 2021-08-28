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
	        if (n==4){
	        	 do 
	 	        {
	 	            System.out.println("The values on dice are: ");
	 	            for(int i=0; i<m; i++)
	 	                System.out.println(rand.nextInt(4)+1);
	 	 
	 	            System.out.println("Continue: true/false");
	 	        } while (sc.nextBoolean() == true);
	 	        sc.close();
	        } else if (n==6) {
	        	do 
	 	        {
	 	            System.out.println("The values on dice are: ");
	 	            for(int i=0; i<m; i++)
	 	                System.out.println(rand.nextInt(6)+1);
	 	 
	 	            System.out.println("Continue: true/false");
	 	        } while (sc.nextBoolean() == true);
	 	        sc.close();
	        } else if (n==8) {
	        	do 
	 	        {
	 	            System.out.println("The values on dice are: ");
	 	            for(int i=0; i<m; i++)
	 	                System.out.println(rand.nextInt(8)+1);
	 	 
	 	            System.out.println("Continue: true/false");
	 	        } while (sc.nextBoolean() == true);
	 	        sc.close();
	        } else if (n==10) {
	        	do 
	 	        {
	 	            System.out.println("The values on dice are: ");
	 	            for(int i=0; i<m; i++)
	 	                System.out.println(rand.nextInt(10)+1);
	 	 
	 	            System.out.println("Continue: true/false");
	 	        } while (sc.nextBoolean() == true);
	 	        sc.close();
	        } else if (n==12) {
	        	do 
	 	        {
	 	            System.out.println("The values on dice are: ");
	 	            for(int i=0; i<m; i++)
	 	                System.out.println(rand.nextInt(12)+1);
	 	 
	 	            System.out.println("Continue: true/false");
	 	        } while (sc.nextBoolean() == true);
	 	        sc.close();
	        } else if (n==20) {
	        	do 
	 	        {
	 	            System.out.println("The values on dice are: ");
	 	            for(int i=0; i<m; i++)
	 	                System.out.println(rand.nextInt(20)+1);
	 	 
	 	            System.out.println("Continue: true/false");
	 	        } while (sc.nextBoolean() == true);
	 	        sc.close();
	        }
	}
}
