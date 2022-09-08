package var;

/**
 * program to demonstrat var.
 * @author sanka
 *
 */
public class Var {

	//var num = 10; // invalid as it is not a local variable.
	
	public void var() {
		var var = "var";
	
	}

	public void Var() {
		Var var = new Var();

	}

	public Var() {
		var var = 10;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Var var = new Var();
		var.var();
		var.Var();
		System.out.println("Program ran successfully.");
		
	}

}
