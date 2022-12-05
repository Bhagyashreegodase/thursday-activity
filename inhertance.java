//author.bhagyashree
package com.question1;
import java.util. Scanner;
class ReverNo
{
       public void reverse Number()
{
   Scanner sc=new Scanner(system.in);
  system.out.println("Enter the no to reverse");
                      int num=sc.nextInt();   
                      int rev=0;
                      {
                      while(num!=0)
   {
                 int remainder=num%10;
               rev=rev*10+remainder;
              num=num/10;
      }
   system.out.println("the reverse of given no is "+ rev);
         }
         }
   }