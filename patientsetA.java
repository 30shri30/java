import java.util.*;
class patient
{
  String name;
  int age;
  int oxylevel;
  int HRCTreport;
  patient(String name,int age,int oxylevel,int HRCTreport)
  {
    this.name=name;
    this.age=age;
    this.oxylevel=oxylevel;
    this.HRCTreport=HRCTreport;
  }
}
   public class patientsetA
   {
     public static void main(String args[]) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("how many patient you want insert:");
       int number=sc.nextInt();
       patient[]ob=new patient[number];
       for(int j=0;j<number;j++)
       {
         System.out.println("enter name:");
         String name=sc.next();
         System.out.println("enter age:");
         int age=sc.nextInt();
         System.out.println("enter oxygenlevel:");
         int oxylevel=sc.nextInt();
         System.out.println("enter HRCT report:");
         int HRCTreport=sc.nextInt();
         ob[j]=new patient(name,age,oxylevel,HRCTreport);
       }
       for(int j=0;j<number;j++)
       {
         if(ob[j].oxylevel<95 && ob[j].HRCTreport > 10)
         {
           try
           {
              throw new NullPointerException("No covid positive\n");
           }
           catch(Exception e)
           {
            System.out.println("patient is covid positive(+) & need to hospitalized");
           }
         }
         else
         {
            System.out.println("patient name:"+ob[j].name);
            System.out.println("patient age:"+ob[j].age);
            System.out.println("patient oxylevel:"+ob[j].oxylevel);
            System.out.println("patient HRCT report:"+ob[j].HRCTreport);
         }
       }
   }
}
       
         
               
               
        
    
    
