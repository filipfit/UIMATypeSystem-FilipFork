

   
/* Apache UIMA v3 - First created by JCasGen Thu Jan 23 11:20:41 CET 2025 */

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
 * Updated by JCasGen Thu Jan 23 11:20:41 CET 2025
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
   
  public final static String _FeatName_id = "id";
  public final static String _FeatName_started = "started";
  public final static String _FeatName_useragent = "useragent";
  public final static String _FeatName_webExtensionKey = "webExtensionKey";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_id = TypeSystemImpl.createCallSite(UserSession.class, "id");
  private final static MethodHandle _FH_id = _FC_id.dynamicInvoker();
  private final static CallSite _FC_started = TypeSystemImpl.createCallSite(UserSession.class, "started");
  private final static MethodHandle _FH_started = _FC_started.dynamicInvoker();
  private final static CallSite _FC_useragent = TypeSystemImpl.createCallSite(UserSession.class, "useragent");
  private final static MethodHandle _FH_useragent = _FC_useragent.dynamicInvoker();
  private final static CallSite _FC_webExtensionKey = TypeSystemImpl.createCallSite(UserSession.class, "webExtensionKey");
  private final static MethodHandle _FH_webExtensionKey = _FC_webExtensionKey.dynamicInvoker();

   
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
  //* Feature: id

  /** getter for id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getId() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_id));
  }
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_id), v);
  }    
    
   
    
  //*--------------*
  //* Feature: started

  /** getter for started - gets 
   * @generated
   * @return value of the feature 
   */
  public String getStarted() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_started));
  }
    
  /** setter for started - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStarted(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_started), v);
  }    
    
   
    
  //*--------------*
  //* Feature: useragent

  /** getter for useragent - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUseragent() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_useragent));
  }
    
  /** setter for useragent - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUseragent(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_useragent), v);
  }    
    
   
    
  //*--------------*
  //* Feature: webExtensionKey

  /** getter for webExtensionKey - gets 
   * @generated
   * @return value of the feature 
   */
  public String getWebExtensionKey() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_webExtensionKey));
  }
    
  /** setter for webExtensionKey - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWebExtensionKey(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_webExtensionKey), v);
  }    
    
  }

    