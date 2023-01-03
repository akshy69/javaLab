package ExceptionHandling;

public class ExceptionHandling1 {
	static void isAdult(int n) throws Exception{
		if(n<18)
			throw new Exception();
	}
	
	public static void main(String[] args) {
		int i=18;
		try {
			isAdult(i);
		}
		
		catch (Exception e) {
			System.out.println(e);
			System.out.println("something went wrong");
		}
		finally {
			System.out.println("it always execute");
		}
		System.out.println("rest of code");
		
		
	}

}
