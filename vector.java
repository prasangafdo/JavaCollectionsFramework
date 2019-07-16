import java.util.*;

class vector{

public static void main (String[] args){

	Vector <String> vector = new Vector<>();
	vector.add("V");
	vector.add("E");
	vector.add("C");
	vector.add("T");


	Vector <String> addVector = new Vector<>();
	addVector.add("O");
	addVector.add("R");

	vector.addAll(addVector);
	System.out.println(vector);

	System.out.println(vector.size());
}
}