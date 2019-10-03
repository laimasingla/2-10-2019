
  
package com.cg.ibs.cardmanagement.ui;

import java.util.Scanner;

import com.cg.ibs.cardmanagement.service.CustomerServiceImpl;

import java.io.*;

enum CardMenu {

	APPLY, UPGRADE, RESET_PIN, REPORT_CARDLOSS, REQUEST_STATEMENT, STATEMENT_MISMATCH, QUIT
}

public class CardManagementui {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to card management System");
		System.out.println("Enter 1 to login as a customer");
		System.out.println("Enter 2 to login as a bank admin");
		int userInput = scan.nextInt();
		
		CardMenu choice = null;
		while (choice != CardMenu.QUIT) {
			System.out.println("Menu");
			System.out.println("--------------------");
			System.out.println("Choice");
			System.out.println("--------------------");
			for (CardMenu menu : CardMenu.values()) {
				System.out.println(menu.ordinal() + "\t" + menu);
			}
			System.out.println("Choice");
			int ordinal = scan.nextInt();
			if (ordinal >= 0 && ordinal < CardMenu.values().length) {
				choice = CardMenu.values()[ordinal];

				switch (choice) {
				case APPLY:
					break;
				case UPGRADE:
					break;
				case RESET_PIN:
					break;
				case REPORT_CARDLOSS:
					break;
				case REQUEST_STATEMENT:
					break;
				case STATEMENT_MISMATCH:
					break;
				case QUIT:
					System.out.println("App Closed.");
					break;
				}
			} else {
				System.out.println("Invalid Option!!");
				choice = null;
			}
		}
	}
}
