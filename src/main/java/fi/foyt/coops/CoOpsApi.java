package fi.foyt.coops;

import java.util.List;
import java.util.Map;

import fi.foyt.coops.model.File;
import fi.foyt.coops.model.Join;
import fi.foyt.coops.model.Patch;

public interface CoOpsApi {
  
  /**
   * Returns a file and file meta-information. If revision number parameter is specified method returns file of that specified revision otherwise last revision is returned
   * 
   * @see https://github.com/foyt/coops-spec/#get--load-request
   * 
   * @param fileId file identifier
   * @param revisionNumber version number of file to be returned. If null is specified latest version is returned
   * @return File file
   * @throws CoOpsNotImplementedException thrown when requested feature is not implemented by the implementation
   * @throws CoOpsNotFoundException thrown when file or file revision can not be found
   * @throws CoOpsUsageException thrown when method is used incorrectly
   * @throws CoOpsInternalErrorException thrown when unexpected error occurs
   * @throws CoOpsForbiddenException thrown when request was cancelled because of permission was denied
   */
  public File fileGet(String fileId, Long revisionNumber) throws CoOpsNotImplementedException, CoOpsNotFoundException, CoOpsUsageException, CoOpsInternalErrorException, CoOpsForbiddenException;

  /**
   * Client calls the method in order to check new updates into the file.
   * 
   * @see https://github.com/foyt/coops-spec/#get-update-update-request
   * 
   * @param fileId file identifier
   * @param sessionId unique collaboration session id
   * @param revisionNumber client revision number
   * @return list of patches after revision
   * @throws CoOpsNotFoundException thrown when file can not be found
   * @throws CoOpsUsageException thrown when method is used incorrectly
   * @throws CoOpsInternalErrorException thrown when unexpected error occurs
   * @throws CoOpsForbiddenException thrown when request was cancelled because of permission was denied
   */
  public List<Patch> fileUpdate(String fileId, String sessionId, Long revisionNumber) throws CoOpsNotFoundException, CoOpsUsageException, CoOpsInternalErrorException, CoOpsForbiddenException;

  /**
   * Patches a file.
   * 
   * @see https://github.com/foyt/coops-spec/#patch--patch-request
   * 
   * @param fileId file identifier
   * @param sessionId unique collaboration session id
   * @param revisionNumber a number of revision patch is meant for
   * @param patch an optional parameter that contains changes to the file content in used diff format
   * @param properties an optional parameter that contains changed meta-data
   * @param extensions an optional parameter that contains extension changes
   * @throws CoOpsNotFoundException thrown when file can not be found
   * @throws CoOpsUsageException thrown when method is used incorrectly
   * @throws CoOpsInternalErrorException thrown when unexpected error occurs
   * @throws CoOpsConflictException throw when conflict occurred while patching the document
   * @throws CoOpsForbiddenException thrown when request was cancelled because of permission was denied
   */
  public void filePatch(String fileId, String sessionId, Long revisionNumber, String patch, Map<String, String> properties, Map<String, Object> extensions) throws CoOpsInternalErrorException, CoOpsUsageException, CoOpsNotFoundException, CoOpsConflictException, CoOpsForbiddenException;
  
  /**
   * Client calls the method in order to join the collaboration session.
   * 
   * @see https://github.com/foyt/coops-spec/#get-join-join-request
   * 
   * @param algorithms algorithm(s) supported by client. Algorithms should be ordered descendingly from most favourable to least favourable algorithm
   * @param procotolVersion used CoOps protocol version.
   * @return Join response
   * @throws CoOpsNotFoundException thrown when file can not be found
   * @throws CoOpsUsageException thrown when method is used incorrectly
   * @throws CoOpsNotImplementedException thrown when requested feature is not implemented by the implementation
   * @throws CoOpsInternalErrorException thrown when unexpected error occurs
   * @throws CoOpsForbiddenException thrown when request was cancelled because of permission was denied
   */
  public Join fileJoin(String fileId, List<String> algorithms, String protocolVersion) throws CoOpsNotFoundException, CoOpsUsageException, CoOpsNotImplementedException, CoOpsInternalErrorException, CoOpsForbiddenException;

}
