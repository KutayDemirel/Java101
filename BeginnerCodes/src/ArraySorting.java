import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Size of array  :");
        num = input.nextInt();
        int [] list = new int[num];
        System.out.println("Enter the values of array  :");
        for(int i = 0 ; i < num ; i++){
            System.out.print(i+1 + ". value  :");
            list[i] = input.nextInt();
        }
        Sort(list);
        System.out.println(Arrays.toString(list));
    }
    static int[] Sort(int[] arr){
        int temp1;
        for(int temp = 0; temp <arr.length; temp++){
            for(int i = 0 ; i < arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    temp1 = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp1;
                }
            }
        }
        return arr;
    }
}
