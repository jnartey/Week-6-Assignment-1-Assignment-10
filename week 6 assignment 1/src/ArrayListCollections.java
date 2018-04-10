import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Jacob Nartey
 * Custom ArrayList collection class
 *
 */
public class ArrayListCollections {
	
	private ArrayList<String> list;
	private int index;
	private String value;
	private String keyword;
	private ArrayList<String> listA, listB;
	private String[] array;
	
	
	/**
	 * @param list
	 * @param index
	 * @param value
	 * @param keyword
	 * @param listA
	 * @param listB
	 * @param array
	 */
	public ArrayListCollections(ArrayList<String> list, int index, String value, String keyword,
			ArrayList<String> listA, ArrayList<String> listB, String[] array) {
		this.list = list;
		this.index = index;
		this.value = value;
		this.keyword = keyword;
		this.listA = listA;
		this.listB = listB;
		this.array = array;
	}
	
	//Empty constructor
	public ArrayListCollections() {
		
	}

	/**
	 * 3. Updating
	 * Method to change element of an index in ArrayList
	 * @param list ArrayList
	 * @param index
	 * @param value
	 * @return ArrayList
	 */
	public ArrayList<String> changeValue(ArrayList<String> list, int index, String value) {		
		try {
			list.set(index, value);
		}catch (IndexOutOfBoundsException e){
			System.out.println("Index not found!");
		}
		
		return list;
	}
	
	/**
	 * Method to remove the element at an index in ArrayList
	 * @param list ArrayList
	 * @param index
	 * @return ArrayList
	 */
	public ArrayList<String> removeElement(ArrayList<String> list, int index) {		
		try {
			list.remove(index);
		}catch (IndexOutOfBoundsException e){
			System.out.println("Index not found!");
		}
		
		return list;
	}
	
	/**
	 * Search
	 * @param list ArrayList
	 * @param color
	 * @return String
	 */
	public String search(ArrayList<String> list, String keyword) {	
		
		String found = "";
		int index = list.indexOf(keyword);
		
		if(index != -1) {
			found = "Color " + keyword + " found at index " + index + " of array list";
		}else {
			System.out.println("Color not found");
		}
		
		return found;
	}
	
	/**
	 * Sort
	 * @param list ArrayList
	 * @return ArrayList
	 */
	public ArrayList<String> sort(ArrayList<String> list) {	
		
		Collections.sort(list);
		return list;
	}
	
	/**
	 * 
	 * @param list ArrayList
	 * @return ArrayList
	 */
	public ArrayList<String> reverse(ArrayList<String> list) {
		
		if(list.size() > 1) {                   
	        String value = list.remove(0);
	    	Collections.reverse(list);
	        list.add(value);
	    }
		
		return list;
	}
	
	/**
	 * 
	 * @param list ArrayList<Object>
	 * @param listCopy ArrayList<Object>
	 * @return ArrayList
	 */
	public ArrayList<String> copy(ArrayList<String> listA, ArrayList<String> listB) {
		
		for(String data : listA) {
			listB.add(data);
		}
		
		return listB;
	}
	
	/**
	 * Compare
	 * @param listA ArrayList<String>
	 * @param listB ArrayList<String>
	 * @return ArrayList
	 */
	public ArrayList<String> compare(ArrayList<String> listA, ArrayList<String> listB) {
		//Creating Set object
		Set<String> arraySet = new HashSet<String>(listA);
		
		//Compare and list common values
		arraySet.retainAll(listB);
		
		//Convert Set to arrayList
		ArrayList<String> result = new ArrayList<String>(arraySet);
		
		return result;
	}
	
	/**
	 * Append
	 * @param listA ArrayList<String>
	 * @param listB ArrayList<String>
	 * @return ArrayList
	 */
	public ArrayList<String> append(ArrayList<String> listA, ArrayList<String> listB) {
		
		//add arrayList listB to arrayList listA
		listA.addAll(listB);		
		return listA;
	}
	
	/**
	 * Loop
	 * @param list ArrayList<String>
	 * @return ArrayList
	 */
	public void iterateArrayList(ArrayList<String> list) {
		//Iterating ArrayList
		for(String listElement : list) {
			//Printing out each element
			System.out.println(listElement);
		}
	}
	
	/**
	 * Method converts a regular Array to an ArrayList.
	 * @param array String
	 * @return ArrayList<String>
	 */
	public ArrayList<String> convertToArray(String[] array) {
		//Converting array to ArrayList
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));//Passing List using Arrays.asList(array) | array converted to List 
		return list;
	}
}
