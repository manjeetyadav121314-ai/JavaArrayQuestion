import java.util.Scanner;

public class SecondMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of element : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];
        int secondMax = arr[0];

        int min = arr[0];
        int secondMin = arr[0];

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            }
        }
        System.out.println("Largest number : " + max);
        System.out.println("Second Largest number : " + secondMax);
        System.out.println("Smallest number : " + min);
        System.out.println("Second Smallest number : " + secondMin);

        sc.close();
    }
}
