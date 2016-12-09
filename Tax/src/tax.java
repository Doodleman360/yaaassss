
public class tax {

    boolean married;
    double money;

    /**
     * @param mula
     *            $
     * @param arrowToTheKnee
     *            Married or not
     */
    tax(double mula, boolean arrowToTheKnee) {
	money = mula;
	married = arrowToTheKnee;
    }

    public double getTax() {
	if (married) {
	    return getMTax();
	} else {
	    return getSTax();
	}
    }

    private double getMTax() {
	if (money < 45200) {
	    return money * 0.15;
	} else if (money < 10925) {
	    return 6780 + (money * 0.275);
	} else if (money < 166500) {
	    return 24393 + (money * 0.305);
	} else if (money < 29735) {
	    return 41855 + (money * 0.355);
	} else {
	    return 88306 + (money * 0.391);
	}
    }

    private double getSTax() {
	if (money < 27050) {
	    return money * 0.15;
	} else if (money < 65550) {
	    return 4057.5 + (money * 0.275);
	} else if (money < 136750) {
	    return 14645 + (money * 0.305);
	} else if (money < 297350) {
	    return 36361 + (money * 0.355);
	} else {
	    return 93374 + (money * 0.391);
	}
    }

}
