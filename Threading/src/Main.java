
public class Main {

	
	public static void main(String[] args) throws InterruptedException {
		
		Foo foo = new Foo();
		SomeWork sw = new SomeWork(foo);
		
		Thread t = new Thread(sw, "the_other_thread");
		t.start();
		
		int i=0;
		while(true) {
			
			System.out.println("Hello from " 
			+ Thread.currentThread().getName());
			
			foo.add(i++);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		
		
		
	}
}
