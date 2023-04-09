package collection_framework_march_29th_2023;

import java.util.ArrayList;
import java.util.List;

public class ArraysVsCollectionFramework {

	public static void main(String[] args) {

		// Arrays can store primitive data types? - Yes
		// Arrays can store objects? - Yes
		// Arrays can only homogeneous form of data
		// Once you have declared the size of the array that is fixed, you cannot
		// change it during run time
		// Arrays are in-build features of java

		// this is how arrays can store objects
		ArraysVsCollectionFramework obj1 = new ArraysVsCollectionFramework();
		ArraysVsCollectionFramework obj2 = new ArraysVsCollectionFramework();
		ArraysVsCollectionFramework obj3 = new ArraysVsCollectionFramework();

		ArraysVsCollectionFramework[] allObjects = { obj1, obj2, obj3 };

		// Collection framework can only store non-primitive data types that is
		// wrapperClass, WebElement, String
		// Collection cannot store the 8 primitive data types
		// collection can store heterogeneous form of data
		// collection framework you can increase or decrease the size of the collection
		// even during runtime
		// Collection is a pre-defined API, interfaces and classes with rules are
		// already defined, It is much easier to use it than Array

		

	}

}
