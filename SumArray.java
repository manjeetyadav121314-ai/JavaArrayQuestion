import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of element : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int sum = 0;

        System.out.print("Enter the array of number : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum of array : " + sum);
        sc.close();
    }
}
