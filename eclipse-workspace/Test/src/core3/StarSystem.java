package core3;

public abstract class StarSystem {
	
	public static int age = 250;
	public static String name = "hhh";
	public int quantity= 45;
	
	
	
	
	public static int method() 
	{
		return age;
	}
	
	
	public static String method2() 
	{
		return name;
	}


	
	
	public abstract int methodAny();
	public abstract int methodAny2();
	
	@Override
	public String toString() {
		return "StarSystem [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + quantity;
		return result;
	}


	

	
	
}
