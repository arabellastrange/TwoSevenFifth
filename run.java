package people;
import java.io.*;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class run{

	private static List<Person> pplList;

	public static void main(String [] args){
		pplList = new ArrayList<Person>();
		double sal = 0;
		String firstName;
		String lastName;
		
		try {
			FileReader fr = new FileReader("People.TXT"); 
			BufferedReader reader = new BufferedReader(fr);
			String line = reader.readLine();
			Scanner sc = null;
			while(line != null) {
				Person newPerson = new Person(0, "blank", "blank");
				sc = new Scanner(line);
				lastName =  sc.next().toString();
				firstName = sc.next().toString();
				sal = sc.nextDouble();
				newPerson.setSalary(sal);
				newPerson.setFName(firstName);
				newPerson.setLName(lastName);
				pplList.add(newPerson);
				line = reader.readLine();
			}
			reader.close();
			}
		
		catch(FileNotFoundException e) {
				System.out.println("the specified file could not be found");
			}
		catch(NoSuchElementException e){
			System.out.println("Information missing");
		}
		catch(IOException e) {
			System.out.println("something went wrong with reading or closing");
		}
		
		System.out.println("Unsorted List: ");
		for(Person p: pplList){
			System.out.println(p.getFName() + " " + p.getLname() + " has salary: " + p.getSlaray());
		}
		
		Collections.sort(pplList);
		
		System.out.println("Sorted List: ");
		for(Person p: pplList){
			System.out.println(p.getFName() + " " + p.getLname() + " has salary: " + p.getSlaray());
		}
		
		}
	}