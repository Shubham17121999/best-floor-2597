package com.masai;

import java.util.Scanner;
public class crimeInfo {
public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	 int number[] = new int[500];
	 int age[] = new int[500];
	 String[] name = new String[500];
	 String[] crime = new String[500];
	 String[] gender = new String[500];
	 String[] city = new String[500];
	 
	 
	System.out.println("Enter the id of the criminal");
	int id =sc.nextInt();
	number[id]=id;
	
	
	
	System.out.println("Enter the name of the criminal");
	String nami =sc.next();
	name[id]=nami;
	
	
	System.out.println("Enter the gender of the criminal");
	String gendi =sc.next();
	gender[id]=gendi;
	
	
	System.out.println("Enter the age of the criminal");
	int agi =sc.nextInt();
	number[id]=agi;
	
	
	
	
	System.out.println("Enter the crime of the criminal");
	String crimi =sc.next();
	crime[id]=crimi;
	
	
	
	System.out.println("Enter the city  of the criminal");
	String cit =sc.next();
	city[id]=crimi;
	
	
	System.out.println("Enter the ID of the criminal to know his information");
	
	int ide =sc.nextInt();
	System.out.println("Name" + "="+name[ide]);
	System.out.println("Crime" + "="+crime[ide]);
	System.out.println("Gender" + "="+gender[ide]);
	System.out.println("Age" + "="+age[ide]);
	System.out.println("City" + "="+city[ide]);
	
	

	
	
	
}
}