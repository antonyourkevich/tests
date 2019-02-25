package core3;

public class Earth extends Planet {
	
	
	
	
	public static int population = 25000;
	public static String polution = "very poluted";
	
	
	Earth()
	{
		this.polution = polution;
		this.population = population;
		
	}
	
	public static int method() 
	{
		return population;
	}
	
	
	public static String method2() 
	{
		return polution;
	}

}
