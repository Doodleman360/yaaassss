import java.util.Scanner;
import java.io.*;

public class Compact {
    private int[] myList = new int[100];
    private int myHowMany;

    public Compact(String fileName) {
	readFile(fileName);
    }

    public void readFile(String fileName) {
	/*
	 * Loads text file numbers.txt into myList. Values are stored from
	 * positions 0..myHowMany-1. Returns the number of data values as
	 * howMany
	 */

	int index = 0;
	Scanner inFile;

	try {
	    inFile = new Scanner(new File(fileName));
	    while (inFile.hasNext()) {
		myList[index] = inFile.nextInt();
		index++;
	    }
	} catch (IOException i) {
	    System.out.println("Error: " + i.getMessage());
	}
	myHowMany = index;
    }

    public void printList() {
	for (int i = 0; i < myHowMany; i++) {
	    System.out.print(myList[i] + ", ");
	}
    }

    public void compact() {
	int count = 0;

	for (int i = 0; i < myList.length; i++) {
	    if (myList[i] != 0) {
		myList[count++] = myList[i];
		myHowMany--;
	    }
	}

	while (count < myList.length)
	    myList[count++] = 0;
    }

    public static void main(String args[]) {
	Compact c = new Compact("compact.txt");
	c.printList();
	c.compact();
	System.out.println("");
	c.printList();
    }

}