package com.addressuc1;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressUC2 {
		public void getDetails() {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Enter the Address details :");
				String name = sc.nextLine();
				String address = sc.nextLine();
				String city = sc.nextLine();
				String state = sc.nextLine();
				String code = sc.nextLine();
				String phonenum = sc.nextLine();
				String emailid = sc.nextLine();
				ArrayList<String> list = new ArrayList<>();
				list.add(name);
				list.add(address);
				list.add(city);
				list.add(state);
				list.add(code);
				list.add(phonenum);
				list.add(emailid);

				Object[] abjArr = list.toArray();
				for(Object obj: abjArr) {
					System.out.print((String)obj);
					System.out.println("\ndetails.......\n");
				}
			}
		}
	}

