package Singleton_code;

public class Singleton3 {
	private volatile static Singleton3 uniqueInstance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (uniqueInstance == Null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton3();				
					}
			}
		}
		return uniqueInstance;
	}
	
}
