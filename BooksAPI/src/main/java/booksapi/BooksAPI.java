package booksapi;

import services.BooksAPIService;

public class BooksAPI {

	//αρχικοποίηση του BooksAPIService 
	
public static BooksAPIService getBooksDBService() {
		//return new BooksAPIService("https://www.googleapis.com/books/v1/volumes?", "AIzaSyAMm8wdV_RFt2Dq6NE-FrdemuseQxbmkKU");	
		return new BooksAPIService("https://www.googleapis.com/books/v1/volumes?");	
	}

public static BooksAPIService getBookshelfDBService() {
	// TODO Auto-generated method stub
	// return new BooksAPIService("https://www.googleapis.com/books/v1/users/", "AIzaSyAMm8wdV_RFt2Dq6NE-FrdemuseQxbmkKU");
	 return new BooksAPIService("https://www.googleapis.com/books/v1/users/");
 }


}


