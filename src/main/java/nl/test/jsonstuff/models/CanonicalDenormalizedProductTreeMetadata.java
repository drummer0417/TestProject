package nl.test.jsonstuff.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class is used for generation of the Metadata part of productTree json file,
 * Metadata is a child of ProductTreeRooot
 */
public class CanonicalDenormalizedProductTreeMetadata {

    private String publisherSystem;
    private String sourceSystem;
    private String country;
    private String language;
    private Date dateCreated;
    private Date dateModified;

    @JsonProperty("publisher_system")
    public String getPublisherSystem() {
        return publisherSystem;
    }

    @JsonProperty("source_system")
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

    @JsonProperty("date_created")
    public String getDateCreated() {
        return formatDate(dateCreated);
    }

    @JsonProperty("date_modified")
    public String getDateModified() {
        return formatDate(dateModified);
    }

    public void setPublisherSystem(String publisherSystem) {
        this.publisherSystem = publisherSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    private String formatDate(Date date) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        return sdf.format(date);
    }
}
