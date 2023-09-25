//Assignment3 setB Q2

import java.util.*;
import java.io.*;
interface product1
{
}
class product implements product1
{
   int id,quantity;
   String name;
   double cost;
public product(int id,String name,double cost,int quantity)
{
  this.id=id;
  this.name=name;
  this.cost=cost;
  this.quantity=quantity;
}
public static void main(String []args)throws IOException
{
  int n,i,count=0;
  int id,quantity;
  String name;
  double cost;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the no of products:");
n=Integer.parseInt(br.readLine());
product p[]=new product[n];
for(i=0;i<n;i++)
{
  System.out.println("enter product id:");
  id=Integer.parseInt(br.readLine());
  System.out.println("enter product name:");
  name=br.readLine();
  System.out.println("enter the quantity:");
  quantity=Integer.parseInt(br.readLine());
  System.out.println("enter the cost:");
  cost=Double.parseDouble(br.readLine());
  p[i]=new product(id,name,cost,quantity);
  count++;
}
if(p[0]instanceof product1)
{
  System.out.println("product marker interface");
}
System.out.println("ID\tname\tcost\tquantity");
for(product p1:p)
{
  System.out.println(p1.id+"\t"+p1.name+"\t"+p1.cost+"\t"+p1.quantity);
}
System.out.println("count:"+count);
}
}
      
        
