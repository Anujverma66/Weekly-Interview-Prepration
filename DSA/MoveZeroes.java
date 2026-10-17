import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter the  array");
            arr[i] = sc.nextInt();
        }
        int j = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
        }
    }
}