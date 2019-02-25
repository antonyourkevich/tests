package core3;

public class Planet extends StarSystem {
	
	public static int radius = 650;
	public static String distance = "very long";
	
	public static int method() 
	{
		return radius;
	}
	
	
	public static String method2() 
	{
		return distance;
	}

	
	@Override
	public int methodAny2() {
		
		return 34;
	}


	@Override
	public int methodAny() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
