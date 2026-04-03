import java.util.ArrayList;

/**
 * Holds the shared information for our threads.
 * Contains the list of numbers, the target number we are looking for (b),
 * and variables to store the answer if we find it.
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * Creates the shared data object.
	 * * @param array the list of numbers to check
	 * @param b the target sum we want to reach
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		this.array = array;
		this.b = b;
	}

	/**
	 * Gets the array that shows which numbers are part of the answer.
	 * * @return a boolean array with true for the winning numbers
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * Updates the array with the right numbers for the solution.
	 * * @param winArray the new boolean array to set
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * Gets our main list of numbers.
	 * * @return the ArrayList of integers
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * Gets the target number.
	 * * @return the number b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * Checks if a solution was already found by one of the threads.
	 * * @return true if we found the answer, false if not
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * Changes the flag status. Usually called when a thread finds the right sum..
	 * * @param flag the new status to set
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}