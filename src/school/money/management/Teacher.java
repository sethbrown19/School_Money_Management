package school.money.management;
/**
 * 
 * @author sethb 22 Dec 2020
 * this class will be used to understand the teachers
 * identification and salary
 */

public class Teacher 
{
	private int id;
	private String name;
	private int salary;
	
	/**
	 * Creating a new teacher object
	 *
	 * @param id is the unique id of the teacher
	 * @param name is the name of the teacher
	 * @param salary is how much the teacher gets paid
	 */
	public Teacher(int id, String name, int salary) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public int getSalary() 
	{
		return salary;
	}
	 
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}

}
