package model;

import model.googlebooksdb.Result;

import java.util.List;

import model.googlebooksdb.BooksResult;
import model.googlebooksdb.com.example.Example;
import model.googlebooksdb.com.example.Item;
import model.googlebooksdb.com.example.VolumeInfo;
import model.googlebooksdb.com.example.Epub;
public class BooksInfo {


	
	private final String kind;
    private final String id;
    private final String etag;
    private final String selflink;
    private final VolumeInfo volume;
    private final String title;
    private final List<String> authors;
    private final String publisher;
    private final List<String> categories;
    private final String description;
  
    
    public BooksInfo(String kind, String id, String etag, String selflink, VolumeInfo volume, String title, List<String> authors, String publisher, List<String> categories, String description) {
        this.kind = kind;
        this.id = id;
        this.etag = etag;
        this.selflink = selflink;
        this.volume = volume;
        this.title= title;
        this.authors=authors;
        this.publisher=publisher;
        this.categories=categories;
        this.description=description;
      
    }

    public BooksInfo(Item theItem){

        this.kind= theItem.getKind();
        this.id=theItem.getId();
        this.etag=theItem.getEtag();
        this.selflink=theItem.getSelfLink();
        this.volume=theItem.getVolumeInfo(); // to volume info einai antikeimeno mesa sto antikeimeno items
        this.title=volume.getTitle(); //ola ta parakatw stoixeia einai apo to volumeInfo
        this.authors=volume.getAuthors();
        this.publisher=volume.getPublisher();
        this.categories=volume.getCategories();
        this.description=volume.getDescription();
      
    }

    public String getKind() {

        return kind;
    }

    public String getId() {
        return id;
    }

    public String getEtag() {
        return etag;
    }

    public String getSelflink() {
        return selflink;
    }

    public VolumeInfo getVolume() {
        return volume;
    }

    public String getTitle() {
        return title;
    }
        

        public List<String> getAuthors() {
            return authors;
    }
        public String getPublisher() {
            return publisher;
    }
        public List<String> getCategories() {
            return categories ;
        }
        public String getDescription() {
            return description;
    } 
     
         
    
    @Override
    public String toString() {
        return "BookInfo{" +
                "kind='" + kind + '\''+
                ", id='" + id + '\'' +
                ", etag='" + etag + '\'' +
                ", selflink='" + selflink + '\''+
                ", volume=" + volume + '\'' +
                ", title=" + title +'\'' +
                ", authors=" + authors +'\'' +
                ",publisher=" + publisher + '\'' +
                ",categories=" + categories+ '\'' +
                ",description=" + description+ 
                '}';
    }
}
