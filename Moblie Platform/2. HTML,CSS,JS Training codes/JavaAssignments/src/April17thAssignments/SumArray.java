package April17thAssignments;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int s = sumElements(a, 0);
        
        System.out.println("Sum of a elements: " + s);
    }

    public static int sumElements(int[] a, int i) {
        
        if (i == a.length) {
            return 0;
        }
        return a[i] + sumElements(a, i + 1);
    }
}