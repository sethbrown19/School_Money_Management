
package school.money.management;

/**
 * @author sethb 22 Dec 2020
 *this class is responsible to keep track of students
 * identifiers and fees 
 */
public class Student
{
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/** 
	 * Create new student object by initializing values
	 * @param id is the unique number for each student
	 * @param name is the name of the student
	 * @param grade is the grade the student received in the class
	 */
	public Student(int id, String name, int grade) 
	
	{
		this.id = id;
		this.name = name;
		this.grade = grade;
		
	}
}
