public class Casting{
	public static void main(String[] args)
	{ 
          int var1 = 9;
          double dub = var1;              // Automatic Casting

          System.out.println(var1);
          System.out.println(dub);
        

          double dub2 = 54.45d;
          int var2 = (int)dub2;   // Manual Casting

          System.out.println(var2);

          byte b =7;
          short s = b;

          System.out.println(b);
          System.out.println(s);

          char c = (char)b;
          c++;
          System.out.println(c);
        
          String str ="9";
          int newInt = Integer.parseInt(str);
          System.out.println(newInt);

    }
}       