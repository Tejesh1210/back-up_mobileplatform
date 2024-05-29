package April17thAssignments;

import java.util.Scanner;

public class SliceArray {

    public static int[] sliceArray(int[] arr, int startIndex, int endIndex) {
      
      if (startIndex < 0 || startIndex >= endIndex || endIndex > arr.length) {
        throw new IllegalArgumentException("Invalid start or end index");
      }
  

      int length = endIndex - startIndex;

      int[] slicedArray = new int[length];

      System.arraycopy(arr, startIndex, slicedArray, 0, length);
  
      return slicedArray;
    }
  
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
      int[] slicedArray = sliceArray(a, 1, 4); 
  
      System.out.print("Original array: ");
      for (int p : a) {
        System.out.print(p + " ");
      }
      System.out.println();
  
      System.out.print("Sliced array: ");
      for (int p : slicedArray) {
        System.out.print(p + " ");
      }
    }
  }
