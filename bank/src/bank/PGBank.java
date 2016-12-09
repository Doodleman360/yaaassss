package bank;

public class PGBank {
    
    int pennies = 0;
    int nickels = 0;
    int dimes = 0;
    int quarters = 0;

    PGBank(int pennies, int nickels, int dimes, int quarters) {
	this.pennies = pennies;
	this.nickels = nickels;
	this.dimes = dimes;
	this.quarters = quarters;
	
    }
    
    PGBank() {
	
    }
    
    boolean takePennie(int amount) {
	if(pennies - amount >= 0) {
	    pennies -= amount;
	    return true;
	}
	return false;
    }
    
    boolean takeNickel(int amount) {
	if(nickels - amount >= 0) {
	    nickels -= amount;
	    return true;
	}
	return false;
    }
    
    boolean takeDime(int amount) {
	if(dimes - amount >= 0) {
	    dimes -= amount;
	    return true;
	}
	return false;
    }
    
    boolean takeQuarter(int amount) {
	if(quarters - amount >= 0) {
	    quarters -= amount;
	    return true;
	}
	return false;
    }
    
    int getTotal() {
	int temp = 0;
	temp += pennies;
	temp += nickels * 5;
	temp += dimes * 10;
	temp += quarters * 25;
	return temp;
    }
}
