package com.company;
import java.util.Scanner;
import java.io.*;
public class Hw {
  public static void main(String[] args) {
    Scanner abc = new Scanner(System.in);
    // BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter student name ");
    java.lang.String nmg = abc.nextLine();
    System.out.println("Enter Prn no");
    int prn = abc.nextInt();
    System.out.println("Enter student email ");
    String email = abc.next();
    System.out.println("Enter roll no");
    int roll = abc.nextInt();
    System.out.println("Enter student address ");
    java.lang.String addr = abc.next();
    System.out.println(nmg);
    System.out.println(prn);
    System.out.println(email);
    System.out.println(addr);
}
}
