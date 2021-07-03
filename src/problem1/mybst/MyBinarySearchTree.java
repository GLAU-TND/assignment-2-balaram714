/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree
public class MyBinarySearchTree {
int z=2;
static int a=2;
int c=1;
static E[] data= new E[a];
 public Node left(Node x)
 {
    return x.leftside;
}
public Node right(Node x)
 {
    return x.rightside;
}
public void traversalleft()
{
  Node current=root;
  if(current==null)
      System.out.println("empty try");

else
{
  data[0]=current.left.data;
  data[1]=current.right.data;
  system.out.println(data[0]);

}
change();
c=search();
If(c==1)
{
while(c!=1)
{
for(int l=1;l<=a;l++)
{
  if(l%2!=0)
  {
    System.out.println(data[l]);
}
change();
c=search();
}

}
}
}
public void change()
{
   int k=0;
    int q=2;
    z=z*2;
    int t=0;
E[]newdata=(E[])new object[z];
for(int j=0;j<z;j++)
{
  if(t==0)
  newdata[j]=data[k].left();
  else
   newdata[j]=data[k].right();
q++;
if(q%2==0)
{
  K++;
  t=1;
}
}
data=newdata;
}
public int search()
{
  int response=1;
for(int u=0;u<z;u++)
{
if(data[u]==null)
{
  response=-1;
  break;
}
}
return response;
}
}
