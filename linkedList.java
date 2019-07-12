import java.util.*;

class linkedList{

public static void main (String[] args){
	
	LinkedList <String> linkedList = new LinkedList<>();

	linkedList.add("H");
	linkedList.add("J");
	linkedList.add("K");
	
	System.out.println(linkedList);

	LinkedList <String> addList = new LinkedList<>();

	addList.add("J");
	addList.add("B");
	addList.add("B");
	addList.add("H");
	addList.add("J");

	//System.out.println(addList);
	linkedList.addAll(addList);
	System.out.println(linkedList);

	if (linkedList.contains("B")){

		linkedList.remove("B");
		System.out.println(linkedList);
	}

	addList.clear();

	System.out.println("Is empty "+addList.isEmpty());





}
}