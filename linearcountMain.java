import java.util.Scanner;

class Searchingalgos {

    int[] arr;

    public int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int linearSearchO(int[] arr, int target){
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}

public class linearcountMain {
    public static void main(String[] args){
        Searchingalgos s1 = new Searchingalgos();
        int targ = 4;

        // Fixed: Added the missing semicolon at the end
        int arr[] = {1, 2, 3, 4, 4, 4, 6};

        // 1. Find the first occurrence index
        int index = s1.linearSearch(arr, targ);

        if(index == -1){
            System.out.println("number is not present");
        }
        else{
            System.out.println("number is present at index : " + index);
        }

        // 2. Fixed: Called your duplicate counting method here
        int occurrences = s1.linearSearchO(arr, targ);
        System.out.println("The number " + targ + " appears " + occurrences + " times.");

        System.out.println();
    }
}
