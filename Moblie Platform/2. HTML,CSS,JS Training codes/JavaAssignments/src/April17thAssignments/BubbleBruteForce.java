package April17thAssignments;
import java.util.Scanner;

public class BubbleBruteForce {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        bruteForceSort(a);
        for(int p:a)
        {
            System.out.println(p);
        }

    }
    static void bruteForceSort(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    
    
}
