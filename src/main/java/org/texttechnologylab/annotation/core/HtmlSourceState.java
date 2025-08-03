

   
/* Apache UIMA v3 - First created by JCasGen Sat Jun 14 14:21:44 CEST 2025 */

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
 * Updated by JCasGen Sat Jun 14 14:21:44 CEST 2025
 * XML source: /home/filip/Documents/Bachelor/UIMATypeSystem-FilipFork/target/jcasgen/typesystem.xml
 * @generated */
public class HtmlSourceState extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.core.HtmlSourceState";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(HtmlSourceState.class);
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
  public final static String _FeatName_html = "html";
  public final static String _FeatName_timestamp = "timestamp";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_internalId = TypeSystemImpl.createCallSite(HtmlSourceState.class, "internalId");
  private final static MethodHandle _FH_internalId = _FC_internalId.dynamicInvoker();
  private final static CallSite _FC_html = TypeSystemImpl.createCallSite(HtmlSourceState.class, "html");
  private final static MethodHandle _FH_html = _FC_html.dynamicInvoker();
  private final static CallSite _FC_timestamp = TypeSystemImpl.createCallSite(HtmlSourceState.class, "timestamp");
  private final static MethodHandle _FH_timestamp = _FC_timestamp.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected HtmlSourceState() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public HtmlSourceState(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public HtmlSourceState(JCas jcas) {
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

  /** getter for internalId - gets Internal ID only unique per session
   * @generated
   * @return value of the feature 
   */
  public long getInternalId() { 
    return _getLongValueNc(wrapGetIntCatchException(_FH_internalId));
  }
    
  /** setter for internalId - sets Internal ID only unique per session 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInternalId(long v) {
    _setLongValueNfc(wrapGetIntCatchException(_FH_internalId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: html

  /** getter for html - gets HTML source
   * @generated
   * @return value of the feature 
   */
  public String getHtml() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_html));
  }
    
  /** setter for html - sets HTML source 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHtml(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_html), v);
  }    
    
   
    
  //*--------------*
  //* Feature: timestamp

  /** getter for timestamp - gets Time of taking HTML source
   * @generated
   * @return value of the feature 
   */
  public String getTimestamp() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_timestamp));
  }
    
  /** setter for timestamp - sets Time of taking HTML source 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimestamp(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_timestamp), v);
  }    
    
  }

    