package week05;

public class App {

	public static void main(String[] args) {

		AsteriskLogger newAL = new AsteriskLogger();
		SpacedLogger newSL = new SpacedLogger();
		
		newAL.Log("Hello");
		System.out.println();
		newAL.Error("Hello");
		System.out.println();
		System.out.println("Hello");
		System.out.println();
		newSL.Log("Hello");
		System.out.println();
		newSL.Error("Hello");

	}

}
