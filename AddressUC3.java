package com.addressuc1;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressUC3 {
	
		public static void add(String name, String lastName, String address, String city, String state, String code, String phonenum, String email) {
			ArrayList<String> list = new ArrayList<>();
			list.add(name);
			list.add(address);
			list.add(city);
			list.add(state);
			list.add(code);
			list.add(phonenum);
			list.add(email);

			for(int i = 0; i < list.size(); i++) {
				System.out.println("\nContact1 Added.......\n");
				System.out.println("Before editing the Address Book: " +list);
				Scanner scan = new Scanner(System.in);
				System.out.print("Enter the latest last name :");
				String fName = scan.nextLine();
				list.set(1, fName);
				System.out.println("\nEditied Successfully.......\n");
				System.out.println("After editing the Address Book: " +list);
			}
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println(": Enter the Address details :");
			System.out.println("---------------------------------------------------------");
			System.out.print("Enter the first name :");
			String name = sc.nextLine();
			System.out.print("Enter the address :");
			String address = sc.nextLine();
			System.out.print("Enter the city :");
			String city = sc.nextLine();
			System.out.print("Enter the state :");
			String state = sc.nextLine();
			System.out.print("Enter the code :");
			String code = sc.nextLine();
			System.out.print("Enter the contact number :");
			String phonenum = sc.nextLine();
			System.out.print("Enter the email address :");
			String email = sc.nextLine();
			add(name,  address, city, state, code, phonenum, email, email);
		}
	}

	
		