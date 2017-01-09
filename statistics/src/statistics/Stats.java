package statistics;

import java.io.File;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Stats {

    public static void main(String[] args) {
	ArrayList<Integer> values = new ArrayList<Integer>();
	DecimalFormat df = new DecimalFormat("#.##");
	df.setRoundingMode(RoundingMode.CEILING);
	readFile("numbers.txt", values);
	System.out.println("The average = "+df.format(Ag(values)));
	System.out.println("Standard deviation = "+df.format(sd(values)));
	System.out.println("The mode is(are) --> "+mode(values));

    }

    public static void readFile(String fileName, ArrayList<Integer> values) {

	Scanner inFile;

	try {
	    inFile = new Scanner(new File(fileName));
	    while (inFile.hasNext()) {
		values.add(inFile.nextInt());
	    }
	} catch (IOException i) {
	    System.out.println("Error: " + i.getMessage());
	}
    }

    static double Ag(ArrayList<Integer> marks) {
	Integer sum = 0;
	if (!marks.isEmpty()) {
	    for (Integer mark : marks) {
		sum += mark;
	    }
	    return sum.doubleValue() / marks.size();
	}
	return sum;
    }

    public static double mean(ArrayList<Integer> table) {
	int total = 0;

	for (int i = 0; i < table.size(); i++) {
	    int currentNum = table.get(i);
	    total += currentNum;
	}
	return total / table.size();
    }

    static ArrayList<Integer> mode(ArrayList<Integer> values) {
	ArrayList<Integer> maxValue = new ArrayList<Integer>();
	int maxCount = 0;

	for (int i = 0; i < values.size(); ++i) {
	    int count = 0;
	    for (int j = 0; j < values.size(); ++j) {
		if (values.get(j) == values.get(i))
		    ++count;
	    }
	    if (count > maxCount) {
		maxCount = count;
		maxValue.clear();
		if (!maxValue.contains(values.get(i))) {
		    maxValue.add(values.get(i));
		}
	    } else if (count == maxCount) {
		if (!maxValue.contains(values.get(i))) {
		    maxValue.add(values.get(i));
		}
	    }
	}
	return maxValue;
    }

    public static double sd(ArrayList<Integer> table) {
	// Step 1:
	double mean = mean(table);
	double temp = 0;

	for (int i = 0; i < table.size(); i++) {
	    int val = table.get(i);

	    // Step 2:
	    double squrDiffToMean = Math.pow(val - mean, 2);

	    // Step 3:
	    temp += squrDiffToMean;
	}

	// Step 4:
	double meanOfDiffs = (double) temp / (double) (table.size());

	// Step 5:
	return Math.sqrt(meanOfDiffs);
    }

}
