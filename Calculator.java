package Lab;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Username");
		String userName = sc.next();
		System.out.println("Enter your password(int)");
		int userPassword=sc.nextInt();
		/*if (userName=="Sinan")
			if (userPassword==1234)
				System.out.println("Welcome to the calculate System");*/
		if (userName.equals ("Sinan") && userPassword==1234) {
			System.out.println("Welcome to the Calculater System");
			Scanner sc1 = new Scanner (System.in); 
		System.out.println("Enter the first numbers");
		int n1=sc1.nextInt();
		int n2=sc1.nextInt();
		System.out.println("Enter 1 for +");
		System.out.println("Enter 2 for -");
		System.out.println("Enter 3 for *");
		System.out.println("Enter 4 for /");
		int operator=sc1.nextInt();
		switch (operator) {
		case 1 : 
			System.out.println(n1+"+"+n2+"="+(n1+n2));
					break;
		case 2 : 
			System.out.println(n1+"-"+n2+"="+(n1-n2));
			break;
		case 3 : 
			System.out.println(n1+"*"+n2+"="+(n1*n2));
			break;
		case 4 : 
			System.out.println(n1+"/"+n2+"="+(n1/n2));
			break;
		}
		}
		else 
			System.out.println("invalid user info");
	}

	}


