package Random;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {

	//	String re = "..";
	//	String text = "sss";
		String re = "\\w\\w\\w\\W.";
	//	String re = "\\S\\s";
		String text = "a";
		Pattern pattern = Pattern.compile(re);
		Matcher match = pattern.matcher(text);
		boolean res = match.matches();
		System.out.println(res);
	}

}
