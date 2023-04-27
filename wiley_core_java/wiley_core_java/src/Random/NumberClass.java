package Random;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberClass {

	public static void main(String[] args) {
		
		BigDecimal n1= new BigDecimal("22");
		BigDecimal n2 = new BigDecimal("7");
		System.out.println(n1.divide(n2, 9999999, RoundingMode.HALF_UP));
		String str = "5665";
		int number = Integer.parseInt(str);
		System.out.println(number);
	}

}
