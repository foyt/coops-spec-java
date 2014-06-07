package fi.foyt.coops;

public class CoOpsInternalErrorException extends CoOpsException {

  private static final long serialVersionUID = 1L;

  public CoOpsInternalErrorException(String message) {
    super(message);
  }
  
  public CoOpsInternalErrorException(Throwable cause) {
    super(cause);
  }

}
