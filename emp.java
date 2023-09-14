import java.util.Scanner;
public class emp
{
  int id;
  String name;
  String deptname;
  float salary;
  static int numberofobject=0;
  emp()
  {
    id=0;
    name=" ";
    deptname=" ";
    salary=0;
  }  
emp(int id,String name,String deptname,float salary)
{  
     this.id=id;
     this.name=name;
     this.deptname=deptname;
     this.salary=salary;
     numberofobject++;
}
public void display()
{
    System.out.println("employee id:"+id);
    System.out.println("employee name:"+name);
    System.out.println("employee department:"+deptname);
    System.out.println("employee salary:"+salary);
}
public static void main(String []args)
{
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("How many employees you want to enter:");
  n=sc.nextInt();
  emp[] ob=new emp[n];
  for(int i=0;i<n;i++)
  {
    System.out.println("enter id of empployee");
    int id=(sc.nextInt());
    System.out.println("enter name of employee");
    sc.nextLine();
    String name=sc.nextLine();
    System.out.println("enter department of empployee");
    String deptname=(sc.nextLine());
    System.out.println("enter salary");
    float salary=sc.nextFloat();
    ob[i]=new emp(id,name,deptname,salary);
    System.out.println("\n number of object:"+numberofobject);
  }
  for(int i=0;i<n;i++)
  {
    ob[i].display();
  }
}
}               
