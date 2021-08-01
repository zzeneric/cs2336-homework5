// Raghav Pillai, 7/24/21

import java.util.ArrayList;
import java.util.Scanner;

public class sortArrayList{
    public static void sort(ArrayList<Integer> list){ // Sort integers (input arraylist)
        for (int i = 0; i < 5; i++) {
            int min = list.get(i);
            int id = i;

            for (int x = i + 1; x < list.size(); x++) {
                if (min > list.get(x)) {
                    min = list.get(x);
                    id = x;
                }
            }
            if (id != i){
                list.set(id, list.get(i));
                list.set(i, min);
            }
        }
    }

    public static ArrayList<Integer> returnArray(){ // Get inputs for array, return array
        Scanner sc = new Scanner(System.in); // New scanner for input
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Print five integers (each integer follows return)");
        for(int i=0; i<5; i++){ // Input 5 integers
            arr.add(sc.nextInt());
        }
        
        sc.close();
        return arr;
    }

    public static void main(String args[]){ // Main
        ArrayList<Integer> arr = returnArray(); // Get array
        sort(arr); // Sort array (pass array in)

        System.out.print("Sorted array: "); // Display array
		for (int i=0; i<arr.size(); i++){
			System.out.print(arr.get(i) + " ");
		}
    }
}