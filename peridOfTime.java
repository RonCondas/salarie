package salarie;

import java.util.Scanner;

public class peridOfTime {

	public static void main(String[] args) {
		
		
		
		
		
		//talk to the user
		talk();
		
		//store
		int days = input1();
		
		//talk to the user
		talk1();
		
		//store
		double salary = input();
		
		//display
		talk2();
		
		//logic and operation
		loop(days, salary);
			
	} public static void talk() {
		
		System.out.println("Please enter de total of days");
	
	} public static void talk2() {
		
		System.out.printf("%s%20s%n","Year","Amount of salary");
		
		System.out.printf("%s%20s%n","====","====== == ======");
	
	} public static void talk1() {
	
	System.out.println("Please enter desire Salary");
	
	
	} public static double input() {
		
		Scanner kb = new Scanner(System.in);
		//variables 
		double sal = 0.0;
		//store
		sal = kb.nextDouble();
		
		return sal;
		
	} public static double loop(int days, double salary) {
		//variables 
		int counter = 1;
		
		double newSalary = salary;
		
		while (counter <= days) {
		
			System.out.printf("%4d%,20.2f%n",counter,newSalary);
		
			newSalary = newSalary *2;
		
			counter++;}	
		
		return newSalary;
		
	}public static int input1() {
	
	Scanner kb = new Scanner(System.in);
	//variables 
	int day = 0;
	//store
	day = kb.nextInt();
	
	return day;
		
	}
	
}