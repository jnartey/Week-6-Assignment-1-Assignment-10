package Generic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Jacob Nartey
 * Custom ArrayList collection class
 * @param <T>
 *
 */
public class ArrayListCollections<T> {
	
	private ArrayList<T> list;
	private int index;
	private T value;
	private T keyword;
	private ArrayList<T> listA, listB;
	private T[] array;
	
	
	/**
	 * @param list
	 * @param index
	 * @param value
	 * @param keyword
	 * @param listA
	 * @param listB
	 * @param array
	 */
	public ArrayListCollections(ArrayList<T> list, int index, T value, T keyword,
			ArrayList<T> listA, ArrayList<T> listB, T[] array) {
		this.setList(list);
		this.setIndex(index);
		this.setValue(value);
		this.setKeyword(keyword);
		this.setListA(listA);
		this.setListB(listB);
		this.setArray(array);
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
	public ArrayList<T> changeValue(ArrayList<T> list, int index, T value) {		
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
	public ArrayList<T> removeElement(ArrayList<T> list, int index) {		
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
	public String search(ArrayList<T> list, String keyword) {	
		
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
	public ArrayList<T> sort(ArrayList<T> list) {	
				
		Collections.sort(list, null);
		return list;
	}
	
	/**
	 * 
	 * @param list ArrayList
	 * @return ArrayList
	 */
	public ArrayList<T> reverse(ArrayList<T> list) {
		
		if(list.size() > 1) {                   
	        T value = (T) list.remove(0);
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
	public ArrayList<T> copy(ArrayList<T> listA, ArrayList<T> listB) {
		
		for(T data : listA) {
			listB.add(data);
		}
		
		return listB;
	}
	
	/**
	 * Compare
	 * @param listA ArrayList<T>
	 * @param listB ArrayList<T>
	 * @return ArrayList
	 */
	public ArrayList<T> compare(ArrayList<T> listA, ArrayList<T> listB) {
		//Creating Set object
		Set<T> arraySet = new HashSet<T>(listA);
		
		//Compare and list common values
		arraySet.retainAll(listB);
		
		//Convert Set to arrayList
		ArrayList<T> result = new ArrayList<T>(arraySet);
		
		return result;
	}
	
	/**
	 * Append
	 * @param listA ArrayList<T>
	 * @param listB ArrayList<T>
	 * @return ArrayList
	 */
	public ArrayList<T> append(ArrayList<T> listA, ArrayList<T> listB) {
		
		//add arrayList listB to arrayList listA
		listA.addAll(listB);		
		return listA;
	}
	
	/**
	 * Loop
	 * @param list ArrayList<T>
	 * @return ArrayList
	 */
	public void iterateArrayList(ArrayList<T> list) {
		//Iterating ArrayList
		for(T listElement : list) {
			//Printing out each element
			System.out.println(listElement);
		}
	}
	
	/**
	 * Method converts a regular Array to an ArrayList.
	 * @param array String
	 * @return ArrayList<T>
	 */
	public ArrayList<T> convertToArray(T[] array) {
		//Converting array to ArrayList
		ArrayList<T> list = new ArrayList<T>(Arrays.asList(array));//Passing List using Arrays.asList(array) | array converted to List 
		return list;
	}

	public ArrayList<T> getList() {
		return list;
	}

	public void setList(ArrayList<T> list) {
		this.list = list;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public T getKeyword() {
		return keyword;
	}

	public void setKeyword(T keyword) {
		this.keyword = keyword;
	}

	public ArrayList<T> getListA() {
		return listA;
	}

	public void setListA(ArrayList<T> listA) {
		this.listA = listA;
	}

	public ArrayList<T> getListB() {
		return listB;
	}

	public void setListB(ArrayList<T> listB) {
		this.listB = listB;
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}
}
