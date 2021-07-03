/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
import myqueu.MyPriorityQueue;
import node.Student;
public class MyMain {
MyPriorityQueue g=new MyPriorityQueue();
g.Add(new Student(balaram,3));
g.Add(new Student(goggo,1));
g.Add(new Student(dealer,2));
g.Add(new Student(repoter,5));
g.Add(new Student(gollu,4));
g.SorT();
g.display();
//display all the students in sorted order accordin to the roll no.
}
