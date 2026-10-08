import java.util.Scanner;

class Searchingalgos {

    int[] arr;

    public int linearSearch(int[] arr, int target){
        for(int i =0;i< arr.length;i++){
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;

    }

}

public class Main {
    public static void main(String[] args){
        Searchingalgos s1= new Searchingalgos();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of array : ");
        int capacity= sc.nextInt();


        int arr[] = new int[capacity];

        for(int i=0;i<capacity;i++){
            System.out.println("Enter the value for index "+ i + " :");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value you want to search :");
        int targ = sc.nextInt();
        System.out.println();

        int index = s1.linearSearch(arr,targ);

        if(index == -1){
            System.out.println("number is not present");
        }

        else{
            System.out.println("number is present at index : " + index);
        }


        System.out.println();
    }
}
