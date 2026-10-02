import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of element : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int count = 0;

        System.out.println("Enter the element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number find of frequency : ");
        int fre = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (fre == arr[i]) {
                count = count + 1;
            }
        }

        System.out.println("frequency : " + count);
        sc.close();

    }
}
