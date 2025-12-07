import java.util.Scanner;
public class Reverse_Array_Optimal {
    public static void main(String[] args) {
            System.out.println("Enter N of Array: ");
            Scanner sc=new Scanner(System.in);
            int n= sc.nextInt();
            System.out.println("Enter "+n+" of Array numbers: ");
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n/2;i++){
               int temp=arr[i];
               arr[i]=arr[n-i-1];
               arr[n-i-1]=temp;
            }
            for(int j = 0; j <n; j++)
                System.out.print(arr[j]+" ");
    }
}
