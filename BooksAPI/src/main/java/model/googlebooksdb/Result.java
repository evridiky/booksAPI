package model.googlebooksdb;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "authors",
    "publisher",
    "publishedDate",
    "description",
    "industryIdentifiers",
    "readingModes",
    "pageCount",
    "printType",
    "categories",
    "averageRating",
    "ratingsCount",
    "maturityRating",
    "allowAnonLogging",
    "contentVersion",
    "panelizationSummary",
    "imageLinks",
    "language",
    "previewLink",
    "infoLink",
    "canonicalVolumeLink",
    "subtitle"
		
})

public class Result {

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAuthors() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPublisher() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
