

   
/* Apache UIMA v3 - First created by JCasGen Fri Jun 13 13:13:30 CEST 2025 */

package org.texttechnologylab.annotation.core;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Jun 13 13:13:30 CEST 2025
 * XML source: /home/filip/Documents/Bachelor/UIMATypeSystem-FilipFork/target/jcasgen/typesystem.xml
 * @generated */
public class UserSession extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.core.UserSession";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(UserSession.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_internalId = "internalId";
  public final static String _FeatName_started = "started";
  public final static String _FeatName_useragent = "useragent";
  public final static String _FeatName_webExtensionKey = "webExtensionKey";
  public final static String _FeatName_user = "user";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_internalId = TypeSystemImpl.createCallSite(UserSession.class, "internalId");
  private final static MethodHandle _FH_internalId = _FC_internalId.dynamicInvoker();
  private final static CallSite _FC_started = TypeSystemImpl.createCallSite(UserSession.class, "started");
  private final static MethodHandle _FH_started = _FC_started.dynamicInvoker();
  private final static CallSite _FC_useragent = TypeSystemImpl.createCallSite(UserSession.class, "useragent");
  private final static MethodHandle _FH_useragent = _FC_useragent.dynamicInvoker();
  private final static CallSite _FC_webExtensionKey = TypeSystemImpl.createCallSite(UserSession.class, "webExtensionKey");
  private final static MethodHandle _FH_webExtensionKey = _FC_webExtensionKey.dynamicInvoker();
  private final static CallSite _FC_user = TypeSystemImpl.createCallSite(UserSession.class, "user");
  private final static MethodHandle _FH_user = _FC_user.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected UserSession() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public UserSession(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public UserSession(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: internalId

  /** getter for internalId - gets Numeric ID for internal handling, in most cases assigned by the data bank.
   * @generated
   * @return value of the feature 
   */
  public long getInternalId() { 
    return _getLongValueNc(wrapGetIntCatchException(_FH_internalId));
  }
    
  /** setter for internalId - sets Numeric ID for internal handling, in most cases assigned by the data bank. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInternalId(long v) {
    _setLongValueNfc(wrapGetIntCatchException(_FH_internalId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: started

  /** getter for started - gets Time stamp string in the "ISO 8601" format
   * @generated
   * @return value of the feature 
   */
  public String getStarted() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_started));
  }
    
  /** setter for started - sets Time stamp string in the "ISO 8601" format 
   * @generated
   * @param v value to set into the feature 
   */
  public void setStarted(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_started), v);
  }    
    
   
    
  //*--------------*
  //* Feature: useragent

  /** getter for useragent - gets User agent used by the user's browser this session
   * @generated
   * @return value of the feature 
   */
  public String getUseragent() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_useragent));
  }
    
  /** setter for useragent - sets User agent used by the user's browser this session 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUseragent(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_useragent), v);
  }    
    
   
    
  //*--------------*
  //* Feature: webExtensionKey

  /** getter for webExtensionKey - gets Web extension key used this session
   * @generated
   * @return value of the feature 
   */
  public String getWebExtensionKey() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_webExtensionKey));
  }
    
  /** setter for webExtensionKey - sets Web extension key used this session 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWebExtensionKey(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_webExtensionKey), v);
  }    
    
   
    
  //*--------------*
  //* Feature: user

  /** getter for user - gets This session's user
   * @generated
   * @return value of the feature 
   */
  public NeobridgeUser getUser() { 
    return (NeobridgeUser)(_getFeatureValueNc(wrapGetIntCatchException(_FH_user)));
  }
    
  /** setter for user - sets This session's user 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUser(NeobridgeUser v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_user), v);
  }    
    
  }

    