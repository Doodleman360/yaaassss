package bank;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
	PGBank bank = new PGBank();
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Thanks for purchacing your first vurtural piggy bank");
	System.out.println("How manny pennies would you like to start with?");
	bank.takePennie(-scan.nextInt());
	System.out.println("How manny nickels would you like to start with?");
	bank.takeNickel(-scan.nextInt());
	System.out.println("How manny dimes would you like to start with?");
	bank.takeDime(-scan.nextInt());
	System.out.println("How manny quarters would you like to start with?");
	bank.takeQuarter(-scan.nextInt());
	
	boolean quit = false;
	
	while(!quit) {
	    System.out.println("your curent total is: $" + (double)bank.getTotal()/100);
	    System.out.println("what would you like to do next?");
	    String s = scan.nextLine();
	    if(s.contains("add")) {
		if(s.contains("pennie")) {
		    bank.takePennie(-Integer.parseInt(s.substring(4, s.length()-7).trim()));
		} else if(s.contains("nickel")) {
		    bank.takeNickel(-Integer.parseInt(s.substring(4, s.length()-7).trim()));
		} else if(s.contains("dime")) {
		    bank.takeDime(-Integer.parseInt(s.substring(4, s.length()-6).trim()));
		} else if(s.contains("quarter")) {
		    bank.takeQuarter(-Integer.parseInt(s.substring(4, s.length()-9).trim()));
		}
	    } else if(s.contains("take")) {
		if(s.contains("pennie")) {
		    bank.takePennie(Integer.parseInt(s.substring(4, s.length()-7).trim()));
		} else if(s.contains("nickel")) {
		    bank.takeNickel(Integer.parseInt(s.substring(4, s.length()-7).trim()));
		} else if(s.contains("dime")) {
		    bank.takeDime(Integer.parseInt(s.substring(4, s.length()-6).trim()));
		} else if(s.contains("quarter")) {
		    bank.takeQuarter(Integer.parseInt(s.substring(4, s.length()-9).trim()));
		}
	    } else if(s.contains("quit")) {
		quit = true;
	    } else {
		System.out.println("the format is: [take/add] [number] [type of coin]");
	    }
	}
	System.out.println("your final total is: $" + (double)bank.getTotal()/100);
    }

}
