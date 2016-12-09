package smaclulator;

import java.util.Scanner;

public class Smalculator 
{
    public static int FirstNumber, SecondNumber;
    public static float TheAnswer;
    public static String Action;
    public static Scanner ScanInt1, ScanString;
    public static boolean hasString;
    public static boolean hasString2, hasInt;

    /*  Answer()
    **
    **  Compute the result of FirstNumber <operator> SecondNumber, and return the value.
    */
    public static float Answer()
    {
        TheAnswer = -1.0f;  

        
        /*  Multiplication */
        if( Action.equals( "*" ) )
        {
            TheAnswer = FirstNumber * SecondNumber;
        } 

        /*  Division */
        if( Action.equals( "/" ) )
        {
            TheAnswer = FirstNumber / SecondNumber;
        }

        /*  Addition */
        if( Action.equals( "+" ) )
        {
            TheAnswer = FirstNumber + SecondNumber;
        }

        /*  Subtraction */
        if( Action.equals( "-" ) )
        {
            TheAnswer = FirstNumber - SecondNumber;
        }
        return TheAnswer;
    }

    /*  Main
    **      No arguments.
    */
    public static void main( String args[] )
    {
	
	int x = 10;
	if (x > 10)
	    System.out.println("Hello ");
	    System.out.println("There. ");
	System.out.println("How are you?");
	
        hasString = false;  //sets up the booleans
        hasString = false;
        hasInt = false;
        ScanInt1 = new Scanner(System.in);
        ScanString = new Scanner(System.in);
        System.out.println("Give your First input please.");
        while  (FirstNumber < 1)
        {
            FirstNumber = ScanInt1.nextInt();   
        }
        System.out.println("Give your Second input please.");
        hasString = true;
        if (SecondNumber < 1)
        {
            SecondNumber = ScanInt1.nextInt();      
        }
        else 
        {
            System.out.println("Now * or / or + or -");
            hasString2 = true;
        }
        Action = ScanString.nextLine();
        System.out.println(Answer());
    }
}