

   
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
public class Screenshot extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.core.Screenshot";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Screenshot.class);
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
  public final static String _FeatName_reason = "reason";
  public final static String _FeatName_timestamp = "timestamp";
  public final static String _FeatName_base64Encoding = "base64Encoding";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_id = TypeSystemImpl.createCallSite(Screenshot.class, "id");
  private final static MethodHandle _FH_id = _FC_id.dynamicInvoker();
  private final static CallSite _FC_reason = TypeSystemImpl.createCallSite(Screenshot.class, "reason");
  private final static MethodHandle _FH_reason = _FC_reason.dynamicInvoker();
  private final static CallSite _FC_timestamp = TypeSystemImpl.createCallSite(Screenshot.class, "timestamp");
  private final static MethodHandle _FH_timestamp = _FC_timestamp.dynamicInvoker();
  private final static CallSite _FC_base64Encoding = TypeSystemImpl.createCallSite(Screenshot.class, "base64Encoding");
  private final static MethodHandle _FH_base64Encoding = _FC_base64Encoding.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Screenshot() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Screenshot(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Screenshot(JCas jcas) {
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
  //* Feature: reason

  /** getter for reason - gets 
   * @generated
   * @return value of the feature 
   */
  public String getReason() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_reason));
  }
    
  /** setter for reason - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReason(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_reason), v);
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
  //* Feature: base64Encoding

  /** getter for base64Encoding - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBase64Encoding() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_base64Encoding));
  }
    
  /** setter for base64Encoding - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBase64Encoding(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_base64Encoding), v);
  }    
    
  }

    