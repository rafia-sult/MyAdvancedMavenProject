package java_code_strings_feb_28th_2023;

public class MemoryLocations_In_Java {

	public static void main(String[] args) {
		
		// These are memory spaces 

		// Heap Area [SCP/SLP is inside the heap area] 
		// Stack Area
		// Method Area
		// PC Register
		// NativeMethod Area 
		
		
		// Which key is used to create Object
		// - new keyword
		// - the moment new keyword is used to create an Object, the object occupied memory is heap area
		
		String S1 = new String(); // S1 object is created in heap area
		
		String S2 = new String("java"); // 2 object is created
		// the object created by new keyword will store in heap area
		// the literal "java" created will act as another object and it will be taking memory in SLP/SCP 
		// SLP/SCP- String literal pull / String constant pull
		// anything stored in SLP/SCP will be pointed by jvm internal reference 
		
		String S3 = "python"; // 1 object is created in SCP/SLP area 
		
		String S4 = "java"; // 0 object will be created cause java is already created by S2 but it will be pointed by S4 directly instead of jvm internal reference 
		String S5 = "java"; // 0 object is created and S5 will also point to java 
		
		
		
	}

}
