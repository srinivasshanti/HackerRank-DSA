import java.io.*;
import java.util.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        //input to array
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        
        for (int i = 0; i < n / 2; i++) {
            int t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
        }
        
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    
    }
}
