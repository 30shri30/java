//Assignment 3 setB Q1

import java.io.*;
import java.lang.*;
import java.util.*;
abstract class order
{
  int id;
  String desp;
  abstract void accept();
  abstract void display();
}
class purchaseorder extends order
{
  String cusname;
  void accept()
{
  try
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter purchase order details:");
    System.out.println("enter id,enter description,enter customer name:");
    id=Integer.parseInt(br.readLine());
    desp=br.readLine();
    cusname=br.readLine();
  }
  catch(Exception e)
  {
     System.out.println("exception caught");
  }
}

void display()
{
   System.out.println("purchase details");
   System.out.println("id:"+id);
   System.out.println("description:"+desp);
   System.out.println("customer name:"+cusname);
   
}
}
class salesorder extends order
{
  String venname;
  void accept()
{
  try
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter purchase order details:");
    System.out.println("enter id,enter description,enter vendor name:");
    id=Integer.parseInt(br.readLine());
    desp=br.readLine();
    venname=br.readLine();
  }
  catch(Exception e1)
  {
     System.out.println("exception caught");
  }
}
void display()
{
   System.out.println("purchase details");
   System.out.println("id:"+id);
   System.out.println("description:"+desp);
   System.out.println("vendor name:"+venname);
   
}
}
public class Assetba
{
  int id;
  String desp,cusname,venname;
  public Assetba(int id,String desp,String cusname,String venname)
  {
   this.id=id;
   this.desp=desp;
   this.cusname=cusname;
   this.venname=venname;
  }
  public static void main(String []args)throws IOException
  {
    int i,ch;
    BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
    do
    {
      System.out.println("\n 1.purchase oreder\n 2.sales oreder\n 3.exit\n");
      System.out.println("enter your choice of order");
      ch=Integer.parseInt(br.readLine());
      switch(ch)
      {
        case 1:order[]p=new purchaseorder[3];
        for(i=0;i<3;i++)
        {
          p[i]=new purchaseorder();
          p[i].accept();
         }
         for(i=0;i<3;i++)
         {
           p[i].display();
         }
         break;
          
        case 2:order[]s=new salesorder[3];
        for(i=0;i<3;i++)
        {
         s[i]=new salesorder();
         s[i].accept();
        }
        for(i=0;i<3;i++)
        {
          s[i].display();
        }
        break;
      }
    }
    while(ch!=3);
  }
}
              
                        
  
