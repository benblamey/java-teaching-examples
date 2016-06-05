
public class Foo {

	
	
	int[] _numbers = new int[10]; 
	int index;
	
	public synchronized void add(int a ) {
		_numbers[index] = a;
		index++;
		
		index = index % 10;
	}
	
}
