import java.util.Scanner;
public class Sum_N_Array {
    public static void main(String[] args) {
        System.out.println("Enter N of Array: ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Enter "+n+" of Array numbers: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
           sum+=arr[i];
        }
        System.out.println("Sum of "+n+" array is: "+sum);
    }
}
