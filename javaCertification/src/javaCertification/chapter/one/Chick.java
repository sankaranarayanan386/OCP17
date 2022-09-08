package javaCertification.chapter.one;

public class Chick {
	{ int someVar = 500000;System.out.println(someVar);}

	private String name = "Fluffy";
	{
		System.out.println("Setting Field");
	}

	public Chick() {
		name = "Tiny";
		System.out.println("Setting Constructor");
	}

	public static void main(String[] args) {
		Chick chick = new Chick();
		System.out.println(chick.name);
		int ₹rupee = 5;
		int ₹ = 0;
		int num1, num2, div, sum;
		num1 =10; num2 = 5;
		//sum = num1+num2;
		System.out.println("negate of number 999 is "+(~-999));
		System.out.println("sum is "+ (num1+num2)  +" testing= "+ (num1 += num2) + " num is "+num1 + " num2 is " + num2);
		div = num1%num2;
		System.out.println("sub is "+ div);
		System.out.println(₹rupee);
		System.out.println(₹);
		String textBlockSample = """

				 text block sample
				""";

		System.out.println(textBlockSample);

		String textBlockSample2 ="""
				text vlock valide""";

		System.out.println(textBlockSample2);

		String textBlockSample3 = """
				text block valid sample 3""";

		System.out.println("Line break is manadatory for after the first set of \"\"\" " + textBlockSample3);

		
	}

}
