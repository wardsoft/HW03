import java.text.DecimalFormat;

public class Employee {
	
	private String name;
	private double rate;
	private double hours;
	private static double totalSum;
	private final int bonusPercentage = 10;
	private final String currencyChar = "£";
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public static void main(String[] args){
		Employee employee1 = new Employee("Chris",450,35);
		Employee employee2 = new Employee("Dave",175,30);
		Employee employee3 = new Employee("Steve",245,45);
		
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
		
		System.out.println("Total hours = "+ totalSum);
	}
	
	public Employee() {		
		totalSum = totalSum + this.hours;
    }
	
	public Employee(String name, double rate) {		
		this.name = name;
		this.rate = rate;
		totalSum = totalSum + this.hours;
    }
	
	public Employee(String name, double rate, double hours) {		
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum = totalSum + this.hours;
    }
	
	public double getSalary(){
		return this.rate * this.hours;
	}
	
	public double getSalaryIncludingBonus(){
		return getSalary() + calcuateBonus();
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public String toString(){
		return "[Name = " + getName() + ", Rate = " + currencyChar + getRate() + ", Hours = " + getHours() + ", Salary = " + currencyChar + getSalary() + ", Salary (inc bonus) = " + currencyChar + getSalaryIncludingBonus() + "]"; 
	}

	public double getRate(){
		return this.rate;
	}
	
	public double getHours(){
		return this.hours;
	}
	
	public static double getTotalSum(){
		return totalSum;
	}
	
	public void setRate(double rate){
		this.rate = rate;
	}
	
	public double calcuateBonus(){
		double dividedBy = 100;
		double bonusCalc = bonusPercentage/dividedBy;

		return bonusCalc * getSalary();
	}
	
}
