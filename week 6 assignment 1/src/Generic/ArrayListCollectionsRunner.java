package Generic;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Jacob Nartey
 * Runner class
 *
 */
public class ArrayListCollectionsRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Creating an Object of main class
		ArrayListCollections<String> ArrayObj = new ArrayListCollections<String>();
		
		//Creating an ArrayList Object colors
		ArrayList<String> colors = new ArrayList<String>();
		
		//Adding elements colors to ArrayList
		colors.addAll(Arrays.asList("Red", "Green", "Orange", "White", "Black"));
		
		//1. Starting small
		System.out.println(colors);
		System.out.println("");
				
		//2. Iterating
		for(String color : colors) {
			System.out.println("Today's Color is [" + color +  "]");
		}
		
		System.out.println("");
		
		//3. Updating
		System.out.println("Updated fifth element of ArrayList to Magenta");
		//Calling changeValue method to change the fifth element of ArrayList colors to "Magenta" and print to console results
		System.out.println(ArrayObj.changeValue(colors, 4, "Magenta") + "\n");
		
		//4. Removing
		System.out.println("Updated List of colors with the third element removed");
		//Calling changeValue method to remove the third element of ArrayList and print to console results
		System.out.println(ArrayObj.removeElement(colors, 2));
		System.out.println("");
		
		//5. Searching
		//Searching for color Green in array list
		System.out.println(ArrayObj.search(colors, "Green"));
		System.out.println("");
		
		//6. Sorting
		//calling sort method to sort ArrayList of colors from A-Z and print to console results
		System.out.println("Sorting ArrayList");
		System.out.println(ArrayObj.sort(colors));
		System.out.println("");
		
		//7. Reversing
		//calling reverse method to reverse ArrayList of colors and print to console results
		System.out.println("Reversing ArrayList");
		System.out.println(ArrayObj.reverse(colors));
		System.out.println("");
		
		//8. Copying
		//Creating an array list object to copy content to and print to console results
		ArrayList<String> copyOfList = new ArrayList<String>();
		
		//calling copy method to copy ArrayList of colors to new ArrayList copyOfList
		System.out.println("A copy of ArrayList colors to another ArrayList");
		System.out.println(ArrayObj.copy(colors, copyOfList));
		System.out.println("");
		
		
		//9.Comparing
		//Creating an array list object to compare
		ArrayList<String> colorsA = new ArrayList<String>();
		ArrayList<String> colorsB = new ArrayList<String>();
				
		//Adding elements colors to ArrayList
		colorsA.addAll(Arrays.asList("Red", "Green", "Orange", "White", "Black"));
		colorsB.addAll(Arrays.asList("Red", "Green", "Orange", "Gray", "Black", "Brown"));
		
		//calling compare method to compare ArrayList of colors and new ArrayList colorsB and print to console results
		System.out.println(ArrayObj.compare(colorsA, colorsB));
		System.out.println("");
		
		//10.Appending
		//Creating an array list object to compare
		ArrayList<String> colorsA1 = new ArrayList<String>();
		ArrayList<String> colorsB1 = new ArrayList<String>();
				
		//Adding elements colors to ArrayList
		colorsA1.addAll(Arrays.asList("Red", "Green", "Orange", "white", "Black"));
		colorsB1.addAll(Arrays.asList("Red", "Green", "Orange", "Gray", "Black", "Brown"));
		
		//calling compare method to compare ArrayList of colors and new ArrayList colorsB and print to console results
		System.out.println(ArrayObj.append(colorsA1, colorsB1));
		System.out.println("");
		
		//11.Looping
		//Calling the looping method iterateArrayList
		ArrayObj.iterateArrayList(colors);
		System.out.println("");
		
		//12.Converting
		//Creating a regular array of String
		String[] regularArray = {"Red", "Green", "Orange", "white", "Black"};
		//calling method convertToArray to convert regularArray array to ArrayList
		System.out.println("Converted regular array to ArrayList");
		System.out.println(ArrayObj.convertToArray(regularArray));
		System.out.println("");

	}

}
