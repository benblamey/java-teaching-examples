import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Traditional interaction with the class/type.
		Book b = new Book();
		b.title = "foo";
		b.author = 21;

		// Interaction with the class/type via reflection.
		Class<?> bookClass = Book.class;
		
		
		toJson(bookClass, b);
		
		
		b.title = "new title";
	}

	private static void toJson(Class<?> clazz, Object instance) throws NoSuchMethodException, SecurityException, NoSuchFieldException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for (Field field : clazz.getFields())
		{
			try {
				System.out.println(field.getName()+"="
					+field.get(instance));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		for (Method m : clazz.getMethods()) {
			System.out.println(m.getName());
		}
		
		Class<String> s = String.class;
		s.getMethod("reallyCoolMethod").invoke("sdfsdf", null);
		
		try {
			Method toStringMethod = clazz.getMethod("toString", null);
			System.out.println((String)toStringMethod.invoke(instance, null));
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			throw new AsonException(e);
		}
		
		String className = "foo";
		try {
			
			
			Class<?> targetClass = Class.forName(className);
			Constructor<?> ctor = targetClass.getConstructor(null);
			Object object  = ctor.newInstance(null);
			targetClass.getField("bob").set(object, 12);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}



// field.setAccessible(false);