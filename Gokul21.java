import java.util.Scanner;

class Student
{
	public int rollNo;
	public String name;
	public double marks;
	
	public final String college = "ANITS";
	
	static int studentCount = 0;
	
	static
	{
		System.out.println("========================");
		System.out.println("STUDENT MANAGEMENT SYSTEM ");
		System.out.println("========================");
		System.out.println(" System is loading ...");
		
	}
	 Student(int rollNo, String name,double marks)
	 {
		 this.rollNo=rollNo;
		 this.name=name;
		 this.marks=marks;
	 }
	 void displayDetails()
	 {
		 System.out.println("-------------Student Details----------");
		 System.out.println("Roll Number : " + this.rollNo);
		 System.out.println("Name :" + this.name);
		 System.out.println("Marks :" + this.marks);
		 System.out.println("college Name : " + this.college);
		 
	 }
	 void checkResults()
	 {
		 System.out.println("-------------Result------------");
	  if(this.marks>=40)
	 {
		 System.out.println(" you are passed ");
	 }
	 else
	 {
		 System.out.println("you are failed ");
		 
	 }
	 }
	 
	 
}

public class Gokul21
{
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System .in);
		System.out.println(" welcome to student management system \n");
		
		System.out.println("\n Enter roll number :");
		int rollNo = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Student name :");
		String name = sc.nextLine();
		
		System.out.println("Enter marks :");
		double marks = sc.nextDouble();
		
		Student s1 = new Student(rollNo,name,marks);
		
		s1.displayDetails();
		
		s1.checkResults();
		
		sc.close();
		
		
	}
}