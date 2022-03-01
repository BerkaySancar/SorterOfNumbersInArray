import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Array size : ");
        int size = scan.nextInt();

        int[] arr = new int[size];


        int count = 0; // for array elements.
        int count2 = 1; // for number of elements to print.
        int elements;
        System.out.println("Enter array elements: ");
        do {
            System.out.print("Element " + count2 + ": ");
            elements = scan.nextInt();
            arr[count++] += elements;
            count2++;
        } while (count != size);
        Arrays.sort(arr);
        System.out.println("Sorted Elements = " + Arrays.toString(arr));
    }
}
