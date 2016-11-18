package people;

public class Person implements Comparable<Person>{
	double salary;
	String firstName;
	String surname;
	
	public Person(double sal, String first, String last){
		salary = sal;
		firstName = first;
		surname = last;
	}
	
	public Person(){
		salary = 15000;
		firstName = "Cassie";
		surname = "Lang";
	}
	
	public String getFName(){
		return firstName; 
	}
	
	public String getLname(){
		return surname;
	}
	
	public void setFName(String first){
		firstName = first;
	}
	
	public void setLName(String last){
		surname = last;
	}
	
	public void setSalary(double sal){
		salary = sal; 
	}
	
	public double getSlaray(){
		return salary;
	}

	public int compareTo(Person object) {
		int lastComp = this.getLname().compareTo(object.getLname());
		if(lastComp == 0){
			int firstComp = this.getFName().compareTo(object.getFName());
			return firstComp;
		}
		return lastComp;
	}
}
