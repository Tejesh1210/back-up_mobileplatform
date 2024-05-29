package April17thAssignments;

import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
      if (n <= 1) {
        return n;
      }
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  
    public static int[] fibonacciArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = fibonacci(i);
      }
      return a;
    }
  
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int[] a = fibonacciArray(n);
      System.out.print(n + " Fibonacci numbers: ");
      for (int p: a) {
        System.out.print(p + " ");
      }
    }
  }
