import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
class Exception11 extends Exception{
@Override
public String toString() {
return "This is not allowed";
}
@Override
public String getMessage() {
return "Error";
}
}
class MaxInput extends Exception{
@Override
public String toString() {
return "Max Limit Reached";
}
}
public class assignment_6 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a choice");
System.out.println("Press 1 for ArithmeticException");
System.out.println("Press 2 Custom Exception and If you enter 5 , you will get error");
System.out.println("Press 3 for ArrayIndexOutOfBoundsException");
System.out.println("Press 4 for Exception when the entered word's first letter be x");
System.out.println("Press 5 for When you try to enter 7000 and above numbers to multiply ,
you get an error");
System.out.println("Press 6 IO Exception");
System.out.println("Press 7 for NumberFormatException");
System.out.println("Press 8 for NullPointerException");
System.out.println("Press 9 for FileNotFoundException");
System.out.println("Press 10 for NegativeArraySizeException");
int choice = sc.nextInt();
switch(choice){
case 1:
try{
int c = 5/0;
System.out.println(c);
}
catch (ArithmeticException e){
System.out.println(e);
}
break;
case 2:
int d = sc.nextInt();
while(d==5){
try{
throw new Exception11();
}

catch (Exception11 e){

System.out.println(e.toString());

}
break;
}
break;
case 3:
int[] arr = new int[4];
try{
int i = arr[4];
}
catch (ArrayIndexOutOfBoundsException e){
System.out.println(e);
}
break;
case 4:
String ef = sc.next();
while(ef.startsWith("x")){
try{
System.out.println();
throw new Exception11();
}

catch (Exception11 e){

System.out.println(e.getMessage());
}
break;
}
break;
case 5:
int a = sc.nextInt();
int b = sc.nextInt();
while(a>=7000 || b>=7000){
try {
throw new MaxInput();
} catch (MaxInput e) {
System.out.println(e);
break;
}
}

if(a>=7000 || b>=7000){

}
else{
System.out.println(a*b);
}
break;
case 6:
try{
throw new IOException("Sorry device error");
}

catch (IOException e){
System.out.println(e);
}
break;
case 7:
try{
int af = Integer.parseInt(null); //throws Exception as
// the input string is of illegal format for parsing as it is null.

System.out.println(af);

}

catch(NumberFormatException e){
System.out.println(e);
}
break;
case 8:
try {
String att = null; //null value
System.out.println(att.charAt(0));
} catch(NullPointerException e) {
System.out.println("NullPointerException..");
}
break;
case 9:
try {
// Following file does not exist
File file = new File("E://file.txt");
FileReader fr = new FileReader(file);
} catch (FileNotFoundException e) {
System.out.println("File does not exist");
}
break;
case 10:
int[] arrneg = new int[-1];
try{

System.out.println(arrneg[0]);
}

catch (NegativeArraySizeException e){

System.out.println(e);
}
break;
default:
System.out.println("Wrong choice");
break;
}
