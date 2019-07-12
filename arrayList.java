import java.util.*;

class arrayList{
	public static void main (String[] args){

		ArrayList <String> arrList = new ArrayList<>();
		arrList.add("S");
		arrList.add("D");
		arrList.add("H");
		arrList.add("E");
		arrList.add("S");

		Iterator iterator = arrList.iterator();

			System.out.println("Array List:");
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
}