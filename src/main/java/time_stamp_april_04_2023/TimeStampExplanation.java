package time_stamp_april_04_2023;

import java.util.Date;

public class TimeStampExplanation {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString()); 
		//i want to replace the spaces with underscore, replace the colon with underscore
		System.out.println(date.toString().replace(" ", "_").replace(":", "_"));
		//when you want to remove certain part at .substring and the index place 
		System.out.println(date.toString().replace(" ", "_").replace(":", "_").substring(8, 19));
		//when you want to replace _ with nothing 
		System.out.println(date.toString().replace(" ", "_").replace(":", "_").substring(8, 19).replace("_", ""));

		
	}

}
