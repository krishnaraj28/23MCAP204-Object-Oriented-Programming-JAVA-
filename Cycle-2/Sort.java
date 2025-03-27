import java.util.Scanner;
public class Sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter the strings:");           //get the input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();                         //store the in a array
        }
        for (int i=0;i<n-1; i++) {                      
            for (int j=0;j<n-1-i;j++) {
                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {   //check the lexicographic order
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted strings:");              //print the sorted array
        for (int i=0;i<arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
