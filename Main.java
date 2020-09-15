import java.util.Scanner;
/**
 *simple program that can calculate the discount available to customers that shop at the store during a special sale
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	// create a Scanner for user input
	Scanner input = new Scanner(System.in);
  //prompt user for ho much money was spent
	System.out.println("Please enter the amount the customer spent");
	//get input from user 
	double MONEY_SPENT = input.nextDouble();
	//if the input is greater than 0.01 and less than 40.00
	if (MONEY_SPENT >= 0.01 && MONEY_SPENT <= 40.00){
		//prompt user they will recieve 10% off
		System.out.println("They will recieve 10% off.");
		//calculate the discount  by multiplying the money and the perent off 
		double discount = MONEY_SPENT * 0.10;
		//prompt user they will save discount var
		System.out.println("They will save $" + discount + ".");
		//print the final value by subtracting the discount from intial total
		double total = MONEY_SPENT - discount;
		System.out.println("The new total is $" + total + ".");
	}  //repeat this for all the money spent and change the percent off for each one
	else if (MONEY_SPENT >= 40.01 && MONEY_SPENT <= 80.00){
		System.out.println("They will recieve 20% off.");
		double discount = MONEY_SPENT * 0.20;
		System.out.println("They will save $" + discount + ".");
		double total = MONEY_SPENT - discount;
		System.out.println("The new total is $" + total + ".");
	}  
	else if (MONEY_SPENT >= 80.01 && MONEY_SPENT <= 120.00){
		System.out.println("They will recieve 30% off.");
		double discount = MONEY_SPENT * 0.30;
		System.out.println("They will save $" + discount + ".");
		double total = MONEY_SPENT - discount;
		System.out.println("The new total is $" + total + ".");
	} 
	else if (MONEY_SPENT > 120) {
		System.out.println("They will recieve 40% off.");
		double discount = MONEY_SPENT * 0.40;
		System.out.println("They will save $" + discount + ".");
		double total = MONEY_SPENT - discount;
		System.out.println("The new total is $" + total + ".");
	}   
  else { //if value is in negative or 0 
		System.out.println("You have entered and incorrect value please correct it!");
	}
	}
}
