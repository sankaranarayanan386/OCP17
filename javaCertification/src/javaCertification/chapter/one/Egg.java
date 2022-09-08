package javaCertification.chapter.one;

/**
 * Class to demonstrate how initializer block work
 * @author sanka
 *
 */
public class Egg {
	public Egg() {
		number = 5;
	}
	public static void main(String[] args) {
		 
		Egg egg = new Egg();
		System.out.println(egg.number);
	}
	private int number =3;
	
	/**
	 * initializer block
	 */
	{
		number = 4;
	}

}
