import java.util.Scanner;

public class Student {
	
	private String name;
	private int rating;
	private static int totalRating;
	private static int totalStudentCount;
	private static int avgRating;
	
	
	public Student(String name, int rating) {		
		this.name = name;
		this.rating = rating;

		_setAvgRating();
    }
	
	public Student() {		
		
    }
	
	public boolean compareStudents(Student student1, Student student2){
		
		if(student1.getRating() > student2.getRating()){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	private void _setAvgRating(){
		totalStudentCount++;
		totalRating = totalRating + getRating();
		avgRating = totalRating / totalStudentCount;
	}
	
	public int getAvgRating(){
		return avgRating;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getRating(){
		return this.rating;
	}
	
	public int getTotalRating(){
		return totalRating;
	}
	
	public String toString(){
		String studentString = "Name = " + getName() + " | Rating = " + getRating();
		return studentString;
	}
	
	public void setRating(int rating){
		this.rating = rating;
	}
}
