// Raghav Pillai, 7/24/21

import java.util.ArrayList;
import java.util.Scanner;

public class removeDuplicates{
    public static void removeDuplicate(ArrayList<Integer> list){ // Remove all duplicate integers (input arraylist)
        for (int i=0; i<list.size()-1; i++){
			for (int j=i+1; j<list.size(); j++){
				if (list.get(i) == list.get(j)){
					list.remove(j);
                }
			}
		}
    }

    public static ArrayList<Integer> returnArray(){ // Get inputs for array, return array
        Scanner sc = new Scanner(System.in); // New scanner for input
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Print ten integers (each integer follows return)");
        for(int i=0; i<10; i++){ // Input 10 integers
            arr.add(sc.nextInt());
        }
        
        sc.close();
        return arr;
    }

    public static void main(String args[]){ // Main
        ArrayList<Integer> arr = returnArray(); // Get array
        removeDuplicate(arr); // Remove duplicates (pass array in)

        System.out.print("The distinct integers are "); // Display array
		for (int i=0; i<arr.size(); i++){
			System.out.print(arr.get(i) + " ");
		}
    }
}