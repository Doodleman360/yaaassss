package paladrome;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Scanner scan = new Scanner(System.in);
	Tester test = new Tester();
	
	String s;
	
	do {
	s = scan.nextLine();
	System.out.println(test.isPaladrome(s));
	} while (!s.equals("quit"));
	
    }

}
