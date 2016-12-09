import java.util.Scanner;

public class first {
    
    static tax tax;
    static Scanner in = new Scanner(System.in);
    
    static boolean married;
    static double money;

    public static void main(String[] args) {
	System.out.print("Are you married? (true/false): ");
	married = in.nextBoolean();
	System.out.print("Enter taxable income: $");
	money = in.nextDouble();
	
	tax = new tax(money, married);
	
	System.out.println(tax.getTax());
    }

}