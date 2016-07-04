import org.junit.Test;

import static org.junit.Assert.*;

public class HW03Test {
	
	private static final double DELTA = 1e-15;
	
	@Test
	public void testStudentAvg() {
		Student Student1  = new Student("David",10);
		Student Student2  = new Student("Paul",12);
		Student Student3  = new Student("Steve",25);
		
		Student Student  = new Student();
				
		int expected = 15;
		
		assertEquals(Student.getAvgRating(), expected);
	}
	
	@Test
	public void testGetStudentName() {
		Student Student = new Student("Chris",5);
		String actual = Student.getName();
		String expected = "Chris";
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void testStudentToString() {
		Student Student = new Student("David",8);
		String actual = Student.toString();
		String expected = "Name = David | Rating = 8";
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void testCompareStudentsFalse() {
		Student Student1  = new Student("David",10);
		Student Student2  = new Student("Paul",12);
		
		Student Student  = new Student();
				
		boolean expected = false;
		
		assertEquals(Student.compareStudents(Student1,Student2), expected);
	}
	
	@Test
	public void testCompareStudentsTrue() {
		Student Student1  = new Student("David",40);
		Student Student2  = new Student("Paul",35);
		
		Student Student  = new Student();
				
		boolean expected = true;
		
		assertEquals(Student.compareStudents(Student1,Student2), expected);
	}
	
	@Test
	public void testChangeStudentsRating() {
		Student Student1  = new Student("David",40);
		
		Student1.setRating(32);
				
		int expected = 32;
		
		assertEquals(Student1.getRating(), expected);
	}
	
	@Test
	public void testEmployeeBonus() {
		Employee employee1  = new Employee("James",175,30);
						
		int expected = 5775;
		
		assertEquals(employee1.getSalaryIncludingBonus(), expected, DELTA);
	}

}
