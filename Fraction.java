/** 
 * This is a small abstract class that stores two numbers(numerator and denominator) 
 * in its reduced form. 
 * 
 * @author Jamie Kim
 * @version October 10, 2019
 */

public class Fraction {
	
	//data members
	private int numerator = 0; 
	private int denominator = 1; 
	
	/**
	 * no-arg constructor
	 */
	public Fraction() {
	}
	
	/**
	 * Copy constructor to set data accordingly to its method
	 * 
	 * @param num represents fraction's numerator
	 * @param denom represents fraction's denominator
	 */
	public Fraction(int num, int denom) {
		setNumerator(num);  //numerator
		setDenominator(denom); //denominator
		reduceFraction(num,denom); //sets for the reducing method
	}
	
	/**
	 * Accessor method that returns the numerator value
	 * 
	 * @return the current numerator
	 */
	public int getNumerator() {
		return this.numerator; //getter method
	}
	
	/**
	 * Accessor method that returns the denominator value
	 * 
	 * @return the current denominator
	 */
	public int getDenominator() {
		return this.denominator; //getter method
	}
	
	/**
	 * Mutator method to change the numerator value to the newNumerator value
	 * Class invariant: Numerator must be a valid counting integer
	 * 
	 * @param newNumerator newNumerator sets the current numerator value for the object
	 */
	public void setNumerator(int newNumerator) {
		this.numerator = newNumerator; //setter method

	}
	
	/**
	 * Mutator method to change the denominator value to the newDenominator value
	 * under the circumstances defined in the parameter
	 * Class invariant: Denominator cannot be a zero. 
	 * 
	 * @param newDenominator newDenominator sets the current numerator value for the object
	 */
	public void setDenominator(int newDenominator) { //setter method with invariants
		if(newDenominator > 0) { //when the denominator is a positive int
			this.denominator = newDenominator;
		} else if (newDenominator < 0) { //when the denominator is a negative int
			this.denominator = -newDenominator;
		} else if(newDenominator == 0) { //set boundaries so denominator cannot be a zero
			throw new  IllegalArgumentException ("Denominator cannot be zero!");
		}
	}
	
	/**
	 * Method to find the greatest common divisor using the Euclid's algorithm as a reference
	 * 
	 * @param a first number
	 * @param b second number
	 * @return greatest common divisor
	 */
	public int gcd(int a, int b) { 
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
	
	/**
	 * Method to reduce the fraction by calling the gcd method
	 * 
	 * @param num numerator
	 * @param denom denominator 
	 */ 
	private void reduceFraction(int num, int denom) {
		int fraction; //new variable 
		fraction = gcd(num, denom); //calls the gcd method
		
		num = num/fraction; //reduce numerator
		denom = denom/fraction; //reduce denominator
		
		System.out.println(num + "/" +denom);
	}

	/**
	 * Boolean method that will return true if this and other are equal fractions
	 * but return false if it is not equal or other is not a fraction
	 */
	@Override
	public boolean equals (Object other) {
		if(other == null) //null check
			return false;
		
		if(other instanceof Fraction == false) //check if reference variable contains the object or not
			return false;
		
		Fraction that = (Fraction) other; //casting 
	
		
		return this.numerator == that.numerator &&
				this.denominator == that.denominator;
	}
	
	/**
	 * Method that will convert the Fraction into a String
	 * @return  string that outputs a fraction
	 */
	public String toSring() {
		return this.numerator + "/" + this.denominator;
	}
}
