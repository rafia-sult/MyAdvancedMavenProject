package group_study_mar_23_2023;

public class concatination {

	// I am Mr. X. I am 30 years old.

	public static void main(String[] args) {

		String part1 = "I";
		String part2 = "am";
		String part3 = "Mr";
		String part4 = "X";
		String part5 = "years";
		String part6 = "old";
		String period = ".";
		String space = " ";
		int agePart1 = 10;
		int agePart2 = 3;

		System.out.println(part1 + space + part2 + space + part3 + period + space + part4 + period + space + part1
				+ space + part2 + space + (agePart1 * agePart2) + space + part5 + space + part6 + period);
	}

}
