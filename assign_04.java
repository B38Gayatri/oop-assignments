class Employee{
String Firstname;
String lastname;
double salary;
double raise;
public Employee() {
Firstname = "Siddharth ";
this.lastname = "Sutar";
this.salary = 130000;
}
public String getFirstname() {
return Firstname;
}
public void setFirstname(String firstname) {
Firstname = firstname;
}
public String getLastname() {
return lastname;
}
public void setLastname(String lastname) {
this.lastname = lastname;
}
public double getSalary() {
if(salary<0){
salary = 0;
}
else{
System.out.println("Salary of empolyee is "+salary);
}
System.out.print("Salary of employee is ");
return salary;
}
public void setSalary(double salary) {
this.salary = salary;
}

public void getRaise(){
raise = salary + (salary/10);
System.out.println("Salary after Raise is "+raise);
}
}

public class practiceset4 {
public static void main(String[] args) {
Employee sid = new Employee();
Employee piyush = new Employee();
System.out.print(sid.getFirstname());
System.out.println(sid.getLastname());
System.out.println(sid.getSalary());
sid.getRaise();
System.out.println("\n");
piyush.setFirstname("Piyush");
piyush.setLastname(" Thite");
piyush.setSalary(150000);
System.out.print(piyush.getFirstname());
System.out.println(piyush.getLastname());
System.out.println(piyush.getSalary());
piyush.getRaise();
}
}
