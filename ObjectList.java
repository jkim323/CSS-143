/**
 * This class stores the list of Fractions, their count, and a reference to the
 * Fraction object that is being counted
 * 
 * @author Jamie Kim
 * @version October 10, 2019
 */
public class ObjectList {
	
	//data members
	private Object[] fractionList; //object list to store fraction
	private int numElements = 0;
	
	public void add(Object next) {
		fractionList[numElements++] = next; //allows us to add fractions at the end in the list
	}
	
	/**
	 * Method will return the number of elements stored in the fractionList
	 * 
	 * @return numElements int representing length of the list
	 */
	public int length() {
		return numElements; //gives how many elements there are in the list
	}
	
	/**
	 * Method that will get the item specified in the index
	 * 
	 * @param index provides which int to target in the list
	 * @return the int specified at the index
	 */
	public Object get(int index) {
		return fractionList[index]; //returns the value and is casted to fractionList
	}
	
	/**
	 * Method that will put all the elements of the fractionList in a
	 * string and return using retVal
	 * 
	 * @return retVal the string consisting of the fractionList elements
	 */
	@Override
	public String toString() {
		String retVal = ""; //initialize the string
		
		for(int i = 0; i < numElements; i++) { //go through the array
			retVal += fractionList[i]; //add the value of the element to the string
		}
		
		return retVal;
	}

}
