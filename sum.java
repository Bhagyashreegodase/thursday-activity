// author : bhagyashree 
package com.question1;
 java.util.scanner;
public class sunof extends reverseNO
{
public void sumIs()
{
sacnner sc=new Scanner(system.in);
system .out.println("enter the number to find the sum");
     int num=sc.nextInt();
     int sum=0,digit;
       while(num>0)
 {
         digit=num%10;
          sum=sum+digit;
          num=num/10;
   }
system.out.println(" the sum is "+sum);



}

}