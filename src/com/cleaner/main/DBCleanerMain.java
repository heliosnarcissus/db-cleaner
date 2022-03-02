package com.cleaner.main;

import com.cleaner.main.service.LottoMoService;

public class DBCleanerMain {

	public static void main(String[] args) {
		
		System.out.println("Starting Lotto Clean UP..");
		LottoMoService service = new LottoMoService();
		service.truncateEntries();
		System.out.println("Truncate Entries tbl Complete..");
		service.truncateWinners();
		System.out.println("Truncate Winners tbl Complete..");
		service.truncateReturnbets();
		System.out.println("Truncate Returnbets tbl Complete..");
	}
}
