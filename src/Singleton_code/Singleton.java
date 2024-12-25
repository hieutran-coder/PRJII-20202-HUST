package Singleton_code;

// Xem lai sau khi on tap hDH
	/* public Myclass {
	 * 		private Myclass() {}
	 */
	
	/* public MyClass {
	 * 
	 * 	public static Myclass getInstance(){}
	 */
	
	/* public Myclass {
	 * 
	 * public static MyClass getInstance() {
	 * 		return new MyClass; }
	 * 
	 */
	
	public class Singleton {
		private static Singleton uniqueInstance;
		
		// other useful instance variable here
		
		private Singleton() {}
		
		public static synchronized Singleton getInstance() {
			if (uniqueInstance == null) {
				uniqueInstance = new Singleton();
			}
			return uniqueInstance;
		}
	
}
