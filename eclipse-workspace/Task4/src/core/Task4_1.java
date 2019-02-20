package core;

public class Task4_1 {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName();
		person.setSurname();
		person.setAge();
		person.setPhone();
		System.out.println(person.getName() + "" + person.getSurname() + "" + person.getAge() + person.getPhone()+ "");
	
		

	}

	
	public static void printAllInformation(String name, String surname, int age, int phone )
	{
		System.out.println(name + "" + surname + "" + age + "" + phone+"");
	}
	
	
	
	public static void printName(String name, String surname)
	{
		System.out.println(name + "" + surname + "");
	}
	
	
	public static boolean isAdult(int age)
	{
		if (age>18) {
			return true;
		}
		
		
		else {
			return false;
		}
	}
	
	
}
