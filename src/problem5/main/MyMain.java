/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;
//executable class
import problem5.student;
import problem5.circularqueue;
import java.util.*;
public class MyMain {
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the no of students");
int b=obj.nextInt();
ArrayQueue c= new ArrayQueue(b);
System.out.println("enter the students");
for(int i=0;i<b;i++)
{
System.out.println("enter the name of the students");
String s=obj.next();
System.out.println("enter the no of backs");
int k=obj.nextInt();
c.offer(new Student(s,k));

}
Student arr[]=new Student[b];
for(int j=0;j<b;j++)
{
arr[j]=null;
}
for(int j=0;j<b;j++)
{
Student ab=c.poll();
if((ab.count!=0)||(ab.count<2))
arr[j]=ab;
}
for(int j=0;j<b;j++)
{
if(arr[d]!=null)
  System.out.println(arr[j].name);
}
}
}
