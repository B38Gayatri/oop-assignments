package com.company;
import java.util.Scanner;
import java.io.*;
public class Hw {
  public static void main(String[] args) {
    Scanner abc = new Scanner(System.in);
    //   q1
    int a = abc.nextInt();
    int b = abc.nextInt();
    System.out.print("1st number is ");
    System.out.println(a);
    System.out.print("2nd number is ");
    System.out.println(b);
    int sum = a + b;
    System.out.print("Their sum is ");  
    System.out.println(sum);
    int sub = a - b;
    System.out.print("Their sub is ");
    System.out.println(sub);
    int div = a/b;
    System.out.print("Their div is ");
    System.out.println(div);
    int mul = a*b;
    System.out.print("Their mul is ");
    System.out.println(mul);
  }
}
