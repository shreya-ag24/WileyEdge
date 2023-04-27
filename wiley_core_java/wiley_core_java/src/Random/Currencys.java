package Random;
import java.text.*;
import java.util.*;

public class Currencys {

	public static void main(String[] args) {
			Currency usd =  Currency.getInstance("USD");
			NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
			String formattedval = format.format(108.5);
			System.out.println(formattedval);
			
			Currency inr = Currency.getInstance("INR");
			NumberFormat inrFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
			String formattedValue = inrFormat.format(108.5);
			System.out.println(formattedValue);
			
			double price = 2000.22;
			Locale local = new Locale("en", "US");
			NumberFormat currencyFor = NumberFormat.getCurrencyInstance(local);
			String finalprice = currencyFor.format(price);
			System.out.println(finalprice);
			DecimalFormat df = new DecimalFormat("#,##0.00");
			df.setPositivePrefix("$");
			String res = df.format(price);
			System.out.println(res);
			
			Currency cur = Currency.getInstance("USD");
			System.out.println(cur.getSymbol());
			System.out.println(cur.getCurrencyCode());
			
			//Exchande rate provider 
			
			
	}

}
