import java.util.Scanner;
public class arrayoperations {
    static void insert(int n, Scanner os){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value of " + i + " element that needs to be inserted:");
            arr[i] = os.nextInt();
        }
        System.out.println("The elements in the array are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        search(arr,os);
        delete(arr,os);
    }
    static void search(int[] arr, Scanner os){
        System.out.println("Enter element that needs to be searched:");
        int val = os.nextInt();
        int n = arr.length;
        for (int i = 0;i < n;i++){
            if (val == arr[i]){
                System.out.println("The element " + val + " is present in the index " + i);
            }
            else
                System.out.println("No elements found");
        }
    }
    static void delete(int[] arr, Scanner os) {
    System.out.println("Enter element that needs to be deleted:");
    int val = os.nextInt();
    int n = arr.length;

    for (int i = 0; i < n; i++) {
        if (val == arr[i]) {
            for (int j = i; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }

            System.out.print("The new array is: ");
            for (int a = 0; a < n - 1; a++) {
                System.out.print(arr[a] + " ");
            }
            break;
        }
    }
}
    public static void main(String[] args) {
        Scanner os = new Scanner(System.in);
        System.out.print("Enter the number of elements in a array:");
        int s = os.nextInt();
        insert(s, os);
    }
}
