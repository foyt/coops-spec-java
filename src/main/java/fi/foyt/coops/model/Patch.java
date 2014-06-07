package fi.foyt.coops.model;

import java.util.Map;

public class Patch {
	
	public Patch() {
	  super();
	}
	
	public Patch(String sessionId, Long revisionNumber, String checksum, String patch, Map<String, String> properties, Map<String, Object> extensions) {
    this();
    this.sessionId = sessionId;
    this.revisionNumber = revisionNumber;
    this.checksum = checksum;
    this.patch = patch;
    this.properties = properties;
    this.extensions = extensions;
  }

  public String getPatch() {
		return patch;
	}
	
	public void setPatch(String patch) {
		this.patch = patch;
	}
	
	public Map<String, String> getProperties() {
		return properties;
	}
	
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}
	
	public Long getRevisionNumber() {
		return revisionNumber;
	}
	
	public void setRevisionNumber(Long revisionNumber) {
		this.revisionNumber = revisionNumber;
	}
	
	public String getChecksum() {
		return checksum;
	}
	
	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}
	
	public String getSessionId() {
    return sessionId;
  }
	
	public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }
	
	public Map<String, Object> getExtensions() {
    return extensions;
  }
	
	public void setExtensions(Map<String, Object> extensions) {
    this.extensions = extensions;
  }

  private String sessionId;
  private Long revisionNumber;
  private String checksum;
	private String patch;
	private Map<String, String> properties;
  private Map<String, Object> extensions;
}
