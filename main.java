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

import java.util.*;
public class main{

	public static void main (String[] args){

		ArrayList<String> arr = new ArrayList<>();
		arr.add("Q");
		arr.add("W");
		arr.add("E");
		arr.add("R");
		arr.add("R");
		arr.add("R");
		arr.add("D");

		System.out.println(arr);
		arr.remove("R");//Remove only the last element of the value. Does not remove duplicates. 
		System.out.println(arr);

		ArrayList<String> arremove = new ArrayList<>();
		arremove.add("R");
		arr.removeAll(arremove);
		System.out.println(arr);

	
	}
}