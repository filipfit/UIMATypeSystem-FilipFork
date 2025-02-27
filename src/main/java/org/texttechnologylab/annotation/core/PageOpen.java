

   
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
public class PageOpen extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.core.PageOpen";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PageOpen.class);
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
  public final static String _FeatName_timestamp = "timestamp";
  public final static String _FeatName_page_id = "page_id";
  public final static String _FeatName_session_id = "session_id";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_id = TypeSystemImpl.createCallSite(PageOpen.class, "id");
  private final static MethodHandle _FH_id = _FC_id.dynamicInvoker();
  private final static CallSite _FC_timestamp = TypeSystemImpl.createCallSite(PageOpen.class, "timestamp");
  private final static MethodHandle _FH_timestamp = _FC_timestamp.dynamicInvoker();
  private final static CallSite _FC_page_id = TypeSystemImpl.createCallSite(PageOpen.class, "page_id");
  private final static MethodHandle _FH_page_id = _FC_page_id.dynamicInvoker();
  private final static CallSite _FC_session_id = TypeSystemImpl.createCallSite(PageOpen.class, "session_id");
  private final static MethodHandle _FH_session_id = _FC_session_id.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected PageOpen() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public PageOpen(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public PageOpen(JCas jcas) {
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
  //* Feature: timestamp

  /** getter for timestamp - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTimestamp() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_timestamp));
  }
    
  /** setter for timestamp - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimestamp(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_timestamp), v);
  }    
    
   
    
  //*--------------*
  //* Feature: page_id

  /** getter for page_id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPage_id() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_page_id));
  }
    
  /** setter for page_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPage_id(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_page_id), v);
  }    
    
   
    
  //*--------------*
  //* Feature: session_id

  /** getter for session_id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSession_id() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_session_id));
  }
    
  /** setter for session_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSession_id(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_session_id), v);
  }    
    
  }

    