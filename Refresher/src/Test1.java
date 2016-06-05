import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Test1 {

	private static final int _myFavouriteNumber = 42;
	
	private static Test1 _instance;
	private Test1() {
		
		Double foo = 6.0;

		
		new Scanner();

		foo.toString();
		

		Test1 a = new Test1();
		Test1 b = new Test1();
		Test1 c = new Test1();
		
		//a == b; // false.
		a.equals(b);
		
		
		for (int i = 0; i < 10; i++) {
		
		}
		
		
	}
	
	@Override
	public String toString() {
		return "Test1: " + this._myInt + " " + this._myString;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Test1) {
			Test1 other = (Test1)obj;
			
		}
		return false;

	}
	
	
	public static Test1 getInstance() {
		if (null == _instance) {
			_instance = new Test1();
		}
		return _instance;
		
		
	}


	
	public static void main(String[] argssdfsdfsdfsdfdsfsdfdsfsdfsdf) {
		
		System.out.println("hello");
		
		while (5 < 6) {
			
			
			break;
		}
		
		
		List<Integer> myList = new ArrayList();
		List<Integer> myList2 = new LinkedList();
		Boolean result = myList.add("sdfsdf");
		
		
		
		
		
		int foo = Test1._myWibble;
	}
	
	private void foo() {
		System.out.println(_myWibble);
	}
	
	
	private static void someMethod() {
		//System.out.println(_myString);
	}
	
	public static int _myWibble = 42;
	
	private int _myInt;
	private String _myString = "foo";
	
	
}
