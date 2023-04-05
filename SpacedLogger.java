package week05;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String str) {
		StringBuilder newStr = new StringBuilder();
		String spacer = " ";
		
		for(int index = 0; index < str.length(); index++) {
			newStr.append(str.charAt(index)+ spacer);
		}
		newStr.deleteCharAt(newStr.length()-1);//Added this to get rid of the space that gets added to the last character of the String
		System.out.println(newStr);

	}

	@Override
	public void Error(String str) {
		StringBuilder newStr = new StringBuilder();
		String spacer = " ";
		
		for(int index = 0; index < str.length(); index++) {
			newStr.append(spacer + str.charAt(index));//Changed the order of where the space is
		}
	
		System.out.println("ERROR:"+newStr);
		
	}

}
