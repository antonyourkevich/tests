package core;

public class StaticMethod {

	public static void main(String[] args) {
		
		System.out.println(sum("Anton", "Yurkevich"));

	}
	static String sum( String name, String surname)
	{
		return name+ surname;
	}
	
	

}
