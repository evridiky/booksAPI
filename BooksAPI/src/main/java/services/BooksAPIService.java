package services;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;

import bookshelf.BookshelfInfo;
import bookshelf.ShelfInfo;
import exception.BooksAPIException;
import model.BooksInfo;
import model.googlebooksdb.ErrorResponse;
import model.googlebooksdb.BooksResult;
import model.googlebooksdb.com.example.*;

public class BooksAPIService {

	private final String API_URL;
	//private final String API_KEY;
	
	
	public BooksAPIService(String aPI_URL) {
		API_URL = aPI_URL;
		//API_KEY = aPI_KEY;
	}
	
		
	//"https://www.googleapis.com/books/v1/users/"
	// get shelf info
	// ftiaxnoume mia lista me ta dedomena apo tin klasi BookShelfInfo
	public List<ShelfInfo> getShelfInfo() throws BooksAPIException {
		BookshelfInfo result = getAPIData1( API_URL);
		List<ShelfInfo> shelfInfoList = new ArrayList<>(result.getItems().size());
		for (bookshelf.Item theItem : result.getItems()) {
			shelfInfoList.add(new ShelfInfo(theItem));
		}
		return shelfInfoList;
	}
	
	// //https://www.googleapis.com/books/v1/volumes?
	// search for books info
	// ftiaxnoume mia lista me ta dedomena apo tin klasi Example
	public List<BooksInfo> searchForBooks(String parameter) throws BooksAPIException {
		Example result = getAPIData(parameter, API_URL);
		List<BooksInfo> booksInfoList = new ArrayList<>(result.getItems().size());
		for (Item theItem : result.getItems()) {
			booksInfoList.add(new BooksInfo(theItem));
		}
		
		return booksInfoList;
		
	}
	
	
	
	//https://www.googleapis.com/books/v1/volumes?
	// get API Data
		//Ta exw sto class Example gia to getBooks
	private Example getAPIData(String parameter, String API_URL)
			throws BooksAPIException {
		try {
				//ftiaxnoume to uri		
			final URIBuilder uriBuilder = new URIBuilder(API_URL)
				.setPathSegments("books", "v1", "volumes");
					
					//.addParameter("api_key", API_KEY);
			if (parameter != null ) 
			{
				uriBuilder.addParameter("q", parameter);
				
	
				}
					
		
			//www.googleapis.com/books/v1/volumes?
			//me 2 parameters
			
//		final URIBuilder uriBuilder = new URIBuilder(API_URL)
//				.setPathSegments("books", "v1","volumes", parameter)
//				.addParameter("api_key", API_KEY);
//		if (parameter != null && !parameter.isEmpty()) {
//			switch (parameter) {
//			case "q":
//				uriBuilder.addParameter("q", parameter);
//				break;
//			case "inauthor":
//				uriBuilder.addParameter("author", parameter);
//				break;
//			}
//		}
			
			
			
		
			final URI uri = uriBuilder.build();

			final HttpGet getRequest = new HttpGet(uri);
			final CloseableHttpClient httpclient = HttpClients.createDefault();
			
			try (CloseableHttpResponse response = httpclient.execute(getRequest)) {
				final HttpEntity entity = response.getEntity();
				final ObjectMapper mapper = new ObjectMapper();

				if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
					ErrorResponse errorResponse = mapper.readValue(entity.getContent(), ErrorResponse.class);
					if (errorResponse.getStatusMessage() != null)
						throw new BooksAPIException("Error occurred on API call: " + errorResponse.getStatusMessage());
				}

				return mapper.readValue(entity.getContent(), Example.class);
			} catch (IOException e) {
				throw new BooksAPIException("Error requesting data from the GoogleBooksDB API.", e);
			}
		} catch (URISyntaxException e) {
			throw new BooksAPIException("Unable to create request URI.", e);
		}
	}
	
	// "https://www.googleapis.com/books/v1/users/"
	//Ta exw sto class Example gia to shelf 102701940585560677579
	private BookshelfInfo getAPIData1( String API_URL)
			throws BooksAPIException {
		try {
						
			final URIBuilder uriBuilder = new URIBuilder();
			//https://learn.microsoft.com/en-us/dotnet/api/system.uribuilder?view=net-7.0
			//.setPathSegments("books", "v1", "users")
			uriBuilder.setScheme("https").setHost("www.googleapis.com").setPath("/books/v1/users/102701940585560677579/bookshelves");
			//.addParameter("api_key", API_KEY);
			final URI uri = uriBuilder.build();
			
			
				
			final HttpGet getRequest = new HttpGet(uri);
			final CloseableHttpClient httpclient = HttpClients.createDefault();
			
			try (CloseableHttpResponse response = httpclient.execute(getRequest)) {
				final HttpEntity entity = response.getEntity();
				final ObjectMapper mapper = new ObjectMapper();

				if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
					ErrorResponse errorResponse = mapper.readValue(entity.getContent(), ErrorResponse.class);
					if (errorResponse.getStatusMessage() != null)
						throw new BooksAPIException("Error occurred on API call: " + errorResponse.getStatusMessage());
				}

				return mapper.readValue(entity.getContent(), BookshelfInfo.class);
			} catch (IOException e) {
				throw new BooksAPIException("Error requesting data from the GoogleBooksDB API.", e);
			}
		} catch (URISyntaxException e) {
			throw new BooksAPIException("Unable to create request URI.", e);
		}
	}




	private URIBuilder setPath(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
