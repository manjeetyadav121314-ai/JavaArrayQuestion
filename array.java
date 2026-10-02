import java.util.Scanner;

public class array {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter the size");
    //     int size = sc.nextInt();

    //     int marks[] = new int[size];

    //     System.out.println("Enter the elements");
    //     for (int i = 0; i < size; i++) {
    //         marks[i] = sc.nextInt();
    //     }

    //     System.out.println("Enter the find element");
    //     int x = sc.nextInt();

    //     for (int i = 0; i < size; i++) {
    //         if (x == marks[i]) {
    //             System.out.println("index : " + i);
    //         }
    //     }
    //     sc.close();
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter the size of names : ");
    //     int size = sc.nextInt();

    //     System.out.println("Enter the name");
    //     String names[] = new String[size];
    //     for(int i=0; i<size; i++) {
    //         names[i] = sc.next();
    //     }
    //     for(int i=0; i<size; i++) {
    //         System.out.println(names[i]);
    //     }
    //     sc.close();
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter the size of element : ");
    //     int size = sc.nextInt();

    //     int arr[] = new int[size];

    //     for(int i=0; i<size; i++) {
    //         arr[i] = sc.nextInt();
    //     }
    //     int max = arr[0];
    //     int min = arr[0];

    //     for(int i=0; i<size; i++) {
    //         if(arr[i] < min) {
    //             min = arr[i];
    //         }
    //         if(arr[i] > max) {
    //             max = arr[i];
    //         }
    //     }
    //     System.out.println("Largest number : " + max);
    //     System.out.println("Smallest number : " + min);

    //     sc.close();
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the element");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<size; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest number : " + max);
        System.out.println("Smallest number : " + min);

        sc.close();
    }
}
