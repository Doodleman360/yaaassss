package paladrome;

public class Tester {

    
    Tester() {
    }

    public String reverse(String s) {
	return new StringBuilder(s).reverse().toString();
    }
    
    public boolean isPaladrome(String s) {
	s = s.replaceAll("\\W","");
	s = s.toLowerCase();
	if (s.equals(reverse(s))) {
	    return true;
	}
	return false;
    }
}
