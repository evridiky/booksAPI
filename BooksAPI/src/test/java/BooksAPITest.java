import booksapi.BooksAPI;
import bookshelf.ShelfInfo;

import java.util.List;

	import org.junit.Assert;
	import org.junit.Test;

	import exception.BooksAPIException;
	import model.BooksInfo;
	import services.BooksAPIService;


	public class BooksAPITest {
		@Test
		public void testSearchAPI() throws BooksAPIException {
			
			final BooksAPIService booksSearchService = BooksAPI.getBooksDBService();
			final List<BooksInfo> results = booksSearchService.searchForBooks("Sherlock");
			Assert.assertFalse(results.isEmpty());
			results.forEach(System.out::println);
		
	
	    }

	    @Test
	    public void testBookshelfAPI() throws BooksAPIException {
	        final BooksAPIService bookshelfService = BooksAPI.getBookshelfDBService();
	        final List<ShelfInfo> results = bookshelfService.getShelfInfo();
	        Assert.assertFalse(results.isEmpty());
	        results.forEach(System.out::println);
	    }
	    
	    
//	    @Test
//	    public void testDiscoverAPIInvalidYear() throws BooksAPIException {
//	        final BooksAPIService booksSearchService = BooksAPI.getBooksDBService();
//	        final List<BooksInfo> results = booksSearchService.getPopularBooksForYear(5555);
//	        Assert.assertTrue(results.isEmpty());
//	    }
	}
