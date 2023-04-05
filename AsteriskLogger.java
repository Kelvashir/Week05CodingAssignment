package week05;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String str) {
		System.out.println("***"+str+"***");
	}

	@Override
	public void Error(String str) {
		//Added this to dynamically change the length of the asterisks depending on the String length
		String count = "";
		for(int index = 0; index < 12 + str.length(); index++) {
			count += "*";
		}
		System.out.println(count);
		System.out.println("***Error:"+str+"***");
		System.out.println(count);
	}
}
