package kr.co.ezenac.decorator;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee aamericano = new AAmericano();
		aamericano.brewing(); // AAmericano Coffee
		
		Coffee latte = new Latte(new AAmericano());
		latte.brewing();// AAmericano Coffee Adding milk
		
		Coffee mocha = new Mocha(new Latte(new AAmericano()));
		mocha.brewing(); // ... adding Mocha Syrup
		
		Coffee mocha2 = new Mocha(new Latte(new BAmericano()));
		mocha2.brewing(); // BAmericaon Coffe ~~~
		
		
		
		
	}

}
