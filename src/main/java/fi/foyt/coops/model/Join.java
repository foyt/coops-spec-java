package fi.foyt.coops.model;

import java.util.Map;

public class Join {

  public Join() {
    super();
  }
  
  public Join(String sessionId, String algorithm, Long revisionNumber, String content, String contentType, Map<String, String> properties,
      Map<String, Map<String, String>> extensions) {
    this();
    this.sessionId = sessionId;
    this.algorithm = algorithm;
    this.revisionNumber = revisionNumber;
    this.content = content;
    this.contentType = contentType;
    this.properties = properties;
    this.extensions = extensions;
  }

  public String getAlgorithm() {
    return algorithm;
  }
  
  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

	public Long getRevisionNumber() {
		return revisionNumber;
	}

	public String getContent() {
		return content;
	}

	public String getContentType() {
		return contentType;
	}
	
	public String getSessionId() {
    return sessionId;
  }
	
	public Map<String, String> getProperties() {
    return properties;
  }
	
	public Map<String, Map<String, String>> getExtensions() {
    return extensions;
  }

  private String sessionId;
  private String algorithm;
	private Long revisionNumber;
	private String content;
	private String contentType;
	private Map<String, String> properties;
  private Map<String, Map<String, String>> extensions;
}