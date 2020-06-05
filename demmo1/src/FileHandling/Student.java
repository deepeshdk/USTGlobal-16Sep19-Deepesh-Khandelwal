package FileHandling;
import java.io.Serializable;
public class Student implements Comparable<Student>,Serializable
{
  static int cCode;
  int id;
  String name;
 transient double perc;
 
public Student(int id, String name, double perc) 
{
	this.id = id;
	this.name = name;
	this.perc = perc;
}
@Override
public String toString() 
{
	return "Student ["+cCode +","+ id + "," + name +","+perc+"]";
}
@Override
public int compareTo(Student o) 
{
	return this.id-o.id;
}
}