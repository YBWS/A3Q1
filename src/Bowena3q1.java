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
         
         System.out.println(String.format("%-22s"+firstNum,"first number is:"));
         System.out.println(String.format("%-22s"+secondNum,"second number is:"));
         System.out.println(String.format("%-22s"+thirdNum,"third number is:"));
         System.out.println(String.format("%-22s"+forthNum,"forth number is:"));
         System.out.println(String.format("%-22s"+fifthNum,"fifth number is:"));
         System.out.println(String.format("%-22s"+ Average,"Your Average:"));
         
         


         userInput.close();
     	
         
         
        
         
         
         
        

	}

}
