package bookapp;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Searches {
	
	private String searches[];

	public Searches(String[] searches) {
		this.searches = searches;

	}
//ftiaxnoume mia metavliti searches h opoia exei 5 eggrafes
	public Searches() {
		this.searches = new String[5];
	}

	public void log() throws IOException {
		// TODO Auto-generated method stub



		
		
		//apothikevw tiw 5 teleutaies eggrafes se ena txt arxeio 
		FileWriter writer = new FileWriter("named_searches.txt");
		for (String name : searches) {
			
			writer.write(name + "\n");
		}
		writer.close();
		System.out.println("Named searches saved to file.");
		
	}

	public String[] load() throws IOException{
		// TODO Auto-generated method stub

//HashMap<String, String> namedSearches = new HashMap<>();

		//me ti methodo fileReader anoigei to arxeio txt kai vgazei ta dedomena
	
			FileReader reader = new FileReader("named_searches.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			int index=0;
			
			while ((line = bufferedReader.readLine()) != null && index<5) {

				searches[index++]= line;
			}
			reader.close();
			System.out.println("Named searches retrieved from file: " + searches);
			return searches;
	
	}
	
	//bazoume ta apotelesmata apo panw, se enan pinaka me 5 eggrafes o opoios einai temporary kai meta diagrafetai
	public void addSearch (String search) {
		String tmp[] = new String [5];
		
		tmp [0] = search;
		for (int i=1; i<5; i++) {
			tmp [i]= searches [i-1];
		
		}
		searches = tmp; 
		
	}

	public String[] getSearches() {
		return searches;
	}

	public void setSearches(String[] searches) {
		this.searches = searches;
	}
}
