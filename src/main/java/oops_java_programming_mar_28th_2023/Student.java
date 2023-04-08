package oops_java_programming_mar_28th_2023;


// set data means setting a data
// get data means getting the data 
public class Student {

	private String student_name;
	private int student_id;

	public void setData(String name, int id) {
		student_name = name;
		student_id = id;
	}

	public String getData() {
		return student_name;

	}

	public int getData1() {
		return student_id;
	}

}
