// import java.util.*; 

// public class main{

// public static void main(String[] args){
// //System.out.println("Hello World!");

// ArrayList<String> arr = new ArrayList<>();
// arr.add("H");
// arr.add("e");
// arr.add("l");
// arr.add("l");
// arr.add("o");

// System.out.println(arr);
// 	}
// }

// import java.util.*;
// public class main{

// 	public static void main (String[] args){

// 		ArrayList<String> arr = new ArrayList<>();
// 		arr.add("Q");
// 		arr.add("W");
// 		arr.add("E");
// 		arr.add("R");
// 		arr.add("R");
// 		arr.add("R");
// 		arr.add("D");

// 		System.out.println(arr);
// 		arr.remove("R");//Remove only the last element of the value. Does not remove duplicates. 
// 		System.out.println(arr);

// 		ArrayList<String> arremove = new ArrayList<>();
// 		arremove.add("R");
// 		arr.removeAll(arremove);
// 		System.out.println(arr);

// 		ArrayList<String> arrAdd = new ArrayList<>();
// 		arrAdd.add("N");
// 		arrAdd.add("E");
// 		arrAdd.add("W");
		
// 		System.out.println("Newly added ArrayList" +arrAdd);
// 		arr.addAll(arrAdd);
// 		System.out.println(arr);//Printing the added arraylist
		
	
// 	}
// }



import java.util.*;

public class main{
	public static void main (String[] args){

	ArrayList <String> arrList = new ArrayList<>();
	arrList.add("A");
	arrList.add("D");
	arrList.add("N");
	arrList.add("G");
	arrList.add("S");	
	System.out.println(arrList);
	arrList.remove("S");
	System.out.println(arrList);

	ArrayList <String> arrRemove = new ArrayList<>();
	arrRemove.add("A");
	arrRemove.add("N");
	arrList.removeAll(arrRemove);
	System.out.println(arrList);
	
	int arrSize = arrList.size();//Getting the arrayList size
	System.out.println("Array size: "+arrSize);

	ArrayList <String> arrAdd = new ArrayList<>();
	arrAdd.add("S");
	arrAdd.add("A");
	arrAdd.add("N");
	arrAdd.add("D");
	arrAdd.add("U");
	arrAdd.add("N");
	arrAdd.add("I");
	arrAdd.add("B");
	arrAdd.add("A");
	arrAdd.add("B");
	arrAdd.add("A");
	arrList.addAll(arrAdd);
	System.out.println (arrList);

	//arrList.clear();//Removes everything from the array
	System.out.println (arrList);

	System.out.println ("Does contain \"S\" "+arrList.contains("S"));
	
//	arrList.clear();//Removes everything from the array
	
	System.out.println ("Is empty "+arrList.isEmpty());


	//Iterator interface --Forward direction only

	Iterator itr = arrList.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	
	
	
	
}
}
