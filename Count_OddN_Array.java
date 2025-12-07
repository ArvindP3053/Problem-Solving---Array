import java.util.Scanner;
public class Count_OddN_Array {
    public static void main(String[] args) {
        System.out.println("Enter N of Array: ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Enter "+n+" of Array numbers: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==1)
                ++count;
        }
        System.out.println("Count of "+n+" Odd numbers in array is: "+count);
    }
}

