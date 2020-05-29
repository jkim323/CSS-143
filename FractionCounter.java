/**
 * This class stores a reference to a Fraction object and count the
 * number of times the fraction object has appeared in the input file.
 * 
 * @author Jamie Kim
 * @version October 10, 2019
 */

public class FractionCounter{
	
	//data members
	private Fraction theFraction; //Fraction object 
	private int counter = 1; //count number of the fraction found in the file
	
	/**
	 * Constructor 
	 * 
	 * @param theFraction
	 */
	public FractionCounter(Fraction theFraction) {
		this.theFraction = theFraction;
	}
	
	/**
	 * Boolean method to check if the newFraction is same as theFraction we stored
	 * 
	 * @param newFraction fraction that is to be compared to theFraction
	 * @return true if theFraction and newFraction is equal and false if
	 * 		   theFraction and newFraction is not equal
	 */
	public boolean compareAndIncrement(Fraction newFraction) {
		if(theFraction == newFraction) { //compares the two fractions 
			counter++; //increments the counter by one
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Method that will print out a string containing both the fraction and its count
	 * 
	 * @return retVal string that prints out the Fraction and how many times it showed in the list
	 */
	@Override
	public String toString() {
		//initializes retVal and calls the toString method from the Fraction class 
		String retVal = theFraction.toSring() + " has a count of " + counter;
		return retVal;
	}

}
