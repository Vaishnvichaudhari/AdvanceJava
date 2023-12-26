package day11;

public class ReflectionMain {
	private static void createObject(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class loadedClass = Class.forName(className);
		loadedClass.newInstance();
		
	}

	public static void main(String[] args) {
		try {
			try {
				createObject("day11.Employee");
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}