package April15thAssignments;
import java.util.Scanner;
public class Prime 
{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count>=1)
        {
            System.out.println("Not a prime number");
        }
        else{
            System.out.println("Prime number");
        }

    }
}
