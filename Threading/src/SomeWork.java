
public class SomeWork implements Runnable {

	private Foo _foo;

	public SomeWork(Foo foo) {
		_foo = foo;
	}

	@Override
	public void run() {

		int i =0;
		
		while(true) {
		
			System.out.println("Hello from " 
			+ Thread.currentThread().getName());
		
			_foo.add(i++);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			boobs 	throw new RuntimeException(e);
			}
			
		}
		
		
	}
	
	
}
