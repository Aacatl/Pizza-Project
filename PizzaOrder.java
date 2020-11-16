// Aacatl Campos 
// A170 CRN: 36603
// Date: April 1, 2020
// Project two
// Project Pizza order
import java.util.Scanner;
import javax.swing.JOptionPane;
public class PizzaOrder{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Task 1: Print Menu, Declaration of variables, initial values
		String ownerOne = "Aacatl";
		String ownerTwo = "Jared";
		double discount = 2.0;
		double total = 0.0;
		int numberOfToppings = 0;
		String toppings = "cheese";
		double tax;

		System.out.println("Welcome to " + ownerOne + " and " + ownerTwo + "'s Pizzeria");
		String customerName;
		customerName = JOptionPane.showInputDialog("Enter your first name: ");

		System.out.println();
		pizzaMenu();
		int sizeOfPizza;
		String str;
		str = JOptionPane.showInputDialog("What size pizza would you like? 10 inch, 12 inch, 14 inch, or 16 inch( enter the number only):");
		sizeOfPizza = Integer.parseInt(str);

		//Task 2: Comparing Strings, Using flag as a condition 
		if(customerName.equalsIgnoreCase(ownerOne) || customerName.equalsIgnoreCase(ownerTwo) )
		{
			if(true)
			{
				JOptionPane.showMessageDialog(null,"You are eligible for a $2.00 discount");
				total = total - discount;
			}
		}
		//Task 3: The if-else-if statement
		if(sizeOfPizza == 10)
		{
			total = 10.99;
		}
		else if(sizeOfPizza == 12)
		{
			total = 12.99;
		}
		else if(sizeOfPizza == 14)
		{
			total = 14.99;
		}
		else if(sizeOfPizza == 16)
		{
			total = 16.99;
		}
		else if(sizeOfPizza == 17)
		{
			total = 17.99;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "That was not one of the options");
		}

		//Task 4: The Switch Statement 
		System.out.println("What type of crust do you want?");
		String crust;
		crust = JOptionPane.showInputDialog("(H)Hand-tossed, (T) Thin-crust, or (D) Deep-dish (enter  H, T, or D):");
		char crustType = crust.charAt(0);
		switch (crustType) 
		{
			case 'H':
			case 'h':
				crust = "Hand-tossed";
				break;
			case 'D':
			case 'd':
				crust = "Deep-Dish";
				break;
			case 'T':
			case 't':
				crust = "Thin-Crust";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Sorry that was not one of the choices. Instead a Hand-tossed pizza will be made by default");
				crust = "Hand-Tossed";
				break;
		}
		//Task 5: String Concatenation
		System.out.println("All pizzas come with cheese");
		System.out.println("Additional toppings are $1.25 each, choose from:");
		System.out.println("Pepperoni, Sausage, Onion, Mushroom");

		
		String toppingPepperoni;
		toppingPepperoni = JOptionPane.showInputDialog("Do you want Pepperoni (Y/N): ");
		if(toppingPepperoni.equalsIgnoreCase("Y"))
		{
			total = total + 1.25;
			numberOfToppings++;
			toppings = toppings + " Pepperoni";
		}
		String toppingSausage;
		toppingSausage = JOptionPane.showInputDialog("Do you want Sausage (Y/N): ");
		if(toppingSausage.equalsIgnoreCase("Y"))
		{
			total = total + 1.25;
			numberOfToppings++;
			toppings = toppings + " Sausage";
		}
		String toppingOnion;
		toppingOnion = JOptionPane.showInputDialog("Do you want Onion (Y/N): ");
		if(toppingOnion.equalsIgnoreCase("Y"))
		{
			total = total + 1.25;
			numberOfToppings++;
			toppings = toppings + " Onion";
		}
		String toppingMushroom;
		toppingMushroom = JOptionPane.showInputDialog("Do you want Mushroom (Y/N): ");
		if(toppingMushroom.equalsIgnoreCase("Y"))
		{
			total = total + 1.25;
			numberOfToppings++;
			toppings = toppings + " Mushroom";
		}
	
		//Task 6: Formatting output
		System.out.println();
		System.out.println("Your order is as follows:");
		System.out.println( sizeOfPizza + " inch pizza");
		System.out.println(crust + " crust");
		System.out.println(toppings);
		System.out.printf("The cost of your order is: $%,.2f%n", total);
		System.out.printf("The tax is: $%,.2f%n", tax = total * 8/100);
		System.out.printf("The total due is $%,.2f%n: ", total + tax);
		System.out.println("Your order will be ready for pickup in 30 minutes");
		
	}
	public static void pizzaMenu()
	{
		System.out.println("Pizza Size (Inches)    Cost");
		System.out.println("    10                10.99");
		System.out.println("    12                12.99");
		System.out.println("    14                14.99");
		System.out.println("    16                16.99");
	}
}
