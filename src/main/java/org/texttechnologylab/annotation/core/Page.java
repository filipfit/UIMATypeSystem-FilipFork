

   
/* Apache UIMA v3 - First created by JCasGen Sat Jun 14 14:21:44 CEST 2025 */

package org.texttechnologylab.annotation.core;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Sat Jun 14 14:21:44 CEST 2025
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
   
  public final static String _FeatName_internalId = "internalId";
  public final static String _FeatName_url = "url";
  public final static String _FeatName_title = "title";
  public final static String _FeatName_screenshots = "screenshots";
  public final static String _FeatName_scrollEvents = "scrollEvents";
  public final static String _FeatName_htmlSourceStates = "htmlSourceStates";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_internalId = TypeSystemImpl.createCallSite(Page.class, "internalId");
  private final static MethodHandle _FH_internalId = _FC_internalId.dynamicInvoker();
  private final static CallSite _FC_url = TypeSystemImpl.createCallSite(Page.class, "url");
  private final static MethodHandle _FH_url = _FC_url.dynamicInvoker();
  private final static CallSite _FC_title = TypeSystemImpl.createCallSite(Page.class, "title");
  private final static MethodHandle _FH_title = _FC_title.dynamicInvoker();
  private final static CallSite _FC_screenshots = TypeSystemImpl.createCallSite(Page.class, "screenshots");
  private final static MethodHandle _FH_screenshots = _FC_screenshots.dynamicInvoker();
  private final static CallSite _FC_scrollEvents = TypeSystemImpl.createCallSite(Page.class, "scrollEvents");
  private final static MethodHandle _FH_scrollEvents = _FC_scrollEvents.dynamicInvoker();
  private final static CallSite _FC_htmlSourceStates = TypeSystemImpl.createCallSite(Page.class, "htmlSourceStates");
  private final static MethodHandle _FH_htmlSourceStates = _FC_htmlSourceStates.dynamicInvoker();

   
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
  //* Feature: url

  /** getter for url - gets URL of the page
   * @generated
   * @return value of the feature 
   */
  public String getUrl() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_url));
  }
    
  /** setter for url - sets URL of the page 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUrl(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_url), v);
  }    
    
   
    
  //*--------------*
  //* Feature: title

  /** getter for title - gets Page title
   * @generated
   * @return value of the feature 
   */
  public String getTitle() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_title));
  }
    
  /** setter for title - sets Page title 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_title), v);
  }    
    
   
    
  //*--------------*
  //* Feature: screenshots

  /** getter for screenshots - gets All screenshots taken on the page
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<Screenshot> getScreenshots() { 
    return (FSArray<Screenshot>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_screenshots)));
  }
    
  /** setter for screenshots - sets All screenshots taken on the page 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScreenshots(FSArray<Screenshot> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_screenshots), v);
  }    
    
    
  /** indexed getter for screenshots - gets an indexed value - All screenshots taken on the page
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public Screenshot getScreenshots(int i) {
     return (Screenshot)(((FSArray<Screenshot>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_screenshots)))).get(i));
  } 

  /** indexed setter for screenshots - sets an indexed value - All screenshots taken on the page
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setScreenshots(int i, Screenshot v) {
    ((FSArray<Screenshot>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_screenshots)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: scrollEvents

  /** getter for scrollEvents - gets All scroll events recorded on the page
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<ScrollEvent> getScrollEvents() { 
    return (FSArray<ScrollEvent>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_scrollEvents)));
  }
    
  /** setter for scrollEvents - sets All scroll events recorded on the page 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScrollEvents(FSArray<ScrollEvent> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_scrollEvents), v);
  }    
    
    
  /** indexed getter for scrollEvents - gets an indexed value - All scroll events recorded on the page
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public ScrollEvent getScrollEvents(int i) {
     return (ScrollEvent)(((FSArray<ScrollEvent>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_scrollEvents)))).get(i));
  } 

  /** indexed setter for scrollEvents - sets an indexed value - All scroll events recorded on the page
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setScrollEvents(int i, ScrollEvent v) {
    ((FSArray<ScrollEvent>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_scrollEvents)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: htmlSourceStates

  /** getter for htmlSourceStates - gets HTML source of the page
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<HtmlSourceState> getHtmlSourceStates() { 
    return (FSArray<HtmlSourceState>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_htmlSourceStates)));
  }
    
  /** setter for htmlSourceStates - sets HTML source of the page 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHtmlSourceStates(FSArray<HtmlSourceState> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_htmlSourceStates), v);
  }    
    
    
  /** indexed getter for htmlSourceStates - gets an indexed value - HTML source of the page
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public HtmlSourceState getHtmlSourceStates(int i) {
     return (HtmlSourceState)(((FSArray<HtmlSourceState>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_htmlSourceStates)))).get(i));
  } 

  /** indexed setter for htmlSourceStates - sets an indexed value - HTML source of the page
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setHtmlSourceStates(int i, HtmlSourceState v) {
    ((FSArray<HtmlSourceState>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_htmlSourceStates)))).set(i, v);
  }  
  }

    