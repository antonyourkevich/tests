package core2;

public class Tester {
	
	public String name;
	public String surname;
	protected int expirienceInYears;
	protected String englishLevel;
	private int salary;
	
	
	public Tester ( String name, String surname, int expirienceInYears, String englishLevel, int salary)
	{
		this.name= name;
		this.surname= surname;
		this.expirienceInYears= expirienceInYears;
		this.englishLevel= englishLevel;
		this.salary=salary;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getExpirienceInYears() {
		return expirienceInYears;
	}
	public void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}
	public String getEnglishLevel() {
		return englishLevel;
	}
	public void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

	private int newSalary()
	{
		return salary*2;
	}
	
	 int newExperience()
	{
		return expirienceInYears/12;
	}
	
	 protected String newNameSurname ()
	 {
		 return name + surname;
	 }
	 
	 public String NewAllInfo()
	 {
		 return name + surname + expirienceInYears + englishLevel + salary;
	 }
	
}
//доп задание
//1 - нужно сделать класс Tester абстрактным


//  чтобы обойти нужно проосто переопределить методы 
