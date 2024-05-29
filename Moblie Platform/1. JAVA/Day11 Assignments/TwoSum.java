package April17thAssignments;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] p, int t) {
        
        HashMap<Integer, Integer> s = new HashMap<>();

        for (int i = 0; i < p.length; i++) {
            
            int c = t - p[i];
            if (s.containsKey(c)) {
                return new int[]{s.get(c), i};
            }

            s.put(p[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int k=scan.nextInt();
        int[] r = twoSum(a, k);
        System.out.println("The two indices are"+" " +  r[0] + " "+"and" +" "+ r[1]);
    }
}