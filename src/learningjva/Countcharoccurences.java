package learningjva;

import java.util.HashMap;

public class Countcharoccurences {

	public static void main(String[] args) {
		String string= "abcdabcaaaannnbbbbbcccc";
		
		
		char arr[]= string.toCharArray();
		HashMap <String, Integer> map= new HashMap <String, Integer>();
       for (int j = 0; j < arr.length; j++) {
		if (map.containsKey(arr[j]+"")) {
			int i= map.get(arr[j]+"");
			i++;
			map.put(arr[j]+"", i);//update the value of arr[j]
		}
		else {
			map.put(arr[j]+"", 1); //concat sring
		}
	}
       System.out.println(map.toString());
       
	}

}
