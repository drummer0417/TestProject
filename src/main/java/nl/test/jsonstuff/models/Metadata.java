package nl.test.jsonstuff.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Metadata {
    String publisherSystem;
    String sourceSystem;

    String country;
    String language;
    Date dateCreated;
    Date dateModified;

    public Metadata(String publisherSystem, String sourceSystem, String country, String language, Date dateCreated, Date dateModified) {
        this.publisherSystem = publisherSystem;
        this.sourceSystem = sourceSystem;
        this.country = country;
        this.language = language;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    @JsonProperty("publisherSystem")
    public String getPublisherSystem() {
        return publisherSystem;
    }

    @JsonProperty("sourceSystem")
    public String getSourceSystem() {
        return sourceSystem;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("dateCreated")
    public String getDateCreated() {
        return formatDate(dateCreated);
    }

    @JsonProperty("dateModified")
    public String getDateModified() {
        return formatDate(dateModified);
    }

    private String formatDate(Date date) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        return sdf.format(date);
    }
}
