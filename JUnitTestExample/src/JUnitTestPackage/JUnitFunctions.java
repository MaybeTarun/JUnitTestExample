package JUnitTestPackage;

public class JUnitFunctions {
	static void AddStrings(String a,String b) {
	    System.out.println("Addition Of your String :\n"+(a+b));
	  }
	static void AddNumbers(int a,int b) {
		System.out.println("Sum Of your Number :"+(a+b));
	  }
	
	public static void main(String[] args) {
		JUnitFunctions myObj = new JUnitFunctions();
		myObj.AddStrings("Tarun","Gupta");
		myObj.AddNumbers(5,3);

	}	
}
