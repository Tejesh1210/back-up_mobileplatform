package April17thAssignments;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int k=scan.nextInt();
        int p=linearSearch(a,k);
        System.out.println(p);
       
    }
    static int linearSearch(int a[],int e)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==e)
            return i;
        }
        return -1;
    }
    
}
