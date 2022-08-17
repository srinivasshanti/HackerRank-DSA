import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int n = scan.nextInt();
        int[] A = new int[N];
        
        for (int i=0; i<N; ++i) {
            A[i] = scan.nextInt();
        }
        
        for (int i=0; i<n; ++i) {
            int t = A[0];
            for (int j=0; j<A.length-1; ++j) 
            {
                A[j] = A[j+1];
            } 
        A[A.length-1] = t;
        }
        
        for (int a : A) {
            System.out.print(a+" ");
        }
        
        System.out.println("");
    }
    
    
    
}
