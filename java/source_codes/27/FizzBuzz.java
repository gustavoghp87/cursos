
public class FizzBuzz {
	
	public static void main(String[] ar) {
		 for (int f = 1; f <= 100; f++)
			 System.out.println(f % 3 == 0 && f % 5 == 0 ? "FizzBuzz" : (f % 3 == 0 ? "Fizz" : (f % 5 == 0 ? "Buzz" : f)));
		 main2();
	}
	
	
	public static void main2() {
		 for (int f = 1; f <= 100; f++)
			 if (f % 3 == 0 && f % 5 == 0)
				 System.out.println("FizzBuzz");
			 else
				 if (f % 3 == 0)
					 System.out.println("Fizz");
				 else
					 if (f % 5 == 0)
						 System.out.println("Buzz");
					 else
						 System.out.println(f);
	}

}