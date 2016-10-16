package student;

/**
* THIS IS A CLASS TO DEFINE THE NECESSARY ATTRIBUTES AND METHODS TO CONCEPTUALIZE A "STUDENT"
* THE SPEPCIFIC TASKS ARE:
* MD.SHARIFUL ISLAM MUBIN
* @15/10/16 (A VERSION NUMBER OR A DATE)
*/
import java.util.Scanner;
import java.io.*;


public class Student {

Scanner input = new Scanner(System.in);
// DECLARE THE IMPORTANT ATTRIBUTES OF A STUDENT. FOR EXAMPLE:
//1.ID
//2. NAME
//3. DEPARTMENT
//4. UNIVERSITY
//5. GPAS IN VARIOUS TERMS (MULTIDIMENSIONAL ARRAYS)
//6. SUBJECTS FOR CURRENT TERMS
//7. CREDITS AND GRADES OF CURRENT TERMS (MULTIDIMMENTIONAL ARRAY)

int id;
String name;
String Department ;
String University ;
double[] GPA = new double[8];
double[][][] CnG = new double[8][5][5];
double CGPA;

/**
* DEFINE A CONSTRUCTOR THAT INITILIZE THE DEFAULT PROPERTIES OF THE STUDENT
*/
public Student(int Id,String Name,String department,String university)
{
id = Id;
name = Name;
Department = department;
University = university ;
}

	/**
	* DEFINE A METHOD TO PRINT THE STUDENTS DETAILS.
	*/
public void studentDetailsById(int id)
{
//write your code here
System.out.println("ID : " + id);
System.out.println("Name : " +name);
System.out.println("Department : " + Department);
System.out.println("University : " + University);
}


/**
* Define a method to update information of students by ID
* Use as many arguments as required.
*/
public void updateStudentById(int id)
{
//Write your code here
//i got confused here.
}

/**
* Define a method to compute the CGPA from the Given term GPA for a particular student.
* se as many arguments as required.
*/
	public double computeCGPAByID()
	{
	// Write your code here
	double cgpa = 0;
	int count = 0;

	for(int i=0;i<8;i++)
	{
	System.out.println("Enter GPA of Sem " + (i+1) +" : ");
	GPA[i]=input.nextDouble();
	}


	for(int i=0;i<8;i++)
	{
	if(GPA[i] == 0)	continue;
	count++;
	cgpa+=GPA[i];
	}
	cgpa/=count;
	CGPA = cgpa;

	return cgpa;
	}


/**
* DEFINE A METHOD TO COMPUTE THE GPA FROM THE GIVEN CREDITS AND GRADES OF ALL THE SUBJECTS
*/

//I GOT CONFUSED IN THIS CALCULATIONS.


/**
* AFTER PERFORMING REQUIRED OPERATIONS ON EACH STUDENT, SAVE THE INFORMATION TO A FILE. USE FILE AND PRINTWRITER CLASS.
* USE AS MANY ARGUMENTS AS REQUIRED.
*
*/
public void saveStudent()
{
//problem in file operation handle.
}

/**
* CREATE A DUMMY FILES WITH INFLAMMATIONS TO DESCRIBE THE PROPERTIES OF A STUDENT OBJECT AND LOAD THE DATA FILES USING JAVA FILE AND SCANNER CLASS.
* USE AS MANY ARGUMENTS AS REQUIRED.
*/
public static void main(String[] args)
{
Student[] students = new Student[50];
Scanner in = new Scanner(System.in);
for(int i=0; in.hasNextLine() ; i++)
{
int p=in.nextInt();
String q=in.next();
String r=in.next();
String s=in.next();
students[i] = new Student(p,q,r,s);
students[i].studentDetailsById(p);
//students[i].updateStudentById(p);

}
}
}
