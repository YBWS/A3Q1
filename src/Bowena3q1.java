import java.util.Scanner;

/**
 * 
 */

/**
 * @author b.yang
 *
 */
		/**

		 *

		 * Name: Bowen

		 * Teacher: Mr.hardman

		 * Assignment #3, Program #1

		 * Date Last Modified: Oct.28

		 *

		 */
public class Bowena3q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner userInput = new Scanner(System.in);  
		 System.out.println("Hello User!");
         double firstNum;
         double secondNum;
         double thirdNum;
         double forthNum;
         double fifthNum;
         
         double Average;
         
         System.out.println("Please enter a number:");
         firstNum =userInput.nextDouble();
         
         System.out.print("Think of another number: ");  
         secondNum = userInput.nextDouble();  
         
         System.out.print("Think of another number,please: ");  
         thirdNum = userInput.nextDouble();  
         
         System.out.print("Think of another number,please: ");  
         forthNum = userInput.nextDouble();  
         
         System.out.print("Think of another number,please: ");  
         fifthNum = userInput.nextDouble();  
         
         Average=(firstNum+secondNum+thirdNum+forthNum+fifthNum)/5;
         
         System.out.println("\n"+"first number is:"+firstNum);
         System.out.println("\n"+"second number is:"+secondNum);
         System.out.println("\n"+"third number is:"+thirdNum);
         System.out.println("\n"+"forth number is:"+forthNum);
         System.out.println("\n"+"fifth number is:"+fifthNum);
         System.out.println(String.format("Your Average: %17.2f", Average) );
         
         


         userInput.close();
     	
         
         
        
         
         
         
        

	}

}
