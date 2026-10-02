import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of element : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                countEven = countEven + 1;
            } else {
                countOdd = countOdd + 1;
            }
        }
        System.out.println("Count of even array : " + countEven);
        System.out.println("Count of odd array : " + countOdd);

        sc.close();
    }
}
