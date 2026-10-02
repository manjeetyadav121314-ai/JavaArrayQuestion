import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of element : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the swarch number : ");
        int x = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (x == arr[i]) {
                System.out.println("Your search index of element is : " + i);
            }
        }
        sc.close();
    }
}
