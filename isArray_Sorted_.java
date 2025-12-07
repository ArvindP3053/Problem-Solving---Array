import java.util.Scanner;
public class isArray_Sorted_ {
    public static void main(String[] args) {
        System.out.println("Enter N of Array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter " + n + " of Array numbers: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Sorted s=new Sorted();
        boolean sorted= s.isSorted(n,arr);
        if(sorted)
            System.out.println("Array is in sorted");
        else
            System.out.println("Array is not in sorted");
    }
}
class Sorted{
    public boolean isSorted(int n, int[] arr){
        for (int i = 1; i < n; i++) {
            if(arr[i]<arr[i-1]) {
                return false;
            }
        }
        return true;
    }
}
