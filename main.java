import java.util.Scanner;

class Searchingalgos {

    public void binarySearch(int[] arr ,int targ){

    int left=0;
    int right = arr.length -1;

    while(left <= right) {

        //formula for finding mid
        int mid = (left + right) / 2;


        //checking for target found
        if (arr[mid] == targ) {
            System.out.println(mid);
            return;

        }

        //checking for right half
        else if (arr[mid] < targ) {
            left = mid + 1;
        }

        //checking for left half
        else {
            right = mid - 1;
        }

    }
        System.out.println("Number not present");

    }


    public void linearSearch(int[] arr, int target){

        for(int i =0;i< arr.length;i++){
            if(arr[i]==target) {
                System.out.println(i);

                }

        }

    }



}

public class main {
    public static void main(String[] args){
        Searchingalgos s1= new Searchingalgos();


        int arr[] = {10,20,30,40,50,60};

        System.out.println("Searching for binary search ");
        s1.binarySearch(arr,90);

        System.out.println("Searching for binary search ");
        s1.binarySearch(arr,50);


    }
}
