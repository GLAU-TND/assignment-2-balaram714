/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;
import myqueue.Myqueue;
public class MyPriorityQueue {
Student[]data;
Myqueue a=new Myqueue();
Myqueue b= new Myqueue();
int arr[];
public void Add(Student x)
{
a.enqueue(x);
System.out.println("student added");
}
public int size()
{
return a.getSize();
}
public void SorT()
{
int i=0;
data=new Student[size];
while(a.isEmpty!=true)
{
data[i]=a.dequeue();
i++;
}
arr=new Int[size];

for(int i=0;i< size;i++)
{
arr[i]=data[i].rollno;
}
arr.sort();
for(int i=0;i<size;i++)
{
for(int j=0;j<size;j++)
{
if((data[j].rollno)==arr[i])
  b.Add(data[j]);
}
}
public void display()
{
while(b.isEmpty()!=true)
{
System.out.println(b.dequeue());
}
}
}
}
