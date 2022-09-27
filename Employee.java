import java.util.Scanner;

public class Employee
{
    String Firstname,lastname,designation;
    int age;
    Employee ()
    {
        this.Firstname = "Muthubharathi";
        this.lastname = "Gnanavel";
        this.age = 22;
        this.designation = "Software Engineer ";
    }
    Employee(String Fn,String ln,int a,String des)
    {
        this.Firstname = Fn;
        this.lastname = ln;
        this.age = a;
        this.designation = des;
    }
    public void display()
    {
        System.out.println("Firstname : " +this.Firstname);
        System.out.println("Lastname : " +this.lastname);
        System.out.println("Age  : " +this.age);
        System.out.println("Designation: " +this.designation);
        System.out.println();
    }
    // OVERRIDING THE TOSTRING CLASS
    public String toString()
    {
        return this.Firstname=" "+this.lastname+" of age "+this.age+"has a designation of "+this.designation;
    }
    public void setFirstname(String Fn)
    {
        this.Firstname =Fn;

    }
    public void setlastname(String ln)
    {
        this.lastname =ln;
    }
    public void setage(int a)
    {
        this.age =a;
    }
    public void setdesignation(String des)
    {
        this.designation =des;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        Employee emp =new Employee();
        Employee emp1 =new Employee("Mohana","devi",29,"Analyst");
        emp.display();
        emp.setFirstname("M S");
        emp.setlastname("dhoni");
        emp.setage(41);
        emp.setdesignation("Cricket player");
        emp.display();
        emp1.display();
        System.out.println(emp.toString());

    }
}
