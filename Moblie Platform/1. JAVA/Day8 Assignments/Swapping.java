package April15thAssignments;

public class Swapping 
{
    
    public static void main(String[] args) 
    {
        int x = 50;
        int y = 20;
        System.out.println("\nBefore swapping: x =  " + x + " , y =  " + y);
       x = x + y;
       y = x - y;
       x = x - y;

     System.out.println("\nAfter swapping:");
     System.out.println("x = " + x);
     System.out.println("y = " + y);
    }  
}
