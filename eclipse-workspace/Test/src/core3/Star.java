package core3;

public abstract class Star extends StarSystem {
	
	
	public static int diametr = 250;
	public static String brightness = "very bright";
	
	public static int method() 
	{
		return diametr;
	}
	
	
	public static String method2() 
	{
		return brightness;
	}


	@Override
	public int methodAny() {
		
		return 9;
	}

	
	
}
