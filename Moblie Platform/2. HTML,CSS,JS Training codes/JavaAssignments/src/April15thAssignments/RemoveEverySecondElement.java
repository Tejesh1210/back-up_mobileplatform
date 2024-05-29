package April15thAssignments;
 
import java.util.ArrayList;
import java.util.List;

public class RemoveEverySecondElement {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(5);
        a.add(1);
        a.add(7);
        a.add(9);
        a.add(8);
        
        System.out.println("Before removing elements: " + a);
        
        removeEverySecondElement(a);
        
        System.out.println("After removing every second element: " + a);
    }
    
    public static void removeEverySecondElement(List<Integer> l) {
        for (int i = l.size() - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                l.remove(i);
            }
        }
    }
}
