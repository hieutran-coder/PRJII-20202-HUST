package AdapterandFacadePattern;

public class DuckTestDrive {
	public static void main(String[] args) {
		
		MallardDuck duck = new MallardDuck();
		
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		public void testDuck(Duck duck) {
			duck.quack();
			duck.fly();
		}
		
		
		System.out.println("\n The Duck says...");
		testDuck(duck);
		
		System.out.println("\n The TurkeyAdapter says...");
		testDuck(turkeyAdapter);
		

	
	}
}
