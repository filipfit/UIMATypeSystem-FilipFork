

   
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
public class Page extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.core.Page";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Page.class);
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
  public final static String _FeatName_title = "title";
  public final static String _FeatName_url = "url";
  public final static String _FeatName_assessment_phase_in_session_id = "assessment_phase_in_session_id";
  public final static String _FeatName_session_id = "session_id";
  public final static String _FeatName_tab_id = "tab_id";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_id = TypeSystemImpl.createCallSite(Page.class, "id");
  private final static MethodHandle _FH_id = _FC_id.dynamicInvoker();
  private final static CallSite _FC_title = TypeSystemImpl.createCallSite(Page.class, "title");
  private final static MethodHandle _FH_title = _FC_title.dynamicInvoker();
  private final static CallSite _FC_url = TypeSystemImpl.createCallSite(Page.class, "url");
  private final static MethodHandle _FH_url = _FC_url.dynamicInvoker();
  private final static CallSite _FC_assessment_phase_in_session_id = TypeSystemImpl.createCallSite(Page.class, "assessment_phase_in_session_id");
  private final static MethodHandle _FH_assessment_phase_in_session_id = _FC_assessment_phase_in_session_id.dynamicInvoker();
  private final static CallSite _FC_session_id = TypeSystemImpl.createCallSite(Page.class, "session_id");
  private final static MethodHandle _FH_session_id = _FC_session_id.dynamicInvoker();
  private final static CallSite _FC_tab_id = TypeSystemImpl.createCallSite(Page.class, "tab_id");
  private final static MethodHandle _FH_tab_id = _FC_tab_id.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Page() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Page(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Page(JCas jcas) {
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
  //* Feature: title

  /** getter for title - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTitle() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_title));
  }
    
  /** setter for title - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_title), v);
  }    
    
   
    
  //*--------------*
  //* Feature: url

  /** getter for url - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUrl() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_url));
  }
    
  /** setter for url - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUrl(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_url), v);
  }    
    
   
    
  //*--------------*
  //* Feature: assessment_phase_in_session_id

  /** getter for assessment_phase_in_session_id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAssessment_phase_in_session_id() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_assessment_phase_in_session_id));
  }
    
  /** setter for assessment_phase_in_session_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAssessment_phase_in_session_id(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_assessment_phase_in_session_id), v);
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
    
   
    
  //*--------------*
  //* Feature: tab_id

  /** getter for tab_id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTab_id() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_tab_id));
  }
    
  /** setter for tab_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTab_id(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_tab_id), v);
  }    
    
  }

    