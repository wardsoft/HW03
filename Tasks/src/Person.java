import java.util.Calendar;
import java.util.Scanner;

public class Person {
	
	private static String name;
	private static int birthYear;
	
	public static void main(String[] args){
		_showMenu();
	}
	
	public Person(String nameArg,int birthYearArg) {		
		name = nameArg;
		birthYear = birthYearArg;
	}
	
	private static void _showMenu(){
		System.out.println("");
		System.out.println("Please choose an option");
		System.out.println("------------------------");
		System.out.println("1-Enter person details");
		System.out.println("2-View person details");
		System.out.println("3-Change name");
		System.out.println("4-Exit");
		
		Scanner option = new Scanner(System.in);
		int selected = option.nextInt();
		
		switch (selected) {
	 	case 1: input();
	 			break;
	 	case 2: output();
				break;	
	 	case 3: changeName();
	 			break;	
	 	case 4: option.close();
				break;
	 	default: break;
		}
	}
	
	public void getName(){
		
	}
	
	public void getBirthYear(){
		
	}
	
	public static int age(){
		return (Calendar.getInstance().get(Calendar.YEAR) - birthYear);
	}
	
	public static void input(){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scanner.nextLine();
		System.out.println("Please enter your birth year");
		int birthYear = scanner.nextInt();
		
		Person person = new Person(name,birthYear);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Thanks, information has been entered");
		System.out.println("-------------------------------------------------------------");
		System.out.println("");
		_showMenu();
	}
	
	public static void output(){
		System.out.println("-------------------------------------------------------------");
		System.out.println("Your name is " + name + " and you are " + age() + " years old");
		System.out.println("-------------------------------------------------------------");
		System.out.println("");
		_showMenu();
	}
	
	public static void changeName(){
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Please enter your new name");
		name = scanner1.nextLine();
		_showMenu();
	}
}
