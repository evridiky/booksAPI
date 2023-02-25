package model.googlebooksdb;


import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import model.googlebooksdb.com.example.AccessInfo;
import model.googlebooksdb.com.example.SaleInfo;
import model.googlebooksdb.com.example.SearchInfo;
import model.googlebooksdb.com.example.VolumeInfo;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "kind",
    "id",
    "etag",
    "selfLink",
    "volumeInfo",
    "saleInfo",
    "accessInfo",
    "searchInfo"
})
@Generated("jsonschema2pojo")
public class BooksResult {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("id")
    private String id;
    @JsonProperty("etag")
    private String etag;
    @JsonProperty("selfLink")
    private String selfLink;
    @JsonProperty("volumeInfo")
    private VolumeInfo volumeInfo;
    @JsonProperty("saleInfo")
    private SaleInfo saleInfo;
    @JsonProperty("accessInfo")
    private AccessInfo accessInfo;
    @JsonProperty("searchInfo")
    private SearchInfo searchInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("etag")
    public String getEtag() {
        return etag;
    }

    @JsonProperty("etag")
    public void setEtag(String etag) {
        this.etag = etag;
    }

    @JsonProperty("selfLink")
    public String getSelfLink() {
        return selfLink;
    }

    @JsonProperty("selfLink")
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    @JsonProperty("volumeInfo")
    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    @JsonProperty("volumeInfo")
    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    @JsonProperty("saleInfo")
    public SaleInfo getSaleInfo() {
        return saleInfo;
    }

    @JsonProperty("saleInfo")
    public void setSaleInfo(SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    @JsonProperty("accessInfo")
    public AccessInfo getAccessInfo() {
        return accessInfo;
    }

    @JsonProperty("accessInfo")
    public void setAccessInfo(AccessInfo accessInfo) {
        this.accessInfo = accessInfo;
    }

    @JsonProperty("searchInfo")
    public SearchInfo getSearchInfo() {
        return searchInfo;
    }

    @JsonProperty("searchInfo")
    public void setSearchInfo(SearchInfo searchInfo) {
        this.searchInfo = searchInfo;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	public String[] getResults() {
		// TODO Auto-generated method stub
		return null;
	}

}


//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.naming.spi.DirStateFactory.Result;
//
//import com.fasterxml.jackson.annotation.JsonAnyGetter;
//import com.fasterxml.jackson.annotation.JsonAnySetter;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//    "page",
//    "results",
//    "total_pages",
//    "total_results"
//})
//
//
//public class BooksResult {
//	@JsonProperty("page")
//    private Integer page;
//    @JsonProperty("results")
//    private List<Result> results = null;
//    @JsonProperty("total_pages")
//    private Integer totalPages;
//    @JsonProperty("total_results")
//    private Integer totalResults;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
//
//    @JsonProperty("page")
//    public Integer getPage() {
//        return page;
//    }
//
//    @JsonProperty("page")
//    public void setPage(Integer page) {
//        this.page = page;
//    }
//
//    @JsonProperty("results")
//    public List<Result> getResults() {
//        return results;
//    }
//
//    @JsonProperty("results")
//    public void setResults(List<Result> results) {
//        this.results = results;
//    }
//
//    @JsonProperty("total_pages")
//    public Integer getTotalPages() {
//        return totalPages;
//    }
//
//    @JsonProperty("total_pages")
//    public void setTotalPages(Integer totalPages) {
//        this.totalPages = totalPages;
//    }
//
//    @JsonProperty("total_results")
//    public Integer getTotalResults() {
//        return totalResults;
//    }
//
//    @JsonProperty("total_results")
//    public void setTotalResults(Integer totalResults) {
//        this.totalResults = totalResults;
//    }
//
//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }
//
//}
