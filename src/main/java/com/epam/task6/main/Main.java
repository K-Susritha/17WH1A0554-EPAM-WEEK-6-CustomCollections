package com.epam.task6.main;

import java.util.List;
import java.util.Scanner;

import com.epam.task6.customlist.CustomList;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomList cl = new CustomList();
		String a[] = {"Abhi", "Akash", "Pooja", "Shamini", "Vikas", "Susritha", "Gayatri", "Keerthi", "Shainu", "Akshay"};
		List<String> list = cl.asList(a);
		list.add("Sanhitha");
		System.out.println("Size : " + list.size());
		System.out.println("List : " + list.toString());
		sc.close();
		
	}
}
