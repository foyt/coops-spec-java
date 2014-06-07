package fi.foyt.coops.model;

import java.util.Map;

public class File {

  public File() {
    super();
  }
  
  public File(Long revisionNumber, String content, String contentType, Map<String, String> properties) {
    this();
    this.revisionNumber = revisionNumber;
    this.content = content;
    this.contentType = contentType;
    this.properties = properties;
  }

  public Long getRevisionNumber() {
    return revisionNumber;
  }

  public void setRevisionNumber(Long revisionNumber) {
    this.revisionNumber = revisionNumber;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  private Long revisionNumber;
  private String content;
  private String contentType;
  private Map<String, String> properties;
}