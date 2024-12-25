package Starbuzz_code;

public class StarBuzzCoffee {
	
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		 beverage2 = new Mocha(beverage2);
		 beverage2 = new Whip(beverage2);
		
		 System.out.println(beverage2.getDescription() + " $" + beverage.cost());
		 
		 Beverage beverage3 = new HouseBlend();
		 beverage3 = new Whip(beverage3);
		 beverage3 = new SteamedMilk(beverage3);
		 beverage3 = new Whip(beverage3);
		 
		 System.out.println(beverage3.getDescription() + " $" + beverage.cost());
		 
		
		
		
	
		
		
		
		
		
		
		
	}
}
