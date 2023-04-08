package oops_java_programming_mar_28th_2023;
/*
 * mechanism of wrapping data (variable/methods) together into a single unit
 * steps to achieve encapsulation 
 * 1. declare the variable as private [this is known as data hiding]
 * 2. provide the setter and getter method to modify and view the data 
 * 
 *https://www.javatpoint.com/encapsulation
 *
 */
public class Encapsulation { //suppose this is a class named student 
	
	private String student_name;
	private int student_id;
	
	public void setData(String name, int id) {
		student_name = name; 
		student_id = id; 
	}

}
