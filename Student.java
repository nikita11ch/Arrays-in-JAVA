//creating array of non-primitive type
package Class_Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Student
{
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }
    
    
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of student to store data :");
        int size = sc.nextInt();
        Student []student = new Student[size];
        
        for(int i=0;i<student.length;i++)
        {
            System.out.println("Enter the student name :");
            String name = sc.next();
            System.out.print("Enter roll no. : ");
            int id = sc.nextInt();
            Student s = new Student(name,id);
            
            student[i] = s;
        }
        for (int i=0;i<student.length;i++)
        {
            System.out.println(student[i]);
        }
        
        
    }  
}

 