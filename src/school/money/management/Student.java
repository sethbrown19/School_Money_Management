
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
	 * fees for every student is $30k per year
	 * fees paid at the start is 0
	 * @param id is the unique number for each student
	 * @param name is the name of the student
	 * @param grade is the grade the student is in
	 */
	public Student(int id, String name, int grade) 
	
	{
		feesPaid = 0;
		feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	// We will not alter students name or id
	
	/**
	 * Used to update what grade the student is in
	 * @param grade
	 */
	public void setGrade(int grade) 
	{
		this.grade = grade; 
	}
	
	
	/**
	 * Add fees to the fees paid
	 * The school will receive the funds
	 *  @param fees the student pays
	 */
	
	public void updateFeesPaid(int fees)
	{
		feesPaid += fees;
	}

	public int getId() 
	{
		return id;
	}

	public String getName() 
	{
		return name;
	}

	public int getGrade() 
	{
		return grade;
	}

	public int getFeesPaid() 
	{
		return feesPaid;
	}

	public int getFeesTotal() 
	{
		return feesTotal;
	}
	
	
	
}
