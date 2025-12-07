import java.util.Scanner;
public class Reverse_Array_Brute {
    public static void main(String[] args) {
        System.out.println("Enter N of Array: ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Enter "+n+" of Array numbers: ");
        int[] arr = new int[n];
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            temp[n-1-i]=arr[i];
        }
        System.out.println("Reverse of the Array :");
        for(int i=0;i<n;i++){
          arr[i]=temp[i];
          System.out.print(arr[i]+" ");
        }
    }
}
