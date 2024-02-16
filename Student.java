package Class_Arrays;
import java.util.Scanner;
import java.util.Arrays;
 
public class Student 
{
    public String name;
    public int id;

    public Student(String name, int id) 
    {
        super();
        this.name = name;
        this.id = id;
    }
    
public String getName() 
{
    return name;
}

public void setName(String name)
{
    this.name = name;
}

public int getId() 
{
    return id;
}

public void setId(int id) 
{
    this.id = id;
}

@Override
public String toString() 
{
    return "Student [name=" + name + ", id=" + id + "]";
}
 
public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many student object you want to store");
        int index=sc.nextInt();
  	Student s[]=new Student[index];
  	//   0          	1
  	//[ 1000x	|  2000x	]
  	
  	//  abc  1  	def  2
 	for(int i=0;i<s.length;i++) 
        {
	    System.out.println("Enter the name");
	    String name=sc.next();
	    System.out.println("Enter the id");
	    int id=sc.nextInt();
	    Student s1=new Student(name,id);
	    	  //    2000x  	def  2
	    s[i]=s1;
 	}
 	
 	for(int i=0;i<s.length;i++)
        {
	    System.out.println(s[i]);
 	}	
    }
}
