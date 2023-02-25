package bookapp;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import booksapi.BooksAPI;
import bookshelf.ShelfInfo;
import exception.BooksAPIException;
import model.BooksInfo;
import services.BooksAPIService;


public class Application {

	//simeio eisodou tis efarmogis
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Searches searches = new Searches();
		try {
			searches.load();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		final BooksAPIService booksDBService = BooksAPI.getBooksDBService();
		final BooksAPIService bookshelfDBService = BooksAPI.getBookshelfDBService();
		
		System.out.println("Welcome the the BooksApp");

		while (true) {
			System.out.println("Select one from the following options: ");
			System.out.println("1.Search for book shelves.");
			System.out.println("2. Search for books.");
			System.out.println("3. Print 5 last searches.");
			System.out.println("4. Exit.");
			System.out.println("Your choice: ");

			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();

			System.out.println("You chose: " + input);

			switch (input) {
			case "1":
				System.out.println("Selected 1");
				System.out.println("Enter the UserID: ");
				String searchParam = sc.nextLine();
				try {
			
					final List<ShelfInfo> results = bookshelfDBService.getShelfInfo();
					System.out.println("Results are: ");
					System.out.println(results);
					searches.addSearch(results.toString());
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				
				break;
			case "2":
				System.out.println("Selected 2");
				System.out.print("Enter search parameter: ");
				String searchParam1 = sc.nextLine();
				try {
					
					final List<BooksInfo> results = booksDBService.searchForBooks(searchParam1);
					System.out.println("Results are: ");
					System.out.println(results);
					searches.addSearch(results.toString());
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;
			case "3":
			for (String s: searches.getSearches()) {
			System.out.println(s);	
			}
			
			
			case "4":
				try {
					searches.log();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Selected 4");
				System.exit(0); //kodikos exodou
				break;
			default:
				System.out.println("Invalid input");
			}

		}
	}


}
